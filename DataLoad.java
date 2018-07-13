import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DataLoad
{
  private Queue<Integer> simpleQueue = new PriorityQueue<>();

  private void addItems()
  {
    simpleQueue.add(new Integer(20));
    simpleQueue.add(new Integer(10));
    simpleQueue.add(new Integer(30));
  }

  private void printQueue(Queue simpleQueue)
  {
    System.out.println(simpleQueue);
  }

  private Integer removeFifo()
  {
    Integer e = simpleQueue.poll();
    System.out.println("\nRemove item : " + e);
    printQueue(simpleQueue);
    System.out.println("\n");
    return e;
  }

  private void highestItem()
  {
    Queue q = new PriorityQueue<>(5, Collections.reverseOrder());
    q.addAll( simpleQueue );

    System.out.println("\nHighest item : " + q.peek());
    printQueue(q);
  }

  private void remove( Integer item)
  {
    simpleQueue.remove(item);
  }

  public static void main(String[] arg)
  {
    DataLoad dl = new DataLoad();
    dl.addItems();
    dl.printQueue(dl.simpleQueue);

    dl.highestItem();

    dl.removeFifo();
    dl.remove(new Integer(12));
    dl.removeFifo();
    dl.removeFifo();
    dl.removeFifo();
  }
}
