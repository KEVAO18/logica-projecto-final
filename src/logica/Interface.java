package logica;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Interface{

    public Perfil[] personas = new Perfil[1000];
    public Puesto[] puestos = new Puesto[1000];
    public Sector[] sectores = new Sector[1000];
    
    public Interface() {
        
        personas[0] = new Perfil("Admin", "0000000000", "0000000000", "cll 0 # 0 - 0", 0, 1, 0, "Admin", "Admin");
        
    }
    
    public void menuAdmin(){
    
        boolean exit = true;
        
        int menu, usuarios = 1, sector = 0, puesto = 0, usuario, puestoCount, salirAct, actuPuesto;
        
        String actu, mostrarUsuarios;
        
        String[] menuArray = {
            "Registrar nuevo perfil",
            "Actualizar un perfil existente",
            "Mostrar todos los perfiles",
            "Registrar nuevo sector",
            "Actualizar un sector existente",
            "Mostrar todos los sectores",
            "Registrar puesto",
            "Actualizar puesto",
            "Mostrar todos los sectores",
            "Salir"
        };

        String[] gen = {
            "Femenino",
            "Masculino",
            "No binario",
            "Otros"
        };
        
        String[] estCivil = {
            "Casado(a)", 
            "Soltero(a)", 
            "Divorciado(a)", 
            "Union Libre", 
            "Viudo(a)", 
            "Otros"
        };
        
        JComboBox menuInterface = new JComboBox(menuArray);

        menuInterface.setSelectedIndex(0);
        
        do {
            
            JOptionPane.showMessageDialog(null, menuInterface);

            menu = menuInterface.getSelectedIndex();
            
            mostrarUsuarios = "";
            
            switch (menu) {
                
                case 0:
                    
                    personas[usuarios] = new Perfil();
                    
                    personas[usuarios].registrarPerfil();
                    
                    usuarios++;
                    
                    break;
                    
                case 1:
                    
                    salirAct = 0;
                    
                    usuario = 0;
                    
                    if(usuarios != 0){
                        
                        actu = JOptionPane.showInputDialog(
                                "Ingresar el documento del usuario que desea actualizar"
                        );
                        
                        for (int i = 0; i < usuarios; i++) {
                            
                            if (personas[i].getCc().equals(actu)) {
                                
                                usuario = i;
                                
                                break;
                                
                            }
                            
                        }
                        
                        while (salirAct == 0) {
                            
                            this.actualizarPersona(usuario);
                            
                            salirAct = JOptionPane.showConfirmDialog(null, "Desea dejar de actualizar a este usuario?");
                        }
                        
                    }else{
                        
                        JOptionPane.showMessageDialog(
                                null, 
                                "Sin usuarios"
                        );
                        
                    }
                    
                    break;
                    
                case 2:
                    
                    if(usuarios != 0){
                        
                        for (int i = 0; i < usuarios; i++) {
                            
                            this.mostrarDatosUsuarios(i);
                            
                        }
                        
                    }else{
                        
                        JOptionPane.showMessageDialog(
                                null, 
                                "Sin usuarios"
                        );
                        
                    }
                    
                    System.out.println(mostrarUsuarios);
                    
                    break;
                    
                case 3:
                    
                    sectores[sector] = new Sector();
                    
                    sectores[sector].registrarSector();
                    
                    sector++;
                    
                    break;
                    
                case 4:
                    System.out.println(menuArray[menu]+"Sin implementar");
                    break;
                    
                case 5:
                    System.out.println(menuArray[menu]+"Sin implementar");
                    break;
                    
                case 6:
                    
                    puestos[puesto] = new Puesto();
                    
                    puestos[puesto].registrarPuesto();
                    
                    puesto++;
                    
                    break;
                    
                case 7:
                    
                    salirAct = 0;

                    if (puesto != 0) {

                        actuPuesto = Integer.parseInt(JOptionPane.showInputDialog(
                                "Ingresar el identificador del puesto"
                        ));

                        while (salirAct == 0) {

                            this.actualizarPuesto(actuPuesto);

                            salirAct = JOptionPane.showConfirmDialog(null, "Desea dejar de actualizar a este usuario?");
                        }

                    } else {

                        JOptionPane.showMessageDialog(
                                null,
                                "Sin Puestos"
                        );

                    }
                    
                    break;
                case 8:
                    System.out.println(menuArray[menu]+"Sin implementar");
                    break;
                case 9:
                    exit = false;
                    break;
                default:
                    throw new AssertionError();
            }
        } while (exit);
    
    }
    
    public void mostrarDatosUsuarios(int id){
        String[] gen = {
            "Femenino",
            "Masculino",
            "No binario",
            "Otros"
        };

        String[] estCivil = {
            "Casado(a)",
            "Soltero(a)",
            "Divorciado(a)",
            "Union Libre",
            "Viudo(a)",
            "Otros"
        };
        System.out.print("| Nombre: "+personas[id].getNombre()
                                        +" | Documento: "+personas[id].getCc()
                                        +" | Telefono: "+personas[id].getTelefono()
                                        +" | Direccion: "+personas[id].getDireccion()
                                        +" | "+gen[personas[id].getGenero()]
                                        +" | "+estCivil[personas[id].getEstadoCivil()]+" | \n");
        
    }
    
    public void actualizarPersona(int id){
        
        String[] actual = {
            "Nombre", 
            "Cedula", 
            "Telefono", 
            "Direccion", 
            "Genero",
            "Estado Civil",
            "Tipo de Usuario",
            "Nombre de Usuario",
            "Contraseña"
        };
        
        JComboBox actualizar = new JComboBox(actual);
        
        actualizar.setSelectedIndex(0);
        
        JOptionPane.showMessageDialog(null, actualizar);
        
        personas[id].actualizarPerfil(actualizar.getSelectedIndex());
    }

    public void actualizarPuesto(int id){
        String[] actual = {
            "Techo",
            "Camara Refrigerante",
            "# de Vitrinas",
            "Tamaño",
            "Dueño",
            "Presio",
            "Valor Base",
            "Disponibilidad",
            "Contrato"
        };
    }
}
