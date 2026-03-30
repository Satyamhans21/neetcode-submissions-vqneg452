class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String token:tokens){
            if(token.equals("+")|| token.equals("-")|| token.equals("*") || token.equals("/") ){
                int a,b;
                if(token.equals("+")){
                    b=stack.pop();
                    a=stack.pop();
                    stack.push(a+b);
                }
                if(token.equals("-")){
                    b=stack.pop();
                    a=stack.pop();
                    stack.push(a-b);
                }
                if(token.equals("*")){
                    b=stack.pop();
                    a=stack.pop();
                    stack.push(a*b);
                }
                if(token.equals("/")){
                    b=stack.pop();
                    a=stack.pop();
                    stack.push(a/b);
                }
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}
