/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app.util;

import java.net.URL;

/**
 *
 * @author PC
 */
public class UtilsX {

    public URL getFile(String ruta) {
        return this.getClass().getResource("/" + ruta);
    }

}
