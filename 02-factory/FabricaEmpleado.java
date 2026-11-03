
class FabricaEmpleado {

    public static Empleado crear(String linea) {
        String[] d = linea.split(";");
        double a = Double.parseDouble(d[2]);
        switch (d[0]) {
            case "FIJO":
                return new EmpleadoFijo(d[1], a);
            case "HORAS":
                return new EmpleadoPorHoras(d[1], a, Double.parseDouble(d[3]));
            case "COMISION":
                return new EmpleadoPorComision(d[1], a, Double.parseDouble(d[3]));
            case "CONTRATISTA":
                return new Contratista(d[1], a);

            default: throw new IllegalArgumentException();
        }

    }
}
