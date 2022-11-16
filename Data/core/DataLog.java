package Data.core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

import Data.array;


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


    public static String SetDateSaida(String string) throws ParseException{
        SimpleDateFormat date1 =new SimpleDateFormat("dd/MM/yyyy");
        Date date = date1.parse(string);
        long a = date.getTime()/ 1000;
        long b = a + 604800;
        long c = b * 1000;
        SimpleDateFormat jdf = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = jdf.format(c);
        
        
        return strDate;
    }

    public void CadastrarCarga(String conteudoCarga, int qnt){
        IncrementID();
        this.conteudoCarga[this.id] = conteudoCarga;
        this.qnt[this.id] = qnt;
    }



}
