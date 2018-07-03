package br.netshoes.Service;

import org.junit.Assert;

public class ValidaRetornoApi {
    public void validaRetornoApiCep(){
        ApiService apiService = new ApiService();

        String resposta = apiService.consultaCepApi();

        boolean valida = resposta.contains("Indaiatuba");

        if (valida){
            System.out.println("Cidade corresponde ao CEP");
        }
        else {
            System.out.println("Cidade não corresponde ao CEP");
            Assert.assertFalse(valida);
        }

        boolean endereco = resposta.equals("Massaharo Kanesaki");
        if (valida){
            System.out.println("Endereço correspondente ao CEP");
        }
        else {
            System.out.println("Endereço não corresponde ao CEP");
            Assert.assertFalse(endereco);
        }
    }
}
