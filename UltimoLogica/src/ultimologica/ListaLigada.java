package ultimologica;
/**
 *
 * @author leomare12
 */
public class ListaLigada {
    private Nodo cab;
    private Nodo ult;
    private Nodo x;
    
    public ListaLigada(){
        cab = new Nodo('0');
        ult = x = cab;
    }

    public void CreaLista (char pCar) {
        Nodo p = new Nodo(pCar);
        ult.setLigaDer(p);
        p.setLigaIzq(ult);
        ult = p;
    }
    
    public void InsertCar (char pCar){
        Nodo nuevoCar = new Nodo(pCar);
        int contar = 0;
        Nodo p = cab.getLigaDer();
        while (contar != 1){
            if (p.getCar() == ' '){
                contar = contar + 1;
            }
            p = p.getLigaDer();
        }
        p = p.getLigaDer();
        nuevoCar.setLigaIzq(p);
        nuevoCar.setLigaDer(p.getLigaDer());
        p.setLigaDer(nuevoCar);
        p.getLigaDer().getLigaDer().setLigaIzq(nuevoCar);
    }
    
    public void Intercambio (){
        int contar = 0;
        char cAux;
        Nodo p = cab.getLigaDer();
        while (contar != 2){
            if (p.getCar() == ' '){
                contar = contar + 1;
            }
            p = p.getLigaDer();
        }
        p = p.getLigaDer().getLigaDer();
        cAux = p.getLigaIzq().getCar();
        p.getLigaIzq().setCar(p.getLigaDer().getCar());
        p.getLigaDer().setCar(cAux);
    }
    
    public void Elimina (){
        int contar = 0;
        Nodo p = ult.getLigaIzq();
        while (contar != 1){
            if (p.getCar() == ' '){
                contar = contar + 1;
            }
            p = p.getLigaIzq();
        }
        p = p.getLigaIzq();
        p.getLigaIzq().setLigaDer(p.getLigaDer());
        p.getLigaDer().setLigaIzq(p.getLigaIzq());
    }
    
    public char MostrarHilera(){
        x = x.getLigaDer();
        return x.getCar();
    }
}