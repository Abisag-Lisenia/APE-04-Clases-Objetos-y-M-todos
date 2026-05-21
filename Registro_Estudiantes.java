/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aby
 */
public final class Registro_Estudiantes {
    private String cedula;
    private String nombre;
    private String apellido;
    private double nota1; 
    private double nota2; 
    private double nota3;
    private double promedio;
    private String estado;
    // Constructor 
    public Registro_Estudiantes(String cedula, String nombre, String apellido, double nota1, double nota2, double nota3) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1; 
        this.nota2 = nota2; 
        this.nota3 = nota3;
        
        // Procesos automatizados al instanciar
        this.calcularPromedio();
        this.determinarEstado();
    }

    // Método para calcular el promedio
    public void calcularPromedio() {
        this.promedio = (this.nota1 + this.nota2 + this.nota3) / 3.0;
    }

    // Método para determinar si aprueba o reprueba
    public void determinarEstado() {
        if (this.promedio >= 7.0) {
            this.estado = "Aprobado";
        } else {
            this.estado = "Reprobado";
        }
    }

    // Métodos Get y Set
    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public double getNota1() { return nota1; }
    public void setNota1(double nota1) { 
        this.nota1 = nota1; 
        this.calcularPromedio(); 
        this.determinarEstado(); 
    }

    public double getNota2() { return nota2; }
    public void setNota2(double nota2) { 
        this.nota2 = nota2; 
        this.calcularPromedio(); 
        this.determinarEstado(); 
    }

    public double getNota3() { return nota3; }
    public void setNota3(double nota3) { 
        this.nota3 = nota3; 
        this.calcularPromedio(); 
        this.determinarEstado(); 
    }

    public double getPromedio() { return promedio; }
    public String getEstado() { return estado; }

    // Método para mostrar la información del estudiante
    public void mostrarInformacion() {
        System.out.println("========================================");
        System.out.println("         REPORTE DEL ESTUDIANTE (JAVA)  ");
        System.out.println("========================================");
        System.out.println("• Cédula:   " + this.cedula);
        System.out.println("• Alumno:   " + this.apellido + ", " + this.nombre);
        System.out.println("----------------------------------------");
        System.out.printf("• Nota 1:   %.2f\n", this.nota1);
        System.out.printf("• Nota 2:   %.2f\n", this.nota2);
        System.out.printf("• Nota 3:   %.2f\n", this.nota3);
        System.out.printf("• Promedio: %.2f\n", this.promedio);
        System.out.println("• Estado:   [" + this.estado + "]");
        System.out.println("========================================\n");
    }

    // Método Main dentro de la clase para ejecutar la prueba
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("1720345678", "Brandom", "Mendoza", 9.0, 8.5, 10.0);
        est1.mostrarInformacion();
    }
}