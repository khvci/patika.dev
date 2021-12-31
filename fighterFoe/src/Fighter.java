public class Fighter {
    String name;
    int damage;
    int defence;
    int health;
    double weight;

    public Fighter(String name, int damage, int defence, int health, double weight)
    {
        this.name = name;
        this.damage = damage;
        this.defence = defence;
        this.health = health;
        this.weight = weight;
    }

    public int hit(Fighter foe)
    {
        int tempHit = (int)(Math.random() * this.damage);
        int tempDef = (int)(Math.random() * this.defence);

        System.out.println(this.name + " attacked with force " + tempHit + " to " + foe.name);

        if (tempDef >= tempHit)
        {
            System.out.println(foe.name + " dodged the attack.");
            return foe.health;
        }

        if (foe.health - tempHit <= 0)
        {
            return 0;
        }

        return (foe.health - tempHit);
    }



}
