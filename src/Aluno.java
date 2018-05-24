
import javax.swing.JOptionPane;

public class Aluno {

    String[] nomes = new String[100];
    int[] idades = new int[100];
    char[] sexos = new char[100];
    String[] cpfs = new String[100];
    String[] estados = new String[100];
    String[] cidades = new String[100];
    String[] bairros = new String[100];
    String[] logradouros = new String[100];
    String[] ceps = new String[100];
    String[] numeros = new String[100];
    String[] complementos = new String[100];
    double[] notas = new double[100];
    int[] faltas = new int[100];
    String[] observacoesGerais = new String[100];
    int aluno = 0;

    public void cadastrar() {
        solicitarInformacao(aluno++);
        aluno++;
        apresentarInfo(aluno);
    }

    public void editar() {
        String busca = JOptionPane.showInputDialog(null, "digite o nome para edição:");
        for (int i = 0; i < aluno; i++) {
            if (nomes[i].equals(busca)) {
                solicitarInformacao(i);
            }
        }

    }

    public void apresentarInfo(int posicao) {
        JOptionPane.showMessageDialog(null,
                "Nome: " + nomes[posicao]
                + "\nIdade: " + idades[posicao]
                + "\nCPF: " + cpfs[posicao]
                + "\nEstado: " + estados[posicao]
                + "\nCidade: " + cidades[posicao]
                + "\nBairro: " + bairros[posicao]
                + "\nLogradouro: " + logradouros[posicao]
                + "\nCEP: " + ceps[posicao]
                + "\nNumero: " + numeros[posicao]
                + "\nComplemento:" + complementos[posicao]
                + "\nNotas:" + notas[posicao]
                + "\nFaltas" + faltas[posicao]
                + "\nObservações:" + observacoesGerais[posicao]);
    }

    public void buscarPeloNome() {
        String busca = JOptionPane.showInputDialog(null,
                "Digite o nome  parcial que deseja buscar:").toLowerCase().trim();
        for(int i = 0 ; i < aluno++; i++){
            if(nomes[i].contains(busca)){
                apresentarInfo(i);
            }
        }
        JOptionPane.showMessageDialog(null,"Opção inválida, registro não foi gerado!!!");
    }

    public void contabilizarPeloNome() {
        String busca = JOptionPane.showInputDialog(null,
                "Digite o nome para busca");
        int quantidadeDeRegistros = 0;
        for (int i = 0; i < aluno; i++) {
            if (nomes[i].contains(busca)) {
                quantidadeDeRegistros++;
            }
        }
    }
    
    

    public void buscarPeloCpf() {
        String cpfBusca = JOptionPane.showInputDialog("Digite o CPF que desejas buscar").replace(".", "").replace("-", "");
        for (int i = 0; i < aluno; i++) {
            if (cpfs[i].equals(cpfBusca)) {
                apresentarInfo(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Registo inválido!");
    }

    public void listar() {
        String texto = "";
        for (int i = 0; i < aluno; i++) {
            texto += nomes[i] + "  " + cpfs[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public void solicitarInformacao(int posicao) {
        nomes[posicao] = JOptionPane.showInputDialog("Digite o nome:");
        idades[posicao] = Integer.parseInt(JOptionPane.showInputDialog(nomes[posicao] + " Digite a sua idade"));
        sexos[posicao] = JOptionPane.showInputDialog((nomes[posicao] + " Digite o seu sexo:")).charAt(0);
        cpfs[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite o seu CPF").replace(".", "").replace("-", "");
        estados[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite o seu estado").trim().toUpperCase();
        cidades[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite a sua cidade:");
        logradouros[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite o seu logradouro:");
        ceps[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite o seu cep:");
        numeros[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite o numero");
        complementos[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite o complemento");

    }

    public void menu() {
        int menu = Integer.parseInt(JOptionPane.showInputDialog(
                "1-Cadastrar Aluno:"
                + "\n2 - Editar Aluno:"
                + "\n3 - Buscar Pelo nome:"
                + "\n4 - Contabilizar Pelo nome:"
                + "\n5 - Buscar Pelo CPF:"
                + "\n6 - Listar Aluno"));
        switch (menu) {
            case 1:
                cadastrar();
                break;
            case 2:
                editar();
                break;
            case 3:
                buscarPeloNome();
                break;
            case 4:
                contabilizarPeloNome();
                break;
            case 5:
                buscarPeloCpf();
                break;
            case 6:
                listar();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!!!!!");
        }

    }

}
