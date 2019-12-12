import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UniqueCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="KESHAV";
		char y[]=x.toCharArray();
		int size=y.length;
		int i=0;
		Map<Character,Integer>map=new HashMap();
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
		Set<Map.Entry<Character,Integer>>hmap=map.entrySet();
		for(Map.Entry<Character, Integer>data:hmap) {
			if(data.getValue()>1) {
				System.out.println("String has not Unique Character");
				System.exit(0);
			}
		}
		System.out.println("String has  Unique Character");

	}

}
