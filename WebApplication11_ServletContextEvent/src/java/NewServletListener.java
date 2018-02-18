
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Web application lifecycle listener.
 *
 * @author Ekam
 */
public class NewServletListener implements ServletContextListener {
int count;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("initialized..");
        DBCon conec = new DBCon("jdbc:mysql://localhost:3306/javaadv", "root","ekam");
        
        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaadv", "root","ekam");
//            Statement state = con.createStatement();
            ResultSet myres = conec.state.executeQuery("select count from count");
            while(myres.next())
            {
                count = myres.getInt("count");
            }
            
            sce.getServletContext().setAttribute("COUNT",count);
            sce.getServletContext().setAttribute("con",conec);
            
//            count = myres.getInt("count")+1;
            
        } catch (SQLException ex) {
//            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext cc= sce.getServletContext();
        cc.getAttribute("con");
        System.out.print("HELLO WORLD");
        
    }
//        
//        System.out.print("HERE DESTROYING");
//                int cou =(Integer) sce.getServletContext().getAttribute("COUNT");
//                cou++;
//                sce.getServletContext().setAttribute("COUNT", cou);
//    try {
//        DBCon con = (DBCon) sce.getServletContext().getAttribute("con");
////        ResultSet res = con.state.executeQuery("select count from count");
////        while(res.next())
////        {
////            cou = res.getInt("count");
////        }
//        
//        if(con.state.execute("update count set count = "+(cou)+""))
//        {
//            System.out.print("UPDATED");
//            System.out.print(cou);
//        }
//        System.out.print("HERE");
//        con.con.close();
//    } catch (SQLException ex) {
//        System.out.print(ex.getMessage());
////        Logger.getLogger(NewServletListener.class.getName()).log(Level.SEVERE, null, ex);
//    }
//    }
}
