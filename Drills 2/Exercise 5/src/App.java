import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
    /*Desenvolva  um  programa  que  peça  ao  usuário  para  criar  uma  senha.  Em  seguida, 
    verifique  se  a  senha  atende  aos  critérios  de  segurança,  como  ter  pelo  menos  8 
    caracteres, conter pelo menos uma letra maiúscula, uma letra minúscula, um número e 
    um caractere especial.  */

    String pass;
    int lower = 0, upper = 0, special = 0;

    pass = JOptionPane.showInputDialog("Digite uma Senha: ");

    if(pass.length() > 8){
        for(int i = 0; i < pass.length(); i++){
            if(pass.charAt(i) > 'a' && pass.charAt(i) <= 'z'){
                lower = 1;
            }
            else if(pass.charAt(i) > 'A' && pass.charAt(i) <= 'Z'){
                upper = 1;
            }
            else if(!(pass.charAt(i) > 'A' && pass.charAt(i) <= 'Z' && pass.charAt(i) > 'a' && pass.charAt(i) <= 'z')){
                special = 1;
            }
        }    
        if(special == 1 && lower == 1 && upper == 1){
            JOptionPane.showMessageDialog(null, "Senha Válida!");   
        }
        else JOptionPane.showMessageDialog(null, "Senha Inválida");
        
    }
    }
}