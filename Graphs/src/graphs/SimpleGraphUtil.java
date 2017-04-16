package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleGraphUtil 
{
	private static List<Map<String, List<String>>> graph;
	
	static
	{
		graph = new ArrayList<>();
		Map<String, List<String>> a = new HashMap<>();
		List<String> alist = new ArrayList<>();
		alist.add("C");
		a.put("A", alist);
		
		Map<String, List<String>> b = new HashMap<>();
		List<String> blist = new ArrayList<>();
		blist.add("C");
		blist.add("D");
		b.put("B", blist);
		
		Map<String, List<String>> c = new HashMap<>();
		List<String> clist = new ArrayList<>();
		clist.add("E");
		c.put("C", clist);
		
		Map<String, List<String>> d = new HashMap<>();
		List<String> dlist = new ArrayList<>();
		dlist.add("F");
		d.put("D", dlist);
		
		Map<String, List<String>> e = new HashMap<>();
		List<String> elist = new ArrayList<>();
		elist.add("H");
		elist.add("F");
		e.put("E", elist);
		
		Map<String, List<String>> f = new HashMap<>();
		List<String> flist = new ArrayList<>();
		flist.add("G");
		f.put("F", flist);
		
		Map<String, List<String>> g = new HashMap<>();
		g.put("G", null);
		
		Map<String, List<String>> h = new HashMap<>();
		h.put("H", null);
	}
	
	public static List<Map<String, List<String>>> createSimpleGraph()
	{
		return graph;
	}
}
