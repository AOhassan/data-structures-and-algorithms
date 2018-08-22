package day26;

import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class GraphBFS {

    public String graphBFS(Graph graph, Node start){

        Queue<Node> qq = new LinkedList<>();
        Set<Node> seen = new HashSet<>();

        qq.add(start);
        String result = "";

        while(!qq.isEmpty()){

//            Node poll = qq.poll();
//
//            if(poll.)
//
//            if(!seen.contains(poll)){
//                seen.add(poll);
//                result += poll.toString() + " ";
//            }


        }



        return result;
    }
}
