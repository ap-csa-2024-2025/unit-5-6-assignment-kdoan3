public class Dog
{
  private String breed;
  private double weight;
  private String name;
  private String color;


public Dog()
{
  breed = "weiner dog";
  name = "schnitzel";
  color = "red";
  weight = 1000;
}

public Dog(String iBreed, String iName, String iColor, double iWeight)
{
  breed = iBreed;
  name = iName;
  color = iColor;
  weight = iWeight;
}

public Dog(String iBreed, String iName)
{
  breed = iBreed;
  name = iName;
  color = "red";
  weight = 0;
}
  // Make setters
  public void setBreed(String iBreed)
  {
    breed = iBreed;
  }

  public void setWeight(double iWeight)
  {
    weight = iWeight;
  }

  public void setName(String iName)
  {
    name = iName;
  }

  public void setColor(String iColor)
  {
    color = iColor;
  }

  // Make getters
public String getBreed()
{
  return breed;
}

public void getName()
{
  return name;
}

public void double getWeight()
{
  return weight;
}

public void getColor()
{
  return color;
}

  
}
