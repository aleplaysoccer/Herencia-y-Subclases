public static void main(String[] args) {
    Empleado[] equipo = {
        new Piloto("Ana Gómez", "E-101", 4500.0, 60),
        new TecnicoMantenimiento("Luis Rivas", "E-102", 3800.0, 3),
        new AgenteVentas("Carla Mux", "E-103", 3200.0, 900.0),
        new Supervisor("Alejandro López", "E-104", 4000.0, 3)
    };
    for (Empleado e : equipo) {
        System.out.println(
            e.getNombre() + ": Q" + e.calcularSalario());
    }
}
