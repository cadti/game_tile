package poo_game;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameTile extends JFrame {
	private static final long serialVersionUID = 1L;
	public GameTile() {
		setSize(320, 320);
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.montaTela();
	}
	private void montaTela() {
		int[][] mapa = {
				{12, 12, 12, 12, 12, 12, 12, 12, 12, 12},
				{12, 12, 12, 12, 12, 12, 12, 12, 12, 12},
				{12, 12, 12, 12, 12, 12, 12, 12, 12, 12},
				{12, 12, 12, 12, 12, 12, 12, 12, 12, 12},
				{8, 8, 8, 8, 8, 8, 8, 8, 8, 8},
				{8, 8, 8, 8, 8, 8, 8, 8, 8, 8},
				{8, 8, 8, 8, 8, 8, 8, 8, 8, 8},
				{8, 8, 8, 8, 8, 8, 8, 8, 8, 8},
				{16, 16, 16, 17, 17, 17, 17, 16, 16, 16},
				{16, 16, 16, 16, 16, 16, 16, 16, 16, 16}				
		};
		Container contentPane = getContentPane();
		for(int i=0;i<mapa.length;i++) {
			for(int j=0;j<mapa[i].length;j++) {
				JLabel tile = new Tile().getTile(mapa[i][j]);
				tile.setBounds((j*32), (i*32), 32, 32);
				contentPane.add(tile);				
			}
		}
	}
	public static void main(String[] args) {
		GameTile gameTile = new GameTile();
		gameTile.setVisible(true);
		
	}
}
