package model;
import java.util.Scanner;

public class User {
    public int id;
    public String name;
    public String userName;
    public String password;
    public String namePet;
    public String email;
    public int phone;
    public String address;
    public String salt;

    public String details1() {
        String s = ""  + "\n";
        s += "ID       : " + this.id + "\n";
        s += "Name     : " + this.name + "\n";
        s += "User name: " + this.userName + "\n";
        s += "password : " + this.password + "\n";
        s += "namePet  : " + this.namePet + "\n";
        s += "Email    : " + this.email + "\n";
        s += "Phone    : " + this.phone + "\n";
        s += "Address  : " + this.address + "\n";
        s += "Salt     : " + this.salt + "\n";
        return s;     
    }

     public void readData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.print("Name : ");
        this.name = sc.nextLine();
        System.out.print("User name : ");
        this.userName = sc.nextLine();
        System.out.print("Password: ");
        this.password = sc.nextLine();
        System.out.print("namePet: ");
        this.namePet = sc.nextLine();
        System.out.print("Email: ");
        this.email = sc.nextLine();
        System.out.print("Phone: ");
        this.phone = Integer.parseInt(sc.nextLine());
        System.out.print("Address: ");
        this.address = sc.nextLine();
        System.out.print("Salt: ");
        this.salt = sc.nextLine();
    }
}
