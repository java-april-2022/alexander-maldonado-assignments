import java.util.ArrayList;

public class Orders {
    
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<String> items =new ArrayList<>();
    
    public Orders(){

    }
    public Orders(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public double getTotal(){
        return total;
    }

    public boolean getReady() {
        return ready;
    }
    
    public ArrayList<String> getItems() {
        return items;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }

}