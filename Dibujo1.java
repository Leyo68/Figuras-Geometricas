package figura;
//Librerias imprtadas para poder utilizar metodos
import java.awt.Color;
import java.awt.Graphics;

//Clase principal
public class Dibujo1 {

    public Dibujo1() {
    }
    
    public void Rectangulo (Graphics a) {
      a.clearRect(100, 50, 100, 50);
      a.clearRect(290, 100, 90, 55); 
      a.clearRect(100, 35, 80, 110);
      a.clearRect(100, 100, 100, 100);
      a.clearRect(90, 50, 500, 50);
      
      a.setColor(Color.PINK);
      a.fillRect(200, 100, 100, 30);     
    }
    
    public void Ovalo (Graphics b) {
        b.clearRect(200, 100, 100, 100);
        b.clearRect(400, 300, 200, 150);
        b.clearRect(100,35, 80, 80);        
        b.clearRect( 100, 35, 80, 110);
        b.clearRect(100, 100, 100, 100);
        b.clearRect(90, 50, 500, 50);
        
        b.setColor(Color.BLUE);
        b.fillOval(400, 300, 200, 150);
        
    }
    
    public void Arco (Graphics c) {
        c.clearRect(200, 100, 100, 100);
        c.clearRect(100, 35, 80, 110);
        c.clearRect(290, 100, 90, 55); 
        c.clearRect(100, 100, 100, 100);
        c.clearRect(90, 50, 500, 50);
        
        c.setColor(Color.GRAY);
        c.drawRect(100, 35, 80, 80 );
        c.setColor(Color.ORANGE);
        c.fillArc(100, 35, 80, 80, 0, 110);
    }
    
    public void Cuadrado(Graphics d) { 
        d.clearRect(200, 100, 100, 100);
        d.clearRect(100, 100, 100, 100);
        d.clearRect(400, 300, 200, 150);
        d.clearRect(100, 35, 80, 110);
        d.clearRect(90, 50, 500, 50);
        
        d.setColor(Color.YELLOW);
        d.fillRect(100, 100, 100, 100);

    }
    
    public void Linea (Graphics e) {
        e.clearRect(200, 100, 100, 100);
        e.clearRect(90, 50, 500, 50);  
        e.clearRect(400, 300, 200, 150);  
        e.clearRect(100, 35, 80, 110);
        e.clearRect(100, 100, 100, 100);
        
        e.setColor(Color.RED);
        e.drawLine(90, 50, 500, 50);
        
    }
    

    void triangulo(String string) {
        throw new UnsupportedOperationException(""); //To change body of generated methods, choose Tools | Templates.
    }

    void Linea(String string) {
        throw new UnsupportedOperationException("."); //To change body of generated methods, choose Tools | Templates.
    }

    void Cuadrado(String string) {
        throw new UnsupportedOperationException(""); //To change body of generated methods, choose Tools | Templates.
    }

    void Ovalo(String string) {
        throw new UnsupportedOperationException(""); //To change body of generated methods, choose Tools | Templates.
    }

    void Arco(String string) {
        throw new UnsupportedOperationException(""); //To change body of generated methods, choose Tools | Templates.
    }
    
    }



