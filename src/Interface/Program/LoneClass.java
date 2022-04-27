package Interface.Program;

public class LoneClass implements AutoMobileLone, HousingLone
{

	@Override
	public float rateOfInterestHousing() 
	{
		return 6.7f;
	}

	@Override
	public float rateOfInterestAuto() 
	{
		return 5.55f;
	}
	public static void main (String args[])
	{
		LoneClass ob =new LoneClass();
		System.out.println(ob.rateOfInterestAuto());
		System.out.println(ob.rateOfInterestHousing());
	}
	
}
