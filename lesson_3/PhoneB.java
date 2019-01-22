package lesson_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneB {
    private Map<String, List<String>> books = new HashMap<>();
    private List<String> phone_numbers;

    public void add(String name, String phonenumber) {
        if (books.containsKey(name)) {
            phone_numbers = books.get(name);
            phone_numbers.add(phonenumber);
            books.put(name, phone_numbers);
        } else {
            phone_numbers = new ArrayList<>();
            phone_numbers.add(phonenumber);
            books.put(name, phone_numbers);
        }
    }

    public List<String> get(String name) {
        return books.get(name);
    }

}