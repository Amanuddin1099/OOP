package static_keyword;

public class Student {
    String name;
    int id;
    static String univerityName= "John jay";

    Student(String n, int i){
        name=n;
        id=i;


    }
    void dispalyInformation(){
        System.out.println("Name :  "+name);
        System.out.println("ID :  "+id);
        System.out.println("UniversityName :  "+univerityName);
    }

}


