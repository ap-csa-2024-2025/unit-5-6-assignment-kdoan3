public class Plane
{
  private int location;

public Plane()
{
  location = 0;
}

public Plane (int loc)
{
  if (loc >= -2000 && loc <= 2000)
  {
    location = loc;
  }
  else
  {
    location = 0;
  }
}

public void upward()
{
  if (location <= 1900)
  {
    location += 100;
  }
}

public void downward()
{
  if (location >= -1900)
  {
    location -= 100;
  }
}

public int getLocation()
{
  return location;
}

public String toString()
{
  String output = "";
  for ()
  {
    output += " ";
  }
  output += "@";
  return output;

}
}
