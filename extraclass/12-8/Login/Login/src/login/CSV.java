/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ale
 */
public class CSV {

    String csvFile = "C:\\Users\\Ale\\Documents\\GitHub\\Fundamentos\\extraclass\\12-8\\Login\\Login\\Users.csv";
    BufferedReader br = null;
    String line = "";
    String csvSplitBy = ",";

    private boolean LogIn = false;
    private boolean Authenticator = false;

    public void CSVReader(String User, String Password) {
        try {
            Authenticator = true;
            br = new BufferedReader(new FileReader(csvFile));
            while (((line = br.readLine()) != null) && !LogIn) {

                String[] people = line.split(csvSplitBy);

                String userTemp = people[0];
                String passTemp = people[1];

                if ((User.equals(people[0])) && Password.equals(people[1])) {
                    JOptionPane.showMessageDialog(null, "Usuario Aceptado");
                    LogIn = true;

                }

            }
            Authenticator = false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "En este momento no podemos atender la solicitud");
        } finally {
            if (LogIn ||Authenticator) {
            } else {
                JOptionPane.showMessageDialog(null, "El usuario/contraseña estan incorrectos ");
            }

        }
    }

}
