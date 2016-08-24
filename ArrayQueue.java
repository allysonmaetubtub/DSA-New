/**Allyson Mae J. Tubtub
 * BSIS - II
 */
package sample;

public class ArrayQueue {
 
  private int QSIZE; 
  private int[] queue;
  private int nItems;
  
  public ArrayQueue(int size){
    QSIZE = size;
    queue = new int[QSIZE];
  }
  
  public void showQueue(){
      int i;
      for(i = 0; i < QSIZE; i++){
          System.out.printf("Queue[%d] = %d\n" , i , queue[i]);
      }
  }
  
  public boolean isFull(){
      if(nItems == QSIZE){
          System.out.println("QUEUE is FULL");
          return true;
      } else{
      return false;
    }
  }
  
  public boolean isEmpty(){
      if(nItems == 0){
          System.out.println("QUEUE is EMPTY");
          return true;
      } else{
      return false;
      }
  }
  
  public boolean enqueue(int num){
     System.out.println("Trying to enqueue " + num + "...");
     if(! isFull()){
         queue[nItems] = num;
         nItems++;
         return true;
     }else{
         System.out.println("Failed to enque " + num);
         return false;
     }
  }
  
  public void dequeue(){
      System.out.print("Dequeueing...");
      if(! isEmpty()){
          int num = queue[0];
          System.out.println("Removed " + num);
          rearrangeQueue();
      }else{
          System.out.println("Failed to dequeue");
      }

  }
  
  private void rearrangeQueue(){
      System.out.println("Rearranging Queue");
      int[] temp = new int[nItems];
      int i;
      for(i = 0; i < (nItems - 1); i++){
          temp[i] = queue[i + 1];
      }
      nItems--;
      for(i = 0; i < QSIZE; i++){
          if(i <= nItems){
              queue[i] = temp[i];
          }else{
              queue[i] = 0;
          }
      }
  }
  
  public int peekFront(){
    return queue[0];
  }
  
  public int peekRear(){
    return queue[nItems-1];
  }
} //end class ArrayQueue

