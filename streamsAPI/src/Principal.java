import java.util.List;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args){
        //creo una lista
        List<String> empleados = List.of("Ana", "Pedro", "Maria", "Jose", "Carlos", "Armando");
        //creo una lista a partir de la anterior
        List<String> empleadosLetraA = empleados.stream()
            .filter(e -> e.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(empleados);
        System.out.println((empleadosLetraA));

        List<Double> valorDeVentas = List.of(300.5, 400.2, 500.4, 200.5, 300.7);
        List<Double> comisionVentas = valorDeVentas.stream()
                .map(valor -> valor * 0.05)
                .collect(Collectors.toList());
        System.out.println("Ventas= "+valorDeVentas);
        System.out.println("Las comisiones de ventas son: "+comisionVentas);

        List<Double>comisionFilter = valorDeVentas.stream()
                .map(valor -> valor * 0.05)
                .filter(valor -> valor > 15.025)
                .collect(Collectors.toList());
        System.out.println("Las comisiones mayores a 15.025 son: "+comisionFilter);

        Double totalVentas = valorDeVentas.stream()
                .reduce(0.0, Double::sum);
        System.out.println("El total de las ventas es: "+totalVentas);

        List<String> funcionarios = List.of("Ana", "Carlos", "Pedro", "Sofia", "Maria", "Alberto");

        List<String> nombres5Caract = funcionarios.stream()
                .filter(n -> n.length() >= 5)
                .collect(Collectors.toList());
        System.out.println("Los nombres con 5 o mas caracteres son: "+nombres5Caract);

        List<Integer> numeros = List.of(2, 4, 6, 9, 11, 15);
        List<Integer> numerosAlCuadrado = numeros.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("numeros al cuadrado son: "+numerosAlCuadrado);

        List<Double> preciosProductos = List.of(325.5, 420.6, 530.8, 220.1, 1000.0);

        //no se hace lista, porque es total
        double totalGastado = preciosProductos.stream()
                .reduce(0.0, Double::sum);

        double impuestoDeGasto = totalGastado * 0.08;

        System.out.println("El valor total es :"+totalGastado);
        System.out.println(("El valor del impuesto es : "+ impuestoDeGasto));
        System.out.println("E valor total con impuesto es :"+ (totalGastado + impuestoDeGasto));

        List<Double> notasEstudiantes = List.of(6.34, 7.45, 8.65, 9.8, 9.43, 8.9, 4.53);
        double totalNotas = notasEstudiantes.stream()
                .reduce(0.0, Double::sum);
        int cantidadNotas = notasEstudiantes.size();

        double promedioNotas = totalNotas / cantidadNotas;
        double notaMasAlta = notasEstudiantes.stream()
                .max(Double::compare).get();
        double notaMasBaja = notasEstudiantes.stream()
                .min(Double::compare).get();

        System.out.println("La suma total de las notas es. "+totalNotas);
        System.out.println("son "+ cantidadNotas + " notas");
        System.out.println("El Promedio de las notas es :"+ promedioNotas);
        System.out.println("La nota mas alta es; "+notaMasAlta);
        System.out.println("La nota mas baja es: "+notaMasBaja);


    }
}
