public class Dog extends pet
{

    String breed;

    public Dog(String name, String breed, int age, double weight, String food)
    {
        super(name, age, weight, food);
        this.breed = breed;
    }//end full constructor with call to super

    public String Fetch()
    {
        if(Math.random() >= 0.5)
        {
            return "Fetch Complete.";
        }
        else
        {
            return "No Fetch Completed.";
        }
    }//end method that only exists in dog

    public int monthlyFeeding()
    {
        int dailyFeedings;

        if(super.getAge() < 6)
        {
            dailyFeedings = 2;
        }
        else
        {
            dailyFeedings = 1;
        }
        return dailyFeedings * 30;
    }

    public String Speak()
    {
        if(this.age < 2)
        {
            return "Yipp";
        }
        return "Woof";
    }

    public String toString()
    {

        String output = super.toString() + "\nBreed: " + breed;

        return output;
    }//end toString
}
