public abstract class WaterFowl extends Animal
{
  

private boolean flyOrLand ;
// true for flying
// false for landing
public WaterFowl(String name, String primaryColor)
{
super(name, primaryColor);
flyOrLand = true;
}

public void swim()
{
if (!super.isAlive()) {
System.out.println("This waterFowl already fainted, can't swim!");
return;
}
System.out.println(super.getName() + " is swimming");
}

public void fly()
{
if (!super.isAlive())
{
System.out.println("This waterFowl already fainted, can't fly!");
return;
}
System.out.println(super.getName() + " is flying");
}

public void getFlyOrLand()
{
if (!super.isAlive())
{
System.out.println("This waterFowl already fainted, it's neither Landing or Flying !");
return;
}
if (flyOrLand)
{
System.out.println(super.getName() + " is flying");
}
else
{
System.out.println(super.getName() + " is landing");
}
}

public void setFlyOrLand(boolean flyOrLand) {
this.flyOrLand = flyOrLand;
}

}