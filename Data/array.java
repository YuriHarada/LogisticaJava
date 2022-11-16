package Data;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Data.core.view.ScreenMain;

public class Array {
    static public int front, rear,capacity;
    static public String[] queue;


    public Array()
    {
        front = rear = 0;
        queue = new String[10];
    }

    public String[] queueEnqueue(String string, int id)
    {
        queue[id] = string;
        return queue;
    }

    public String SearchItem(int id){
        return queue[id];
    }

    private int SearchId4Item(String a, String[] arr) {
        for(int i = 0; i >= arr.length; i++) {
            if(arr[i] == a) return i;
        }
        return -1;
    }
    public void remove(int id) {
        DefaultTableModel dtmProdutos = (DefaultTableModel) Data.core.view.ScreenMain.jTProdutos.getModel();
        dtmProdutos.removeRow(Data.core.view.ScreenMain.jTProdutos.getSelectedRow());
    }

}
