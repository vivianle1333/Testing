import java.util.LinkedList;
import java.util.Queue;

public class test {
	
public static void main(String[] args) {
		
		Queue<Object> rods = new LinkedList<Object>();
		Queue<Object> nets = new LinkedList<Object>();
		
		for(int i = 0; i < 5 ; i++) {
			rods.add(new Object());
			nets.add(new Object());
		}
		
		for(int i = 0; i < 10; i++) {
			new Thread(new something(rods, nets, "test #" + i), "Thread #" + i).start();
		}
	}
}
