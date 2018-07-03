package br.netshoes.Service;

import com.google.gson.JsonArray;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

public class ApiService {
    public String consultaCepApi(){
        Response response = RestAssured.get("https://buscarcep.com.br/?cep=13339575&formato=string&chave=Chave_Gratuita_BuscarCep&identificador=CLIENTE1");
        String textoResposta= response.asString();
        System.out.print(textoResposta);
        return textoResposta;
    }
}
