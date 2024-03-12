package es3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Phonebook {
    private Map<String, String> rubric;

    public Phonebook() {
        rubric = new HashMap<>();
    }

    public void addContact(String name, String phoneNum) {
        rubric.put(name, phoneNum);
    }

    public void deleteContact(String name) {
        rubric.remove(name);
    }

    public String searchNameByNum(String phoneNum) {
        Set<String> contacts = rubric.keySet();
        for (String name : contacts) {
            String num = rubric.get(name);
            if (num.equals(phoneNum)) {
                return name;
            }
        }
        return null;
    }

    public String findNumByName(String name) {
        return rubric.get(name);
    }

    public void printContact() {
        for (String name : rubric.keySet()) {
            System.out.println("Name: " + name + ", Phone: " + rubric.get(name));
        }
    }
}
