

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MaxOccurCharaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="WELCOME TTO MY GITHUB";
		x=x.replace(" ", "");
		char y[]=x.toCharArray();
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
		
		char maxKey=' ';
		int maxVal=0;
		Set<Map.Entry<Character,Integer>>hmap=map.entrySet();
		for(Map.Entry<Character, Integer>data:hmap) {
			if(data.getValue()>maxVal) {
				maxVal=data.getValue();
				maxKey=data.getKey();
			}
		}
		System.out.print(maxKey);
		System.out.println(maxVal);

	}

}
