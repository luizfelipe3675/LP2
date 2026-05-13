package projetoLP2.app;

import java.util.*;
import java.awt.Color;
import projetoLP2.model.*;
import projetoLP2.view.Hello2DFrame;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Figura> figuras = new ArrayList<>();

        System.out.print("Quantas figuras deseja criar? ");
        int total = sc.nextInt();

        for (int i = 0; i < total; i++) {
            System.out.print("Tipo (E=Elipse, L=Linha, T=Texto, P=Poligono): ");
            String tipo = sc.next();
            switch (tipo.toUpperCase()) {
                case "E": {
                    System.out.print("cx cy largura altura espessura R G B (separados por espaço): ");
                    int cx = sc.nextInt(), cy = sc.nextInt(), l = sc.nextInt(), a = sc.nextInt(), e = sc.nextInt();
                    int r = sc.nextInt(), g = sc.nextInt(), b = sc.nextInt();
                    System.out.print("V para vazio ou F para preenchido: ");
                    String st = sc.next();
                    System.out.print("Rotação em graus: ");
                    double graus = sc.nextDouble();
                    figuras.add(new Elipse(cx, cy, l, a, e, r, g, b, st, graus));
                    break;
                }
                case "L": {
                    System.out.print("xi yi xf yf espessura R G B: ");
                    int xi = sc.nextInt(), yi = sc.nextInt(), xf = sc.nextInt(), yf = sc.nextInt(), e = sc.nextInt();
                    int r = sc.nextInt(), g = sc.nextInt(), b = sc.nextInt();
                    figuras.add(new Linha(xi, yi, xf, yf, e, r, g, b));
                    break;
                }
                case "T": {
                    sc.nextLine(); 
                    System.out.print("Texto: ");
                    String texto = sc.nextLine();
                    System.out.print("x y tamanho R G B espessura: ");
                    int x = sc.nextInt(), y = sc.nextInt(), tamanho = sc.nextInt();
                    int r = sc.nextInt(), g = sc.nextInt(), b = sc.nextInt(), e = sc.nextInt();
                    figuras.add(new Texto(texto, r, g, b, e, x, y, tamanho));
                    break;
                }
                case "P": {
                    System.out.print("Quantos pontos: ");
                    int pontos = sc.nextInt();
                    int[] xs = new int[pontos], ys = new int[pontos];
                    for (int j = 0; j < pontos; j++) {
                        System.out.print("x y do ponto " + (j+1) + ": ");
                        xs[j] = sc.nextInt(); ys[j] = sc.nextInt();
                    }
                    System.out.print("espessura R G B preenchido(true/false) rotacao: ");
                    int e = sc.nextInt(),-r = sc.nextInt(), g = sc.nextInt(), b = sc.nextInt();
                    boolean fill = sc.nextBoolean();
                    double graus = sc.nextDouble();
                    figuras.add(new Poligono(xs, ys, pontos, new Color(r, g, b), fill, graus, e));
                    break;
                }
                default:
                    System.out.println("Tipo inválido, pulando.");
            }
        }

        sc.close();

        
        for (Figura f : figuras) f.print();

        
        Figura[] arrayFiguras = figuras.toArray(new Figura[figuras.size()]);
	Hello2DFrame frame = new Hello2DFrame(arrayFiguras);


    }
}


