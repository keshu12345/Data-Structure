import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="KKEESSHHAAV";
		char y []=x.toCharArray();
		int size=y.length;
		int i=0;
		Map<Character,Integer>map=new LinkedHashMap();
		while(i!=size) {
			if(map.containsKey(y[i])==false) {
				map.put(y[i], 1);
			}
			else {
				int oldVal=map.get(y[i]);
				int newVal=oldVal+1;
				map.put(y[i], newVal);
			}
			i++;
		}
		
		String result="";
		Set<Map.Entry<Character, Integer>>hmap=map.entrySet();
		for(Map.Entry<Character, Integer>data:hmap) {
			result=result+data.getKey();
			
		}
		System.out.println(result);
		

	}

}
