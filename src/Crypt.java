import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Crypt {
    String textToCrypt;
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");

    public void setTextToCrypt(String textToCrypt) {
        this.textToCrypt = textToCrypt;
    }

    public String getTextToCrypt() {
        return textToCrypt;
    }

    public void deCrypt (){
        System.out.println(textToCrypt.replace("à", "!))").replace("ê", "¹::")
                .replace("ð", "-_").replace("ì", "+*")
                .replace("î", ";,").replace("ó", "__-")
                .replace("ê", "=((").replace("ë", ")()")
                .replace("ÿ", "q").replace("ñ", ":!")
                .replace("â", "*g*").replace("ä", "¹%¹")
                .replace("è", "^^").replace("á", "yi")
                .replace("æ", ",,").replace("å", "}{") + " " +
                dateFormat.format(calendar.getTime()).replace("1","z!")
                .replace("2","((>").replace("3","l")
                .replace("4","h").replace("5","|||")
                .replace("6","*&").replace("7","$$")
                .replace("8","fA").replace("9","<-").replace("0","I"));
    }

    public void enCrypt (){
        System.out.println(textToCrypt.replace("!))", "à").replace("¹::", "ê")
                .replace("-_", "ð").replace("+*", "ì")
                .replace(";,", "î").replace("__-", "ó")
                .replace("=((", "ê").replace(")()", "ë")
                .replace("q", "ÿ").replace(":!", "ñ")
                .replace("*g*", "â").replace("¹%¹", "ä")
                .replace("^^", "è").replace("yi", "á")
                .replace(",,", "æ").replace("}{", "å")
                .replace("z!","1").replace("((>","2")
                .replace("l","3").replace("h","4")
                .replace("|||","5").replace("*&","6")
                .replace("$$","7").replace("fA","8")
                .replace("<-","9").replace("I","0"));

    }
}
