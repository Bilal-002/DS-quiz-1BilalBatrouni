
package linkedlist;


public class Arraylist {
    private  Object[] countOccurrences ;
    private int count = 0;
     
    
     public int indexOf(Object element) {
        for (int i = 0; i < countOccurrences.length; i++) {
            if (countOccurrences[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
   
}
