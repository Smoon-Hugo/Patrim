package com.example.patrim;

import com.example.patrim.model.User;

public class UserTest {

    public static void main(String[] args) {
        // Création d’un nouvel utilisateur
        User user = new User("Hugo", "hugo@mail.com", "motdepasse123");

        // Utilisation des getters
        System.out.println("Nom : " + user.getName());
        System.out.println("Email : " + user.getEmail());
        System.out.println("Mot de passe : " + user.getPassword());

        // Modification avec les setters
        user.setName("Mohammed");
        user.setEmail("mohammed@mail.com");
        user.setPassword("nouveauMotDePasse");

        // Affichage après modification
        System.out.println("Nom modifié : " + user.getName());
        System.out.println("Email modifié : " + user.getEmail());
        System.out.println("Mot de passe modifié : " + user.getPassword());
    }
}
