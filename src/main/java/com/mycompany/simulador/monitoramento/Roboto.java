/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simulador.monitoramento;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manoe
 */
public class Roboto {

    private Font regular;
    private Font bold;
    
    public Roboto() {
        
        File regularFile = new File("fonts/roboto.ttf");
        File boldFile = new File("fonts/roboto-bold.ttf");
        
        try {
            regular = Font.createFont(Font.TRUETYPE_FONT, regularFile);
            bold = Font.createFont(Font.TRUETYPE_FONT, boldFile);
            
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(regular);
            ge.registerFont(bold);
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Font getRegular(Float size) {
        return regular.deriveFont(size);
    }
    
    public Font getBold(Float size) {
        return bold.deriveFont(size);
    }
}
