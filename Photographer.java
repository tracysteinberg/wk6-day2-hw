import java.util.*;

class Photographer{
  private String name;
  private String model;
  private String filter;
  private String resolution;
  private Boolean noiseReduction;
  private ArrayList<Printable> bag;



  public Photographer(String name, String model, String filter, String resolution, Boolean noiseReduction) {
    this.name = name;
    this.model = model;
    this.filter = filter;
    this.resolution = resolution;
    this.noiseReduction = noiseReduction;
    // USE THE FOLLOWING EXAMPLE FOR PDA POLYMORPHISM - USE OWN EXAMPLE AND SHOW RUN
    // WITH 2+ OBJECTS IN BELLY
    this.bag = new ArrayList<Printable>(); 


  }

  public String getName() {
    return this.name;

  }


  public String getModel() {
    return this.model;

  }


  public String getFilter() {
    return this.filter;

  }

  public String getResolution() {
    return this.resolution;

  }
  public boolean getNoiseReduction (){
     return this.noiseReduction;
  }

  public int cameraCount () {

       return this.bag.size(); 

  }


  public void addCamera ( Printable camera ) {

       this.bag.add(camera);

  }
  

  public void removeCamera( Printable camera) {

       this.bag.remove(camera);

      }

  public String cameraDetails() {

     String details = "";
     for (int i=0; i < this.bag.size(); i++) {

      details+= this.bag.get(i).printDetails(); 
       
     }

     return details;
  }
      
     
  }

