package _27_exceptionHandling;

import java.util.ArrayList;

public class UncheckedExceptionSample {

    public static void main(String[] args) {

        ArrayList<String> strList = new ArrayList<String>();


        strList.add("Zeliha");    //0. value
        strList.add("Deniz");     //1. value
        strList.add("Lale");      //2. value
        strList.add("Sumeyye");   //3. value
        strList.add("Ismail");    //4. value

        String val = strList.get(5);
        System.out.println(val);

    }

    /*
    Kodda gelistirme asamasinda herhangi bir hata gözükmese bile çalıstirildigi zaman :

    Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 5 out of bounds for length 5
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
	at java.base/java.util.Objects.checkIndex(Objects.java:359)
	at java.base/java.util.ArrayList.get(ArrayList.java:427)
	at _27_exceptionHandling.UncheckedExceptionSample.main(UncheckedExceptionSample.java:18)

    Hatasi alinir.
     */




}
