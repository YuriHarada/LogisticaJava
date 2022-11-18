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

    public static boolean CpfValidation(String CPF) {
            String a = CPF.replace("-", "");
            String b = a.replace(".", "");
            CPF = b;
        if (CPF.equals("00000000000") ||
            CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") ||
            (CPF.length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;


        try {
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48);


            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);

            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
                 return(true);
            else return(false);
                } catch (InputMismatchException erro) {
                return(false);
            }
        }


    public String toString(){
        return "[Log] O(a) " + this.nomeOperador + " registrou o produto do id " + this.id;  
    }

}
