
public class Student {
	public int Id, Hours, Points;
 
	public Student(int xId, int xHours, int xPoints) {
     this.Id = xId;
     this.Hours =xHours ;
     this.Points= xPoints;
 }
 
 public int getIdname()	{
		return Id;
	}
	public int gethoursname()	{
		return Hours;
	}
	public int getpointsname()	{
		return Points;
	}	
	public void  getIdname (int i)
	{
		Id = i;
	}
	public void gethoursname (int h)
	{
		Hours = h;
	}
	public void getpointsname(int p)
	{
		Hours = p;
	}
}
