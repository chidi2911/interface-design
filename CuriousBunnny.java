public class CuriousBunnny extends Animal
{

public CuriousBunnny(String name, String primaryColor)
{
super(name, primaryColor);
}

public void hop()
{
if (!super.isAlive())
{
System.out.println("Animal already fainted, can't hop!");
return;
}
System.out.println(this.getName() + " is hopping");
}

}








