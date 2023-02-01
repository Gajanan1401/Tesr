
public class CityProcessor {
	
     public static float getAvgPopulation(City ct1[])
     {
    	 int size=ct1.length;
    	 int sum=0;
    	 for(City vl:ct1)
    	 {
    		 sum+=vl.population;
    	 }
    	 return (sum/size);
     }
     public static String[] getBigCityNames(City ct[])
     {
    	 int size=ct.length;
    	 String rt[]=new String[size];
    	 int index =0;
    	 for(City var:ct)
    	 {
    		 if(var.getPopulation()>4000000)
    		 {
    			 rt[index]=var.getName();
    			 index++;
    		 }
    	 }
    	 return rt;
     }
}
