public class Lizard extends pet
{
    private String species;

    public Lizard(String name, String breed, int age, double weight, String food)
    {
        super(name, age, weight, food);
        this.species = breed;

    }//end lizard constructor with call to super

    public String Speak()
    {
        return "Hiss";
    }
    public int monthlyFeeding()
    {
        return 3;
    }

    public String toString()
    {
        String output = super.toString() + "\nSpecies: " + species;

        return output;
    }//end toString for lizard class
}//cl;ose class
