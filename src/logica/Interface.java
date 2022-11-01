package logica;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
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
        
        int menu, usuarios = 1;
        String actu, mostrarUsuarios;
        String[] menuArray = {
            "Registrar nuevo perfil",
            "Actualizar un perfil existente",
            "Mostrar todos los perfiles",
            "Registrar nuevo sector",
            "Actualizar informacion de un sector",
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
                    usuarios ++;
                    break;
                case 1:
                    if(usuarios != 0){
                        actu = JOptionPane.showInputDialog(
                                "Ingresar el documento del usuario que desea actualizar"
                        );
                        
                        for (int i = 0; i < usuarios; i++) {
                            if (personas[i].getCc().equals(actu)) {
                                this.actualizarPersona(i);
                                break;
                            }
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
                        for (Perfil p : personas) {
                            if (p != null) {
                                mostrarUsuarios += "| Nombre: "+p.getNombre()
                                        +" | Documento: "+p.getCc()
                                        +" | Telefono: "+p.getTelefono()
                                        +" | Direccion: "+p.getDireccion()
                                        +" | "+gen[p.getGenero()]
                                        +" | "+estCivil[p.getEstadoCivil()]+" | \n";
                            }
                        }
                    }else{
                        JOptionPane.showMessageDialog(
                                null, 
                                "Sin usuarios"
                        );
                    }
                    //JOptionPane.showMessageDialog(null, mostrarUsuarios);
                    System.out.println(mostrarUsuarios);
                    break;
                case 3:
                    System.out.println(menuArray[menu]);
                    break;
                case 4:
                    System.out.println(menuArray[menu]);
                    break;
                case 5:
                    System.out.println(menuArray[menu]);
                    break;
                case 6:
                    System.out.println(menuArray[menu]);
                    break;
                case 7:
                    System.out.println(menuArray[menu]);
                    break;
                case 8:
                    System.out.println(menuArray[menu]);
                    break;
                case 9:
                    exit = false;
                    break;
                default:
                    throw new AssertionError();
            }
        } while (exit);
    
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
}
