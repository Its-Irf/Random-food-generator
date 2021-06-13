

public class Food{
    private String type;
    private String name;
    //No parameter instance of food object with name and type of food
    public Food(){
        type="";
        name="";
    }

    public Food(String type, String name){
        this.type=type;
        this.name=name;
    }

    public String toString(){
        return name+","+ type;
    }



    
}