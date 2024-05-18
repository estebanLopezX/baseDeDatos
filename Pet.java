package model;
import java.util.Scanner;

public class Pet {
    public int id;
    public int admindId;
    public int userId;
    public String name;
    public String specie;
    public String race;
    public String birthdate;
    public int weight;
    public int sterelized;
    public String medicalCondition;
    public String nameVeterinarian;
    public int firstVaccine;
    public int rabiesVaccine;
    private String adminId;

    public String details(){
        String s = "" + "\n";
        s += "ID              : " + this.id + "\n";
        s += "adminId         : " + this.adminId + "\n";
        s += "userId          : " + this.userId + "\n";
        s += "name            : " + this.name + "\n";
        s += "Specie          : " + this.specie + "\n";
        s += "birthdate       : " + this.birthdate + "\n";
        s += "weight          : " + this.weight + "\n";
        s += "sterelized      : " + this.sterelized + "\n";
        s += "medicalCondition: " + this.medicalCondition + "\n";
        s += "nameVeterinarian: " + this.nameVeterinarian + "\n";
        s += "firstVaccine    : " + this.firstVaccine + "\n";
        s += "rabiesVaccine   : " + this.rabiesVaccine + "\n";
        return s;
    }

    public void readData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.print("adminId  : ");
        this.adminId = sc.nextLine();
        System.out.print("userId : ");
        this.userId = Integer.parseInt(sc.nextLine());
        System.out.print("name: ");
        this.name = sc.nextLine();
        System.out.print("Specie: ");
        this.specie = sc.nextLine();
        System.out.print("birthdate: ");
        this.birthdate = sc.nextLine();
        System.out.print("weight: ");
        this.weight = Integer.parseInt(sc.nextLine());
        System.out.print("sterelized: ");
        this.sterelized = Integer.parseInt(sc.nextLine());
        System.out.print("medicalCondition: ");
        this.medicalCondition = sc.nextLine();
        System.out.print("nameVeterinarian: ");
        this.nameVeterinarian = sc.nextLine();
        System.out.print("firstVaccine: ");
        this.firstVaccine = Integer.parseInt(sc.nextLine());
        System.out.print("rabiesVaccine: ");
        this.rabiesVaccine = Integer.parseInt(sc.nextLine());
    }
}
