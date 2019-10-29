import java.util.*;

public class EnoughIsEnough {

	//Deletes duplicates over a certain amount from an int array
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		Map<String, Integer> map = new HashMap<>();
		ArrayList<Integer> prunedList = new ArrayList<Integer>();
		for (int e : elements) {
			map.put(Integer.toString(e), (map.get(Integer.toString(e)) != null) ? map.get(Integer.toString(e)) + 1 : 1);
			if (!(map.get(Integer.toString(e)) > maxOccurrences)) {prunedList.add(e);}
		}
		
		//Stream Integers to primitive ints
		return prunedList.stream().mapToInt(i->i).toArray();
	}

}