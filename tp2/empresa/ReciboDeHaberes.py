from datetime import date

class ReciboDeHaberes:
    def __init__(self, empleado):
        self.nombreEmpleado = empleado.nombre
        self.direccion = empleado.direccion
        self.fechaEmision = date.today()
        self.sueldoBruto = empleado.calcularSueldoBruto()
        self.sueldoNeto = empleado.calcularSueldoNeto()
        self.desgloceConceptos = self.generarDesgloce(empleado)

    def generarDesgloce(self, empleado):
        desglose = []

        desglose.append(("Sueldo Basico", empleado.sueldoBasico))

        if hasattr(empleado, "cantidadHijos"):
            if empleado.cantidadHijos > 0:
                desglose.append(("Asignacion por hijos", empleado.cantidadHijos *150))
            if empleado.estadoCivil.lower() == "casado":
                desglose.append(("Asignacion por conyuge", 100))
            if empleado.antiguedad > 0:
                desglose.append(("Antiguedad", empleado.antiguedad * 50))
        elif hasattr(empleado, "CantidadHorasExtras"):
            if empleado.cantidadHorasExtras > 0:
                desglose.append(("Horas Extras"), empleado.cantidadHorasExtras * 40)
        elif hasattr(empleado, "numeroContrato"):
            desglose.append(("Gastos Administrativos Contractuales", -50))

        retenciones = empleado.calcularRetenciones()
        desglose.append(("Total Retenciones", -retenciones))

        return desglose
    
    def mostrarRecibo(self):
        print(f"Recibo de Haberes - {self.fechaEmision}")
        print(f"Empleado: {self.nombreEmpleado}")
        print(f"Dirección: {self.direccion}")
        print(f"Sueldo Bruto: ${self.sueldoBruto:.2f}")
        print(f"Sueldo Neto: ${self.sueldoNeto:.2f}")
        print("\nDesglose de Conceptos:")
        for concepto, monto in self.desgloceConceptos:
            print(f" - {concepto}: ${monto:.2f}")