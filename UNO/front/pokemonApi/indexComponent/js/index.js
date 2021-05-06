let urlCompleta;
let url;
let parametros;
const SERVIDOR = "http://localhost:8080";
const SERVIDOR_API = "https://pokeapi.co/api/v2";

let generacionPokemon = $("#generacionInput");
let rangoUno = $("#rangoUnoInput");
let rangoDos = $("#rangoDosInput");

let apodo = $("#apodoPokemonInput");
let especie = $("#especiePokemonInput");

let apodo2 = $("#apodoPokemonInput2");
let especie2 = $("#especiePokemonInput2");


function pedirAyuda() {
	url = "/help";
	urlCompleta = SERVIDOR + url;
	console.log("PIDIENDO AYUDA ...");
	console.log(urlCompleta);
	peticionAjax("POST", urlCompleta, {}).then((respuesta) => {
		console.log(JSON.parse(respuesta));
	}).catch((error) => {
		console.log(error);
	});

}

function pedirInfoPokemonPorNumero(numero) {
	return new Promise((resolve, reject)=>{
	url = "/pokemon/"+numero;
	urlCompleta = SERVIDOR_API + url;
	console.log("PIDIENDO INFO POKEMON ",numero);
	console.log(urlCompleta);
	peticionAjax("GET", urlCompleta, {}).then((respuesta) => {
		//console.log(JSON.parse(respuesta));
		resolve(JSON.parse(respuesta));
		
	}).catch((error) => {
		//console.log(error);
		reject(error);
	});
	});


}

function guardarPokemon() {
	url = "/guardar";
	urlCompleta = SERVIDOR + url;
	let obj = {
        apodo: apodo.val(),
        especie: especie.val()
};
	console.log("GUARDANDO POKEMON: ",obj);
	console.log(urlCompleta);
	peticionAjax("POST", urlCompleta, obj).then((respuesta) => {
		console.log(JSON.parse(respuesta));
		
	}).catch((error) => {
		console.log(error);
		
	});
}

function buscarPorApodo() {
	url = "/buscarPorApodo";
	urlCompleta = SERVIDOR + url;
	let obj = {
        apodo: apodo2.val()
};
	console.log("BUSCANDO POKEMON POR APODO: ",obj);
	console.log(urlCompleta);
	peticionAjax("POST", urlCompleta, obj).then((respuesta) => {
		console.log(JSON.parse(respuesta));
		
	}).catch((error) => {
		console.log(error);
		
	});
}

function buscarPorEspecie() {
	url = "/buscarPorEspecie";
	urlCompleta = SERVIDOR + url;
	let obj = {
        especie: especie2.val()
};
	console.log("BUSCANDO POKEMON POR ESPECIE: ",obj);
	console.log(urlCompleta);
	peticionAjax("POST", urlCompleta, obj).then((respuesta) => {
		console.log(JSON.parse(respuesta));
		
	}).catch((error) => {
		console.log(error);
		
	});
}

async function listarPorRango(){
	for(let i=rangoUno.val(); i<=rangoDos.val(); i++){
		let r = await pedirInfoPokemonPorNumero(i);
		console.log(r);
		
		
	}
}



function pedirPokemonesGeneracion() {
	url = "/generation/"+generacionPokemon.val();
	urlCompleta = SERVIDOR_API + url;
	console.log("PIDIENDO POKEMONES GENERACION ",generacionPokemon.val());
	console.log(urlCompleta);
	peticionAjax("GET", urlCompleta, {}).then((respuesta) => {
		console.log(JSON.parse(respuesta));
		pedirInfoPokemon("treecko");

	}).catch((error) => {
		console.log(error);
	});

}

function pedirInfoPokemon(nombre) {
	url = "/pokemon/"+nombre;
	urlCompleta = SERVIDOR_API + url;
	console.log("PIDIENDO INFO POKEMON ",nombre);
	console.log(urlCompleta);
	peticionAjax("GET", urlCompleta, {}).then((respuesta) => {
		console.log(JSON.parse(respuesta));
		
	}).catch((error) => {
		console.log(error);
	});

}