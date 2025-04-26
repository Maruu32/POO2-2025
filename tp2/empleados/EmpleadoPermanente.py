from empleados.Empleado import Empleado

class EmpleadoPermanente(Empleado):
    def __init__(self, nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico, cantidadHijos, antiguedad):
        super().__init__(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico)
        self.cantidadHijos  = cantidadHijos
        self.antiguedad = antiguedad

    def calcularSueldoBruto(self):
        salarioFamiliar = (150 * self.cantidadHijos) + (100 if self.estadoCivil.lower() == "casado" else 0)
        adicionalAntiguedad = 50 * self.antiguedad
        return self.sueldoBasico + salarioFamiliar + adicionalAntiguedad
    
    def calcularRetenciones(self):
        sueldoBruto = self.calcularSueldoBruto()
        obraSocial = 0.10 * sueldoBruto + (20 * self.cantidadHijos)
        aportesJubilatorios = 0.15 * sueldoBruto
        return obraSocial + aportesJubilatorios
    