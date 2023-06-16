
package SalesData;


public class Driver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FileIO readdata = new FileIO();
        
                
        Franchise f1 = readdata.readData("C:\\Users\\asj1757\\workspace\\Assignment3\\SalesDat.txt", 6);
        for (int i = 0; i < 6; i++)
        {
            Store s = f1.getStores(i);
            System.out.printf("==== Store %d ====\n", i+1);
            s.analyzeresults();
        }        
        System.out.println("Data read");
    }

}

