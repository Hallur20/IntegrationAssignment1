/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import entity.Student;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author hvn15
 */
public interface StudentInterface extends Remote{
    public String getAllStudents() throws RemoteException;
    ArrayList<Student> getOldStudents() throws RemoteException, IOException;
    ArrayList<Student> getNewStudents() throws RemoteException, SQLException;
}
