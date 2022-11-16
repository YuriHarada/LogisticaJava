package Data.core;

import java.util.*;


public class DataLog {

    private int id;
    private double pesoCarga;
    private String nomeOperador;
    private int[] qnt;
    private String[] conteudoCarga;
    /* private String origem, destino;
 */

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

    public int SetDateEntrada() {
        int i = (int) (new Date().getTime()/1000);
        return i;
    } 

    public int SetDateSaida(){
        int a = SetDateEntrada();
        return a + 604800;
    }

    public void CadastrarCarga(String conteudoCarga, int qnt){
        IncrementID();
        this.conteudoCarga[this.id] = conteudoCarga;
        this.qnt[this.id] = qnt;
    }



}
