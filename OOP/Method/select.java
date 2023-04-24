import java.util.Scanner;
public class COM221_Act3_Pagulayan {

    public static void main (String[] args) {
      
      Selection();
    
    }

    public static void Selection() {

      Scanner s = new Scanner(System.in);

      System.out.println("FIGURES");

      //figures to select
      System.out.println("1: Square");
      System.out.println("2: Left Half Triangle");
      System.out.println("3: Inverted Left Half Triangle");
      System.out.println("4: Left Hollow Half");
      System.out.println("5: Inverted Left Hollow Half Triangle");
      System.out.println("6: Right Half Triangle");
      System.out.println("7: Inverted Right Half Triangle");
      System.out.println("8: Right Hollow Half Triangle");
      System.out.println("9: Inverted Right Hollow Half Triangle");
      System.out.println("10: Full Triangle");
      System.out.println("11: Inverted Full Triangle");
      System.out.println("12: Full Hollow Triangle");
      System.out.println("13: Inverted Full Hollow Triangle");
      System.out.println("14: Half Left Diamond");
      System.out.println("15: Half Left Hollow Diamond");

      //select a number that will print a figure 
      System.out.println("Enter number to select figure: ");
      int select = s.nextInt();

      switch (select) {
        case 1:
          Square();
          break;

          default:
            break;
      }
    }

      public static String Square(int n) {
        String figure = "";
        for(int r = 1; r<=n;r++) {
          for(int c=1; c<=n;c++) {
            figure += "* ";
          }
          figure += "\n";
        }
        return figure;
      }
   }
 
        
  
    
