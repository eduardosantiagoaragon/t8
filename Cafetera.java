package t8;

public class Cafetera {
    private int cantidadAgua;
    private int cantidadCafé;
    private int cantidadCrema;
    private int cantidadVaos;

    public Cafetera() {
    }

    public Cafetera(int cantidadAgua, int cantidadCafé, int cantidadCrema, int cantidadVaos) {
        this.cantidadAgua = cantidadAgua;
        this.cantidadCafé = cantidadCafé;
        this.cantidadCrema = cantidadCrema;
        this.cantidadVaos = cantidadVaos;
    }

    public int getCantidadAgua() {
        return cantidadAgua;
    }

    public void setCantidadAgua(int cantidadAgua) {
        if (cantidadAgua < 5000 && cantidadAgua > 1) {
            this.cantidadAgua = cantidadAgua;
        }
        else {
            System.out.print(("No es posible establecer esa cantidad"));
        }
    }

    public int getCantidadCafé() {
        return cantidadCafé;
    }

    public void setCantidadCafé(int cantidadCafé) {
        this.cantidadCafé = cantidadCafé;
    }

    public int getCantidadCrema() {
        return cantidadCrema;
    }

    public void setCantidadCrema(int cantidadCrema) {
        this.cantidadCrema = cantidadCrema;
    }

    public int getCantidadVaos() {
        return cantidadVaos;
    }

    public void setCantidadVaos(int cantidadVaos) {
        this.cantidadVaos = cantidadVaos;
    }

    @Override
    public String toString() {
        return "Cafetera{" +
                "cantidadAgua=" + cantidadAgua +
                ", cantidadCafé=" + cantidadCafé +
                ", cantidadCrema=" + cantidadCrema +
                ", cantidadVaos=" + cantidadVaos +
                '}';
    }
    public boolean servirAmericano (){
        if (this.cantidadAgua >= 180 && this.cantidadCafé >= 15 && this.cantidadVaos >= 1) {

            this.cantidadAgua = this.cantidadAgua - 180;
            this.cantidadCafé = this.cantidadCafé - 15;
            this.cantidadVaos = this.cantidadVaos - 1;

            return true;
        }
        else {
            System.out.println("No es posible servir café");
            return false;
        }
    }
}
