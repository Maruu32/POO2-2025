from empresa.ReciboDeHaberes import ReciboDeHaberes

class Empresa:
    def __init__(self, nombre, cuit):
        self.nombre = nombre
        self.cuit = cuit
        self.empleados = []

    def agregarEmpleado(self, empleado):
        self.empleados.append(empleado)

    def calcularTotalSueldosNetos(self):
        return sum(empleado.calcularSueldoNeto() for empleado in self.empleados)
    
    def calcularTotalSueldosBrutos(self):
        return sum(empleado.calcularSueldoBruto() for empleado in self.empleados)
    
    def calcularTotalRetenciones(self):
        return sum(empleado.calcularRetenciones() for empleado in self.empleados)
    
    def liquidarSueldos(self):
        recibos = []
        for empleado in self.empleados:
            recibo = ReciboDeHaberes(empleado)
            recibos.append(recibo)
        return recibos

