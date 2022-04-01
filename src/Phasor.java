package panel;

public class Phasor {
	  double amplitude, frequency, phase;
	  
	  Phasor(double A, double f, double p){
	   amplitude = A;
	   frequency = f;
	   phase = p;
	  }
	  
	 
public class PVector state(double time, double offset){
	    return PVector.fromAngle(frequency * time + phase + offset).mult(amplitude);
	    
	    public static void fromAngle(double angle) {
	    	
	    }
	}


	public void Sort(Phasor[] Phasors)
	{
	  int n = Phasors.length;

	  for (int i = 0; i < n-1; i++)
	  {
	    int mindex = i;

	    for (int j = i+1; j < n; j++)
	    {
	      if (Phasors[j].amplitude > Phasors[mindex].amplitude)
	        mindex = j;
	    }
	    swap(Phasors, mindex, i);
	  }
	}



	public void swap(Phasor[] Phasors, int i, int j)
	{
	  Phasor temp = Phasors[i];
	  Phasors[i] = Phasors[j];
	  Phasors[j] = temp;
	}
}
