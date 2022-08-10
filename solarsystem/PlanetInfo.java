package solarsystem;



public class PlanetInfo {
       
	 private int noOfMoons;
     private boolean hasRings;
     private String planetName;
     private String surfaceGase="" ;  
	
	public String getSurfaceGase() {
		return surfaceGase;
	}
	public void setSurfaceGase(String surfaceGase) {
		this.surfaceGase=surfaceGase;
	}
	public int getNoOfMoons() {
		return noOfMoons;
	}
	public void setNoOfMoons(int noOfMoons) {
		this.noOfMoons = noOfMoons;
	}
	public boolean isHasRings() {
		return hasRings;
	}
	public void setHasRings(boolean hasRings) {
		this.hasRings = hasRings;
	}
	public String getPlanetName() {
		return planetName;
	}
	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}
	
       public PlanetInfo(String surfaceGase, int noOfMoons, boolean hasRings, String planetName) {
    	this.surfaceGase=surfaceGase;
		this.noOfMoons = noOfMoons;
		this.hasRings = hasRings;
		this.planetName = planetName;
	}
	  
       
    
	

}
