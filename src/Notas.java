
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Notas {

    static int quantidadeNotasMaximas = 4;
    double[] portugues = new double[quantidadeNotasMaximas];
    double[] matematica = new double[quantidadeNotasMaximas];
    double[] quimica = new double[quantidadeNotasMaximas];
    double[] biologia = new double[quantidadeNotasMaximas];
    double[] fisica = new double[quantidadeNotasMaximas];
    double[] filosofia = new double[quantidadeNotasMaximas];
    double[] sociologia = new double[quantidadeNotasMaximas];
    double[] educacaoFisica = new double[quantidadeNotasMaximas];
    double[] ensinoReligioso = new double[quantidadeNotasMaximas];
    double[] ingles = new double[quantidadeNotasMaximas];
    double[] alemao = new double[quantidadeNotasMaximas];
    double[] artes = new double[quantidadeNotasMaximas];
    double[] informatica = new double[quantidadeNotasMaximas];
    static String[] apresentarBoletim = new String[quantidadeNotasMaximas];
    int notas = 0;

    public void cadastrarNota() {
        for (int i = 0; i < quantidadeNotasMaximas; i++) {
            solicitarNota(i);
        }
        apresentarNotas();
    }

    public String apresentarNotaDeMateria(String nome, double[] materia) {
        return nome + ": " + materia[0] + " - " + materia[1] + " - " + materia[2] + " - " + materia[3] + "\n";
    }

    public void apresentarNotas() {
        JOptionPane.showMessageDialog(null,
                apresentarNotaDeMateria("Portugues", portugues)
                + apresentarNotaDeMateria("Matematica", matematica)
                + apresentarNotaDeMateria("biologia", biologia)
                + apresentarNotaDeMateria("quimica", quimica)
                + apresentarNotaDeMateria("fisica", fisica)
                + apresentarNotaDeMateria("filosofia", filosofia)
                + apresentarNotaDeMateria("sociologia", sociologia)
                + apresentarNotaDeMateria("educacaoFisica", educacaoFisica)
                + apresentarNotaDeMateria("ensinoReligioso", ensinoReligioso)
                + apresentarNotaDeMateria("ingles", ingles)
                + apresentarNotaDeMateria("alemao", alemao)
                + apresentarNotaDeMateria("artes", artes)
                + apresentarNotaDeMateria("informatica", informatica));
    }

    private void solicitarNota(int i) {
        portugues[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a " + (i + 1) + " nota de portugues:"));
        matematica[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota:"));
        quimica[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota:"));
        fisica[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota:"));
        filosofia[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota:"));
        sociologia[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota:"));
        educacaoFisica[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota:"));
        ensinoReligioso[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota:"));
        ingles[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota:"));
        alemao[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota:"));
        artes[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota:"));
        informatica[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota:"));
    }

    public void apresentarBoletim() {
        for (int i = 0; i < apresentarBoletim.length; i++) {
            apresentarBoletim[i] = "";
        }
        for (int i = 0; i < quantidadeNotasMaximas; i++) {
            apresentarBoletim[i] += portugues[i] + "   - \n";
        }
    }
}
