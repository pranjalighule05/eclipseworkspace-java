package sybcs;

public class SYmarks {
	public int ComputerTotal;
	public int MathsTotal;
	public int ElectronicsTotal;
	
	public SYmarks(int computer,int math,int electronic)
	{
	    this.ComputerTotal=computer;
        this.MathsTotal=math;
        this.ElectronicsTotal=electronic;
    }

    public void displayMarks() 
    {
        System.out.println("Computer Total: " + ComputerTotal);
        System.out.println("Maths Total: " + MathsTotal);
        System.out.println("Electronics Total: " + ElectronicsTotal);
    }
}
