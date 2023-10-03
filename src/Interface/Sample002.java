package Interface;
interface Shape
{
	void Draw();
}
class Rectagle implements Shape{
	public void Draw()
	{
		System.out.println("Draw the shape of the rectange......");
	}
}
class circle implements Shape
{
	public void Draw()
	{
		System.out.println("Draw the shape of the circle......");
	}
}

public class Sample002 {

	public static void main(String[] args) {
		
		Shape s= new circle();
s.Draw();

	}

}
