
import java.util.Scanner;
public class method3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine().toLowerCase();
        String[] huffman=new String[]{"1010","100000","00000","10110","010","110011","1000010","0001","01110","1100001010","11000011","10111","110010","01111","1001","100001",
                "1100001001","0010","0011","1101","00001","1100000","110001","1100001000","100011","1100001010"};
        String[] asci=new String[]{"01100001", "01100010","01100011","01100100","01100101","01100110","01100111","01101000","01101001","01101010","01101011",
                "01101100","01101101","01101110","01101111","01110000","01110001","01110010","01110011","01110100","01110101","01110110","01110111","01111000",
                "01111001","01111010"};
        StringBuilder as=new StringBuilder("");
        StringBuilder hf=new StringBuilder("");
        for (int i = 0; i <input.length() ; i++) {

            int a=input.charAt(i)-97;
            as=as.append(asci[input.charAt(i)-97]);
            hf=hf.append(huffman[input.charAt(i)-97]);
        }
        System.out.println(as);
        System.out.println(hf);
        System.out.println((double)((as.length()-hf.length())*100)/as.length()+"% compresssed");
    }

}
