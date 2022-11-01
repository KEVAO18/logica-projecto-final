# logica-projecto-final

---

## logica

- Interface
  - Atributos
    - Publico Perfil personas [1000]
    - Publico Puestos puestos [1000]
    - Publico Sector sectores [1000]
  - Metodos
    - Contructor: Interface()
    - Vacio: menuAdmin()
    - Vacio: mostrarDatosUsuarios(Entero id)
    - Vacio: actualizarPersona(Entero id)
    - Vacio: actualizarPuesto(Entero id)
- Perfil

  - Atributos
    - Privado Cadena nombre
    - Privado Cadena cc
    - Privado Cadena telefono
    - Privado Cadena direccion
    - Privado Entero genero
    - Privado Entero estadoCivil
    - Privado Entero tipoUsuario
    - Privado Cadena nombreUsuario
    - Privado Cadena Contrasena

  - Metodos
    - Contructor: Perfil()
    - Contructor: Perfil(...todos los atributos)
    - Boleano: validate()
    - Vacio: registrarPerfil()
    - Vacio: actualizarPerfil(Entero id)
    - getters [todos los atributos]
    - setters [todos los atributos]
- Puesto

  - Atributos
    - Privado Entero tieneTecho
    - Privado Entero tieneCamaraRefri
    - Privado Entero numVitri
    - Privado Real tamano
    - Privado Perfil dueno
    - Privado Real presio
    - Privado Real valorBase
    - Privado Entero estaDisponible
    - Privado Contrato contrato

  - Metodos
    - Contructor: Puesto()
    - Contructor: Puesto(...todos los atributos)
    - Vacio registrarPuesto()
    - Vacio actualizarPuesto()
    - getters [todos los atributos]
    - setters [todos los atributos]
- Sector

  - Atributos
    - Privado Entero numSector
    - Privado Entero numLocales
    - Privado Real presioBase

  - Metodos
    - Contructor: Sector()
    - Contructor: Sector(...todos los atributos)
    - Vacio registrarSector()
    - Vacio actualizarSector()
    - getters [todos los atributos]
    - setters [todos los atributos]
- Contrato

  - Atributos

    - Privado Entero numeroContrato
    - Privado Cadena fechaInicio
    - Privado Cadena fechaFinal
    - Privado Real montoMensual
    - Privado Perfil responsable
    - Privado Perfil dueno
    - Privado Perfil codeudor1
    - Privado Perfil codeudor2

  - Metodos
    - Contructor: Contrato()
    - Contructor: Contrato(...todos los atributos)
    - getters [todos los atributos]
    - setters [todos los atributos]

---

## plazademercado

- PlazaDeMercado
  - Metodos
    - Principal()
