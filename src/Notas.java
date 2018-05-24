
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Notas {

    int quantidadeNotasMaximas = 4;
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
    int notas = 0;

    public void cadastrarNota() {[
        for (int i = 0; < quantidadeNotasMaximas; i++) {
            solicitarNota(i);
        }
        apresentarInfo(notas);
    }

    public void editarNota() {
        String busca = JOptionPane.showInputDialog(null, "Digite o nome que deseja editar as notas!!");
        for (int i = 0; i < notas; i++) {
            if (notas[i].equals(busca)) {
                solicitarNota(i);
            }
        }
    }

    public void apresentarNotas(int i) {
        JOptionPane.showMessageDialog(null,
                "Português: " + portugues[i]
                + "Matemática: " + matematica[i]
                + "Biologia: " + biologia[i]
                + "Quimica: " + quimica[i]
                + "Fisica: " + fisica[i]
                + "Filosofia: " + filosofia[i]
                + "Sociologia: " + sociologia[i]
                + "Educação Fisica: " + educacaoFisica[i]
                + "Ensino Religioso: " + ensinoReligioso[i]
                + "Inglês: " + ingles[i]
                + "Alemão: " + alemao[i]
                + "Artes: " + artes[i]
                + "Informática" + informatica[i]);

    }

    private void solicitarNota(int i) {
        portugues[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota:"));
        matematica[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota:"));
        quimica[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota:"));
        fisica[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota:"));
        filosofia[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota:"));
        sociologia[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota:"));
        educacaoFisica[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota:"));
        ensinoReligioso[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota:"));
        ingles[i]= Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a nota:"));
        alemao[i]= Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a nota:"));
        artes[i]= Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a nota:"));
        informatica[i]= Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a nota:"));
    }

    public String apresentarBoletim() {
        String texto = "";
        for (int i = 0; i < quantidadeNotasMaximas; i++) {
            texto += portugues[i] + "   - " + 
            
        }
        return texto;
    }
}
