import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DataLoad
{
  private Queue<Integer> simpleQueue = new LinkedList();
  //private Queue<Integer> simpleQueue = new PriorityQueue<>( );

  private void addItems()
  {
    simpleQueue.add(new Integer(3));
    simpleQueue.add(new Integer(1));
    simpleQueue.add(new Integer(10));
  }

  private void printQueue()
  {
    /*
    System.out.println("List >>");
    for (Integer item : simpleQueue )
    {
      System.out.println(item);
    }*/
    System.out.println(simpleQueue);
  }

  private Integer removeFifo()
  {
    //return simpleQueue.remove();
    Integer e = simpleQueue.poll();
    System.out.println("\nRemove item : " + e);
    printQueue();
    System.out.println("\n");
    return e;
  }

  private void remove( Integer item)
  {
    simpleQueue.remove(item);
  }

  public static void main(String[] arg)
  {
    DataLoad dl = new DataLoad();
    dl.addItems();
    dl.printQueue();

    dl.removeFifo();
    dl.remove(new Integer(12));
    dl.removeFifo();
    dl.removeFifo();
    dl.removeFifo();
  }
}
