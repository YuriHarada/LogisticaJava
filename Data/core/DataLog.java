package Data.core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.table.DefaultTableModel;

import Data.core.view.ScreenMain;


public class DataLog {
    public int id;
    private double pesoCarga;
    private String nomeOperador;
    private int[] qnt;
    private String[] conteudoCarga;

    
    public DataLog(int idInitial, String nomeOperador) {
        super();
        this.id = idInitial;
        this.nomeOperador = nomeOperador;
    }

    public Integer GetID(){
        DefaultTableModel dtmProdutos = (DefaultTableModel) ScreenMain.jTProdutos.getModel();            
        if (dtmProdutos.getRowCount() > 0) {
            Object a = dtmProdutos.getValueAt(dtmProdutos.getRowCount() - 1, 0);

            this.id = Integer.parseInt(a.toString());
            return  this.id + 1;
        }else {
            return 1;
        }
        
    } 

    public void SetconteudoCarga(String[] conteudoCarga){
        this.conteudoCarga = conteudoCarga;
    }

    public String[] GetconteudoCarga(){
        return this.conteudoCarga;
    }

    public void Setqnt(int[] qnt){
        this.qnt = qnt;
    }

    public int[] Getqnt(){
        return this.qnt;
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

    public String toString(){
        return "[Log] O(a) " + this.nomeOperador + " registrou o produto do id " + this.id;  
    }  

}
