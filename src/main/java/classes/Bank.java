package classes;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;


    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }


    public boolean addBranch(String name){
        return false;
    }

}
//Victor.Aremu