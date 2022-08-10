package solarsystem;

import java.util.ArrayList;

public class Operations {
	
   public static void main(String args[]) {
	   PlanetInfo obj1=new PlanetInfo(null, 0, false, "Mercury");
	   PlanetInfo obj2=new PlanetInfo("Carbon Dioxite , Nitrogen", 0, false, "Venus");
	   PlanetInfo obj3=new PlanetInfo("Nitrogen ,Oxygen", 1, false, "Earth");
	   PlanetInfo obj4=new PlanetInfo("Hydrogen , Helium", 79, true, "Jupitor");
	   PlanetInfo obj5=new PlanetInfo("Hydrogen, Helium", 83, true, "Saturn");
	   PlanetInfo obj6=new PlanetInfo("Hydrogen, Helium, Methane", 27, true, "Uranus");
	   
	   ArrayList<PlanetInfo> objects=new ArrayList<>();
	      objects.add(obj1);
	      objects.add(obj2);
	      objects.add(obj3);
	      objects.add(obj4);
	      objects.add(obj5);
	      objects.add(obj6);
	      
	  System.out.println("Count of moons of all planets having rings: "+countOfMoons(objects));    
	  System.out.println("\nGases that is found on maximum planets: ");
	  gases(objects);
	   
	   
   }
   public static void gases(ArrayList<PlanetInfo> obj) {
	   for(PlanetInfo i : obj) {
		    if(i.getSurfaceGase() != null ) {
		    	System.out.print(i.getPlanetName()+"-"+i.getSurfaceGase());
		    }
		    System.out.println();
	   }
   }
   public static int countOfMoons(ArrayList<PlanetInfo> obj) {
	   int sum=0;
	   for(PlanetInfo i:obj) {
		   if(i.isHasRings())
		    sum=sum+i.getNoOfMoons();
	   }
	   return sum;
   }
}
