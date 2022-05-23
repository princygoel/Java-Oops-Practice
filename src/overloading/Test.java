package overloading;

import java.util.*;
import java.io.*;

class Function { 
  String ThirdGreatest(String[] strArr) {
    int[] contaCaracteres = new int[strArr.length];
   
    for (int i = 0; i < strArr.length; i++) {
     contaCaracteres[i] = strArr[i].length();
    }
   
    boolean achouMenor;
   
    int maior = -1;
    int indice = -1;
    for (int i = 0; i < strArr.length; i++) {
      if (contaCaracteres[i] > maior) {
        maior = contaCaracteres[i];
        indice = i;
      }
    }
   
    int maior2 = -1;
    int indice2 = -1;
    for (int i = 0; i < strArr.length; i++) {
      if (contaCaracteres[i] > maior2 && contaCaracteres[i] <= maior && i != indice) {
        maior2 = contaCaracteres[i];
        indice2 = i;
      }
    }
   
    int maior3 = -1;
    int indice3 = -1;
    for (int i = 0; i < strArr.length; i++) {
      if (contaCaracteres[i] > maior3 && contaCaracteres[i] <= maior2 && i != indice && i != indice2) {
        maior3 = contaCaracteres[i];
        indice3 = i;
      }
    }
      
    return strArr[indice3];
   
  }
 
  public static void main (String[] args) { 
    // keep this function call here    
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.ThirdGreatest(s.nextLine()));
  }

private char[] ThirdGreatest(String nextLine) {
	// TODO Auto-generated method stub
	return null;
}


}  
 
