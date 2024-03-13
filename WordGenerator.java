import java.util.ArrayList;
import java.util.Random;
/**
 * Escreva uma descrição da classe WordGenerator aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class WordGenerator
{
    private ArrayList<String> words;
    private Random random;
    public WordGenerator(){
        words = new ArrayList<String>();
        random = new Random();
    }
    public void fillArrayList(){
        words.add("boolean");
        words.add("break");
        words.add("byte");
        words.add("case");
        words.add("char");
        words.add("class");
        words.add("continue");
        words.add("do");
        words.add("double");
        words.add("else");
        words.add("enum");
        words.add("for");
        words.add("if");
        words.add("import");
        words.add("int");
    }
    public String generateWord(){
        int index = random.nextInt(words.size() + 1 );
        return words.get(index);
    }
    public void addWord(String word){
        words.add(word);
    }
    
}
