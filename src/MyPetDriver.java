public class MyPetDriver
{
    public static void main(String []args)
    {

        Dog rex = new Dog("Rex", "German Shepherd", 2, 160.0, "kibble");
        Lizard shaggy = new Lizard("Shaggy", "Blue-Toungued Skink", 8, 2, "Bugs");
        Bird chimkin = new Bird("chimkin", 5, 7.5, "White and Brown", 2.7, "Chicken", "Seeds");
        //pet secret = new pet("Secret", 7, 40.2);
        //abstract classes cannot be printed, even with necessary elements

        /*
        System.out.println(rex.Fetch());//only works when rex is a dog, not when rex is a pet
        System.out.println(rex.Speak());//dependent on what type of pet rex is
        
         */

        /*
        int[] arrayOfInts = new int[5];//make new array
        pet[] menagerie = new pet[5];
        menagerie[0] = rex;
        menagerie[1] = shaggy;
        menagerie[2] = chimkin;

        for(int i = 0; i < menagerie.length; i++)
        {
            System.out.println(menagerie[i]);
        }
         */

        /*
        System.out.println("Rex says: " + rex.Speak());
        System.out.println("Shaggy says: " + shaggy.Speak());
        System.out.println("Chimkin says: " + chimkin.Speak());

         */

        /* Testing pets
        System.out.println(rex);
        System.out.println(shaggy);
        System.out.println(chimkin);
        //System.out.println(secret);

         */
    }


}
//push to git
