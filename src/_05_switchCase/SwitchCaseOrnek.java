package _05_switchCase;

public class SwitchCaseOrnek {
    public static void main(String[] args) {

        String ayDegeriStr = "Temmuz";
        int ayDeger = -1;

        switch(ayDegeriStr.toLowerCase()) {
            case "ocak":
                ayDeger = 1;
                break;
            case "subat":
                ayDeger = 2;
                break;
            case "mart":
                ayDeger = 3;
                break;
            case "nisan":
                ayDeger = 4;
            case "mayis":
                ayDeger = 5;
                break;
            case "haziran":
                ayDeger = 6;
                break;
            case "temmuz":
                ayDeger = 7;
                break;
            case "agustos":
                ayDeger = 8;
                break;
            case "eylul":
                ayDeger = 9;
                break;
            case "ekim":
                ayDeger = 10;
                break;
            case "kasim":
                ayDeger = 11;
                break;
            case "aralik":
                ayDeger = 12;
                break;
            default:
                break;
        }
        System.out.println(ayDegeriStr + " ayi yilin " + ayDeger + ". ayidir.");

        //OUTPUT : Temmuz ayi yilin 7. ayidir.



    }
}
