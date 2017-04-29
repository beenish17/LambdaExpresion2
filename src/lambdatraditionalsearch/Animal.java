
package lambdatraditionalsearch;

public class Animal {
    protected String species;
    protected boolean canHop;
    protected boolean canSwim;
    
    public Animal(String species,boolean canHop,boolean canSwim){

        this.species=species;
        this.canHop=canHop;
        this.canSwim=canSwim;
    }
    public boolean getcanHop(){
        return canHop;
    }
    public String getspecies(){
        return species;
    }
    public boolean getcanSwim(){
        return canSwim;
    }
}
