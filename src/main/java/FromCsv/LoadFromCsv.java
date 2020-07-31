package FromCsv;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import Nomen.ListNomen;
import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

@SuppressWarnings("resource")

public class LoadFromCsv {

     public static final String pathInFileCsv = "d:\\tmp\\ДляОбработки.csv";
     public static final String pathOutFileCsv = "d:\\tmp\\Разбивка.csv";
     public static final String charsetName = "CP1251";
     public static final String[] delimiter = {" ",";","ГОСТ",""}; // Разделитель

     ArrayList<StringBuilder> stringAll = new ArrayList<StringBuilder>();
     ArrayList<ListNomen> nomeAll;
     CSVReader reader;
     String[] nextLine;
    {
        try {
            reader = new CSVReader(new InputStreamReader(new FileInputStream(pathInFileCsv), charsetName), ',', '"', 1);
            while ((nextLine = reader.readNext()) != null) {
                //System.out.println(Arrays.toString(nextLine));
                for (int i = 0; i < nextLine.length - 1; i++) {
                    if (nextLine[i].trim().length() > 0) {
                        stringAll.add(new StringBuilder(Arrays.toString(nextLine)));
                    };
                };
            }
            nomeAll = new ArrayList<ListNomen>();
            for (StringBuilder element : stringAll) {
                String[] subStr = element.toString().split(delimiter[1]);
                String name = "";
                String document = "";

                if (subStr[0].trim().contains(delimiter[2]))
                {
                     name = subStr[0].trim().substring(1,subStr[0].trim().indexOf(delimiter[2]));
                     document = subStr[0].trim().substring(subStr[0].trim().indexOf(delimiter[2]),subStr[0].length());
                }
                 else
                {
                    name = subStr[0].trim().substring(1,subStr[0].length());;
                }

                String[] subName = name.split(delimiter[0]);
                String vendor = "";
                for(int i=0;i<subName.length-1;i++){
                    vendor = vendor+" "+subName[i];
                }

                String stock = String.valueOf(subName.length-1);

                nomeAll.add(new ListNomen(subName[0],vendor.toString(),document,stock,"", "",subStr[4].trim().replaceAll(delimiter[0],delimiter[3]),""));
            }
            OutputStreamWriter flowFile = new OutputStreamWriter(new FileOutputStream(pathOutFileCsv), charsetName);
            CSVWriter writer = new CSVWriter(flowFile, ';', CSVWriter.DEFAULT_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);
            for(ListNomen elementList:nomeAll){
                       String[] outData = {elementList.getName(),elementList.getVendor(),elementList.getDocument(),elementList.getStock(),elementList.getHowMuchToBuy().replaceAll("]","")};
                if (Integer.parseInt(elementList.getStock().trim())<4) {
                      System.out.println("name="+elementList.getName()
                                        +" stock="+elementList.getStock()
                                        +" vendor="+elementList.getVendor()
                                        +" document="+elementList.getDocument()
                                        +" HowMuchToBuy="+elementList.getHowMuchToBuy());
                          writer.writeNext(outData);
                     }
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
