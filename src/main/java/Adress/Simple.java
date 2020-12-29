package Adress;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class Simple {
    public static void main(String[] args) {
        List<String>name=new ArrayList<>();
        name.add("salah");
        name.add("gb");
        name.add("mia");


        name.forEach(out::println);
    }
}
