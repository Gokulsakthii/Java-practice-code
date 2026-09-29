class animal {
    String name;
    int age;

    void makesound() {
        System.out.println("animal makes a sound");
    }
}
    class dog extends animal {
        String preed;
        @Override
        void makesound() {
            System.out.println("dog barks");
        }


            void fetch() {
                System.out.println("dog is fetching");
            }

    }
 class cat extends animal {
        String color;
        @Override
        void makesound() {
            System.out.println("cat meows");
        }

            void climb() {
                System.out.println("cat is climbing");
            }
        
    }

    
public class inheritance {
    public static void main(String[] args) {
       dog d = new dog();
       d.name= "raja";
       d.age= 5;
       d.preed= "german";
       d.makesound();
       d.fetch();

         cat c = new cat();
         c.name= "tom";
         c.age= 3;
         c.color= "black";
         c.makesound();
         c.climb();
    }
}