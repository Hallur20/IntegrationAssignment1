/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import au.com.bytecode.opencsv.CSVReader;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import logic.StudentFactory;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
/**
 *
 * @author hvn15
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static Registry registry;
    public static void main(String[] args) throws IOException {

        StudentFactory f = new StudentFactory();
        System.out.println(f.getAllStudents());
    }
}
