/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Ficheiro;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Pessoa;
import model.PessoaTableModel;

/**
 *
 * @author KPROGRAMMER
 */
public class TelaGestao extends JFrame{
    JTable table;
    JTextField nome;
    JTextField idade;
    JTextField morada;
    JTextField bi;
    JTextField jtfPesquisa;
    JLabel id;
    
    public TelaGestao(){
        
        initComponents();
         DefaultTableModel modelo=(DefaultTableModel) table.getModel();
         table.setRowSorter(new TableRowSorter(modelo));
         readJTable();
    }
    public void readJTable(){
          DefaultTableModel modelo=(DefaultTableModel) table.getModel();
          //Ficheiro ficheiro=new Ficheiro();
          modelo.setNumRows(0);
          for (Pessoa p : Ficheiro.lista()) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getIdade(),
                p.getMorada(),
                p.getBi()
                
            
            
            });
        }
          
       }
    
    public void readJTableSearch(String pessoa){
          DefaultTableModel modelo=(DefaultTableModel) table.getModel();
          //Ficheiro ficheiro=new Ficheiro();
          modelo.setNumRows(0);
          for (Pessoa p : Ficheiro.search(pessoa)) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getIdade(),
                p.getMorada(),
                p.getBi()
                
            
            
            });
        }
          
       }
    public void clean(){
        nome.setText("");
         idade.setText("");
          morada.setText("");
           bi.setText("");
            jtfPesquisa.setText("");
            id.setText("");
    }
    public void initComponents(){
        
     
        
        Point p=new Point();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800,600));
        setVisible(true);
        setLocation(300,100);
        
        
        
        JPanel jPanel=new JPanel();
        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setLayout(new GridLayout(2, 0));
        setContentPane(jPanel);
        
          //Panel de fields
        JPanel jPanel1=new JPanel();
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new GridLayout(6, 0));
        
          //Panel de Jtable
         JPanel jPanel2=new JPanel();
        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new GridLayout(1, 0));
        
        
      //Panels de fields
         JPanel jPanel12=new JPanel();
        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new FlowLayout(FlowLayout.LEFT));
        
         JPanel jPanel13=new JPanel();
        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JPanel jPanel14=new JPanel();
        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JPanel jPanel15=new JPanel();
        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JPanel jPanel16=new JPanel();
        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JPanel jPanel17=new JPanel();
        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(BorderFactory.createTitledBorder(""));
        jPanel17.setLayout(new FlowLayout(FlowLayout.CENTER));

        
        jPanel12.add(new JLabel("Nome:    "));
        
        nome=new JTextField();
        nome.setPreferredSize(new Dimension(400, 30));
        jPanel12.add(nome);
        
        JButton jbPesquisar=new JButton("Pesquisar");
        jbPesquisar.setPreferredSize(new Dimension(100, 30));
        jbPesquisar.setBackground(new java.awt.Color(0,204,204));
        jbPesquisar.setForeground(new java.awt.Color(255,255,255));
        jPanel12.add(new JLabel("                   "));
        jPanel12.add(jbPesquisar);
        
        jtfPesquisa=new JTextField();
        jtfPesquisa.setPreferredSize(new Dimension(150, 30));
        jPanel12.add(jtfPesquisa);
        
        
        jPanel13.add(new JLabel("Idade:    "));
        
         idade=new JTextField();
        idade.setPreferredSize(new Dimension(400, 30));
        jPanel13.add(idade);
        
        jPanel14.add(new JLabel("Morada:"));
        
         morada=new JTextField();
        morada.setPreferredSize(new Dimension(400, 30));
        jPanel14.add(morada);
        
         jPanel15.add(new JLabel("BI:           "));
        
         bi=new JTextField();
        bi.setPreferredSize(new Dimension(400, 30));
        jPanel15.add(bi);
        
        id=new JLabel("ID:");
        jPanel16.add(id);
        
        JButton jbNovo=new JButton("Novo");
        jbNovo.setPreferredSize(new Dimension(100, 30));
        jbNovo.setBackground(new java.awt.Color(0,204,204));
        jbNovo.setForeground(new java.awt.Color(255,255,255));
        jPanel17.add(jbNovo);
        
          JButton jbEditar=new JButton("Editar");
        jbEditar.setPreferredSize(new Dimension(100, 30));
        jbEditar.setBackground(new java.awt.Color(0,204,204));
        jbEditar.setForeground(new java.awt.Color(255,255,255));
        jPanel17.add(jbEditar);
        
        JButton jbApagar=new JButton("Apagar");
        jbApagar.setPreferredSize(new Dimension(100, 30));
        jbApagar.setBackground(new java.awt.Color(0,204,204));
        jbApagar.setForeground(new java.awt.Color(255,255,255));
        jPanel17.add(jbApagar);
        
         JButton jbNormalizar=new JButton("Normalizar");
        jbNormalizar.setPreferredSize(new Dimension(100, 30));
        jbNormalizar.setBackground(new java.awt.Color(0,204,204));
        jbNormalizar.setForeground(new java.awt.Color(255,255,255));
        jPanel17.add(jbNormalizar);
        
        
        //add to fields panel
        jPanel1.add(jPanel12);
        jPanel1.add(jPanel13);
        jPanel1.add(jPanel14);
        jPanel1.add(jPanel15);
        jPanel1.add(jPanel16);
        jPanel1.add(jPanel17);
        
        
        
        //Jtable Panel
       String[] colunas={"ID","Nome","Idade","Morada","BI"};
        table=new JTable();
        table.setModel(new DefaultTableModel(colunas,ABORT));
        JScrollPane scroll=new JScrollPane(table);
        jPanel2.add(scroll);
        
        
        //add to main panel
       jPanel.add(jPanel1);
       jPanel.add(jPanel2);
        
       
       
       
       
       //Eventos
       
       jbNovo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              Ficheiro ficheiro=new Ficheiro();
              Pessoa p=new Pessoa();
                
                p.setId(Ficheiro.lista().size() + 1);
                p.setBi(bi.getText().toUpperCase());
                p.setNome(nome.getText().toUpperCase());
                p.setIdade(Integer.parseInt(idade.getText()));
                p.setMorada(morada.getText().toUpperCase());
                
                Ficheiro.create(p);
                readJTable();
                clean();
              
                
            }
        });
       
       jbApagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                
               
                
                Ficheiro.delete(Integer.parseInt(id.getText()));
                readJTable();
                clean();
              
                
            }
        });
       
       jbEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                
               
                Pessoa p=new Pessoa();
                
                p.setId(Integer.parseInt(id.getText()));
                p.setBi(bi.getText().toUpperCase());
                p.setNome(nome.getText().toUpperCase());
                p.setIdade(Integer.parseInt(idade.getText()));
                p.setMorada(morada.getText().toUpperCase());
                
                Ficheiro.edit(Integer.parseInt(id.getText()),p);
                readJTable();
                clean();
              
                
            }
        });
       
        jbPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                readJTableSearch(jtfPesquisa.getText().toUpperCase());
                clean();
              
                
            }
        });
        
        jbNormalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                readJTable();
                clean();
              
                
            }
        });
        
       table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e); 
         
         id.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
         nome.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
         idade.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
         morada.setText(table.getValueAt(table.getSelectedRow(), 3).toString());
         bi.setText(table.getValueAt(table.getSelectedRow(), 4).toString());
           
         
                
            }
           
           
});
      
       
       pack();
    }
    
}
