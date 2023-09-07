package xxx;

public class Calculator {


		private int x;
		private int y;

		public void setter(int x, int y) throws CalException {
	        if (x <= 0 || y <= 0) {
	            throw new CalException("x和y必須是非負整數");
	        }
//	        }else(!Integer.parseInt(Integer.toString(x))){
//	        }
	        	this.x = x;
	        	this.y = y;
	    }

			

		public int getterX() {
			return x;
		}

		public int getterY() {
			return y;
		}

		public int powerXY() {
			return (int) Math.pow(x, y);
		}
	}



