package com.ssafy.yjh.ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame extends Frame {	// static�� ���� �ȿ��� non-static�� ����� ���� �Ұ� (static���� class ����� �ȵ�)
	
	private TextField tf;	// �����ʹ� ������ private
	private TextArea ta;
	private Button b1;
	Panel p;
	MenuBar mb;
	Menu fileMenu, editMenu;
	MenuItem saveItem, openItem;
	
	protected void createComponent() {	// �޼��忡�� protected(�ٸ� ������ �������� �� �� �ֵ���)
		ta = new TextArea();
		tf = new TextField(20);
		b1 = new Button("b1");
		p = new Panel();
		mb = new MenuBar();
		fileMenu = new Menu("file");
		editMenu = new Menu("edit");
		saveItem = new MenuItem("save");
		openItem = new MenuItem("open");
	}
	
	public void addComponent() {
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		
		mb.add(fileMenu);
		mb.add(editMenu);
		
		setMenuBar(mb);
		
		p.add(tf);
		p.add(b1);
		
		add(ta, BorderLayout.CENTER);
		add(p,BorderLayout.SOUTH);
		
	}
	
	public void setComponent() {
		setSize(400, 500);
		
		//Color bgColor = new Color(123,145,0);
		//f.setBackground(bgColor);
		setBackground(Color.magenta);
	}
	
	public void eventHandling() {
		ta.addMouseWheelListener(e-> {
				System.out.println("���콺 ���� �����Դϴ�.");
				
			}
		);
		
		b1.addActionListener(e->{
			
				ta.append(tf.getText()+"\n");
				tf.setText("");
			}
		);
		
		/*
		b1.addActionListener(new ActionListener() {	//MyBtnHandler �����θ� ����
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println(tf.getText());
				ta.append(tf.getText()+"\n");
				tf.setText("");
			}
		});
		*/
		
		addWindowListener(new WindowAdapter() {	// �ʿ��� �޼��常 ��� ����(���� ���Ǽ� ���)

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);	
			}
		});

	}
	
	public MyFrame() {
		createComponent();
		
		addComponent();
	
		setComponent();
		
		eventHandling();
		
	}	// end constructor

}	// end class
