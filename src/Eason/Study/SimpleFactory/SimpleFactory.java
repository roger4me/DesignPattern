package Eason.Study.SimpleFactory;

public class SimpleFactory {
     public static Moveable create(String name)
     {
         switch(name){
             case "car" :
                  return new Car();
             case "train" :
                 return new Train();
             default:
                 return null;
         }
     }
}
