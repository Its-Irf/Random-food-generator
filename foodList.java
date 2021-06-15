import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList; // To hold food items

public class foodList {
    private ArrayList<Food> fArrayList;
    public foodList(){
        fArrayList=new ArrayList<Food>();
    }
    public void loadFoodList(String foodlistFileName){
        try {
            File foodlist = new File(foodlistFileName+".txt");
            Scanner myReader = new Scanner(foodlist);
            
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                int i= 0;
                int z= 0;
                String x = data;
                while(i+1<x.length()){
                    i=0;
                    z=0;
                    i = x.indexOf(":");
                    z=x.indexOf(",");
                    String name=x.substring(i+1,z);
                    x=x.substring(z+1);
                    i=x.indexOf(":");
                    String type=x.substring(0,i);
                    x=x.substring(i+1);
                    fArrayList.add(new Food(name,type));
                    


                }
            }
            myReader.close();
        }catch (FileNotFoundException e) {
            System.out.println("An error has occured.\nMAke sure that the file name stated is as indicated without addding the .txtx extension to the name.It must be word ofr word and exaclty as shown.");
        }

    }

    public void addFoodtoList(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many food items would you like to add?(Type in the number in the designated area shown:");
        int x = sc.nextInt();
        
        for(int i=0;i<x;i++){
            System.out.println("Enter food Item Name:");
            String name=sc.next();
            System.out.println("Next,enter food Item Type:");
            String type= sc.next();
            fArrayList.add(new Food(type, name));
        }
        sc.close();
    }
}
