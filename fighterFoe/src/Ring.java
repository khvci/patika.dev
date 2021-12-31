public class Ring {
    Fighter f1;
    Fighter f2;

    public Ring(Fighter f1, Fighter f2)
    {
        this.f1 = f1;
        this.f2 = f2;
    }

    public boolean weightCheck()
    {
        return (f1.weight/f2.weight <= 1.1 && f1.weight/f2.weight >= 0.9);
    }

    public boolean isWinner()
    {
        if (f1.health == 0)
        {
            System.out.println(f2.name + " is the winner!");
            return true;
        } else if (f2.health == 0)

        {
            System.out.println(f1.name + " is the winner!");
            return true;
        }

        return false;
    }

    public int randomFighterSelector()
    {
        double randomNumber = Math.random();
        return (randomNumber < 0.5) ? 1 : 2;
    }

    public void printStatus()
    {
        System.out.println(f1.name + "'s remaining health:\t" + f1.health);
        System.out.println(f2.name + "'s remaining health:\t" + f2.health);
    }

    public void run()
    {
        if (weightCheck())
        {
            if (randomFighterSelector() < 2)
            {
                while (1 == 1)
                {
                    System.out.println("==== NEW ROUND ====");

                    f2.health = f1.hit(f2);
                    if (isWinner()) {break};

                    f1.health = f2.hit(f1);
                    if (isWinner()) {break};
                }
            } else {
                while (1 == 1)
                {
                    System.out.println("==== NEW ROUND ====");

                    f1.health = f2.hit(f1);
                    if (isWinner()) {break};

                    f2.health = f1.hit(f2);
                    if (isWinner()) {break};
                }
            }

        } else {
            System.out.println("Weight difference can't be more than 10%. Match is cancelled.");
        }
    }
}
