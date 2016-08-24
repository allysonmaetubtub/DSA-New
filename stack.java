package stack;

public class Stack {
    
  //functionNAME () // mETHOD, pRICEDURE
    
  private int capacity;
  private int top = 0;
  private String[] storage;
  
  //constructor - method na kapangalan ng Class
  // = Initialize na object instance of the class
  public Stack(int size) {
    // assign the value of size to capacity
    capacity = size;      
    storage = new String[capacity];
  } 
  
  //"Public" - ACCESS MODIFIER
  //"void" - data type
  public void show() {
    // the top of the stack starts from array[0] then newer item gets added on top of another until it reaches its capacity limit
  //  for (int j = capacity-1; j >= 0; j--) { 
      for (int i = capacity-1; i >= 0; i--) {
          System.out.println("stack[" + i + "] = " + storage[i]);
        /* print like this: 
        stack[j = nth] = i = nth value
        stack[n3] = 4th value
        stack[4] = 3rd value
        stack[1] = 2nd value
        stack[0] = 1st value
        */
 //     }
    }
    System.out.println();
  }
  
  private boolean isEmpty() {
    return (top ==0);
  }

  private boolean isFull() {
    if (top == capacity) {
      System.out.println("Stack is Full");
      // print error message
      return true;
    } 
    return false;
  }

  public void push(String value) { //parameter/arguments = nasa loob ng "()"
    if (isFull()) {
      // print error message
      System.out.println("Add failed. Element did not push.");
    } else {
      System.out.println("... trying to push on stack[" + top + "] ...");
      storage[top] = value;
      top++;
      /* increment or decrement top*/
      System.out.println(value + " was successfully added.");
      System.out.println();
    }
  }

  public void pop() {
    if (isEmpty()) {
        System.out.println("Remove failed. No element to pop.");
      // print error message
      System.out.println();
    } else {
      System.out.println("... trying to pop stack[" + (top-1) + "] ...");
      storage[top] = null;
      top--;
      /* increment or decrement top*/
      System.out.println(storage[top] + " was successfully removed.");
      System.out.println();
    }
  }

  public void peek() {
    if (storage[top] == storage[0]) {
      System.out.println("PEEK TOP = " + storage[top]);
      System.out.println();
    } else {
      System.out.println("PEEK TOP = " + storage[top-1]);
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    Stack storage = new Stack(10);
    // construct a new array queue and assign 10 as the integer value for the size limit of the stack
    //ArrStack obj = new ArrStack(10);
    System.out.println("STORAGE CAPACITY = " + storage.capacity);
    System.out.println();
    storage.show();
    // show empty stack
    storage.pop();
    // try removing on an empty stack
    storage.peek();
    // peek top element of an empty stack
    storage.peek();
    storage.push("one");
    storage.show();
    // show the updated stack
    storage.peek();
    // peek if top element is "one"
    storage.push("two");
    storage.show();
    // show the updated stack
    storage.peek();
    // peek if top element is "two"
    storage.push("three");
    storage.show();
    // show the updated stack
    storage.peek();
    // peek if top element is "three"
    storage.push("four");
    storage.show();
    // show the updated stack
    storage.push("five"); 
    storage.show();
    // show the updated stack
    storage.pop();
    // try removing "five"
    storage.push("six"); 
    storage.push("seven"); 
    storage.push("eight"); 
    storage.push("nine");    
    storage.push("ten"); 
    storage.show();
    // show the updated stack
    storage.peek();
    // peek if top element is "ten"
    storage.push("eleven");
    // try adding "eleven"
    storage.push("twelve");
    // try adding "twelve"
    System.out.println();
    storage.show();
    // show the updated stack
  }  
}
