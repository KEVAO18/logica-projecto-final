# logica-projecto-final
---
## logica

- Interface
    ### Atributos
    - Publico Perfil personas [1000]
    - Publico Puestos puestos [1000]
    - Publico Sector sectores [1000]
    ### Metodos
    - Contructor: Interface()
    - Vacio: menuAdmin()
    - Vacio: actualizarPersona(Entero id)
- Perfil
    ### Atributos
    - Privado Cadena nombre
    - Privado Cadena cc
    - Privado Cadena telefono
    - Privado Cadena direccion
    - Privado Entero genero
    - Privado Entero estadoCivil
    - Privado Entero tipoUsuario
    - Privado Cadena nombreUsuario
    - Privado Cadena Contrasena
    ### Metodos
    - Contructor: Perfil()
    - Contructor: Perfil(...todos los atributos)
    - Vacio: registrarPerfil()
    - Vacio: actualizarPerfil(Entero id)
    - getters [todos los atributos]
    - setters [todos los atributos]
- Puesto
    ### Atributos
    - Privado Entero tieneTecho 
    - Privado Entero tieneCamaraRefri
    - Privado Entero numVitri
    - Privado Real tamano
    - Privado Perfil dueno
    - Privado Real presio
    - Privado Real valorBase
    - Privado Entero estaDisponible
    - Privado Contrato contrato
    ### Metodos
    - Contructor: Puesto()
    - Contructor: Puesto(...todos los atributos)
    - getters [todos los atributos]
    - setters [todos los atributos]
- Sector
    ### Atributos
    - Privado Entero numSector 
    - Privado Entero numLocales
    - Privado Real presioBase
    ### Metodos
    - Contructor: Sector()
    - Contructor: Sector(...todos los atributos)
    - getters [todos los atributos]
    - setters [todos los atributos]
- Contrato


---
## plazademercado
- PlazaDeMercado