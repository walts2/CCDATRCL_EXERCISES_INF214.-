// Array implementation of Stack
public class App {
    public static void main(String[] args) {
  
      // Create new Stack Object
      Stack vinyl_stack = new Stack(6);
  
      // Insert new elements into the stack
      vinyl_stack.push("Abbey Road");
      vinyl_stack.push("Kid A");
      vinyl_stack.push("Purple Rain");
      vinyl_stack.push("Rumours");
      vinyl_stack.push("Led Zeppelin IV");
      vinyl_stack.push("Discovery");
  
      // Show the size of the stack
      System.out.println("The size of the stack is: " + vinyl_stack.size());
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + vinyl_stack.peek());
  
      // Remove top element in the stack
      vinyl_stack.pop();
  
      System.out.println("After pop");
  
      // Show all elements in Stack
      vinyl_stack.printStack();
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + vinyl_stack.peek());
      
      vinyl_stack.pop();
      vinyl_stack.pop();
      vinyl_stack.pop();
      vinyl_stack.pop();
      vinyl_stack.pop();
      vinyl_stack.pop();
    }
  }
