package List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
/**
 * Created by Mihnea on 28.04.2017.
 */
public class TokenizerTest {
    public static void main(String[] args) {



//        List listaMea = new ArrayList<Integer>();
//        List listaTotAMea = new LinkedList<String>();


            String text="ana are mere si perelele lui ionel si for each element sa-i dai perele nu merele";




            List<String> a = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(text," ");
            while (st.hasMoreTokens()) {
                a.add(st.nextToken());
            }




            int max = a.get(0).length();
            int pozitie=0;
            for(int i=0;i<a.size();i++) {

                String val = a.get(i);
                System.out.println(a.get(i)+" are lungimea de "+val.length());
                if(max<val.length()) {
                    max = val.length();
                    pozitie = i;
                }
            }
            System.out.println("cel mai lung e: "+a.get(pozitie));






        }
    }

