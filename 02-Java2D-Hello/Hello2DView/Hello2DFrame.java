package projetoLP2.view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import projetoLP2.model.Figura;
public class Hello2DFrame extends JFrame { 
	public Hello2DFrame (Figura[] lista) {
		setTitle("Desenhos 2D");
		setSize(1000,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	setLocationRelativeTo(null);
        	add(new PainelDesenho(lista));
        	setVisible(true);
    	}

        private static class PainelDesenho extends JPanel {
        	private final Figura[] lista;
        	public PainelDesenho(Figura[] lista) { this.lista = lista; }
        	@Override
        	protected void paintComponent(Graphics g) {
            		super.paintComponent(g);
            		Graphics2D g2d = (Graphics2D) g;
            		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            		if (lista != null) {
                		for (Figura f : lista) {
                    			f.desenhar(g2d);
                }
            }
        }
    }
}


