
/**
 * La clase Smith pretende simular un ser vitual (dibujable a partir de un Canvas, del cual desciende).
 * 
 * @author Sergio Recio Blázquez
 * @version 1.0; 14 Dic 2018
 */

import java.awt.*;

public class Smith extends Canvas {
	private String boca = "";

	/**
	 * Constructor for objects of class Smith
	 */
	public Smith() {
		super();
	}

	/**
	 * Método sobreescrito para el pintado de Smith
	 * 
	 * @param g Graphics sobre el que se pinta
	 */
	public void paint(Graphics g) {
		g.setColor(getBackground());
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.BLACK);
		g.fillOval(20, 40, 30, 30);
		g.fillOval(70, 40, 30, 30);
		// BOCA
		g.setColor(Color.RED);
		if (boca.equals("")) {
			g.fillOval(36, 85, 50, 20);
		} else if (boca.equals("o")) {
			g.fillOval(47, 82, 28, 32);
		} else if (boca.equals("a")) {
			g.fillRoundRect(36, 85, 50, 30, 30, 20);
		} else if (boca.equals("i")) {
			g.fillRoundRect(36, 90, 50, 15, 30, 20);
		}

	}

	public void setBoca(String boca) {
		this.boca = boca;
		/*
		 * if (this.boca.equals("")) this.boca = "o"; else if (this.boca.equals("o"))
		 * this.boca = "a"; else this.boca ="";
		 */
		repaint();
		System.out.println(this.boca);
		// this.
	}

	public void pronunciar(String frase) {
		// De momento solo hola
		new Thread(new Runnable() {
			public void run() {
				try {
					if (frase.equals("Hola")) {
						Thread.sleep(500);
						setBoca("o");
						Thread.sleep(350);
						setBoca("a");
						Thread.sleep(275);
						setBoca("");
					} else {
						Thread.sleep(500);
						setBoca("a");
						Thread.sleep(250);
						setBoca("i");
						Thread.sleep(225);
						setBoca("o");
						Thread.sleep(400);
						setBoca("");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
}
