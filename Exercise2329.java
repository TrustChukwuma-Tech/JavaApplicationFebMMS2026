public class Exercise2329 {
   public static void main(String[] args) {
      double startPopulation = 8300000000.0;   // 2026 estimate
      double growthRate = 0.0083;              // 0.83% per year
      double population = startPopulation;
 
      System.out.printf("%-6s %-20s %-20s%n", "Year", "Population", "Added");
 
      for (int year = 1; year <= 75; year++) {
         double increase = population * growthRate;
         population += increase;
         System.out.printf("%-6d %-,20.0f %-,20.0f%n",
            year, population, increase);
      }
 
      // keep growing until the population has doubled
      int doubleYear = 75;
      while (population < 2 * startPopulation) {
         population += population * growthRate;
         doubleYear++;
      }
 
      System.out.printf("%nThe population doubles in year %d (about %d).%n",
         doubleYear, 2026 + doubleYear);
   }
}

