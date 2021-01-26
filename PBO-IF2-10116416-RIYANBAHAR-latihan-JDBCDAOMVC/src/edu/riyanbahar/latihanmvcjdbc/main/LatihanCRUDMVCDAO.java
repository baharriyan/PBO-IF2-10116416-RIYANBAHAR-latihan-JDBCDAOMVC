/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.riyanbahar.latihanmvcjdbc.main;

import edu.riyanbahar.latihanmvcjdbc.database.KingsBarbershopDatabase;
import edu.riyanbahar.latihanmvcjdbc.error.PelangganException;
import edu.riyanbahar.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author sweenutt
 * Nama       : Riyan Bahar
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116416
 * Deskripsi  : Program Latihan JDBC DAO MVC
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
       SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}
