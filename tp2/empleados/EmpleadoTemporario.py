from empleados.Empleado import Empleado

class EmpleadoTemporario(Empleado):
    def __init__(self, nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico, fechaFinDesignacion, cantidadHorasExtras):
        super().__init__(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico)
        self.fechaFinDesignacion = fechaFinDesignacion
        self.cantidadHorasExtras = cantidadHorasExtras
    
    def calcularSueldoBruto(self):
        return self.sueldoBasico + (40 * self.cantidadHorasExtras)
    
    def calcularRetenciones(self):
        sueldoBruto = self.calcularSueldoBruto()
        extraObraSocial = 25 if self.calcularEdad() > 50 else 0
        obraSocial = 0.10 * sueldoBruto + extraObraSocial
        aportesJubilatorios = 0.10 * sueldoBruto + (5 * self.cantidadHorasExtras)
        return obraSocial + aportesJubilatorios
    