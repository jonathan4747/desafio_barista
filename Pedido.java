import java.util.ArrayList;

class Pedido{
    private String nombre;
    private boolean listo;
    private ArrayList<Articulo> items = new ArrayList<Articulo>(); 
    // private ArrayList<Object> 


    public Pedido(){
        this.nombre = "invitado";
        this.items = null;
    }

   

    public Pedido(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
    public boolean getListo(){
        return listo;
    }
    public ArrayList<Articulo> getItems(){
        return items;
    }

    public void setNombre(String nombre){
       nombre=nombre;
    }
    public void setlisto(boolean listo){
        listo=listo;
    }

    public void setItem(ArrayList<Articulo> items){
        items=items;
    }

    public void Articulos( Articulo articulo){
        items.add(articulo);
    }

    public String Estado(boolean listo){
        if (getListo() == true ){
            return "Tu pedido esta listo";
        }
        else{
            return "Tu pedido no esta listo";
        }
    }

    public void display(){
        double Total =0;
        System.out.println("Nombre: "+ getNombre());    
        for (int i=0 ; i <= getItems().size()-1; i++){
            System.out.println(getItems().get(i).getArticulo()+ ": "+ getItems().get(i).getPrecio());
            Total += getItems().get(i).getPrecio();
        } 
        System.out.println("El total es: "+ Total);      
    }

    




}