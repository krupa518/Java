package com.training.encapsulation;

public class Employee {
    private String name;
    private int id;

    /*
     * public String name1; public int id1;
     */

    /*
     * public String getName1() { return name1; }
     */

    Employee(){
        System.out.println("default constructor");
    }
    Employee(String name){
        this.name = name;

    }
    Employee(int id, String name){
        this.id = id;
        this.name =name;
    }

    /*
     * public void setName1(String name1) { this.name1 = name1; }
     */
    /*
     * public int getId1() { return id1; }
     */

    /*
     * public void setId1(int id1) { this.id1 = id1; }
     */
    public String getName() {
        return name;
    }

    /*
     * public void setName(String name) { this.name = name; }
     */
    public int getId() {
        return id;
    }
    /*
     * public void setId(int id) { this.id = id; }
     */
}
