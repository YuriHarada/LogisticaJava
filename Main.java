import graphics.graphics;
import data.data;

public class Main{ 
    public static void main(String[] args) {
        graphics os = new graphics();
        data teste = new data();
        int a = teste.SetDateSaida();
        System.out.println( a);
        os.Start();
    }
}
