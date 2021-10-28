public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack;
        stack = new Stack();
        stack.push("Đến rồi à");
        stack.push("Vào nhanh đi");
        System.out.println(Stack);
        String poped = Stack.pop();
        System.out.println("lấy ra phân từ từ ngăn xếp" + poped);
        
    }
}
