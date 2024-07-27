/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoradeppartidasranqueadas;

import java.util.Scanner;

/**
 *
 * @author Roberto
 */
public class CalculadoraDepPartidasRanqueadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
       
        System.out.println("Indique o numero de vitórias do heroi");
        int vitorias= entrada.nextInt();
        System.out.println("Indique o numero de derrotas do heroi");
        int derrotas= entrada.nextInt();
        String rank=calculaRank(vitorias,derrotas);
    }
    static String calculaRank(int vitorias, int derrotas){
        int saldo=vitorias-derrotas;
        String elo;
        
        if(saldo<10){
            elo="ferro";
        }else if(saldo<20){
            elo="Bronze";
        }else if(saldo<50){
            elo="Prata";
        }else if(saldo<80){
            elo="Ouro";
        }else if(saldo<90){
            elo="Diamante";
        }else if(saldo<100){
            elo="Lendário";
        }else{
            elo="Imortal";
        }
        System.out.println("O Herói tem de saldo de: "+saldo+" está no nível de: "+elo);
        return elo;
    }
}
