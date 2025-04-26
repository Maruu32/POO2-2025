from empleados.Empleado import Empleado

class EmpleadoContratado(Empleado):
    def __init__(self, nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico, numeroContrato, medioPago):
        super().__init__(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico)
        self.numeroContrato = numeroContrato
        self.medioPago = medioPago

    def calcularSueldoBruto(self):
        return self.sueldoBasico
    
    def calcularRetenciones(self):
        return 50