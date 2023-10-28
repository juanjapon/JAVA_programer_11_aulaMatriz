public class Transaccion {

    private String ciudad;
    private String pais;
    private String detalle;
    private boolean claveVerificacion;
    private double monto;
    private boolean sopechosa;
    private String estado;


    @Override
    public String toString() {
        return "Transaccion{" +
                "ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                ", detalle='" + detalle + '\'' +
                ", claveVerificacion=" + claveVerificacion +
                ", monto=" + monto +
                ", sopechosa=" + sopechosa +
                ", estado='" + estado + '\'' +
                '}';
    }

    public Transaccion(){

    }

    public Transaccion(double monto, String ciudad, String pais, String detalle, boolean claveVerificacion) {
    this.monto=monto;
    this.ciudad=ciudad;
    this.pais=pais;
    this.detalle=detalle;
    this.claveVerificacion=claveVerificacion;
    isSospechosa();
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public boolean isClaveVerificacion() {
        return claveVerificacion;
    }

    public void setClaveVerificacion(boolean claveVerificacion) {
        this.claveVerificacion = claveVerificacion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }



    public void setSopechosa(boolean sopechosa) {
        this.sopechosa = sopechosa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isSospechosa(){
        if(this.detalle.contains("fraude")){
            this.sopechosa=true;
        }
        else sopechosa=false;

        return sopechosa;
    }

}
