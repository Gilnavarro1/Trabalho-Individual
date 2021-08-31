package CadClientes.src.CadClientes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

import CadClientes.src.Model.Cliente;

public class CadClientes extends JInternalFrame {

  private JLabel lblCodigo;
  private JLabel lblCpf;
  private JLabel lblNome;
  private JLabel lblEndereço;
  private JLabel lblBairro;
  private JLabel lblCidade;
  private JLabel lblEmail;
  private JLabel lblIdade;
  private JLabel lblSintomas;

  private JTextField txtCodigo;
  private JTextField txtCpf;
  private JTextField txtNome;
  private JTextField txtEndereço;
  private JTextField txtBairro;
  private JTextField txtCidade;
  private JTextField txtEmail;
  private JSpinner txtIdade;
  private JTextField txtSintomas;

  private JButton btnGravarRegistro;
  private JButton btnAnterior;
  private JButton btnProximo;

  Cliente clientes[] = new Cliente[100];
  int qteClientes = -1;

  public CadClientes() {
    setClosable(true);
    setMaximizable(true);
    setResizable(true);
    setTitle("Cadastro de Paciente");

    lblCodigo = new JLabel();
    lblCpf = new JLabel();
    lblNome = new JLabel();
    lblEndereço = new JLabel();
    lblBairro = new JLabel();
    lblCidade = new JLabel();
    lblEmail = new JLabel();
    lblIdade = new JLabel();
    lblSintomas = new JLabel();

    txtCodigo = new JTextField();
    txtCpf = new JTextField();
    txtNome = new JTextField();
    txtEndereço = new JTextField();
    txtBairro = new JTextField();
    txtCidade = new JTextField();
    txtEmail = new JTextField();
    txtIdade = new JSpinner();
    txtSintomas = new JTextField();

    btnGravarRegistro = new JButton();
    btnAnterior = new JButton();
    btnProximo = new JButton();

    lblCodigo.setText("Código:");
    lblCpf.setText("CPF:");
    lblNome.setText("Nome:");
    lblEndereço.setText("Endereço:");
    lblBairro.setText("Bairro:");
    lblCidade.setText("Cidade:");
    lblEmail.setText("E-mail:");
    lblIdade.setText("Idade:");
    lblSintomas.setText("Sintomas:");

    btnGravarRegistro.setText("Gravar registro");
    btnAnterior.setText("Anterior");
    btnProximo.setText("Próximo");

    txtCodigo.setEnabled(false);

    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)

        .addGroup(layout.createSequentialGroup().addContainerGap()
            .addGroup(
                layout
                    .createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)

                        .addPreferredGap(
                            LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGravarRegistro).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnterior))

                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup().addComponent(lblNome)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
                                    Short.MAX_VALUE)
                                .addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))

                            .addGroup(layout.createSequentialGroup().addComponent(lblEndereço)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
                                    Short.MAX_VALUE)
                                .addComponent(txtEndereço, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))

                            .addGroup(layout.createSequentialGroup().addComponent(lblBairro)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
                                    Short.MAX_VALUE)
                                .addComponent(txtBairro, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))

                            .addGroup(layout.createSequentialGroup().addComponent(lblCidade)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
                                    Short.MAX_VALUE)
                                .addComponent(txtCidade, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))

                            .addGroup(layout.createSequentialGroup().addComponent(lblSintomas)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
                                    Short.MAX_VALUE)
                                .addComponent(txtSintomas, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))

                            .addGroup(GroupLayout.Alignment.LEADING,
                                layout.createSequentialGroup().addComponent(lblCpf)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCpf, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))

                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmail).addComponent(lblIdade))

                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
                                    Short.MAX_VALUE)
                                .addGroup(
                                    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(txtIdade, GroupLayout.PREFERRED_SIZE, 48,
                                            GroupLayout.DEFAULT_SIZE)
                                        .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 157,
                                            GroupLayout.DEFAULT_SIZE))))

                        .addGap(0, 0, Short.MAX_VALUE)))
            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addComponent(lblCodigo)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtCodigo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                .addComponent(btnProximo))
            .addContainerGap()));
    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)

        .addGroup(layout.createSequentialGroup().addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblCpf)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblCodigo))

            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblNome)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE))

            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblEndereço)
                .addComponent(txtEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE))

            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblBairro)
                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE))

            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblCidade)
                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE))

            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblEmail)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE))

            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblIdade)
                .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE))

            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblSintomas)
                .addComponent(txtSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE))

            .addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                .addComponent(btnGravarRegistro).addComponent(btnAnterior).addComponent(btnProximo))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

    btnGravarRegistro.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        // validar a tela
        if (validarTela() == true) {
          //
          if (qteClientes <= 98) {
            qteClientes++;

            Cliente cliente = new Cliente(txtCpf.getText(), txtNome.getText(), txtEndereço.getText(),
                txtBairro.getText(), txtCidade.getText(), txtEmail.getText(), (Integer) txtIdade.getValue(),
                txtSintomas.getText());
            clientes[qteClientes] = cliente;
            JOptionPane.showMessageDialog(null, "Dados gravados com sucesso!");

            limparTela();
          } else {
            JOptionPane.showMessageDialog(null, "Não existe mais espaço para novos alunos!");
          }
        }
      }
    });

    btnAnterior.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {

        try {

          int anterior = 0;
          if (qteClientes >= 0) {
            if (txtCodigo.getText().length() == 0) {
              txtCodigo.setText("0");
            } else {
              anterior = Integer.parseInt(txtCodigo.getText()) - 1;
              if (anterior >= 0) {
                txtCodigo.setText(String.valueOf(anterior));
              } else {
                txtCodigo.setText("0");
              }
              if (Integer.parseInt(txtCodigo.getText()) <= qteClientes) {
                Cliente cliente = clientes[Integer.parseInt(txtCodigo.getText())];

                txtCpf.setText(cliente.getCpf());
                txtNome.setText(cliente.getNome());
                txtEndereço.setText(cliente.getEndereço());
                txtBairro.setText(cliente.getBairro());
                txtCidade.setText(cliente.getCidade());
                txtEmail.setText(cliente.getEmail());
                txtIdade.setValue(cliente.getIdade());
                txtSintomas.setText(cliente.getSintomas());
              }

            }
          }
        } catch (Exception ex) {
          txtCodigo.setText("");
          limparTela();
          JOptionPane.showMessageDialog(null,
              "Atenção!\nOcorreu um erro ao buscar" + " dados do Paciente(ant): " + ex.getMessage());
        }
      }
    });

    btnProximo.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        try {
          int proximo = 0;

          if (qteClientes >= 0) {

            if (txtCodigo.getText().length() == 0) {
              txtCodigo.setText("0");
            } else {
              proximo = Integer.parseInt(txtCodigo.getText()) + 1;
              if (proximo <= qteClientes) {
                txtCodigo.setText(String.valueOf(proximo));
              }
            }

            if (Integer.parseInt(txtCodigo.getText()) <= qteClientes) {
              int codigo = Integer.parseInt(txtCodigo.getText());
              Cliente cliente = clientes[codigo];

              txtCpf.setText(cliente.getCpf());
              txtNome.setText(cliente.getNome());
              txtEndereço.setText(cliente.getEndereço());
              txtBairro.setText(cliente.getBairro());
              txtCidade.setText(cliente.getCidade());
              txtEmail.setText(cliente.getEmail());
              txtIdade.setValue(cliente.getIdade());
              txtSintomas.setText(cliente.getSintomas());
            }
          }
        } catch (Exception ex) {
          txtCodigo.setText("");
          limparTela();
          JOptionPane.showMessageDialog(null,
              "Atenção!\nOcorreu um erro ao buscar" + " dados do paciente(prx): " + ex.getMessage());
        }
      }
    });
    pack();
  }

  private boolean validarTela() {
    boolean resposta = true;

    if (txtSintomas.getText().length() == 0) {
      JOptionPane.showMessageDialog(null, "Campo matrícula em branco. Verifique!");
      resposta = false;
    }
    if ((Integer) txtCpf.getCaretPosition() <= 0 && resposta == true) {
      JOptionPane.showMessageDialog(null, "Campo CPF inválido. Verifique!");
      resposta = false;
    }
    if (txtNome.getText().length() == 0 && resposta == true) {
      JOptionPane.showMessageDialog(null, "Campo nome em branco. Verifique!");
      resposta = false;
    }
    if (txtEndereço.getText().length() == 0 && resposta == true) {
      JOptionPane.showMessageDialog(null, "Campo endereço em branco. Verifique!");
      resposta = false;
    }
    if (txtBairro.getText().length() == 0 && resposta == true) {
      JOptionPane.showMessageDialog(null, "Campo bairro em branco. Verifique!");
      resposta = false;
    }
    if (txtCidade.getText().length() == 0 && resposta == true) {
      JOptionPane.showMessageDialog(null, "Campo cidade em branco. Verifique!");
      resposta = false;
    }
    if (txtEmail.getText().length() == 0 && resposta == true) {
      JOptionPane.showMessageDialog(null, "Campo e-mail em branco. Verifique!");
      resposta = false;
    }
    if ((Integer) txtIdade.getValue() <= 0 && resposta == true) {
      JOptionPane.showMessageDialog(null, "Campo idade inválido. Verifique!");
      resposta = false;
    }
    return resposta;
  }

  private void limparTela() {
    txtCpf.setText("");
    txtSintomas.setText("");
    txtNome.setText("");
    txtEndereço.setText("");
    txtBairro.setText("");
    txtCidade.setText("");
    txtEmail.setText("");
    txtIdade.setValue(0);
    txtCpf.requestFocus();
  }
}
