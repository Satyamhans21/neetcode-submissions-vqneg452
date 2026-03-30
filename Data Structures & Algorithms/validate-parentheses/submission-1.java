class Solution {
    public boolean isValid(String s) {
        
    
        Stack<Character> stack=new Stack<>();


        for(Character c:s.toCharArray()){

            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }
            else{
            if(stack.isEmpty()){
                return false;
            }
            char top=stack.peek();
            if(c==')' && stack.peek()!='(' ||
            c=='}' && stack.peek()!='{' ||
            c==']' && stack.peek()!='['
            ){
                return false;
            }
            stack.pop();
                
        }
            

        }
        return stack.isEmpty();
        
    }
}
