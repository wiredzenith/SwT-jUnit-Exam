/*
Creadted by: Tomasz Klebek
Date: 09/03/2020

*/
package ie.gmit;

public class Employee {
    private String title;
    private String name;
    private String pps;
    private String number;
    private String emplymetType;
    private int age;

    public Employee() throws Exception {
        throw new Exception("Please fill all fields");
    }

    public Employee(String title, String name, String pps, String number, String emplymetType, int age) throws Exception {

        if (title == "Mr" || title == "Mrs" || title == "Mr"){
            this.title = title;
        }
        else{
            throw new Exception("Invalid Title");
        }
        this.name = name;
        this.pps = pps;
        this.number = number;
        this.emplymetType = emplymetType;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws Exception {
        if (title == "Mr" || title == "Mrs" || title == "Mr"){
            this.title = title;
        }
        else{
            throw new Exception("Invalid Title");
        }

        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPps() {
        return pps;
    }

    public void setPps(String pps) {
        this.pps = pps;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmplymetType() {
        return emplymetType;
    }

    public void setEmplymetType(String emplymetType) {
        this.emplymetType = emplymetType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
