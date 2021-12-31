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
}
