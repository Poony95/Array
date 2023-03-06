package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		double [] data = new double[5];   
		int size = 0;   // int 함수 추가( total 제공을 위함)
		
		data[0] = 10.0; size++;
		data[1] = 20.0; size++;
		data[2] = 30.0; size++;
		
		double total = 1;
		
		for(int i = 0; i < size; i++) {   // i < data.length를 i < size로 바꿈
			System.out.println(data[i]);         
			total *= data[i];    // 
		}
		
		System.out.println("total = " + total);   // ???? 값이 왜 6000.0?
	}

}