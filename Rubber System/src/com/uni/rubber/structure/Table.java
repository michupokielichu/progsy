package com.uni.rubber.structure;

import javax.swing.JTable;

public class Table extends JTable {
	public Table(String[][] dataValues, String[] columnNames) {
		super(dataValues, columnNames);
		setEnabled(false);
	}

	public void changeTableValue(String[][] dataValues) {

	}

	public void changeTableValue(String[] dataValues) {

	}

}
