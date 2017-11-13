import java.util.Arrays;
import java.util.List;

public class ConvertToWords
{
  private String[] numbers =
      {
          "Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine",
          "Ten", "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen",
          "Twenty", "Twenty One","Twenty Two","Twenty Three","Twenty Four","Twenty Five","Twenty Six","Twenty Seven","Twenty Eight","Twenty Nine",
          "Thirty","Thirty one","Thirty Two", "Thirty Three","Thirty Four","Thirty Five","Thirty Six","Thirty Seven","Thirty Eight","Thirty Nine",
          "Forty","Forty one","Forty Two","Forty Three","Forty Four","Forty Five","Forty Six","Forty Seven","Forty Eight","Forty Nine",
          "Fifty","Fifty One","Fifty Two","Fifty Three","Fifty Four","Fifty Five","Fifty Six","Fifty Seven","Fifty Eight","Fifty Nine",
          "Sixty","Sixty One","Sixty Two","Sixty Three","Sixty Four","Sixty Five","Sixty Six","Sixty Seven","Sixty Eight","Sixty Nine",
          "Seventy","Seventy One","Seventy Two","Seventy Three","Seventy Four","Seventy Five","Seventy Six","Seventy Seven","Seventy Eight","Seventy Nine",
          "Eighty","Eighty One","Eighty Two","Eighty Three","Eighty Four","Eighty Five","Eighty Six","Eighty Seven","Eighty Eight","Eighty Nine",
          "Ninety","Ninety One","Ninety Two","Ninety Three","Ninety Four","Ninety Five","Ninety Six","Ninety Seven","Ninety Eight","Ninety Nine",
      };

  private List<String> list = Arrays.asList(numbers);

  public void convertNumberToWords()
  {
    List<String> list = Arrays.asList(numbers);
    for(String number : list  )
    {
      System.out.println( list.indexOf(number) + " - " + number);
    }

    list.forEach(item-> {
      System.out.println( list.indexOf(item) + " - " + item);
    });
  }

  public static void main(String [] args)
  {
    ConvertToWords test = new ConvertToWords();
    test.convertNumberToWords();
  }
}
