/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author mercy
 */
public class TestUserprofile {
    public static void main(String[] arr){
        System.out.println("Enter your name and choose favourite Genre : ");
        Scanner input = new Scanner(System.in);
String name = input.nextLine();

        System.out.println("Choose your favorite genre from the following options:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        System.out.println("Enter the number corresponding to your favorite genre: ");
        int genreChoice = input.nextInt();

        if (genreChoice >= 1 && genreChoice <= genres.length) {
            String selectedGenre = genres[genreChoice - 1];

            UserProfile userProfile = new UserProfile(name, selectedGenre);
            System.out.println("User profile created successfully.");
            System.out.println("User ID: " + userProfile.getUserID());
            System.out.println("Favorite Genre: " + userProfile.getGenre());
        } else {
            System.out.println("Invalid genre choice. Please try again.");
        }
    }
}