package datastructure.stack;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();


        stack.push("minecraft");
        stack.push("terraria");
        stack.push("lego star wars");
        stack.push("brawl stars");

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        String myFavGame = stack.peek();

        System.out.println(stack);
        System.out.println(myFavGame);
        System.out.println(stack.search("terraria"));
    }
}
