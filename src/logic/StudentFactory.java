/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import au.com.bytecode.opencsv.CSVReader;
import entity.Student;
import interfaces.StudentInterface;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hvn15
 */
public class StudentFactory extends UnicastRemoteObject implements StudentInterface {

    public StudentFactory() throws RemoteException{
        super();
    }
    
    

    @Override
    public String getAllStudents() throws RemoteException{
        String allStudents = "";
        ArrayList<Student> studentsFromFile = null;
        ArrayList<Student> studentsFromMySQL = null;
        try {
            studentsFromFile = getNewStudents();
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Student student : studentsFromFile) {
            allStudents += student.getName() + ", " + student.getEmail() + ", " + student.getAge() + ", " + student.getSemester() + "\n";
        }

        try {
            studentsFromMySQL = getOldStudents();
        } catch (IOException ex) {
            Logger.getLogger(StudentFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Student student: studentsFromMySQL) {
            allStudents += student.getName() + ", " + student.getEmail() + ", " + student.getAge() + ", " + student.getSemester() + "\n";
        }
        return allStudents;
    }

    @Override
    public ArrayList<Student> getOldStudents() throws RemoteException, IOException {
        ArrayList<Student> students = new ArrayList<>();
        Reader reader = Files.newBufferedReader(Paths.get(System.getProperty("user.dir") + "/newStudents.csv"));
        CSVReader csvReader = new CSVReader(reader, ',', '\'', 1);
        String[] nextRecord;

        while ((nextRecord = csvReader.readNext()) != null) {
            students.add(new Student(nextRecord[0], nextRecord[1], Integer.parseInt(nextRecord[2]), "******Second semester******"));
        }
        return students;
    }

    @Override
    public ArrayList<Student> getNewStudents() throws RemoteException, SQLException {
        ArrayList<Student> students = new ArrayList<>();
        Connection con = null;
        try {
            con = DriverManager.
                    getConnection("jdbc:mysql://10.50.131.186:3306/students?useSSL=false", "hallo", "abc123");
            System.out.println("Connection is successful !!!!!");
            PreparedStatement p = con.prepareStatement("select * from students");
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                students.add(new Student(rs.getString("name"), rs.getString("email"), rs.getInt("age"), "******First semester******"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
        con.close();
        }
        return students;
    }


}
