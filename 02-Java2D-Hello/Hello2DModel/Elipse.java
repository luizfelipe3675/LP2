package projetoLP2.model;
import java.awt.*;
import java.awt.geom.AffineTransform;
public class Elipse implements Figura{
	private int cx,cy,l,a,e,r,g,b;
	private String st;
	private double graus;

	public Elipse(int cx,int cy, int l, int a,int e,int r,int g,int b,String st,double graus){
		this.cx=cx;
		this.cy=cy;
		this.l=l;
		this.a=a;
		this.e=e;
		this.r=r;
		this.g=g;
		this.b=b;
		this.st=st;
		this.graus=graus;

		if(r<0||r>255||g<0||g>255||b<0||b>255){
			throw new IllegalArgumentException("cor invalida");	
		}
	}
	@Override
	public void desenhar(Graphics2D g2d){
		int x=cx-l/2;
		int y=cy-a/2;
		AffineTransform old =g2d.getTransform();
		g2d.setColor(new Color(r,g,b));
		g2d.setStroke(new BasicStroke(e));
		g2d.rotate(Math.toRadians(graus),cx,cy);

		if(st.equalsIgnoreCase("F")){
			g2d.fillOval(x,y,l,a);
		}else{
			g2d.drawOval(x,y,l,a);
		}
		g2d.setTransform(old);
	}
	public void print(){
		System.out.printf("elipse com centro na posicao (%d,%d) com tamanho (%d,%d)\n",cx,cy,l,a);
		System.out.printf("elipse com cor RGB(%d,%d,%d) e com espessura de %d e %s com a cor escolhida\n",r,g,b,e,st);
	}
}
