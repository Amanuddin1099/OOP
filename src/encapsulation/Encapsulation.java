package encapsulation;

import java.util.Objects;

public class Encapsulation {
    private String name;
    private int id;


    public String getName() {

        return name;

    }

   public int getId() {
       return id;
   }
    public void setName(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
