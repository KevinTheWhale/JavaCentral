package SalesData;


import java.io.*;
import java.util.StringTokenizer;

public class FileIO {
    // Franchise readData(String filename)
    Franchise readData(String filename, int numstores) {
        Franchise f1 = new Franchise(numstores);
        boolean DEBUG = true;
        int ctr = 0;
        // open the file
        // read the line
        // parse the line - get one value
        // and set it in the correct location in 2 d array
        try {
            FileReader file = new FileReader(filename);
            BufferedReader buff = new BufferedReader(file);
            boolean eof = false;
            while (!eof) {
                String line = buff.readLine();
                ctr++;
                if (line == null)
                    eof = true;
                else {
                    if (DEBUG)
                        System.out.println(line);
                    if (ctr > 1) {
                        StringTokenizer a = new StringTokenizer(line);
                        for (int week = 0; week < 5; week++) {
                            for (int day = 0; day < 7; day++) {
                                String l = a.nextToken();
                                float f = Float.parseFloat(l);
                                f1.getStores(ctr - 2)
                                        .setsaleforweekdayintersection(week,
                                                day, f);
                                if (DEBUG)
                                    System.out.print("");
 
                                		
                                		
                            }
                        }
                    }
                }

            }
         System.out.print("\n\n\n");
        } catch (IOException f2) {

        }
        return f1;
    }
}


