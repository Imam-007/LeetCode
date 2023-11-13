class Solution {
    public boolean isValid(String s) {
        if(s.charAt(0)==']'||s.charAt(0)==')'||s.charAt(0)=='}'){
            return false;
        }
        Stack<Character>stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('|| ch=='['|| ch=='{'){
                stk.push(ch);
            }else if(ch==')'){
                if(!stk.isEmpty() && stk.peek()=='('){
                    stk.pop();
                }else{
                    return false;
                }
            }else if(ch==']'){
                if(!stk.isEmpty() && stk.peek()=='['){
                    stk.pop();
                }else{
                    return false;
                }
            }else if(ch=='}'){
                if(!stk.isEmpty() && stk.peek()=='{'){
                    stk.pop();
                }else{
                    return false;
                }
            }
        }
        // if(!stk.isEmpty()){
        //     return false;
        // }
        // return true;
        return stk.isEmpty();
        
    }
}