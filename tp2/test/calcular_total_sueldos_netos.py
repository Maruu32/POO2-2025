import datetime
import sys
import os
# Agregar el directorio raíz 'tp2' al path
sys.path.append(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

# Importar las clases necesarias del modelo
from empleados.EmpleadoPermanente import EmpleadoPermanente
from empleados.EmpleadoTemporario import EmpleadoTemporario
from empleados.EmpleadoContratado import EmpleadoContratado
from empresa.Empresa import Empresa

# Crear una instancia de Empresa
empresa_ej2 = Empresa("Mi Empresa S.A. (Ext)", "20-98765432-1")

# Crear algunas instancias de empleados (incluyendo Contratados)
empleado1_pp = EmpleadoPermanente("Juan Perez", "Calle Falsa 123", "Casado", datetime.date(1980, 5, 15), 50000, 2, 10)
empleado2_pt = EmpleadoTemporario("Maria Rodriguez", "Av. Siempreviva 742", "Soltero", datetime.date(1990, 10, 20), 40000, datetime.date(2025, 12, 31), 15)
empleado3_pp = EmpleadoPermanente("Carlos Gomez", "Calle 10 555", "Divorciado", datetime.date(1975, 3, 10), 60000, 0, 15)
empleado4_pt = EmpleadoTemporario("Laura Fernandez", "Ruta 8 Km 50", "Casado", datetime.date(1985, 7, 25), 45000, datetime.date(2025, 11, 30), 5)
empleado5_contratado = EmpleadoContratado("Pedro Ramirez", "Calle Nueva 789", "Soltero", datetime.date(1995, 1, 30), 35000, "C7890", "Transferencia Bancaria")
empleado6_contratado = EmpleadoContratado("Ana Torres", "Av. Central 101", "Casado", datetime.date(1988, 11, 5), 55000, "C1122", "Cheque")


# Agregar empleados a la empresa
empresa_ej2.agregarEmpleado(empleado1_pp)
empresa_ej2.agregarEmpleado(empleado2_pt)
empresa_ej2.agregarEmpleado(empleado3_pp)
empresa_ej2.agregarEmpleado(empleado4_pt)
empresa_ej2.agregarEmpleado(empleado5_contratado)
empresa_ej2.agregarEmpleado(empleado6_contratado)

# Calcular y mostrar el total de sueldos netos
total_neto_ej2 = empresa_ej2.calcularTotalSueldosNetos()
print(f"El monto total de sueldos netos a desembolsar por {empresa_ej2.nombre} es: ${total_neto_ej2:,.2f}")
