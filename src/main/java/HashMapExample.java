import entities.Jogadores;

import java.util.*;

public class HashMapExample {


    public static void main(String[] args) {
        //Declarando o MAP
        Map<Integer,Jogadores> escalacaoDoTime = new HashMap<>();
        //Adicionando os itens ao Map
        escalacaoTitulares(escalacaoDoTime);

        //TAMANHO DO MAP
        System.out.println("Tamanho da lista é:  " + escalacaoDoTime.size());

        //Verificar se contem essa chave na lista
        if (escalacaoDoTime.containsKey(1)){
            System.out.println("Contém a chave numero 1:");
        } else {
            System.out.println("Não contém, a chave numero 1");
        }

        //Verificar se contem o valor na lista
        Jogadores cassio = new Jogadores("Cassio", 12);
        if (escalacaoDoTime.containsValue(cassio)){
            System.out.println("Cassio está escalado graças a deus");
        }else {
            System.out.println("Cassio não está na Lista");
        }

        // Remover Item da LIsta
        escalacaoDoTime.remove(12);
        System.out.println("Agora nossa lista terá de ter 10 elementos  e tem: " + escalacaoDoTime.size());
        escalacaoDoTime.put(12, cassio);

        //DESCARREGANDO UM MAP EM UM SET (UTILIZANDO O CAST)
        Set<Jogadores> setDaEscalacao = new HashSet<>(escalacaoDoTime.values());

        System.out.println("agora o nosso set tem o tamanho da escalação " + setDaEscalacao.size());

        //VERIFICANDO SE O MAP ESTA VAZIO
        if (!escalacaoDoTime.isEmpty()){
            System.out.println("A ESCALAÇÃO DO TIME NÃO ESTA VAZIA");
        }

        //DESCARREGANDO AS CHAVES
        Set<Integer> numeroDaEscalacao = escalacaoDoTime.keySet();
        System.out.println("Numeros contidos no SET que recebe as Chaves");
        for (Integer numerros : numeroDaEscalacao){
            System.out.println(numerros);
            System.out.println("*************************************");

        }

        //BUSCANDO ITEM DO MAP
        System.out.println("Esse é o objeto chave 12 " + escalacaoDoTime.get(12).getName() + " com o numero: " + escalacaoDoTime.get(12).getNumber());

    }

    public static void escalacaoTitulares(Map<Integer,Jogadores> escalacaoDoTime){
        Jogadores cassio = new Jogadores("Cassio", 12);
        escalacaoDoTime.put(cassio.getNumber(),cassio);
        Jogadores fagner = new Jogadores("Fagner", 38);
        escalacaoDoTime.put(fagner.getNumber(),fagner);
        Jogadores gil = new Jogadores("Gil", 4);
        escalacaoDoTime.put(gil.getNumber(),gil);
        Jogadores daniloAvelar = new Jogadores("Danilo Avelar", 35);
        escalacaoDoTime.put(daniloAvelar.getNumber(),daniloAvelar);
        Jogadores carlosAugusto = new Jogadores("Carlos Augusto", 30);
        escalacaoDoTime.put(carlosAugusto.getNumber(),carlosAugusto);
        Jogadores ederson = new Jogadores("Ederson", 15);
        escalacaoDoTime.put(ederson.getNumber(),ederson);
        Jogadores cantillo = new Jogadores("Cantillo", 24);
        escalacaoDoTime.put(cantillo.getNumber(),cantillo);
        Jogadores ramiro = new Jogadores("Ramiro", 8);
        escalacaoDoTime.put(ramiro.getNumber(),ramiro);
        Jogadores luan = new Jogadores("Luan", 7);
        escalacaoDoTime.put(luan.getNumber(),luan);
        Jogadores mateusVital = new Jogadores("Mateus Vital", 22);
        escalacaoDoTime.put(mateusVital.getNumber(),mateusVital);
        Jogadores jo = new Jogadores("Jo", 77);
        escalacaoDoTime.put(jo.getNumber(),jo);


    }






}
