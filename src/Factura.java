import java.util.Date;
import java.util.ArrayList;
import java.util.List;


public class Factura {

    private int numero;
    public Date fecha;
    private List<ItemFactura> items;

    public Factura(int numero){
        this.numero=numero;
        this.fecha= new Date();
        this.items = new ArrayList<>();
    }

    public void agregarItem(ItemFactura item){
        items.add(item);
    }

    public double calcularTotal(){
        double total = 0;
        for (ItemFactura i : items) {
            total += i.calcularSubtotal();
        }
        return total;
    }

    public void imprimirFactura(){
        System.out.println("Factura #" + numero);
        System.out.println("Fecha: " + fecha.toString());
        System.out.println("Vehiculos comprados:");
        for (ItemFactura item : items) {
            System.out.println("- " + item.getProducto().getNombre() + ": $" + item.calcularSubtotal());
        }
        System.out.println("Total: $" + calcularTotal());
    }
}