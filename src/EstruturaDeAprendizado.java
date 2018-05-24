


import javax.swing.JOptionPane;

public class EstruturaDeAprendizado {

        int [] salas              = new int [100];
        int [] refeitorio         = new int [100];
        int [] ginasio            = new int [100];
        int [] auditorio          = new int [100];
        int [] administracao      = new int [100];
        int [] biblioteca         = new int [100];
        int [] laboratorioQuimica = new int [100];
        int [] laboratorioFisica  = new int [100];
        int [] laboratorioMusica  = new int [100];
        int atual = 0;
    private Object[] estruturaDeAprendizado;
    
    
         public void EstruturaDeAprendizado() {
        solicitarInformacao(atual);
        atual++;
    }
  public void editar() {
        String busca = JOptionPane.showInputDialog("Digite o nome  para editar");
        for (int i = 0; i < atual; i++) {
            if (estruturaDeAprendizado[i].equals(busca)) {
                solicitarInformacao(i);
                return;
            }

        }
    }
  
      public void listar() {
        String texto = "";
        for (int i = 0; i < atual; i++) {
            texto += nomes[i] + "   ";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

 
  public void apresentarInformacao(int i) {
        JOptionPane.showMessageDialog(null,
                "Salas " + salas [i]
                + "\n refeitorio        " + refeitorio          [i]
                + "\n ginasio           " + ginasio             [i]
                + "\n auditorio         " + auditorio           [i]
                + "\n administracao     " + administracao       [i]  
                + "\n biblioteca        " + biblioteca          [i] 
                + "\n laboratorioQuimica" + laboratorioQuimica  [i] 
                + "\n laboratorioFisica " + laboratorioFisica   [i]
                + "\n laboratorioMusica " + laboratorioMusica   [i]);
  }
  public void solicitarInformacao(int posicao) {
            int i = 0;
         
        salas              [i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de salas :                          "));
        refeitorio         [i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de refeitorios:                     "));
        ginasio            [i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de ginasio:                         "));
        auditorio          [i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de salas de auditorio:              "));
        administracao      [i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de salas de administração:          "));
        biblioteca         [i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de salas de biblioteca:             "));
        laboratorioQuimica [i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de salas de laboratorio de quimica: "));
        laboratorioFisica  [i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de salas de laboratorio de fisica:  "));
        laboratorioMusica  [i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de salas de musicas:                "));
        
    }
}
                        
                        
               
    
        
        
    


