//package day13;
//
//import java.util.Stack;
//
//public class MultiBracketValidation {
//        public static boolean multiBracketValidation(String input) {
//
//            Stack<Character> stack = new Stack<>();
//            char check = stack.peek();
//            boolean answer = true;
//
//            for(int i = 0; i <input.length(); i++){
//                char ch = input.charAt(i);
//
//                String opening = "{([";
//                if(opening.contains(ch)){
//                    stack.push(ch);
//                }
//                String closing = "])}";
//                if(closing.contains(ch)){
//                    if(stack.isEmpty()){
//                        answer = false
//                        return answer;
//                    }
//                    if(check = "{" && ch = "}"||
//                       check = "(" && ch = ")"||
//                       check = "[" && ch = "]" ){
//                        stack.pop();
//                    }
//                    else{
//                        answer =  false;
//                        return answer;
//                    }
//                }
//            }
//            return answer;
//        }
//}
//
//
//
//
