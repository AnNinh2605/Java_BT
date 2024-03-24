import java.util.ArrayList;
public class Implement_Stack {
    ArrayList<Integer> stack = new ArrayList<>();
    ArrayList<Integer> maxStack = new ArrayList<>();

    public void push(int data) {
        int max = data;
        if (!maxStack.isEmpty() && max < maxStack.getLast()) {
            max = maxStack.getLast();
        }
        stack.add(data);
        maxStack.add(max);
    }

    public void pop() {
        if (!stack.isEmpty() && !maxStack.isEmpty()) {
            stack.remove(stack.size() - 1);
            maxStack.remove(maxStack.size() - 1);
        }
    }

    public int getMax() {
        if (maxStack.isEmpty()) {
            return 0;
        }
        return maxStack.getLast();
    }

    public static void main(String[] args) {
        Implement_Stack testStack = new Implement_Stack();

        testStack.push(4);
        testStack.push(5);
        testStack.push(9);
        testStack.push(-10);

        System.out.println("Stack " + testStack.stack);
        System.out.println("Stack max" + testStack.maxStack);
        System.out.println("Max = " + (testStack.getMax() == 0 ? null : testStack.getMax()));

        testStack.pop();
        testStack.pop();

        System.out.println("Stack " + testStack.stack);
        System.out.println("Stack max" + testStack.maxStack);
        System.out.println("Max = " + (testStack.getMax() == 0 ? null : testStack.getMax()));
    }
}
