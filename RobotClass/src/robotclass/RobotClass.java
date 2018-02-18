/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotclass;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import java.util.Date;
/**
 *
 * @author Ekam
 */
public class RobotClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        RobotClass rbc = new RobotClass();
        try {
            Robot rb = new Robot();
            for(int i=0;i<10;i++)
            {
                BufferedImage bimg = rb.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize().width,
                                                            Toolkit.getDefaultToolkit().getScreenSize().height));
                String timeStamp = new SimpleDateFormat("yyMMddHHmmss").format(new Date());
                ImageIO.write(bimg, "jpg",new File("E:\\javaPics\\"+timeStamp+".jpg"));
                int x = (int)(10*Math.random())+1;
                Thread.sleep(x*1000);
            }
        } 
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            
        }
        
        
        
    }
    
}
