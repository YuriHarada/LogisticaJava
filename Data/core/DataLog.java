package Data.core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.table.DefaultTableModel;

import Data.core.view.ScreenMain;


public class DataLog {

    private static int id;
    private double pesoCarga;
    private String nomeOperador;
    private int[] qnt;
    private String[] conteudoCarga;
    /* private String origem, destino;
 */
    
    public static int GetID(){
        DefaultTableModel dtmProdutos = (DefaultTableModel) ScreenMain.jTProdutos.getModel();            
        if (dtmProdutos.getRowCount() > 0) {
            return  (Integer) dtmProdutos.getValueAt(dtmProdutos.getRowCount() - 1, 0) + 1;
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

}
