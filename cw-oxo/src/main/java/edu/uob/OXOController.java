package edu.uob;

import java.io.Serial;
import java.io.Serializable;

public class OXOController implements Serializable {
    @Serial private static final long serialVersionUID = 1;
    OXOModel gameModel;

    public OXOController(OXOModel model) {
        gameModel = model;
    }

    public void handleIncomingCommand(String command) throws OXOMoveException {}
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
