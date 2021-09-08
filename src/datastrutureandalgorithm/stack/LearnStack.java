package datastrutureandalgorithm.stack;

import java.util.Iterator;
import java.util.Stack;

public class LearnStack {

    public static void main(String args[]) {
        Stack<String> foodList = new Stack<>();
        foodList.push("rice");
        foodList.push("meat");
        foodList.push("soda");
        foodList.push("kabab");
        foodList.push("salad");
        System.out.println(foodList);
        System.out.println(foodList.pop());// It will print last item salad and remove from stack

        System.out.println(foodList.push("Yogurt"));// It will add yogurt in the stack as last item
        System.out.println(foodList);
        System.out.println(foodList.peek());// It print the last value yogurt from the stack
        System.out.println(foodList);
        System.out.println(foodList.pop()); // It will print yogurt because it is last item.Pop method will peek the
        // value and remove from stack
        System.out.println(foodList);
        System.out.println("============================================");

        Stack<String> foodId=new Stack<>();
        for(int i=0;i<5;i++){
             foodId.push("FI"+i);
        }

        System.out.println(foodId);
        // Retrieve all the values
                            
          Iterator itr= foodId.iterator();
        while (itr.hasNext()){
            System.out.println("Food Id "+foodId.pop());
        }
       Stack<Integer> priceList=new Stack<>();
        priceList.push(200);
        priceList.push(300);
        priceList.push(400);
        priceList.push(500);
        priceList.push(600);
        LearnStack.stackSearch(priceList,400);
}
public static void stackSearch(Stack<Integer> sta,int element){
        Integer position=sta.search(element);
        if(position==-1){
            System.out.println("Element is not found");
        }else{
            System.out.println("Element found at position "+position);
        }
}

}

