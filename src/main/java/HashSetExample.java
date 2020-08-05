import entities.Jogadores;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        Set<Jogadores> escalacaoDoTime = new HashSet<>();
        Set<Jogadores> escalacaoDosReservas = new HashSet<>();
        escalaOsReservas(escalacaoDosReservas);
        escalaOsTitulares(escalacaoDoTime);

        imprimeTime(escalacaoDoTime);

        //ADD ALL é o metodo chamado de UNIAO vai unir os titulares e os reservas na escalacao
        escalacaoDoTime.addAll(escalacaoDosReservas);
        imprimeTime(escalacaoDoTime);
        //RETAINS ALL é o metodo cahamdo de INTERSECÇÃO
        escalacaoDoTime.retainAll(escalacaoDosReservas);
        imprimeTime(escalacaoDosReservas);

        escalaOsTitulares(escalacaoDoTime);

        //REMOVE ALL é a DIFERENÇA irá remover do conjunto os elementos contidos no outro
        escalacaoDoTime.removeAll(escalacaoDosReservas);
        imprimeTime(escalacaoDoTime);
    }

    public static void escalaOsTitulares(Set<Jogadores> escalacaoDoTime){
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

    }

    public static void escalaOsReservas(Set<Jogadores> escalacaoDosReservas){
        escalacaoDosReservas.add(new Jogadores("Boselli", 2));
        escalacaoDosReservas.add(new Jogadores("Araos", 6));
        escalacaoDosReservas.add(new Jogadores("Camacho", 5));

    }

    public static void imprimeTime(Set<Jogadores> escalacaoDoTime){
        for (Jogadores jogadores : escalacaoDoTime) {
            System.out.println(jogadores.getNumber() + " " + jogadores.getName());
        }
        System.out.println("********************************************");
    }
}
