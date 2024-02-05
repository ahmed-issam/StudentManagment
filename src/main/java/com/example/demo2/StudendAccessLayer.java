package com.example.demo2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StudendAccessLayer {
    private Map<Integer, StudentDataLayer> allStudents = new HashMap<>();

    public Map<Integer, StudentDataLayer> getAllStudents() {
        return allStudents;
    }

    public void setAllStudents(Map<Integer, StudentDataLayer> allStudents) {
        this.allStudents = allStudents;
    }

    public Collection<StudentDataLayer> getAllData() {


        return allStudents.values();
    }

    public void setData(StudentDataLayer text) {
        text.setId(allStudents.size() + 1);
        allStudents.put(text.getId(), text);
    }

    public void replaceData(StudentDataLayer text) {
        allStudents.put(text.getId(), text);
    }

    public StudentDataLayer getData(int id) {
        if (id > allStudents.size()) {
            return allStudents.get(id);
        } else {

            System.out.println("Please Enter id again");
            return null;
        }
    }

    public void removeData(int id) {
        if (id > allStudents.size()) {
            allStudents.remove(id);
        } else {
            System.out.println("Please Enter id again");
        }
    }


}
