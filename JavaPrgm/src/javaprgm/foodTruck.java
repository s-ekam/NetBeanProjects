package javaprgm;

import java.text.SimpleDateFormat;
import java.util.*;


public class foodTruck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Scanner sc = new Scanner(System.in).useDelimiter(",");
        double lat = in.nextDouble();
        double lng = in.nextDouble();
        double r = in.nextDouble();
        ArrayList<Double> la = new ArrayList<Double>();
        ArrayList<Double> lo = new ArrayList<Double>();
        ArrayList<Integer> ph = new ArrayList<Integer>();
        ArrayList<Date> da = new ArrayList<Date> ();
        SimpleDateFormat sf = new SimpleDateFormat("MM/DD/YYYY hh:mm");
        ArrayList<Integer> ind = new ArrayList<Integer>();
        double d=0;
        for(int i=0;in.hasNext();i++)
        {
            String str = in.nextLine();
            if(i==0)
            {
                continue;
            }
            String[] s=new String[4];
            s= str.split(",");
            try
            {
                da.add(sf.parse(s[0]));
                la.add(Double.parseDouble(s[1]));
                lo.add(Double.parseDouble(s[2]));
                ph.add(Integer.parseInt(s[3]));
            }
            catch(Exception e ){System.out.println("Error : "+ e.getMessage());}
        }
        Vector v= new Vector();
        for(int i=0;i<da.size()-1;i++)
        {
            d=2*r*Math.asin(Math.sqrt(Math.pow(Math.sin((lat-la.get(i))/2),2)+Math.cos(lat)*Math.cos(la.get(i))*Math.pow(Math.sin((lng-lo.get(i))/2),2)));
            if(d<=r)
                v.add(i);
            
        }
       
       
    }
    
}
