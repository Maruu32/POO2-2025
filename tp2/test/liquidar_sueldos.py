import sys
import os
# Agregar el directorio raíz 'tp2' al path
sys.path.append(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

# Importar las clases necesarias del modelo
from empleados.EmpleadoPermanente import EmpleadoPermanente
from empleados.EmpleadoTemporario import EmpleadoTemporario
from empleados.EmpleadoContratado import EmpleadoContratado
from empresa.Empresa import Empresa

from datetime import date

# Crear empresa
empresa = Empresa("Tech Solutions S.A.", "30-12345678-9")

# Crear empleados
empleado1 = EmpleadoPermanente(
    nombre="Ana Gómez",
    direccion="Calle 123",
    estadoCivil="Casada",
    fechaNacimiento=date(1985, 5, 20),
    sueldoBasico=50000,
    cantidadHijos=2,
    antiguedad=5
)

empleado2 = EmpleadoTemporario(
    nombre="Juan Pérez",
    direccion="Avenida 456",
    estadoCivil="Soltero",
    fechaNacimiento=date(1992, 8, 15),
    sueldoBasico=40000,
    fechaFinDesignacion=date(2026, 12, 31),
    cantidadHorasExtras=10
)

empleado3 = EmpleadoContratado(
    nombre="Laura Martínez",
    direccion="Boulevard 789",
    estadoCivil="Soltera",
    fechaNacimiento=date(1998, 2, 10),
    sueldoBasico=45000,
    numeroContrato="C-2025-001",
    medioPago="Transferencia bancaria"
)

# Agregar empleados a la empresa
empresa.agregarEmpleado(empleado1)
empresa.agregarEmpleado(empleado2)
empresa.agregarEmpleado(empleado3)

# Liquidar sueldos
recibos = empresa.liquidarSueldos()

# Mostrar recibos
for recibo in recibos:
    print("=" * 50)
    recibo.mostrarRecibo()
