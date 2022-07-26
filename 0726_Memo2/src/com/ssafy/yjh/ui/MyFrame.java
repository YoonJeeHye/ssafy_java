package com.ssafy.yjh.ui;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class MyFrame extends Frame {
	TextArea ta;
	TextField tf;
	Panel p;
	Button b;
	MenuBar mb;
	Menu fileMenu, editMenu;
	MenuItem openItem, saveItem;
	
	FileDialog openDialog, saveDialog;
	
	public MyFrame() {
		createComponent();
		addComponent();
		setComponent();
		addEventHandling();
	}
	
	public void addEventHandling() {
		
		openItem.addActionListener(e->{
			openDialog.setVisible(true);
			try {
				FileReader fr = new FileReader(openDialog.getDirectory()+openDialog.getFile());
				BufferedReader br = new BufferedReader(fr);
				String oneLine = "";
				while((oneLine=br.readLine()) != null) {
					ta.append(oneLine+"\n");
				}
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});
		
		b.addActionListener(e->{
			ta.append(tf.getText()+"\n");
			tf.setText("");
		});
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void setComponent() {
		setSize(400, 500);
		setBackground(Color.pink);
	}
	
	public void addComponent() {
		add(ta);
		add(p, BorderLayout.SOUTH);
		p.add(tf);
		p.add(b);

		setMenuBar(mb);
		mb.add(fileMenu);
		mb.add(editMenu);
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		
		
	}

	public void createComponent() {
		ta = new TextArea();
		tf = new TextField(30);
		p = new Panel();
		b = new Button("send");
		mb = new MenuBar();
		fileMenu = new Menu("file");
		editMenu = new Menu("edit");
		openItem = new MenuItem("open");
		saveItem = new MenuItem("save");
		
		openDialog = new FileDialog(this, "open***", FileDialog.LOAD);
		saveDialog = new FileDialog(this, "save===", FileDialog.SAVE);
	}
}