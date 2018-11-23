
package ultimologica;

/**
 *
 * @author leomare12
 */
public class Nodo {
    private Nodo ligaIzq;
    private Nodo ligaDer;
    private char car;
    
    public Nodo(char car){
        this.car = car;
        ligaIzq = ligaDer = null;
    }  

    public void setLigaIzq(Nodo ligaIzq) {
        this.ligaIzq = ligaIzq;
    }

    public void setLigaDer(Nodo ligaDer) {
        this.ligaDer = ligaDer;
    }

    public void setCar(char car) {
        this.car = car;
    }

    public Nodo getLigaIzq() {
        return ligaIzq;
    }

    public Nodo getLigaDer() {
        return ligaDer;
    }

    public char getCar() {
        return car;
    }

}
