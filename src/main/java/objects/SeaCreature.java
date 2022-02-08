package objects;

public class SeaCreature {

  String name;
  float size;
  String color;

  public SeaCreature(String name, float size, String color){
    this.name = name;
    this.size = size;
    this.color = color;
  }

  public String getName(){
    return name;
  }

  public float getSize(){
    return size;
  }

  public String getColor(){
    return color;
  }
    
}
