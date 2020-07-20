public class AnimalDriver {

public static void main(String[] args) {

CuriousBunnny curiousBunny = new CuriousBunnny("Scorbunny", "white");
HappyPig happyPig = new HappyPig("Swinub", "brown");
LoudGoose loudGoose = new LoudGoose("Zapdos", "Yellow");
AngryDuck angryDuck = new AngryDuck("Psyduck", "Yellow");

Animal a1 = new AngryDuck("www", "Yes"); //test
System.out.println("new animal's name is: " + a1.getName()); //test

System.out.println("Total alive animals: " + Animal.count);
System.out.println("_____________AngryDuck wants to fight_____________");
System.out.println("Its Name is " + angryDuck.getName() + " and it's " + angryDuck.getPrimaryColor());
angryDuck.hit();
angryDuck.hit();
System.out.println("Testing if AngryDuck can swim");
angryDuck.swim();
System.out.println("Testing if AngryDuck can fly");
angryDuck.fly();
System.out.println("Testing setName");
angryDuck.setName("Psyduck VI");
System.out.println("Its name is now " + angryDuck.getName());
System.out.println("Testing getFlyOrLand :");
angryDuck.getFlyOrLand();
angryDuck.hit();
// animal fained
System.out.println("Can angryDuck still fly ? ");
angryDuck.fly();
System.out.println("Total alive animals: " + Animal.count);
System.out.println();
System.out.println();

System.out.println("____________LoudGoose wants to fight_____________");
System.out.println("Its Name is " + loudGoose.getName() + " and it's " + loudGoose.getPrimaryColor());
loudGoose.hit();
loudGoose.hit();
System.out.println("Testing if LoudGoose can swim");
loudGoose.swim();
System.out.println("Testing getFlyOrLand: loudGoose is flying or landing?:");
loudGoose.getFlyOrLand();
System.out.println("Testing if LoudGoose can fly");
loudGoose.fly();
System.out.println("Testing setFlyOrLand: Let loudGoose land !");
loudGoose.setFlyOrLand(false);
System.out.println("Is loudGoose flying or landing ?");
loudGoose.getFlyOrLand();
loudGoose.hit();
// animal fained
System.out.println("Can loudGoose still fly ?");
loudGoose.fly();
System.out.println("Is loudGoose flying or landing ?");
loudGoose.getFlyOrLand();
System.out.println("Total alive animals: " + Animal.count);
System.out.println();
System.out.println();

System.out.println("______________HappyPig wants to fight______________");
System.out.println("Its Name is " + happyPig.getName() + " and it's " + happyPig.getPrimaryColor());
happyPig.hit();
happyPig.hit();
System.out.println("Testing if HappyPig can roll");
happyPig.roll();
System.out.println("Testing if HappyPig can sleep");
happyPig.sleep();
happyPig.hit();
// animal fained
System.out.println("Can Happypig still roll ?");
happyPig.roll();
System.out.println("Total alive animals: " + Animal.count);
System.out.println();
System.out.println();

System.out.println("_____________CuriousBunny wants to fight___________");
System.out.println("Its Name is " + curiousBunny.getName() + " and it's " + curiousBunny.getPrimaryColor());
curiousBunny.hit();
curiousBunny.hit();
System.out.println("Testing if CuriousBunny can hop");
curiousBunny.hop();
curiousBunny.hit();
// animal fained
System.out.println("Can CuriousBunny still hop ?");
curiousBunny.hop();
System.out.println("Testing ToString");
System.out.println(curiousBunny.toString());
System.out.println("Total alive animals: " + Animal.count);

}

}