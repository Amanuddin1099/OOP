package encapsulation;

import java.util.Objects;

public class Encapsulation {
    private String name;
    private int id;


    public String getPrint() {

        return name +"\n"+"Private Age: "+id;

    }


    public void setName(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
