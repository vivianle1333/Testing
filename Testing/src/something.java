import java.util.LinkedList;
import java.util.Queue;

public class something implements Runnable {
	
	private Queue<Object> rods = new LinkedList<Object>(); 
	private Queue<Object> nets = new LinkedList<Object>(); 
	private String name;
	
	public something(Queue<Object> rods, Queue<Object> nets, String name) {
		this.rods = rods;
		this.nets = nets;
		this.name = name;
	}
	
	private void pickTool() {
		synchronized(rods) {
			while(rods.isEmpty());
			rods.remove();
			System.out.println(name + ": Took a rod");
			
			synchronized(nets) {
				while(nets.isEmpty());
				nets.remove();
				System.out.println(name + ": Took a net");
			}
		}
		
	}
	
	private void dropTool() {
		synchronized(rods) {
			while(rods.size() == 5);
			//adds the pbject back into the queue
			rods.add(new Object());
			System.out.println(name + ": Put back rod");
			
			synchronized(nets) {
				while(nets.size() == 5);
				//adds the pbject back into the queue
				nets.add(new Object());
				System.out.println(name + ": Put back net");
			}
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println(name + ": Picking tools...");
			pickTool();
			System.out.println(name + ": Picked tools.");
			
			System.out.println(name + ": Dropping tools...");
			dropTool();
			System.out.println(name + ": Dropped tools...");
		}
	}
}
