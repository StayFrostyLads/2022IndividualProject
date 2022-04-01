package panel;

public class DFT {
	Phasor[] dft (double[] x) {
		  int N = x.length;
		  Phasor[] X = new Phasor[N];
		  for (int k = 0; k < N; k++) {
		    double re = 0;
		    double im = 0;
		    for (int n = 0; n < N; n++) {
		      double phi = ((Math.PI*2) * k * n) / N;
		      re += x[n] * Math.cos(phi);
		      im -= x[n] * Math.sin(phi);
		    }
		    re = re / N;
		    im = im / N;

		    double freq = k;
		    double amp = Math.sqrt(re * re + im * im);
		    double phase = Math.atan2(im, re);
		    X[k] = new Phasor(amp, freq, phase);
		}
		  
		  return X;
		}
}
