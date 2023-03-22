package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;
	private int moveCount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	
	public int getMoveCount() {
		return moveCount;
	}

	// contagem dos movimentos das Peças
	public void increaseMoveCount() {
		moveCount++;
	}
	// desfazendo contagem de movimentos
	public void decreaseMoveCount() {
		moveCount--;
	}
	
	// verificando se tem peça oponente
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	
	
}