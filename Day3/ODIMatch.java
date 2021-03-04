public class ODIMatch extends Match {
	public float calculateRunRate() {
		int n;
		float o,res;
		n= getTarget()-getCurrentscore();
		o=50-getCurrentover();
		res=n/o;
		return res;
	}
	public int calculateBalls()
	{
		int m;
		m=(int)((50-getCurrentover())*6);
		return m;
	}
	public void display(double reqRunrate,int balls)
	{
		System.out.println("Need " + (getTarget()-getCurrentscore()) +"runs in " +balls+"balls");
		System.out.println("Required Runrate:"+reqRunrate);
		
	}
	
}
