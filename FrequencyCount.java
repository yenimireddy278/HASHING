package Demo;
import java.util.*;

public class FrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,2,3,1,2};
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int num:arr) {
			map.put(num,map.getOrDefault(num,0)+1);
			
		}
		System.out.println(map);

	}

}
