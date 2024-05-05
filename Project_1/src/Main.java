import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    private static final int READ_DATA=1;
    private static final int NEW_DATA=2;
    private static final int AVERAGE_POINT=3;
    private static final int TURKEY_DATA=4;
    private static final int NOT_TURKEY_DATA=5;
    private static final int DOCTOR_DATA=6;
    private static final int LINK_LIST=7;
    private static final int ARRAY=8;
    private static final int QUIT=0;


    public static void AddCustomerData(){
        Scanner inputScanner=new Scanner(System.in);
        CustomerData newCustomerData=new CustomerData();

        System.out.println("Enter Name: ");
        newCustomerData.setName(inputScanner.next());
        System.out.println("Enter Surname: ");
        newCustomerData.setSurname(inputScanner.next());
        System.out.println("Enter Country: ");
        newCustomerData.setCountry(inputScanner.next());
        System.out.println("Enter City: ");
        newCustomerData.setCity(inputScanner.next());
        System.out.println("Enter Occupation: ");
        newCustomerData.setOccupation(inputScanner.next());

        inputScanner.close();
    }

    public static void ReadFile(){//ŞÜPHELİ
        Scanner fileScanner=null;
        String[] products;
        int product_num;
        String product_1,product_2,product_3,product_4,product_5;

        String[] row_1;
        int customer_code;
        String name,surname,country,city,occupation;

        String[] row_2;
        int point_product_1,point_product_2,point_product_3,point_product_4,point_product_5;


        String products_row="";
        String Customer_row_1="";
        String Customer_row_2="";
        try{
            fileScanner=new Scanner(new FileInputStream("C:\\Users\\Gökhan\\Desktop\\dönem2\\oop Java\\vscode java\\Project_1\\src\\Firma.txt"));//DOSYA YOLUNA DİKKAT

            products_row=fileScanner.nextLine();
            products=products_row.split(",");
            product_num=Integer.parseInt(products[0]);
            product_1=products[1];
            product_2=products[2];
            product_3=products[3];
            product_4=products[4];
            product_5=products[5];
            System.out.println(product_num+product_1+product_2+product_3+product_4+product_5);
            

            while(fileScanner.hasNext()){
                Customer_row_1=fileScanner.nextLine();
                row_1=Customer_row_1.split(",");
                customer_code=Integer.parseInt(row_1[0]);
                name=row_1[1];
                surname=row_1[2];
                country=row_1[3];
                city=row_1[4];
                occupation=row_1[5];

                CustomerData newCustomer=new CustomerData(name,surname,country,city,occupation);
                System.out.println(newCustomer.toString());

                Customer_row_2=fileScanner.nextLine();
                row_2=Customer_row_2.split(",");
                point_product_1=Integer.parseInt(row_2[0]);
                point_product_2=Integer.parseInt(row_2[1]);
                point_product_3=Integer.parseInt(row_2[2]);
                point_product_4=Integer.parseInt(row_2[3]);
                point_product_5=Integer.parseInt(row_2[4]);
                System.out.println(point_product_1+","+point_product_2+","+point_product_3+","+point_product_4+","+point_product_5);
            }

        
        }catch(FileNotFoundException e){
            System.out.println("File not found. Please check file path");
        }
    }



    public static void main(String[] args){
        ReadFile();
        AddCustomerData();
        System.out.println("abc");
        
    }
}
