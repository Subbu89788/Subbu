package Interface;
interface Drawable
{  
void draw();  
static int cube(int x){return x*x*x;}  
}  
class Rectangle implements Drawable
{  
public void draw()
{
	System.out.println("drawing rectangle of statics to be bexecuted..");
	}  
} 
public class StaticMethod  extends Rectangle
{ 
	
	public static void main(String args[])
	{  
	Rectangle d=new Rectangle();  
	d.draw();  
	System.out.println(Drawable.cube(3)); 
	
	}
	
}  
