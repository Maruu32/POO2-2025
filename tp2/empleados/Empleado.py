from abc import ABC, abstractmethod
from datetime import date

class Empleado(ABC):
    def __init__(self, nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico):
        self.nombre = nombre
        self.direccion = direccion 
        self.estadoCivil = estadoCivil
        self.fechaNacimiento = fechaNacimiento
        self.sueldoBasico = sueldoBasico

    def calcularEdad(self):
        hoy = date.today()
        edad = hoy.year - self.fechaNacimiento.year - ((hoy.month, hoy.day) < (self.fechaNacimiento.month, self.fechaNacimiento.day))
        return edad

    
    @abstractmethod
    def calcularSueldoBruto(self):
        pass

    @abstractmethod
    def calcularRetenciones(self):
        """Método abstracto para calcular el sueldo bruto."""
        raise NotImplementedError("Este método debe ser implementado por las subclases.")


    def calcularSueldoNeto(self):
        return self.calcularSueldoBruto() - self.calcularRetenciones()
    
    