public class QuartsToGallons
{

    public static void main(String[] args)
      {
      
      final int QUARTS_IN_GALLON = 4;
      int quartsForPaintJob = 14;
      int x = (quartsForPaintJob - (quartsForPaintJob % QUARTS_IN_GALLON));
      int y = x / QUARTS_IN_GALLON;
      int z = quartsForPaintJob % QUARTS_IN_GALLON;
      
      System.out.println("A job that requires " + quartsForPaintJob + 
      " quarts requires " + y + " gallons plus " + z + " quarts.");
      
      }

}