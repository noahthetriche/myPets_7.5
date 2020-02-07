import java.text.DecimalFormat;//format weight in lbs

public abstract class pet
{
    String name;
    int age;
    double weight; //kg
    private final double lbToKg = 0.454;
    public String food;
    DecimalFormat fmt = new DecimalFormat("#.#");//create formatting object

    public pet(String name, int age, double weight, String food)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.food = food;
    }//end full constructor to call child classes

    //Getters
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }



    abstract public String Speak();//polymorphic object
    abstract public int monthlyFeeding();

    public double AmericanFreedomUnits()
    {
        return weight * 2.205;
    }

    public String toString()
    {
        String output = "Name: " + name;
        output+= "\nAge: " + age;
        output += "\nWeight: " + weight + "kg." + "(" + fmt.format(AmericanFreedomUnits()) + " )";
        output += "\nWeight: " + weight;
        output += "\nFood: " + food;

        return output;
    }
}
