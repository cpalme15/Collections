import java.util.*;
public class Main {
	public static void main(String [] args)
	{
		Character[] letter={'M','I','S','S','I','S','S','I','P','P','I'};
		List<Character>state=Arrays.asList(letter);
		Display(state);
		Collections.shuffle(state,new Random());
		Display(state);
		
		Set<Character> dups=new HashSet<>();
		Set<Character> uniq=new HashSet<>();
		for(Character ltr:state)
		{
			if(!uniq.add(ltr))
			dups.add(ltr);
		}
		uniq.removeAll(dups);
		Display(uniq);
		Display(dups);
		List<Character> state2=new ArrayList(state);
		state2.removeAll(Collections.singleton('S'));
		Display(state2);
	String [] colors={"red","white","blue","green","cyan","orange"};
	List<String> clrlist=Arrays.asList(colors);
	Display(clrlist);
	Queue<Integer>q=new LinkedList<>();
	for(int i=0;i<10;i++)
		q.add(i);
	while(!q.isEmpty())
	{
		System.out.print(q.remove()+"\t");
		try 
		{
			Thread.sleep(100);//3000 millisecs till it runs again or 3 secs
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	System.out.println();
	Map<String,Integer>map=new LinkedHashMap<>();
	String []words={"James",",while","Steve","had","had","had",
			"had","had","had","had","had","had","had","had","better",
			"effect", "on","the","teacher"};
	for(String w:words)
	{
		Integer Freq=map.get(w);
			map.put(w,(Freq==null)?1:Freq+1);
	}
	System.out.println(map);
	//y=(x==1)?5:15;
	}
	public static <T>void Display(Collection<T> sc)
	{
		for(T e:sc)
		{
			System.out.print(e+" , ");
		}
		System.out.println();
	}
}
