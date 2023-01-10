package logicalprogram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BusRoute 
{
    public int numBusesToDestination(int[][] routes, int source, int target) 
    {
        if(source==target) 
        return 0;
        HashMap<Integer, HashSet<Integer>> hm= new HashMap<>();  
        for(int i=0;i<routes.length;i++)
        {
            for(int j=0;j<routes[i].length;j++)
            {
                HashSet<Integer>busRoute=hm.containsKey(routes[i][j]) ? hm.get(routes[i][j]) : new HashSet<>();
                busRoute.add(i);
                hm.put(routes[i][j], busRoute);
            }
        } 

        Queue<Integer>q=new LinkedList<>();
        q.add(source);
        int count=0;
        HashSet seen=new HashSet<>();
        while(!q.isEmpty())
        {
            count++;
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                int curStop=q.poll();
                HashSet<Integer>buses=hm.get(curStop);
                for(Integer bus:buses)
                {
                    if(seen.add(bus))
                    {
                        for(Integer stop: routes[bus])
                        {
                            if(stop==target)
                            return count;
                            q.add(stop);
                        }
                    }
                }
            }
         }
         return -1;
    }
}