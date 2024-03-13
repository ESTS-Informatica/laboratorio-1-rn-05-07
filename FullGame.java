
/**
 * Escreva uma descrição da classe FullGame aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class FullGame
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private WordGuessingGame game;
    private InputReader reader;

    public FullGame(){
       game = new WordGuessingGame();
       reader = new InputReader();
    }
    
    public void play(){
        boolean playAgain = true;
        char response = 'a';
        do{
            game.reset();
            game.play();
            response = reader.getChar("Deseja continuar a jogar(Note que se responder outra coisa alem de N sera contabilizado como desejo de jogar):");
            if(response == 'N'){
                playAgain = false;
            }
            
        }while(playAgain);
    }
}
