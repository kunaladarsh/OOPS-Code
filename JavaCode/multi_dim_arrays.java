package JavaCode;

public class multi_dim_arrays {

	public static void main(String[] args) {
   // int [] marks; // A 1-D Array
	int [][] flats; // A 2-D Array
    flats = new int[2][3];
	flats[0][0]= 100;
	flats[0][1] = 102;
	flats[0][2] = 103;
	flats[1][0]= 202;
	flats[1][1] = 203;
	flats[1][2] = 204;
	
	
	for(int i=0; i<flats.length; i++ ){
		for(int j=0; j<flats[i].length; j++){
			
		System.out.print(flats[i][j]);
		System.out.print(" ");
	}
		System.out.print("\n");
}
	}
}
