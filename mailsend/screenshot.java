/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailsend;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author hp
 */
public class screenshot {
    
    
    public static void main(String[] args) throws AWTException, IOException {
        
        Robot ro = new Robot();
        BufferedImage  im = ro.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(im, "jpg", new File("C:\\Users\\hp\\Desktop\\maths btech\\myscreen.jpg"));
        
    }
    
}
