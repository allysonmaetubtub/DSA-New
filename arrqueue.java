/**Allyson Mae J. Tubtub
 * BSIS - II
 */

package sample;

public class Arrqueue {
    public static void main(String[] args){
    ArrayQueue arrque = new ArrayQueue(10);
    
    arrque.enqueue(2);
    arrque.enqueue(4);
    arrque.enqueue(6);
    arrque.enqueue(8);
    arrque.enqueue(10);
    arrque.enqueue(12);
    arrque.enqueue(14);
    arrque.enqueue(16);
    arrque.enqueue(18);
    arrque.enqueue(20);
    
    arrque.showQueue();
    System.out.println();
    System.out.println("PeekRear: " + arrque.peekRear());
    System.out.println("PeekFront: " + arrque.peekFront());
    
    System.out.println();
    arrque.enqueue(22);
    
    System.out.println();
    arrque.dequeue();
    
    System.out.println();
    arrque.showQueue();
}
}
