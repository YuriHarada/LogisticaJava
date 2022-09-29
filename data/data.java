package data;

import java.util.*;
import java.sql.Timestamp;
import java.text.*;

public class data {
    Date date = new Date(); 

    private int id;
    private double pesoCarga;
    private String nomeOperador;
    private int[] qnt;
    private String[] conteudoCarga;
    private String origem, destino;


    public int IncrementID(){
        this.id = this.id++;
        return this.id;
    } 

    public void SetPesoCarga(double pesoCarga){
        this.pesoCarga = pesoCarga;
    }

    public double GetpesoCarga(){
        return this.pesoCarga;
    }

    public void SetnomeOperador(String nomeOperador){
        this.nomeOperador = nomeOperador;
    }

    public String GetnomeOperador(){
        return this.nomeOperador;
    }

    //public Date SetDateEntrada() {
        //Timestamp dataDeHoje = new Timestamp(System.currentTimeMillis())
        //Transformar ms pra s
        //return dataDeHoje;
    //} 

    //TODO: fazer funcao de calcular a data de saida
    //warning: prestar atencao na tipagem do dado 


    public void CadastrarCarga(String conteudoCarga, int qnt){
        IncrementID();
        this.conteudoCarga[this.id] = conteudoCarga;
        this.qnt[this.id] = qnt;
    }



}
