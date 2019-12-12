import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PrintDubplicateCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="Keshav Rajput Katalyst";
				x=x.replace(" ", "");
				x=x.toUpperCase();
				char []y=x.toCharArray();
				int size=y.length;
				Map<Character,Integer>map=new LinkedHashMap();
				int i=0;
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
					if(data.getValue()>=2) {
						System.out.print(data.getKey());
						System.out.println(data.getValue());
					}
					
				}
				
		

	}

}
