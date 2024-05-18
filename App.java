import model.Admin;
import model.Pet;
import model.User;

public class App {
    public static void main(String[] args) throws Exception {
        /*Admin adm = new Admin(); */

        // ADMINISTRADOR
        Admin adm = new Admin();
        adm.readData();

        Admin[] admins = {adm};
        for (int i = 0; i < admins.length; i++) {
            System.out.println(admins[i].details());
        }


        // USUARIO
        User us = new User();
        us.readData();

        User[] users = {us};
        for (int i = 0; i < users.length; i++) {
            System.out.println(admins[i].details());
        }



        // PET
        Pet pet = new Pet();
        pet.readData();

        Pet[] pets = {pet};
        for (int i = 0; i < pets.length; i++) {
            System.out.println(pets[i].details());
        }
    }
}
