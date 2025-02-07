package edu.uob;

import java.io.Serial;
import java.io.Serializable;

public class OXOController implements Serializable {
    @Serial private static final long serialVersionUID = 1;
    OXOModel gameModel;

    public OXOController(OXOModel model) {
        gameModel = model;
    }

    public void handleIncomingCommand(String command) throws OXOMoveException {
        command = command.toLowerCase();
        int firstChar = command.charAt(0) - 'a';
        int lastChar = command.charAt(1) - '1';
        gameModel.setCellOwner(firstChar, lastChar, gameModel.getPlayerByNumber(gameModel.getCurrentPlayerNumber()));
        // change to next player
        int nextPlayerNumber = gameModel.getCurrentPlayerNumber() + 1;
        if (nextPlayerNumber > gameModel.getPlayerLength()) {
            nextPlayerNumber = 0;
        }
        gameModel.setCurrentPlayerNumber(nextPlayerNumber);
    }
    public void addRow() {}
    public void removeRow() {}
    public void addColumn() {}
    public void removeColumn() {}
    public void increaseWinThreshold() {}
    public void decreaseWinThreshold() {}
    public void reset() {
        // clear the cells
        for (int i=0; i < gameModel.getNumberOfRows(); i++) {
            for (int j=0; j < gameModel.getNumberOfColumns(); j++) {
                gameModel.setCellOwner(i, j, null);
            }
        }
        gameModel.setCurrentPlayerNumber(0);
        gameModel.setWinner(null);
        gameModel.setWinThreshold(0);
        gameModel.setGameDrawn(false);
    }
}
