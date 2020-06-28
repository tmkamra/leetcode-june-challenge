package com.ds.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class ReconstructItinerary {

	public static <String> List<String> asList(String... items) {
		List<String> list = new ArrayList<String>();
		for (String item : items) {
			list.add(item);
		}

		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReconstructItinerary reconstructItinerary = new ReconstructItinerary();
		List<List<String>> itinerary = asList(asList("JFK", "SFO"), asList("JFK", "ATL"), asList("SFO", "ATL"),
				asList("ATL", "JFK"), asList("ATL", "SFO"));
		System.out.println(reconstructItinerary.findItinerary(itinerary));

	}

	public List<String> findItinerary(List<List<String>> tickets) {

		Map<String, PriorityQueue<String>> hm = new HashMap<String, PriorityQueue<String>>();
		LinkedList<String> iterList = new LinkedList<>();
		for (int i = 0; i < tickets.size(); i++) {
			String key = tickets.get(i).get(0);
			String value = tickets.get(i).get(1);
			if (!hm.containsKey(key)) {
				PriorityQueue<String> pq = new PriorityQueue<String>();
				hm.put(key, pq);
			}
			hm.get(key).add(value);
		}

		dfs("JFK", iterList, hm);
		return iterList;
	}

	private void dfs(String departure, LinkedList<String> iterList,
			Map<java.lang.String, PriorityQueue<java.lang.String>> hm) {

		PriorityQueue<String> arrivals = hm.get(departure);

		while (arrivals != null && !arrivals.isEmpty()) {
			dfs(arrivals.poll(), iterList, hm);
		}

		iterList.addFirst(departure);
	}

}
