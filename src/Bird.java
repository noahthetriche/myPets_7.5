public class Bird extends pet
{
    private String color;
    private String species;
    private double wingspan; //inches

    public Bird(String name, int age, double weight, String color, double wingspan, String species, String food)
    {
        super(name, age, weight, food);

        this.color = color;
        this.wingspan = wingspan;
        this.species = species;
        this.food = food;

    }

    public int monthlyFeeding()
    {
        return 8;
    }

    public String Speak()
    {
        if(this.species.equals("Duck"))
        {
            return "Quack";
        }

        return "The universe is a simulation";
    }

    public String toString()
    {
        String output = super.toString() + "\nColor: " + color;
        output += "\nWingspan: " + wingspan + " inches\n";
        output += "\nSpecies: " + species;

        return output;
    }
}
