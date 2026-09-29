/*public class Hotel{
    int coffee = 10;
    int tea = 20;
    
    public static void main(String[] args) {
        Hotel splier1 = new Hotel();
               // Hotel splier2 = new Hotel();

        System.out.println("Coffee available: " + splier1.coffee);
        System.out.println("Tea available: " + splier1.tea);
    }
}*/

public class laptop {
    String name = "HP";
    String proc = "";
    int ram = 4;
    int storage = 256;

    public static void main(String[] args) {
        laptop lapone = new laptop();
        lapone.name = "Dell";
        lapone.proc = "i5";
        lapone.ram = 8;
        lapone.storage = 512;

        //System.out.println("Laptop Name: " + lapone.name);
       // System.out.println("Processor: " + lapone.proc);
        //System.out.println("RAM: " + lapone.ram + "GB");
        //System.out.println("Storage: " + lapone.storage + "GB");

        laptop laptwo = new laptop();
        laptwo.name = "HP";
        laptwo.proc = "i7";
        laptwo.ram = 16;
        laptwo.storage = 1024;

        //System.out.println("Laptop Name: " + laptwo.name);
       // System.out.println("Processor: " + laptwo.proc);
        System.out.println("RAM: " + laptwo.ram + "GB");
       // System.out.println("Storage: " + laptwo.storage + "GB");

               laptop lapthree = new laptop();
               System.out.println("Laptop Name: " + lapthree.name);

    }


}