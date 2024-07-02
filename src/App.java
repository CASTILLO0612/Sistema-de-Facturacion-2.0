public class App {
    public static void main(String[] args) throws Exception {
        
        Producto p1 = new Producto ("Toyota",123450.6);
        Producto p2 = new Producto ("Ferrari",1500000.6);
        Producto p3 = new Producto ("Porshe",1230550.6);

        ItemFactura itemfactura = new ItemFactura(p1, 3);
        ItemFactura itemfactura2 = new ItemFactura(p2, 2);
        ItemFactura itemFactura3 = new ItemFactura(p3, 1);

        Factura factura = new Factura(2);
        factura.agregarItem(itemfactura);
        factura.agregarItem(itemfactura2);
        factura.agregarItem(itemFactura3);

        factura.imprimirFactura();
    }

    
}