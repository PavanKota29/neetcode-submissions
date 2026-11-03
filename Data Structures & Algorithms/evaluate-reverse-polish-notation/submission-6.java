class Solution {
    public int opration(int a,int b,String op){
        if(op.equals("+")){
            return b+a;
        }else if(op.equals("-")){
            return b-a;
        }else if(op.equals("*")){
            return b*a;
        }else if(op.equals("/")){
            return b/a;
        }

        return -1;
    }
    public int evalRPN(String[] token) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<token.length;i++){
            if((token[i].equals("+") || token[i].equals("-") || token[i].equals("*") || token[i].equals("/")) && !st.isEmpty()){
                int a = st.pop();
                int b = st.pop();
                st.push(opration(a,b,token[i]));
            }else{
                st.push(Integer.parseInt(token[i]));
            }       
        }

        return st.pop();
    }
}
