package PRINCIPAL;

import CLASSES.Cep;
import CLASSES.CepAPI;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) throws IOException, InterruptedException{
        Scanner leitor = new Scanner(System.in);
        List<Cep> listaDCeps = new ArrayList<>();
        String controle = "";
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        
            while(!controle.equalsIgnoreCase("sair")){
                String busca = "";
                try{
                    System.out.println("Digite o número do cep que quer buscar");
                    controle = leitor.nextLine(); 
                    if(controle.equalsIgnoreCase("sair")){
                        break;
                    }else if(controle.length()<8){
                        System.out.println("Um cep tem que ter no mínimo 8 números, por digite novamente");
                        break;
                    }
                    for(String numero : controle.split("")){
                        int teste = Integer.parseInt(numero);
                        busca += teste; 
                    }
                    String endereco = "http://viacep.com.br/ws/"+busca+"/json/";
                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder() 
                        .uri(URI.create(endereco))
                        .build();

                    HttpResponse<String> response = client 
                            .send(request, HttpResponse.BodyHandlers.ofString());

                    String json = response.body();
                    System.out.println(json);

                    CepAPI cepAPI = gson.fromJson(json, CepAPI.class);

                    Cep cep = new Cep(cepAPI);

                    listaDCeps.add(cep);

                    System.out.println(listaDCeps);
                    

                }catch(NumberFormatException e){
                    System.out.println("O cep não foi digitado corretamente");
                }
                
            }

            FileWriter arquivo = new FileWriter("ceps.json");
            arquivo.write(gson.toJson(listaDCeps));
            arquivo.close();

        
    }
    
}