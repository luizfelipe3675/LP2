package Hello2DModel;
import java.awt.*;

public class Linha implements Figura{
	private int xi,yi,xf,yf,e,r,g,b;
	public Linha(int xi,int yi,int xf,int yf,int e,int r,int g,int b){
		this.xi=xi;
		this.yi=yi;
		this.xf=xf;
		this.yf=yf;
		this.e=e;
		this.r=r;
		this.g=g;
		this.b=b;

		if(r<0||r>255||g<0||g>255||b<0||b>255){
			throw new IllegalArgumentException("cor invalida");	
		}
	}
	@Override
	public void desenhar(Graphics2D g2d){
		
		g2d.setColor(new Color(r,g,b));
		g2d.setStroke(new BasicStroke(e));
		g2d.drawLine(xi,yi,xf,yf);
		
	}
	public void print(){
		System.out.printf("Linha com espessura(%d) com cor RGB(%d,%d,%d) com ponto inicial(%d,%d) e ponto final(%d,%d) \n",e,r,g,b,xi,yi,xf,yf);
	}
}

