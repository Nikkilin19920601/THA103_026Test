package xxx;

public class Train implements Comparable<Train> {
	// • 請設計一個Train類別,並包含以下屬性:
	// - 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
	// - 目的地 dest,型別為String - 票價 price,型別為double
	// • 設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件,放到每小題
	// 需使用的集合裡
	int number;
	String type;
	String star;
	String dest;
	double price;

	public Train(int number, String type, String star, String dest, double price) {
		this.number = number;
		this.type = type;
		this.star = star;
		this.dest = dest;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int compareTo(Train aTrain) {
		// 物件本身與 aEmployee 相比較，如果 retrun 正值，就表示比 aEmployee 大
		if (this.number > aTrain.number) {
			return 1;
		} else if (this.number < aTrain.number) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Train [number=" + number + ","
				+ " type=" + type + ", "
				+ "star=" + star + ", "
				+ "dest=" + dest + ", price=" + price+ "]";
	}
}
