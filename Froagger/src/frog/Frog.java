package frog;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;

public class Frog extends Rectangle {

	Color color;
	public boolean arriba = false;
	public boolean derecha = false;
	public boolean izquierda = false;
	public boolean abajo = false;
	int velX = 20;
	public int velY;
	Toolkit t = Toolkit.getDefaultToolkit();
	Dimension screenSize;

	public Frog(int posY, int posX, int height, int width) {
		super(posX, posY, height, width);
		screenSize = t.getScreenSize();
		velY = screenSize.height / 13;
	}

	public void dibujar(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, width, height);
	}

	public void actualizar() {
		if (arriba) {
			upMove();
		}
		if (abajo) {

			downMove();
		}
		if (derecha) {

			rightMove();
		}
		if (izquierda) {

			leftMove();
		}

	}

	public void upMove() {
		y += velY;
	}

	public void downMove() {
		y -= velY;
	}

	public void leftMove() {
		x -= velX;
	}

	public void rightMove() {

		x += velX;
	}

}
