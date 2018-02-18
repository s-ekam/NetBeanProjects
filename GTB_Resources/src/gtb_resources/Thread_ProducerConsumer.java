package gtb_resources;


public class Thread_ProducerConsumer
{
   public static void main(String[] args)
   {
      PizzaCorner pizzaCornerobj = new PizzaCorner();
      PizzaWaiter waiterobj = new PizzaWaiter(pizzaCornerobj);
      PizzaChef chefobj = new PizzaChef(pizzaCornerobj);
      waiterobj.start();
      chefobj.start();
   }
}

class Pizza
{
     String type;
     String size;
     String additives;

     public Pizza(String type, String size, String additives)
     {
         this.type = type;
         this.size = size;
         this.additives = additives;
     }
}
class PizzaCorner
{
     Pizza mypizza;
     volatile int count = 0;
}

class PizzaWaiter extends Thread
{
 PizzaCorner gobj;

 public PizzaWaiter(PizzaCorner tobj) {
       gobj=tobj;
 }

 public void orderPizza() throws InterruptedException {
  synchronized (gobj) 
  {
   while (gobj.count == 0) 
   {
    System.out.println("Waiter:I don't have any pizzas to serve...Let me inform chef");
    gobj.wait();
    System.out
      .println("Waiter:Pizza baking completed by chef! Going to deliver pizza");
   }

  }

 }

 public void run() {
  try {
   orderPizza();
  } catch (InterruptedException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }

 }

}
class PizzaChef extends Thread
{

    PizzaCorner permobj1;

        public PizzaChef(PizzaCorner tobj1) {
        permobj1 = tobj1;
 }

     public void makePizza()
     {
        synchronized (permobj1)
        {
            if (permobj1.count == 0)
            {
               System.err.println("Chef:.No Pizzas...I am gonna make it..please wait for sometime ");
            try
            {
               permobj1.wait(10000);
            }

            catch (InterruptedException e)
            {
                 e.printStackTrace();
            }
         permobj1.mypizza = new Pizza("italian", "medium", "Jalopenos");
         
         permobj1.count = 1;
         System.out.println("Chef:I have made pizza . You can take it");

        permobj1.notify();
      }
   }

 }

 public void run()
 {
     makePizza();
 }

}

