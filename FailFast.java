import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFast {
	public static void main(String[] args) {
		//List<String> color = new ArrayList<String>();// By using this we will get ConcurrentModificationException if try to modify the list at the time of iterate
		List<String> color = new CopyOnWriteArrayList<String>();//By using this we will not get ConcurrentModificagtionException it will work fine  
		color.add("Blue");
		color.add("Black");
		color.add("Brown");
		color.add("Red");
		color.add("Green");
		color.add("Yellow");
		color.add("White");
		
		Iterator<String> itr = color.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			color.add("Sohan");
		}
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
