
/**
 * Escreva uma descrição da classe WordGuessingGame aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class WordGuessingGame
{
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    private InputReader reader;
    
    public WordGuessingGame(){
        hiddenWord = "abc";
        guessedWord = "___";
        numberOfTries = 0;
        reader = new InputReader();
    }
    public String getHiddenWord(){
        return hiddenWord;
    }
    public String getGuessedWord(){
        return guessedWord;
    }
    public int getNumberOfTries(){
        return numberOfTries;
    }
    public void showGuessedWord(){
        System.out.println(guessedWord);
    }
    
    public void showWelcome(){
        System.out.println("Olá! Bem vindo ao jogo de adivinhar a palavra. É tipo um jogo da forca.");
    }
    
    public void guess(){
        char guess = reader.getChar("Introduz uma letra!: ");
        
        for(int i = 0; i<hiddenWord.length(); i++){
            if(hiddenWord.charAt(i) == guess){
                guessedWord = guessedWord.substring(0, i)+guess+guessedWord.substring(i+1);
                showGuessedWord();
            }
        }
        
        numberOfTries++;
    }
    
    public void play(){
        showWelcome();
        
        do { guess(); } while(guessedWord.trim().equals(hiddenWord.trim()) == false);
        
        System.out.println("Correto! A palavra era " + hiddenWord + "com " + getNumberOfTries() + "tentativas.");
    }
}
