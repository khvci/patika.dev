public class Fighter {
    String name;
    byte damage;
    byte defence;
    byte health;
    byte weight;

    public Fighter(String name, byte damage, byte defence, byte health, byte weight)
    {
        this.name = name;
        this.damage = damage;
        this.defence = defence;
        this.health = health;
        this.weight = weight;
    }

    public int hit(Fighter foe)
    {
        System.out.println("--------------------");
        System.out.println(this.name + " attacked with force " + this.damage + " to " + foe.name);

        if (foe.defence >= this.damage)
        {
            System.out.println(foe.name + " dodged the attack.");
            return foe.health;
        }

        if (foe.health - this.damage <= 0)
        {
            return 0;
        }

        return (foe.health - this.damage);
    }



}
