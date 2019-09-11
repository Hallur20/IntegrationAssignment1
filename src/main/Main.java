/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import logic.StudentFactory;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 *
 * @author hvn15
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public Main() throws RemoteException {
        super();
    }

    public static Registry registry;

    public static void main(String[] args) throws IOException {
        try {
            //System.setProperty("java.rmi.server.hostname", "localhost");
            //10.50.131.82
            registry = LocateRegistry.createRegistry(1099);
            StudentFactory f = new StudentFactory();
            String engineName = "StudentServer";
            Naming.rebind("//localhost/StudentServer", new StudentFactory()); 
            //System.out.println("Engine " + engineName + " bound in registry");
            System.out.println(f.getAllStudents());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
