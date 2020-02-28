import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class method2 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine().toLowerCase();
    boolean check=Pattern.matches("[a-z]+",input);
    System.out.println(check);
    HashMap<Character ,String> map = new HashMap<>();
    map.put('a',"1010");
    map.put('b',"100000");
    map.put('c',"00000");
    map.put('d',"10110");
    map.put('e',"010");
    map.put('f',"110011");
    map.put('g',"1000010");
    map.put('h',"0001");
    map.put('i',"01110");
    map.put('j',"1100001010");
    map.put('k',"11000011");
    map.put('l',"10111");
    map.put('m',"110010");
    map.put('n',"01111");
    map.put('o',"1001");
    map.put('p',"100001");
    map.put('q',"1100001001");
    map.put('r',"0010");
    map.put('s',"0011");
    map.put('t',"1101");
    map.put('u',"00001");
    map.put('v',"1100000");
    map.put('w',"110001");
    map.put('x',"1100001000");
    map.put('y',"100011");
    map.put('z',"1100001010");
    StringBuilder as=new StringBuilder("");
    StringBuilder hf=new StringBuilder("");
    String[] binaryString=new String[input.length()];
    int reqzero=0;
    if(check==true){
        for (int i = 0; i <input.length() ; i++) {
            hf=hf.append(map.get(input.charAt(i)));
            //System.out.println(hf);
            binaryString[i]=Integer.toBinaryString(input.charAt(i));
            reqzero = 8-binaryString[i].length();
            binaryString[i]="0".repeat(reqzero)+binaryString[i];
            as=as.append(binaryString[i]);
        }
    }
    System.out.println("ASCI:-"+as);
    System.out.println("HfMn:-"+hf);
    System.out.println((double)((as.length()-hf.length())*100)/as.length()+"% compresssed");
    sc.close();
}
}
