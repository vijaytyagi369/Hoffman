import java.util.*;
import java.lang.Math;public class method1 {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter a string value: ");
            String input=sc.nextLine().toLowerCase();
            String[] binaryString=new String[input.length()];
            int reqzero=0;
            StringBuilder as=new StringBuilder("");
            StringBuilder hf=new StringBuilder("");
            String[] huffman=new String[]{"1010","100000","00000","10110","010","110011","1000010","0001","01110","1100001010","11000011","10111","110010","01111","1001","100001",
                    "1100001001","0010","0011","1101","00001","1100000","110001","1100001000","100011","1100001010"};
            for (int i = 0; i <input.length() ; i++) {
                binaryString[i]=Integer.toBinaryString(input.charAt(i));
                reqzero = 8-binaryString[i].length();
                binaryString[i]="0".repeat(reqzero)+binaryString[i];
                as=as.append(binaryString[i]);
                hf=hf.append(huffman[input.charAt(i)-97]);
            }
            System.out.println("ASCI:-"+as);
            System.out.println("HfMn:-"+hf);
            System.out.println((double)((as.length()-hf.length())*100)/as.length()+"% compresssed");
            sc.close();
        }

}
