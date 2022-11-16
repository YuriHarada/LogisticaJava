import Data.core.DataLog;

public class Main{ 
    public static void main(String[] args) {
        Data.core.view.ScreenMain.main(args);
        DataLog teste = new DataLog();
        int a = teste.SetDateSaida();
        System.out.println(a);
    }
}
