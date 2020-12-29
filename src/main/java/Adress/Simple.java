package Adress;

import java.util.ArrayList;
import java.util.List;

public class Simple {
    public static void main(String[] args) {
        List<String>name=new ArrayList<>();
        name.add("salah");
        name.add("gb");
        name.add("mia");


        name.forEach(System.out::println);
    }
}
