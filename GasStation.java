
class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalDistance= 0;
        int fuel = 0;
        int index = 0;
        for(int i=0;i<gas.length;i++)
        {
            int diff = gas[i] - cost[i];
            totalDistance += diff;
            fuel += diff;
            if(fuel < 0)
            {
                index=i+1;
                fuel = 0;
            }
            
        }
        return (totalDistance<0)?-1:index;
        
    }
}