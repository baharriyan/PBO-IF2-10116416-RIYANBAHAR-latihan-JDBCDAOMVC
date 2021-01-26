/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.riyanbahar.latihanmvcjdbc.event;

import edu.riyanbahar.latihanmvcjdbc.entity.Pelanggan;
import edu.riyanbahar.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author sweenutt
 * Nama       : Riyan Bahar
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116416
 * Deskripsi  : Program Latihan JDBC DAO MVC
 */
public interface PelangganListener {
    public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
    
    public void onDelete();
    
    public void onUpdate(Pelanggan pelanggan);
    
}
