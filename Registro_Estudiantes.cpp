#include <iostream>
#include <string>
#include <iomanip>
using namespace std;

// Clase Estudiante con encapsulamiento
class Estudiante {
private:
    string cedula;
    string nombre;
    string apellido;
    double nota1, nota2, nota3;
    double promedio;
    string estado;

public:
    // Constructor
    Estudiante(string ced, string nom, string ape,
               double n1, double n2, double n3) {
        cedula   = ced;
        nombre   = nom;
        apellido = ape;
        setNotas(n1, n2, n3);
    }

    // Métodos set con validación
    void setNotas(double n1, double n2, double n3) {
        nota1 = (n1 >= 0 && n1 <= 10) ? n1 : 0;
        nota2 = (n2 >= 0 && n2 <= 10) ? n2 : 0;
        nota3 = (n3 >= 0 && n3 <= 10) ? n3 : 0;
        calcularPromedio();
    }

    // Métodos get
    string getCedula()   { return cedula; }
    string getNombre()   { return nombre; }
    string getApellido() { return apellido; }
    double getPromedio() { return promedio; }
    string getEstado()   { return estado; }

    // Calcula el promedio y determina el estado
    void calcularPromedio() {
        promedio = (nota1 + nota2 + nota3) / 3.0;
        estado = (promedio >= 7.0) ? "APROBADO" : "REPROBADO";
    }

    // Muestra la información del estudiante
    void mostrarInfo() {
        cout << fixed << setprecision(2);
        cout << "Cedula   : " << cedula   << endl;
        cout << "Nombre   : " << nombre   << " " << apellido << endl;
        cout << "Nota 1   : " << nota1    << endl;
        cout << "Nota 2   : " << nota2    << endl;
        cout << "Nota 3   : " << nota3    << endl;
        cout << "Promedio : " << promedio << endl;
        cout << "Estado   : " << estado   << endl;
        cout << "----------------------------" << endl;
    }
};

int main() {
    const int N = 5;
    Estudiante estudiantes[] = {
        Estudiante("1804001001","Ana",    "Torres",  8.5, 9.0, 7.5),
        Estudiante("1804001002","Luis",   "Mena",    5.0, 6.5, 4.0),
        Estudiante("1804001003","Maria",  "Lopez",   9.0, 8.0, 9.5),
        Estudiante("1804001004","Carlos", "Vera",    6.5, 7.0, 6.0),
        Estudiante("1804001005","Sofia",  "Rios",    7.5, 8.5, 8.0)
    };

    cout << "=== SISTEMA DE CONTROL DE ESTUDIANTES ===" << endl;
    int aprobados = 0, reprobados = 0;
    for (int i = 0; i < N; i++) {
        estudiantes[i].mostrarInfo();
        if (estudiantes[i].getEstado() == "APROBADO") aprobados++;
        else reprobados++;
    }
    cout << "Aprobados : " << aprobados  << endl;
    cout << "Reprobados: " << reprobados << endl;
    return 0;
}

