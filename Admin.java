package model;
import java.util.Scanner;

public class Admin {
    public int id;
    public int nit;
    public String name;
    public String userName;
    public String password;
    public String salt;

    /*public Admin() {
        this.id = -1;
        this.name = "No name";
        this.nit = -1;
        this.userName = "No user name";
        this.password = "No password";
        this.salt = "No salt";
    }

    public Admin(String[] data) {
        this.id = Integer.parseInt(data[0]);
        this.name = data[1];
        this.nit = Integer.parseInt(data[2]);
        this.userName = data[3];
        this.password = data[4];
        this.salt = data[5];
    }*/

    public String details() {
        String s = "" + "\n";
        s += "ID       : " + this.id + "\n";
        s += "Name     : " + this.name + "\n";
        s += "NIT      : " + this.nit + "\n";
        s += "User name: " + this.userName + "\n";
        s += "Password : " + this.password + "\n";
        s += "Salt     : " + this.salt + "\n";
        return s;
    }

    public void readData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.print("Name : ");
        this.name = sc.nextLine();
        System.out.print("NIT : ");
        this.nit = Integer.parseInt(sc.nextLine());
        System.out.print("User name: ");
        this.userName = sc.nextLine();
        System.out.print("Password: ");
        this.password = sc.nextLine();
        System.out.print("Salt: ");
        this.salt = sc.nextLine();
    }

     
}
