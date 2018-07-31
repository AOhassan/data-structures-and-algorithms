import java.util.Queue;

public class EeneyMeeneyMineyMoe {

    public static String youreOut(Queue<String> names, int n){

        int i = 1;
        while(names.size() != 1){

            if(i < n){
                names.add(names.poll());
            } else {
                names.poll();
                i = 0;
            }

            i++;
        }
        return names.poll();
    }
}




