package kiemtragiuaki;
public class appleNode {
   

	int id;
	float KL;
	String color;
	
	public Apple() {
		
	}
	
	public Apple(int _id, float _KL, String _color) {
		id = _id;
		KL = _KL;
		color = _color;
	}
	
	public void inTT() {
		System.out.println("Táo màu "+ color + ", ID: "+ id + ", Khối lượng: "+ KL);
	}

}
