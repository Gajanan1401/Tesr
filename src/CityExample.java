
public class CityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         City ct[]=new City[3];
         ct[0]= new City("parbhani",4000);
         ct[1]= new City("washim",541212100);
         ct[2]= new City("jalna",10000);
         
         System.out.println("the avg pop is : "+ CityProcessor.getAvgPopulation(ct));

         String bigcitys[]=CityProcessor.getBigCityNames(ct);
         for(String var: bigcitys)
         {
        	 if(var!=null)
        	 System.out.println(var);
         }
	}

}
