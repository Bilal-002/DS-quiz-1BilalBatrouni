
package linkedlist;


public class LinkedList {
    public class Node{
         Object value ;
   Node next  ;
   
    }
  
    
   public Object getnext(Object element ){
       Node currentNode = head;
       if (currentNode.next == head){
           return null;
       }
       while (currentNode.next != null){
           if (currentNode.next.value.equals(element)){
               return currentNode.next.next;
           }
                  
       }
        return - 1;   
   }
}
