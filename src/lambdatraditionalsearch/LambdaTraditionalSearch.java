
package lambdatraditionalsearch;

import java.util.ArrayList;
import java.util.List;

public class LambdaTraditionalSearch {

    public static void main(String[] args) {
        
       List<Animal> animals=new ArrayList<Animal>();
       animals.add(new Animal("Fish",false,true));
       animals.add(new Animal("Kangroo",true,false));
       animals.add(new Animal("Rabbit",true,false));
       
//       print(animals,new CheckIfHopper());
       
    CheckTrait checker=animal->(animal.canHop);
    print(animals,checker);
    }
    static void print(List<Animal> animals,CheckTrait checker){
       
        for(Animal animal:animals ){
            
            if(checker.test(animal)) {
                System.out.print(animal.species +"  ");
                System.out.print(animal.canHop +"  ");
                System.out.println(animal.canSwim +"  ");
            }
        }
        System.out.println();
    }
    
}