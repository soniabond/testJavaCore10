package module8;

public class GameTest {
    public static void main(String[] args) {
        MoveService moveService = new MoveService();
        VoiceProducingService voiceProducingService = new VoiceProducingService();

        Movable movableHorse = new Horse();
        Player player = new Player();
        Talkable talkableDuck = new Duck();

        moveService.moveInSpace(player);
        moveService.moveInSpace(movableHorse);

        voiceProducingService.produceVoice(player);
        voiceProducingService.produceVoice(talkableDuck);
    }
}
