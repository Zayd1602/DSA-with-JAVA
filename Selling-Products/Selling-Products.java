import java.util.*;
import java.util.stream.Collectors;
class Main {
	static int getMinDistinctIds(int[] ids, int m)
	{
		Map<Integer, Integer> map = new HashMap<>();

		for (int each : ids)
			map.put(each, map.getOrDefault(each, 0) + 1);

		LinkedHashMap<Integer, Integer> collect = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o, n) -> o, LinkedHashMap::new));
		int count = map.size();
		for (Map.Entry<Integer, Integer> mp : collect.entrySet()) {
			if (mp.getValue() == 1) {
				count--;
				m--;
			} else if (mp.getValue() - m >= 0) {
				if (mp.getValue() - m == 0)
					count--;
				break;
			}
		}
		return count;
	}

	public static void main(String[] args)
	{
		int n,m;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
	      int arr[] = new int[n];

		for(int i = 0; i<n; i++){
		    arr[i] = s.nextInt();
		}
		m = s.nextInt();
		System.out.println(getMinDistinctIds(arr, m));
	}
}