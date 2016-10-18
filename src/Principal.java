
import java.awt.Color;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


/**
 *
 * @author Marcielli
 */
public class Principal extends javax.swing.JFrame {

    private int valorInicialCaixa, valorAtualCaixa, n10=10, n20=20, n50=50, n100 =100;
    private String valorInicial, valorAtual, n1;
    private  int count10 = 0, count20=0, count50=0, count100=0, soma, qntRetira=0;
       
    public Principal() {
        
        this.valorInicialCaixa=60;
        this.valorAtualCaixa = 60;
        
        initComponents();
        setResizable(false);
        
       jTextFieldValorInicial.setText(""+converterValorInicial());
       jTextFieldValorAtual.setText(""+converterValorAtual());
       
      

       
    }
    
   
    
    public void setValorInicial(int valorInicialCaixa) {
        valorInicialCaixa = this.valorInicialCaixa;       
    }
    
    public String getValorInicial() {
        return valorInicial;
    }
            
    public String converterValorInicial() {
        valorInicial = String.valueOf(valorInicialCaixa);        
        return valorInicial;
    }
    
    public void setValorAtual(int valorAtualCaixa) {
        valorAtualCaixa = this.valorAtualCaixa;
    }
    
    public String getValorAtual() {
        return  valorAtual;
    }
    
    public String converterValorAtual() {
        valorAtual = String.valueOf(valorAtualCaixa);
        return valorAtual;
    }
    
 
   
   
    
    

   
    
   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanelBgCaixa = new javax.swing.JPanel();
        jPanelRodape = new javax.swing.JPanel();
        jLabelNotasDisponiveis = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldQuantidadeUsuarioRetira = new javax.swing.JTextField();
        jTextFieldNumeroAleatorio = new javax.swing.JTextField();
        jTextFieldQuantidadeNota10Disponivel = new javax.swing.JTextField();
        jTextFieldQuantidadeNota20Disponivel = new javax.swing.JTextField();
        jTextFieldQuantidadeNota50Disponivel = new javax.swing.JTextField();
        jTextFieldQuantidadeNota100Disponivel = new javax.swing.JTextField();
        jLabelNota10 = new javax.swing.JLabel();
        jLabelNota20 = new javax.swing.JLabel();
        jLabelNota50 = new javax.swing.JLabel();
        jLabelNota100 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButtonRetiradaUsuario = new javax.swing.JButton();
        jButtonAleatorio = new javax.swing.JButton();
        jButtonpeguedinheiro = new javax.swing.JButton();
        jButtonSaqueIndisponivel = new javax.swing.JButton();
        jLabelValorInicial = new javax.swing.JLabel();
        jTextFieldValorInicial = new javax.swing.JTextField();
        jPanelTopo = new javax.swing.JPanel();
        jLabelValorAtual = new javax.swing.JLabel();
        jTextFieldValorAtual = new javax.swing.JTextField();
        jLabelValoNotas = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanelBgCaixa.setBackground(new java.awt.Color(153, 153, 255));

        jPanelRodape.setBackground(new java.awt.Color(102, 102, 255));

        jLabelNotasDisponiveis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNotasDisponiveis.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNotasDisponiveis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNotasDisponiveis.setText("NOTAS DISPONÍVEIS");

        jTextFieldQuantidadeUsuarioRetira.setEnabled(false);
        jTextFieldQuantidadeUsuarioRetira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeUsuarioRetiraActionPerformed(evt);
            }
        });

        jTextFieldNumeroAleatorio.setEnabled(false);

        jTextFieldQuantidadeNota10Disponivel.setEnabled(false);

        jTextFieldQuantidadeNota20Disponivel.setEnabled(false);

        jTextFieldQuantidadeNota50Disponivel.setEnabled(false);

        jTextFieldQuantidadeNota100Disponivel.setEnabled(false);

        jLabelNota10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNota10.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNota10.setText("R$ 10,00");

        jLabelNota20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNota20.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNota20.setText("R$ 20,00");

        jLabelNota50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNota50.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNota50.setText("R$ 50,00");

        jLabelNota100.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNota100.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNota100.setText("R$ 100,00");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButtonRetiradaUsuario.setBackground(new java.awt.Color(102, 102, 255));
        jButtonRetiradaUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonRetiradaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRetiradaUsuario.setText("RETIRADA USUÁRIO");
        jButtonRetiradaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRetiradaUsuarioMouseClicked(evt);
            }
        });
        jButtonRetiradaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetiradaUsuarioActionPerformed(evt);
            }
        });

        jButtonAleatorio.setBackground(new java.awt.Color(102, 102, 255));
        jButtonAleatorio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAleatorio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAleatorio.setText("ALEATÓRIO");
        jButtonAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAleatorioActionPerformed(evt);
            }
        });

        jButtonpeguedinheiro.setBackground(new java.awt.Color(102, 102, 255));
        jButtonpeguedinheiro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonpeguedinheiro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonpeguedinheiro.setText("Por favor, pegue seu dinheiro!");
        jButtonpeguedinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpeguedinheiroActionPerformed(evt);
            }
        });

        jButtonSaqueIndisponivel.setBackground(new java.awt.Color(102, 102, 255));
        jButtonSaqueIndisponivel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSaqueIndisponivel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSaqueIndisponivel.setText("Saque indisponível!");
        jButtonSaqueIndisponivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaqueIndisponivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRodapeLayout = new javax.swing.GroupLayout(jPanelRodape);
        jPanelRodape.setLayout(jPanelRodapeLayout);
        jPanelRodapeLayout.setHorizontalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodapeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jLabelNotasDisponiveis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelRodapeLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRodapeLayout.createSequentialGroup()
                                    .addComponent(jTextFieldQuantidadeNota100Disponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelNota100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRodapeLayout.createSequentialGroup()
                                    .addComponent(jTextFieldQuantidadeNota50Disponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelNota50, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRodapeLayout.createSequentialGroup()
                                    .addComponent(jTextFieldQuantidadeNota20Disponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelNota20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRodapeLayout.createSequentialGroup()
                                    .addComponent(jTextFieldQuantidadeNota10Disponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelNota10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonpeguedinheiro, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                            .addComponent(jButtonSaqueIndisponivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRodapeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonRetiradaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldQuantidadeUsuarioRetira, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAleatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNumeroAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(166, 166, 166))
        );

        jPanelRodapeLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextFieldQuantidadeNota100Disponivel, jTextFieldQuantidadeNota10Disponivel, jTextFieldQuantidadeNota20Disponivel, jTextFieldQuantidadeNota50Disponivel});

        jPanelRodapeLayout.setVerticalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRodapeLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRodapeLayout.createSequentialGroup()
                        .addComponent(jButtonAleatorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNumeroAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRodapeLayout.createSequentialGroup()
                        .addComponent(jButtonRetiradaUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldQuantidadeUsuarioRetira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabelNotasDisponiveis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRodapeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRodapeLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldQuantidadeNota10Disponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNota10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldQuantidadeNota20Disponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNota20))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldQuantidadeNota50Disponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNota50))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldQuantidadeNota100Disponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNota100)))
                    .addGroup(jPanelRodapeLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jButtonpeguedinheiro)
                        .addGap(40, 40, 40)
                        .addComponent(jButtonSaqueIndisponivel)))
                .addGap(44, 44, 44))
        );

        jPanelRodapeLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextFieldQuantidadeNota100Disponivel, jTextFieldQuantidadeNota10Disponivel, jTextFieldQuantidadeNota20Disponivel, jTextFieldQuantidadeNota50Disponivel});

        jLabelValorInicial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelValorInicial.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValorInicial.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelValorInicial.setText("VALOR INICIAL");

        jTextFieldValorInicial.setEnabled(false);

        jPanelTopo.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanelTopoLayout = new javax.swing.GroupLayout(jPanelTopo);
        jPanelTopo.setLayout(jPanelTopoLayout);
        jPanelTopoLayout.setHorizontalGroup(
            jPanelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelTopoLayout.setVerticalGroup(
            jPanelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        jLabelValorAtual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelValorAtual.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValorAtual.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelValorAtual.setText("VALOR ATUAL");

        jTextFieldValorAtual.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldValorAtual.setEnabled(false);
        jTextFieldValorAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorAtualActionPerformed(evt);
            }
        });

        jLabelValoNotas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelValoNotas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValoNotas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelValoNotas.setText("NOTAS");

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("10");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("20");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("50");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 102, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("100");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBgCaixaLayout = new javax.swing.GroupLayout(jPanelBgCaixa);
        jPanelBgCaixa.setLayout(jPanelBgCaixaLayout);
        jPanelBgCaixaLayout.setHorizontalGroup(
            jPanelBgCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelBgCaixaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelBgCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelValoNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelValorInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelValorAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBgCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldValorAtual)
                    .addGroup(jPanelBgCaixaLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextFieldValorInicial))
                .addContainerGap())
        );
        jPanelBgCaixaLayout.setVerticalGroup(
            jPanelBgCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBgCaixaLayout.createSequentialGroup()
                .addComponent(jPanelTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelBgCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorInicial)
                    .addComponent(jTextFieldValorInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBgCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorAtual)
                    .addComponent(jTextFieldValorAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBgCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelValoNotas)
                    .addGroup(jPanelBgCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jPanelRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanelBgCaixa);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldValorAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorAtualActionPerformed
        
    }//GEN-LAST:event_jTextFieldValorAtualActionPerformed

    private void jButtonRetiradaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetiradaUsuarioActionPerformed
        if((count10>0) || (count20>0) || (count50>0) || (count100>0)) {
            
            int soma10 = count10*10;
            int soma20 = count20*20;
            int soma50 = count50*50;
            int soma100 = count100*100;
            
            soma = soma10+soma20+soma50+soma100;
            
            jTextFieldQuantidadeUsuarioRetira.setText(""+soma);
            jTextFieldQuantidadeNota10Disponivel.setText(""+count10);
            jTextFieldQuantidadeNota20Disponivel.setText(""+count20);
            jTextFieldQuantidadeNota50Disponivel.setText(""+count50);
            jTextFieldQuantidadeNota100Disponivel.setText(""+count100);
            
        } 
        
       
        
        
    }//GEN-LAST:event_jButtonRetiradaUsuarioActionPerformed

    private void jButtonRetiradaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRetiradaUsuarioMouseClicked
       
        
        
        
    }//GEN-LAST:event_jButtonRetiradaUsuarioMouseClicked

    private void jTextFieldQuantidadeUsuarioRetiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeUsuarioRetiraActionPerformed
     
    }//GEN-LAST:event_jTextFieldQuantidadeUsuarioRetiraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String n1 = jButton1.getText();
        n10 = Integer.parseInt(n1);
        valorAtualCaixa = valorAtualCaixa - n10;
        jTextFieldValorAtual.setText(""+valorAtualCaixa);
        
        qntRetira = qntRetira + n10;
        jTextFieldQuantidadeUsuarioRetira.setText(""+qntRetira);
        
        if(valorAtualCaixa > 0) {
            jTextFieldValorAtual.setDisabledTextColor(Color.BLUE);
            jButtonpeguedinheiro.setForeground(Color.WHITE);
            jButtonpeguedinheiro.setBackground(Color.BLUE);
            jTextFieldQuantidadeUsuarioRetira.setDisabledTextColor(Color.BLUE);
            
            
        } else {
             jTextFieldValorAtual.setDisabledTextColor(Color.RED);
             jButtonSaqueIndisponivel.setForeground(Color.WHITE);
             jButtonSaqueIndisponivel.setBackground(Color.RED);
             jTextFieldQuantidadeUsuarioRetira.setDisabledTextColor(Color.RED);
             
             int valor = Integer.parseInt(jTextFieldValorAtual.getText());
        
        if(valor <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, retire seu dinheiro!");          
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);            
        }
             
        }
        count10++;
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String n2 = jButton2.getText();
        n20 = Integer.parseInt(n2);
        valorAtualCaixa = valorAtualCaixa - n20;
        jTextFieldValorAtual.setText(""+valorAtualCaixa);
        
        qntRetira = qntRetira + n20;
        jTextFieldQuantidadeUsuarioRetira.setText(""+qntRetira);
        
      if(valorAtualCaixa > 0) {
            jTextFieldValorAtual.setDisabledTextColor(Color.BLUE);
            jButtonpeguedinheiro.setForeground(Color.WHITE);
            jButtonpeguedinheiro.setBackground(Color.BLUE);
            
            
        } else {
             jTextFieldValorAtual.setDisabledTextColor(Color.RED);
             jButtonSaqueIndisponivel.setForeground(Color.WHITE);
             jButtonSaqueIndisponivel.setBackground(Color.RED);
             
              int valor = Integer.parseInt(jTextFieldValorAtual.getText());
        
        if(valor <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, retire seu dinheiro!");          
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);
        }
             
        }
      
     
        
        count20++;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String n3 = jButton3.getText();
        n50 = Integer.parseInt(n3);
        valorAtualCaixa = valorAtualCaixa - n50;
        jTextFieldValorAtual.setText(""+valorAtualCaixa);
        
        qntRetira = qntRetira + n50;
        jTextFieldQuantidadeUsuarioRetira.setText(""+qntRetira);
        
       if(valorAtualCaixa > 0) {
            jTextFieldValorAtual.setDisabledTextColor(Color.BLUE);
            jButtonpeguedinheiro.setForeground(Color.WHITE);
            jButtonpeguedinheiro.setBackground(Color.BLUE);
            
            
        } else {
             jTextFieldValorAtual.setDisabledTextColor(Color.RED);
             jButtonSaqueIndisponivel.setForeground(Color.WHITE);
             jButtonSaqueIndisponivel.setBackground(Color.RED);   
             
              int valor = Integer.parseInt(jTextFieldValorAtual.getText());
        
        if(valor <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, retire seu dinheiro!");          
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);
        }
       }
       
      
        
       count50++;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String n4 = jButton4.getText();
        n100 = Integer.parseInt(n4);
        valorAtualCaixa = valorAtualCaixa - n100;
        jTextFieldValorAtual.setText(""+valorAtualCaixa);
        qntRetira = qntRetira + n100;
        jTextFieldQuantidadeUsuarioRetira.setText(""+qntRetira);
        
        if(valorAtualCaixa > 0) {
            jTextFieldValorAtual.setDisabledTextColor(Color.BLUE);
            jButtonpeguedinheiro.setForeground(Color.WHITE);
            jButtonpeguedinheiro.setBackground(Color.BLUE);
            
            
        } else {
             jTextFieldValorAtual.setDisabledTextColor(Color.RED);
             jButtonSaqueIndisponivel.setForeground(Color.WHITE);
             jButtonSaqueIndisponivel.setBackground(Color.RED);
             
              int valor = Integer.parseInt(jTextFieldValorAtual.getText());
        
        if(valor <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, retire seu dinheiro!");          
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);
        }
        
        }
        
       
        count100++;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAleatorioActionPerformed
       Random random = new Random();
       int aleatorio = random.nextInt(1000);
    
       int valor = aleatorio * 10;
    
       jTextFieldNumeroAleatorio.setText(""+valor);
    }//GEN-LAST:event_jButtonAleatorioActionPerformed

    private void jButtonpeguedinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpeguedinheiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonpeguedinheiroActionPerformed

    private void jButtonSaqueIndisponivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaqueIndisponivelActionPerformed
      String qntUsuarioRetira1 = jTextFieldQuantidadeUsuarioRetira.getText();
      int qntUsuarioRetira2 = Integer.parseInt(qntUsuarioRetira1);
      
      String valorAtual1 = jTextFieldValorAtual.getText();
      int valorAtual2 = Integer.parseInt(valorAtual1);
      
      int valorAtualPositivo = Math.abs(valorAtual2);
      
      int sub = qntUsuarioRetira2-valorAtualPositivo;
      
      System.out.println("Valor Usuario retira: "+qntUsuarioRetira2);
        System.out.println("Valor Atual: "+valorAtualPositivo);
        System.out.println("Sub: "+sub);
      
      jTextFieldQuantidadeUsuarioRetira.setText(""+sub);
      jTextFieldValorAtual.setText(""+sub);
      
        
        
    }//GEN-LAST:event_jButtonSaqueIndisponivelActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAleatorio;
    private javax.swing.JButton jButtonRetiradaUsuario;
    private javax.swing.JButton jButtonSaqueIndisponivel;
    private javax.swing.JButton jButtonpeguedinheiro;
    private javax.swing.JLabel jLabelNota10;
    private javax.swing.JLabel jLabelNota100;
    private javax.swing.JLabel jLabelNota20;
    private javax.swing.JLabel jLabelNota50;
    private javax.swing.JLabel jLabelNotasDisponiveis;
    private javax.swing.JLabel jLabelValoNotas;
    private javax.swing.JLabel jLabelValorAtual;
    private javax.swing.JLabel jLabelValorInicial;
    private javax.swing.JPanel jPanelBgCaixa;
    private javax.swing.JPanel jPanelRodape;
    private javax.swing.JPanel jPanelTopo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldNumeroAleatorio;
    private javax.swing.JTextField jTextFieldQuantidadeNota100Disponivel;
    private javax.swing.JTextField jTextFieldQuantidadeNota10Disponivel;
    private javax.swing.JTextField jTextFieldQuantidadeNota20Disponivel;
    private javax.swing.JTextField jTextFieldQuantidadeNota50Disponivel;
    private javax.swing.JTextField jTextFieldQuantidadeUsuarioRetira;
    private javax.swing.JTextField jTextFieldValorAtual;
    private javax.swing.JTextField jTextFieldValorInicial;
    // End of variables declaration//GEN-END:variables
}
