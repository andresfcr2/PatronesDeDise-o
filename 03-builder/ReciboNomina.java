public class ReciboNomina {
    private Empleado empleado;
    private double horasExtra;
    private double bonificacion;
    private double auxilioTransporte;
    private double descuentoLibranza;

    public ReciboNomina(Builder b) {
        this.empleado = b.empleado;
        this.horasExtra = b.horasExtra;
        this.bonificacion = b.bonificacion;
        this.auxilioTransporte = b.auxilioTransporte;
        this.descuentoLibranza = b.descuentoLibranza;
    }

    public static class Builder {

        private Empleado empleado;
        private double horasExtra, bonificacion, auxilioTransporte, descuentoLibranza;
        
        public Builder(Empleado e) {
            this.empleado = e;
        }

        public Builder horasExtra(double horasExtra ) {
            this.horasExtra = horasExtra;
            return this;
        }
        public Builder bonificacion(double bonificacion ) {
            this.bonificacion = bonificacion;
            return this;
        }
        public Builder auxilioTransporte(double auxilioTransporte ) {
            this.auxilioTransporte = auxilioTransporte;
            return this;
        }
        public Builder descuentoLibranza(double descuentoLibranza ) {
            this.descuentoLibranza = descuentoLibranza;
            return this;
        }

        public ReciboNomina build() {
            return new ReciboNomina(this);
        }
    }

    public double totalPagar() {
        return empleado.calcularSalario() + horasExtra + bonificacion
                + auxilioTransporte - descuentoLibranza;
    }

    public String getNombreEmpleado() {
        return empleado.getNombre();
    }
}
