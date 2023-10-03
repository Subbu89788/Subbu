package Interface;
interface college
{
	void bTech();
}
interface games extends college
{
	void cricket();
}

public class Sample004TNG implements  games {
	public void bTech()
	{
		System.out.println("B.Tech is executed");
	}
	public void cricket()
	{
		System.out.println("cricket is executed");
	}
	
	public static void main (String args[]) 
	{
		Sample004TNG q = new Sample004TNG();
		q.bTech();
		q.cricket();
	}
	

}
