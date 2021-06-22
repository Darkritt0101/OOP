package com.ucreativa.vacunacion.ui;

import com.ucreativa.vacunacion.repositories.FileRepository;
import com.ucreativa.vacunacion.services.BitacoraService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrontEnd extends JFrame {



    public FrontEnd(String titulo){
        super(titulo);
    }

    public void build(){
        this.construccionPantalla();
        this.crearComponente();
        super.setVisible(true);
    }

    private void construccionPantalla(){
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400,200);
        super.setLayout(new GridLayout(5,2));
    }

    private void agregarComponente(Component component){
        super.getContentPane().add(component);
    }

    private void crearComponente(){
        //crear labels
        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblCedula = new JLabel("Cedula:");
        JLabel lblTxtEdad = new JLabel("Edad:");
        JLabel lblTxtRiesgo = new JLabel("Riesgo:");
        JLabel lblIsAmigo = new JLabel("Es Amigo?:");
        JLabel lblRelacion= new JLabel("Relacion:");
        JLabel lblFacebook = new JLabel("Facebook:");
        JLabel lblParentesco = new JLabel("Parentesco:");
        JLabel lblMarca = new JLabel("Marca:");

        //crear txt
        JTextField txtNombre = new JTextField();
        JTextField txtCedula = new JTextField();
        JTextField txtEdad  = new JTextField();
        JTextField txtRelacion = new JTextField();
        JTextField txtFacebook = new JTextField();
        JTextField txtParentesco = new JTextField();
        JTextField txtMarca = new JTextField();

        JCheckBox txtRiesgo = new JCheckBox();
        JCheckBox txtIsAmigo = new JCheckBox();
        txtIsAmigo.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblParentesco.setVisible(!txtIsAmigo.isSelected());
                txtParentesco.setVisible(!txtIsAmigo.isSelected());

                lblRelacion.setVisible(txtIsAmigo.isSelected());
                txtRelacion.setVisible(txtIsAmigo.isSelected());

                lblFacebook.setVisible(txtIsAmigo.isSelected());
                txtFacebook.setVisible(txtIsAmigo.isSelected());
            }
        });

            JButton salvar = new JButton("Salvar");

        salvar.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BitacoraService service = new BitacoraService(new FileRepository());
                service.save(txtNombre.getText(),
                        txtCedula.getText(),
                        txtEdad.getText(),
                        txtRiesgo.isSelected(),
                        txtIsAmigo.isSelected(),
                        txtRelacion.getText(),
                        txtFacebook.getText(),
                        txtParentesco.getText(),
                        txtMarca.getText());

                txtNombre.setText("");
                txtCedula.setText("");
                txtEdad.setText("");
                txtRiesgo.setText("");
                txtIsAmigo.setText("");
                txtRelacion.setText("");
                txtFacebook.setText("");
                txtParentesco.setText("");
                txtMarca.setText("");

                String reporte = String.join("\n", service.get());

                JOptionPane.showMessageDialog(((JButton)e.getSource()).getParent(), reporte);

            }
        });

        //agregamos al UI
        this.agregarComponente(lblNombre);
        this.agregarComponente(txtNombre);
        this.agregarComponente(lblCedula);
        this.agregarComponente(txtCedula);
        this.agregarComponente(lblTxtEdad);
        this.agregarComponente(txtEdad);
        this.agregarComponente(lblTxtRiesgo);
        this.agregarComponente(txtRiesgo);
        this.agregarComponente(lblIsAmigo);
        this.agregarComponente(txtIsAmigo);
        this.agregarComponente(lblRelacion);
        this.agregarComponente(txtRelacion);
        this.agregarComponente(lblFacebook);
        this.agregarComponente(txtFacebook);
        this.agregarComponente(lblParentesco);
        this.agregarComponente(txtParentesco);
        this.agregarComponente(lblMarca);
        this.agregarComponente(txtMarca );
        this.agregarComponente(salvar);


    }

}
