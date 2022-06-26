package com.company;

import java.sql.*;

public class InsertFile {
    public static void main(String[] args) {
        try {

            Connection con = null;
            Statement stmt = null;

            con = DriverManager
                    .getConnection("jdbc:sqlite:/C:\\sqlite\\java\\connect\\net\\sqlitetutorial\\Mulesoft\\MoviesDatabase.db");

            System.out.println("Database Connection Successful !!");

            stmt = con.createStatement(); // Create Statement

            String query0 = "INSERT INTO MyMovies values ('Pokiri','MaheshBabu','Ileyana', 2008,'Puri Jagannadh');";
            stmt.executeUpdate(query0); // Create Query-1

            String query1 = "INSERT INTO MyMovies values ('Okkadu','MaheshBabu','Bhoomika', 2004,'GunaShekar');";
            stmt.executeUpdate(query1); // Create Query-1

            String query2 = "INSERT INTO MyMovies values ('Darling','prabhas','kajal',2007,'A. Karunakaran');";
            stmt.executeUpdate(query2); // Create Query-2

            String query3 = "INSERT INTO MyMovies values ('Kushi','PawanKalyan','Bhoomika',2004,'SJ Surya');";
            stmt.executeUpdate(query3); // Create Query-3

            String query4 = "INSERT INTO MyMovies values ('Chhichhore','Sushanth singh rajput','Shraddha kapoor',2019,'Nitesh Tiwari');";
            stmt.executeUpdate(query4); // Create Query-4

            String query5 = "INSERT INTO MyMovies values ('RRR','Tarak','Oliviya',2022,'S.S.Rajamouli');";
            stmt.executeUpdate(query5);
            stmt.close();

            con.close();                //Close Connection
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Record  Insertion successful");
    }
}