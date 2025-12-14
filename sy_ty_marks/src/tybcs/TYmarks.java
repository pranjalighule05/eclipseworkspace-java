package tybcs;

public class TYmarks {
   public int Theory;
   public int Practical;

   public TYmarks(int theory, int practical) 
   {
	   this.Theory = theory;
       this.Practical = practical;
   }

   public void displayMarks() 
   {
       System.out.println("Theory: " + Theory);
       System.out.println("Practical: " + Practical);
   }
}

