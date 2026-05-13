package projetoLP2.model;
import java.awt.*;
import java.awt.geom.AffineTransform;
public class Texto implements Figura{
	private String frase;
	private int r,g,b,e;
	private int tamanho;
	private int x,y;

	public Texto(String frase,int r,int g,int b,int e,int x,int y,int tamanho){
		this.frase=frase;
		this.r=r;
		this.g=g;
		this.b=b;
		this.e=e;
		this.x=x;
		this.y=y;
		this.tamanho=tamanho;
		
		if(r<0||r>255||g<0||g>255||b<0||b>255){
			throw new IllegalArgumentException("cor invalida");	
		}
	}
	@Override
	public void desenhar(Graphics2D g2d){
		AffineTransform old =g2d.getTransform();
		g2d.setColor(new Color(r,g,b));
		g2d.setStroke(new BasicStroke(e));
		g2d.setFont(new Font("Arial", Font.BOLD,tamanho));
		g2d.drawString(frase,x,y);
		g2d.setTransform(old);
	}
	public void print() {
		System.out.printf("Texto \"%s\" pos=(%d,%d) tamanho=%d cor=RGB(%d,%d,%d)\n",frase, x, y, tamanho, r, g, b);
        }
}
