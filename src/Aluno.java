//CADASTRO ALUNO

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
    String[] obsevacoesGerais = new String[100];
    int aluno = 0;

}
public void cadastrar() {
        solicitarInformacao(aluno++);
        aluno++;
}

        public void editar(){
String busca = JOptionPane.showInputDialog(null,"digite o nome para edição:");
for(int i = 0; i< aluno; i++){
if(nomes[i].equals(busca)){
    solicitarInformacao++;
}
}

}
public void apresentarInfo(int i){
JOptionPane.showMessageDialog(null,
                "Nome: " + nomes[i]
                + "\nIdade: " + idades[i]
                + "\nCPF: " + cpfs[i]
                + "\nEstado: " + estados[i]
                + "\nCidade: " + cidades[i]
                + "\nBairro: " + bairros[i]
                + "\nLogradouro: " + logradouros[i]
                + "\nCEP: " + ceps[i]
                + "\nNumero: " + numeros[i]
                + "\nComplemento:" + complementos[i]
                + "\nNotas:" + notas[i];
                + "\nFaltas" + faltas[i];
                + "\nObservações:" + observacoesGerais[i];

}
public void buscarPeloNome(){
String busca = JOptionPane.showInputDialog(null,
"Digite o nome  parcial que deseja buscar:"):
}
pulic void contabilizarPeloNome(){
String busca = JOptionPane.showInputDialog(null,
"Digite o nome para busca");
int quantidadeDeRegistros = 0;
for(int i = 0 ; i < aluno; i++){
if(nomes[i].contains(busca)){
quantidadeDeRegistros++;
}
}
}

public void buscarPeloCpf(){
String cpfBusca = JOptionPane.showInputDialog("Digite o CPF que desejas buscar").replace(".","").replace("-","");
for (int i = 0; i <aluno; i++){
if(cpfs[i].equals(cpfBusca)){
apresentarInformacao[i];
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
        cidades[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite a sua cidade:");
        logradouros[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite o seu logradouro:");
        ceps[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite o seu cep:");
        numeros[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite o numero");
        complementos[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite o complemento");
    }