//CADASTRO PROFESSORES

import javax.swing.JOptionPane;

public class Professores {

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
    String[] materia = new String[100];
    double[] cargaHoraria = new double[100];
    String[] formacao = new String[100];
    double[] salario = new double[100];
    int professores = 0;
    private int i;

    public void cadastrar() {
        solicitarInformacao(professores++);
        professores++;
    }

    public void editar() {
        String busca = JOptionPane.showInputDialog(null, "digite o nome para edição:");
        for (int i = 0; i < professores; i++) {
            if (nomes[i].equals(busca)) {
                solicitarInformacao(i);

            }
        }

    }

    public void apresentarInfo(int i) {
        JOptionPane.showMessageDialog(null,
                "Salario"
                + salario[i] + "Nome: " + nomes[i]
                + "\nIdade: " + idades[i]
                + "\nCPF: " + cpfs[i]
                + "\nEstado: " + estados[i]
                + "\nCidade: " + cidades[i]
                + "\nBairro: " + bairros[i]
                + "\nLogradouro: " + logradouros[i]
                + "\nCEP: " + ceps[i]
                + "\nNumero: " + numeros[i]
                + "\nComplemento:" + complementos[i]
                + "\nMatéria" + materia[i]
                + "Carga Horária" + cargaHoraria[i]
                + "Formação" + formacao[i]);

    }

    public void buscarPeloNome() {
        String busca = JOptionPane.showInputDialog(null,
                "Digite o nome  parcial que deseja buscar:").toLowerCase().trim();
    }

    public void contabilizarPeloNome() {
        String busca = JOptionPane.showInputDialog(null,
                "Digite o nome para busca");
        int quantidadeDeRegistros = 0;
        for (int i = 0; i < professores; i++) {
            if (nomes[i].contains(busca)) {
                quantidadeDeRegistros++;
            }
        }
    }

    public void buscarPeloCpf() {
        String cpfBusca = JOptionPane.showInputDialog("Digite o CPF que desejas buscar").replace(".", "").replace("-", "");
        for (int i = 0; i < professores; i++) {
            if (cpfs[i].equals(cpfBusca)) {
                apresentarInfo(i);
            }
        }
    }

    public void listar() {
        String texto = "";
        for (int i = 0; i < professores; i++) {
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
        cidades[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite a sua cidade:").trim().toUpperCase();
        logradouros[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite o seu logradouro:").trim().toUpperCase();
        ceps[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite o seu cep:").trim().toUpperCase();
        numeros[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite o numero");
        complementos[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite o complemento").trim().toUpperCase();
        materia[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Qual a materia lescionada?").trim().toUpperCase();
        cargaHoraria[i] = Double.parseDouble(JOptionPane.showInputDialog(nomes[posicao] + " Carga horaria estimada"));
        formacao[i] = JOptionPane.showInputDialog(nomes[posicao] + "Méritos?").trim().toUpperCase();
        salario[i] = Double.parseDouble(JOptionPane.showInputDialog(nomes[posicao] + "Salario:"));
    }

    public void menu() {
        int menu = Integer.parseInt(JOptionPane.showInputDialog(
                "1-Cadastrar Professor:"
                + "\n2 - Editar Professor:"
                + "\n3 - Buscar Pelo nome:"
                + "\n4 - Contabilizar Pelo nome:"
                + "\n5 - Buscar Pelo CPF:"
                + "\n6 - Listar Professor"));
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
