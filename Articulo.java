class Articulo {
    private String articulo;
    private double precio;

    public String getArticulo(){
        return articulo;
    }

    public void setArticulo( String articulo){
        articulo=articulo;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio( double precio){
        precio=precio;
    }

    public Articulo (String articulo , double precio){
        this.articulo=articulo;
        this.precio=precio;
    }

}