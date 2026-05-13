package Hello2DModel;

import java.awt.*;

public class Poligono implements Figura {
	private int[] x;
	private int[] y;
	private int n;
	private Color cor;
        private boolean fill;
        private double graus;
        private float e;

        public Poligono(int[] x, int[] y, int n, Color cor, boolean fill, double graus, float e) {
        	this.x = x;
        	this.y = y;
        	this.n = n;
        	this.cor = cor;
        	this.fill = fill;
        	this.graus = graus;
        	this.e = e;
        }

        @Override
        public void desenhar(Graphics2D g2d) {
        	g2d.setColor(cor);
        	g2d.setStroke(new BasicStroke(e));

        
        	int cx = 0, cy = 0;
        	for (int i = 0; i < n; i++) {
            		cx += x[i];
            		cy += y[i];
        	}
        	cx /= n;
       		cy /= n;

        	g2d.translate(cx, cy);
        	g2d.rotate(Math.toRadians(graus));
        	g2d.translate(-cx, -cy);

        	if (fill) {
            		g2d.fillPolygon(x, y, n);
        	} else {
            		g2d.drawPolygon(x, y, n);
        	}

        	g2d.translate(cx, cy);
        	g2d.rotate(Math.toRadians(-graus));
        	g2d.translate(-cx, -cy);
        }

        @Override
        public void print() {
        	System.out.printf("Polígono com %d pontos, cor %s, preenchido=%b, rotação=%.2f graus\n",n, cor.toString(), fill, graus);
        }
}

