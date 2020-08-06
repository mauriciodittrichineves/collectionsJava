import entities.Jogadores;

import java.util.ArrayList;
import java.util.Collections;

public class List {


    public static void main(String[] args) {
        ArrayList <Jogadores> escalacaoDoTIme = new ArrayList<>();

        //ADICIONA UM ITEM NA LISTA
    inserirJogadores(escalacaoDoTIme);
        // PARA VERIFICAR O TAMANHO DA LISTA
        System.out.println("resultado do size(): " + escalacaoDoTIme.size());

        //VERIFICANDO SE A LISTA ESTA VAZIA.
        if(escalacaoDoTIme.isEmpty()){
            System.out.println("resultado se a lista estiver vazia");
        } else {
            System.out.println("resultado se a lista tiver pelo menos um item");
        }
        //SOLICITANDO UM DETERMINADO ITEM DA LISTA.
        System.out.println("O item na posição 0 é o : " + escalacaoDoTIme.get(0).getName());

        //Removendo um item da Lista
        escalacaoDoTIme.remove(10);


        //Mostrando que posição um jogador está na Lista
        Jogadores jogadorProcurado = new Jogadores("Cantillo",24);
        System.out.println("O jogador Cantillo está na posição: " + escalacaoDoTIme.indexOf(jogadorProcurado));
        jogadorProcurado = new Jogadores("Dudu", 10);
        System.out.println("O Jogador Dudu não está nessa escalação portanto deve aparecer: " + escalacaoDoTIme.indexOf(jogadorProcurado));

        //Alterando um jogador na Escalação:
        escalacaoDoTIme.set(6, new Jogadores("Gabriel", 5));
        System.out.println("então agora na posição 6 da lista estará o " + escalacaoDoTIme.get(6).getName());

        //Verificando uma determinada item da lista é igual ao outro.
        if(escalacaoDoTIme.get(6).equals(new Jogadores("Gabriel",5))){
            System.out.println("este é o Gabriel mesmo.");
        }

        if(escalacaoDoTIme.get(6) == new Jogadores("Gabriel", 5)){
            System.out.println("Não irá cair aqui");
        }

        //PERGUNTADO NO MEETUP SOBRE O SHUFFLE, O SHUFFLE ESSE METODO FUNCIONA PERMUTANDO ALEATORIAMENTE OS ELEMENTOS NA LISTA
        //TEM O TEMPO DE EXECUÇÃO LINEAR, POR BAIXO DOS PANOS ELA ESTA PEGANDO A LISTA, PASSANDO PARA UMA MATRIZ, DEPOIS ELA EMBARALHA A COPIA DA MATRIZ, E COPIA
        //ESSA MATRIZ EMBARALHADA PARA A LISTA.
        //PARA ESTE TESTE, PRIMEIRAMENTE VAMOS IMPRIMIR A NOSSA LISTA ATUAL

        for (Jogadores jogadores : escalacaoDoTIme){
            System.out.println("Jogador:  " + jogadores.getName() + " Numero " + jogadores.getNumber());
        }

        //AGORA VAMOS IMPRIMIR UMA LISTA UTILIZANDO O METODO SHUFFLE, QUE IRÁ REORGANIZAR OS ITENS QUE ESTÃO NA MINHA LISTA.
        System.out.println("****************************");
        //Então o metodo shuffle do collections deverá pegar nossa lista e reordenar ela aleatoriamente, fazendo com que o resultado da impressao
        //seja totalmente diferente do de cima.
        Collections.shuffle(escalacaoDoTIme);
        for (Jogadores jogadores : escalacaoDoTIme){
            System.out.println("Jogador:  " + jogadores.getName() + " Numero " + jogadores.getNumber());
        }


    }

    //ADICIONA UM ITEM NA LISTA CHAMAMOS O METODO ADD
    public static void inserirJogadores(ArrayList<Jogadores> escalacaoDoTime){
        escalacaoDoTime.add(new Jogadores("Cassio", 12));
        escalacaoDoTime.add(new Jogadores("Fagner", 38));
        escalacaoDoTime.add(new Jogadores("Gil", 4));
        escalacaoDoTime.add(new Jogadores("Danilo Avelar", 35));
        escalacaoDoTime.add(new Jogadores("Carlos Augusto", 30));
        escalacaoDoTime.add(new Jogadores("Ederson", 15));
        escalacaoDoTime.add(new Jogadores("Cantillo", 24));
        escalacaoDoTime.add(new Jogadores("Ramiro", 8));
        escalacaoDoTime.add(new Jogadores("Luan", 7));
        escalacaoDoTime.add(new Jogadores("Mateus Vital", 22));
        escalacaoDoTime.add(new Jogadores("Jo", 77));
        escalacaoDoTime.add(new Jogadores("Tiago Nunes", null));
    }



}
