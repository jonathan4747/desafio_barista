public class TestPedido {
    public static void main(String[] args) {
        Articulo cafe = new Articulo("Cafe", 5);
        Articulo Capuchino = new Articulo("Capuchino", 3.5);

        System.out.println(cafe.getArticulo() +" "+ cafe.getPrecio());
        System.out.println(Capuchino.getArticulo() +" "+ Capuchino.getPrecio());

        Pedido orden1 = new Pedido();
        Pedido orden2 = new Pedido();

        System.out.println(orden1.getNombre()+" "+orden1.getItems());
        System.out.println(orden2.getNombre()+" "+orden2.getItems());

        Pedido orden3 = new Pedido("Raul");
        Pedido orden4 = new Pedido("Jonathan");
        Pedido orden5= new Pedido("Liz");

        orden3.Articulos(Capuchino);
        orden3.Articulos(cafe);
        orden4.Articulos(Capuchino);
        orden4.Articulos(cafe);
        orden5.Articulos(Capuchino);
        orden5.Articulos(cafe);

        orden3.display();

        String estado4 = orden4.Estado(true);
        System.out.println(estado4);
        








        
    }
    
}
