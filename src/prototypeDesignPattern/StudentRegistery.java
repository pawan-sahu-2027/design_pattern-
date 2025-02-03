package prototypeDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistery {
    private Map<String , Student> map = new HashMap<>();
    public void registery (String name , Student student){
        map.put(name , student);
    }
    public Student get(String name){

        return map.get(name);
    }
}
