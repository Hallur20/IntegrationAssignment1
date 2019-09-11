/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiclient;

import entity.Student;
import interfaces.StudentInterface;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Mo-Kayed
 */
public class RMIClient {

    public static void getInput() throws NotBoundException, MalformedURLException, RemoteException, IOException, SQLException {
        int n;
        String remoteEngine = "rmi://10.50.131.53/StudentServer";
        StudentInterface si = (StudentInterface) Naming.lookup(remoteEngine);
        Scanner input = new Scanner(System.in);

        while (true) { // Condition in while loop is always true here
            System.out.println("********************************");
            System.out.println("Type 1 to see all sudents");
            System.out.println("Type 2 to see new sudents");
            System.out.println("Type 3 to see old sudents");
            System.out.println("********************************");
            n = input.nextInt();
            //get all students
            if (n == 1) {
                String result = si.getAllStudents();
                System.out.println(result);

            }
            //get new students
            if (n == 2) {
                for (Student newStudent : si.getNewStudents()) {
                    System.out.println(newStudent);
                }

            }
            //get old student
            if (n == 3) {
                for (Student oldStudent : si.getOldStudents()) {
                    System.out.println(oldStudent);
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            getInput();
            // getService();  
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
