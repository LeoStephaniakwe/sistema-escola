
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Moreira e Daiana Marques
 */
public class Sistema {

    Aluno aluno = new Aluno();
    Professores professor = new Professores();

    public void menu() {
        int menu = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(null,
                        "1 - Aluno" +
                        "\n2 - Professor",
                        "JAVA > C#",
                        JOptionPane.PLAIN_MESSAGE));
                
        while (menu != 8001) {
            switch (menu) {
                case 1:
                    aluno.menu();
                    break;
                case 2:
                    professor.menu();
                    break;
                case 3:
                    //apresentarInfo();
                    break;
                case 4:
                    //buscarPeloNome();
                    break;
                case 5:
                   // contabilizarPeloNome();
                    break;
                case 6:
                    //buscarPeloCpf();
                    break;
                case 7:
                   // listar();
                    break;
                case 8:
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!!!!!");
            }
            menu = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(
                "1-Aluno"));
        }
    }
}
