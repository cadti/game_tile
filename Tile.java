package poo_game;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Tile {
	BufferedImage bufferedImage;

	public Tile() {
		try {
			bufferedImage = ImageIO.read(new File("c:/temp/tile.png"));			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public JLabel getTile(int pos) {
		int linha = (pos % 10) * 32;
		int coluna = (pos / 10) * 32;
		BufferedImage subImage = bufferedImage.getSubimage(linha, coluna, 32, 32);
		return new JLabel(new ImageIcon(subImage));
	}
}
