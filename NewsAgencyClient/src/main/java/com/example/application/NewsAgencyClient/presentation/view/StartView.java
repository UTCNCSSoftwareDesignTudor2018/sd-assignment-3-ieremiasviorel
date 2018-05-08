package com.example.application.NewsAgencyClient.presentation.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class StartView extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel startView;
	
	private JLabel title_label;
	private JLabel subtitle_label;

	private JPanel panels[];
	private GroupLayout gl_panels[];
	private JLabel title_labels[];
	private JLabel abstract_labels[];
	
//	private JPanel panel_1;
//	private JPanel panel_2;
//	private JPanel panel_3;
//	private JPanel panel_4;
//	private JPanel panel_5;
//	private JPanel panel_6;
//
//	private GroupLayout gl_panel_1;
//	private GroupLayout gl_panel_2;
//	private GroupLayout gl_panel_3;
//	private GroupLayout gl_panel_4;
//	private GroupLayout gl_panel_5;
//	private GroupLayout gl_panel_6;
//
//	private JLabel title_label_1;
//	private JLabel title_label_2;
//	private JLabel title_label_3;
//	private JLabel title_label_4;
//	private JLabel title_label_5;
//	private JLabel title_label_6;
//
//	private JLabel abstract_label_1;
//	private JLabel abstract_label_2;
//	private JLabel abstract_label_3;
//	private JLabel abstract_label_4;
//	private JLabel abstract_label_5;
//	private JLabel abstract_label_6;

	private JButton prev_page_btn;
	private JButton next_page_btn;
	private JButton login_btn;
	private JLabel page_count_label;

	public StartView() {

		setBounds(100, 100, 800, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("News Portal");
		setVisible(true);

		title_label = new JLabel("Technix Media");
		title_label.setFont(new Font("Tahoma", Font.PLAIN, 36));

		subtitle_label = new JLabel("Latest News Here");
		subtitle_label.setFont(new Font("Tahoma", Font.PLAIN, 24));

		panels = new JPanel[6];
		gl_panels = new GroupLayout[6];
		title_labels = new JLabel[6];
		abstract_labels = new JLabel[6];
		for (int i = 0; i < 6; i++) {
			panels[i] = new JPanel();
			panels[i].setBackground(Color.WHITE);
			title_labels[i] = new JLabel();
			title_labels[i].setFont(new Font("Tahoma", Font.PLAIN, 18));
			abstract_labels[i] = new JLabel();
			gl_panels[i] = new GroupLayout(panels[i]);
			gl_panels[i].setHorizontalGroup(gl_panels[i].createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_panels[i].createSequentialGroup().addContainerGap()
							.addGroup(gl_panels[i].createParallelGroup(Alignment.LEADING)
									.addComponent(abstract_labels[i], GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
									.addComponent(title_labels[i], GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
							.addContainerGap()));
			gl_panels[i].setVerticalGroup(gl_panels[i].createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panels[i].createSequentialGroup().addContainerGap()
							.addComponent(title_labels[i], GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addGap(11).addComponent(abstract_labels[i], GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
							.addContainerGap()));
			panels[i].setLayout(gl_panels[i]);
		}
		
//		panel_1 = new JPanel();
//		panel_1.setBackground(Color.WHITE);
//		title_label_1 = new JLabel();
//		title_label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		abstract_label_1 = new JLabel();
//		gl_panel_1 = new GroupLayout(panel_1);
//		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
//				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
//						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
//								.addComponent(abstract_label_1, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
//								.addComponent(title_label_1, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
//						.addContainerGap()));
//		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
//				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
//						.addComponent(title_label_1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
//						.addGap(11).addComponent(abstract_label_1, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
//						.addContainerGap()));
//		panel_1.setLayout(gl_panel_1);
//
//		panel_2 = new JPanel();
//		panel_2.setBackground(Color.WHITE);
//		title_label_2 = new JLabel();
//		title_label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		abstract_label_2 = new JLabel();
//		gl_panel_2 = new GroupLayout(panel_2);
//		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
//				.addGroup(gl_panel_2.createSequentialGroup().addContainerGap()
//						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
//								.addComponent(abstract_label_2, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
//								.addComponent(title_label_2, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
//						.addContainerGap()));
//		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
//				.addGroup(gl_panel_2.createSequentialGroup().addContainerGap()
//						.addComponent(title_label_2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
//						.addGap(11).addComponent(abstract_label_2, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
//						.addContainerGap()));
//		panel_2.setLayout(gl_panel_2);
//
//		panel_3 = new JPanel();
//		panel_3.setBackground(Color.WHITE);
//		title_label_3 = new JLabel();
//		title_label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		abstract_label_3 = new JLabel();
//		gl_panel_3 = new GroupLayout(panel_3);
//		gl_panel_3.setHorizontalGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
//				.addGroup(gl_panel_3.createSequentialGroup().addContainerGap()
//						.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
//								.addComponent(abstract_label_3, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
//								.addComponent(title_label_3, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
//						.addContainerGap()));
//		gl_panel_3.setVerticalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
//				.addGroup(gl_panel_3.createSequentialGroup().addContainerGap()
//						.addComponent(title_label_3, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
//						.addGap(11).addComponent(abstract_label_3, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
//						.addContainerGap()));
//		panel_3.setLayout(gl_panel_3);
//
//		panel_4 = new JPanel();
//		panel_4.setBackground(Color.WHITE);
//		title_label_4 = new JLabel();
//		title_label_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		abstract_label_4 = new JLabel();
//		gl_panel_4 = new GroupLayout(panel_4);
//		gl_panel_4.setHorizontalGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
//				.addGroup(gl_panel_4.createSequentialGroup().addContainerGap()
//						.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
//								.addComponent(abstract_label_4, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
//								.addComponent(title_label_4, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
//						.addContainerGap()));
//		gl_panel_4.setVerticalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
//				.addGroup(gl_panel_4.createSequentialGroup().addContainerGap()
//						.addComponent(title_label_4, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
//						.addGap(11).addComponent(abstract_label_4, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
//						.addContainerGap()));
//		panel_4.setLayout(gl_panel_4);
//
//		panel_5 = new JPanel();
//		panel_5.setBackground(Color.WHITE);
//		title_label_5 = new JLabel();
//		title_label_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		abstract_label_5 = new JLabel();
//		gl_panel_5 = new GroupLayout(panel_5);
//		gl_panel_5.setHorizontalGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
//				.addGroup(gl_panel_5.createSequentialGroup().addContainerGap()
//						.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
//								.addComponent(abstract_label_5, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
//								.addComponent(title_label_5, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
//						.addContainerGap()));
//		gl_panel_5.setVerticalGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
//				.addGroup(gl_panel_5.createSequentialGroup().addContainerGap()
//						.addComponent(title_label_5, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
//						.addGap(11).addComponent(abstract_label_5, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
//						.addContainerGap()));
//		panel_5.setLayout(gl_panel_5);
//
//		panel_6 = new JPanel();
//		panel_6.setBackground(Color.WHITE);
//		title_label_6 = new JLabel();
//		title_label_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		abstract_label_6 = new JLabel();
//		gl_panel_6 = new GroupLayout(panel_6);
//		gl_panel_6.setHorizontalGroup(gl_panel_6.createParallelGroup(Alignment.TRAILING)
//				.addGroup(gl_panel_6.createSequentialGroup().addContainerGap()
//						.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
//								.addComponent(abstract_label_6, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
//								.addComponent(title_label_6, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
//						.addContainerGap()));
//		gl_panel_6.setVerticalGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
//				.addGroup(gl_panel_6.createSequentialGroup().addContainerGap()
//						.addComponent(title_label_6, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
//						.addGap(11).addComponent(abstract_label_6, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
//						.addContainerGap()));
//		panel_6.setLayout(gl_panel_6);

		prev_page_btn = new JButton("<<");
		next_page_btn = new JButton(">>");
		login_btn = new JButton("login");
		page_count_label = new JLabel("1");

//		GroupLayout groupLayout = new GroupLayout(getContentPane());
//		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
//				.createSequentialGroup().addContainerGap()
//				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
//						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
//								.addComponent(prev_page_btn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
//								.addPreferredGap(ComponentPlacement.RELATED).addComponent(page_count_label)
//								.addPreferredGap(ComponentPlacement.RELATED).addComponent(next_page_btn).addGap(10))
//						.addGroup(groupLayout.createSequentialGroup().addGap(22)
//								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
//										.addGroup(groupLayout.createSequentialGroup()
//												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
//														.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 220,
//																GroupLayout.PREFERRED_SIZE)
//														.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 220,
//																GroupLayout.PREFERRED_SIZE))
//												.addGap(32)
//												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
//														.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 224,
//																Short.MAX_VALUE)
//														.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 224,
//																Short.MAX_VALUE))
//												.addGap(41)
//												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
//														.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 220,
//																GroupLayout.PREFERRED_SIZE)
//														.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 220,
//																GroupLayout.PREFERRED_SIZE)))
//										.addGroup(groupLayout.createSequentialGroup()
//												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
//														.addGroup(groupLayout.createSequentialGroup()
//																.addComponent(subtitle_label, GroupLayout.DEFAULT_SIZE,
//																		369, Short.MAX_VALUE)
//																.addPreferredGap(ComponentPlacement.RELATED, 303,
//																		Short.MAX_VALUE))
//														.addGroup(groupLayout.createSequentialGroup()
//																.addComponent(title_label, GroupLayout.PREFERRED_SIZE,
//																		523, GroupLayout.PREFERRED_SIZE)
//																.addPreferredGap(ComponentPlacement.RELATED)))
//												.addComponent(login_btn, GroupLayout.PREFERRED_SIZE, 65,
//														GroupLayout.PREFERRED_SIZE)))
//								.addGap(25)))));
//		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
//				.createSequentialGroup().addContainerGap()
//				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(login_btn)
//						.addComponent(title_label, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
//				.addPreferredGap(ComponentPlacement.RELATED).addComponent(subtitle_label).addGap(28)
//				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
//						.createSequentialGroup()
//						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
//								.addGroup(groupLayout.createSequentialGroup()
//										.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 130,
//												GroupLayout.PREFERRED_SIZE)
//										.addGap(18).addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 130,
//												GroupLayout.PREFERRED_SIZE))
//								.addGroup(groupLayout.createSequentialGroup()
//										.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 130,
//												GroupLayout.PREFERRED_SIZE)
//										.addGap(18).addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 130,
//												GroupLayout.PREFERRED_SIZE)))
//						.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
//						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(next_page_btn)
//								.addComponent(prev_page_btn).addComponent(page_count_label)))
//						.addGroup(groupLayout.createSequentialGroup()
//								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
//								.addGap(18)
//								.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
//				.addContainerGap()));
		
		startView = new JPanel();
		for (JPanel panel : panels) {
			startView.add(panel);
		}
		startView.add(title_label);
		startView.add(subtitle_label);
		startView.add(prev_page_btn);
		startView.add(next_page_btn);
		startView.add(login_btn);
		startView.add(page_count_label);
		
		//GroupLayout groupLayout = new GroupLayout(getContentPane());
		
		GroupLayout groupLayout = new GroupLayout(startView);
		
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addContainerGap()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
								.addComponent(prev_page_btn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(page_count_label)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(next_page_btn).addGap(10))
						.addGroup(groupLayout.createSequentialGroup().addGap(22)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(panels[3], GroupLayout.PREFERRED_SIZE, 220,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(panels[0], GroupLayout.PREFERRED_SIZE, 220,
																GroupLayout.PREFERRED_SIZE))
												.addGap(32)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(panels[4], GroupLayout.DEFAULT_SIZE, 224,
																Short.MAX_VALUE)
														.addComponent(panels[1], GroupLayout.DEFAULT_SIZE, 224,
																Short.MAX_VALUE))
												.addGap(41)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(panels[5], GroupLayout.PREFERRED_SIZE, 220,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(panels[2], GroupLayout.PREFERRED_SIZE, 220,
																GroupLayout.PREFERRED_SIZE)))
										.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(subtitle_label, GroupLayout.DEFAULT_SIZE,
																		369, Short.MAX_VALUE)
																.addPreferredGap(ComponentPlacement.RELATED, 303,
																		Short.MAX_VALUE))
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(title_label, GroupLayout.PREFERRED_SIZE,
																		523, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)))
												.addComponent(login_btn, GroupLayout.PREFERRED_SIZE, 65,
														GroupLayout.PREFERRED_SIZE)))
								.addGap(25)))));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addContainerGap()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(login_btn)
						.addComponent(title_label, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(subtitle_label).addGap(28)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
						.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(panels[1], GroupLayout.PREFERRED_SIZE, 130,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(panels[4], GroupLayout.PREFERRED_SIZE, 130,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(panels[2], GroupLayout.PREFERRED_SIZE, 130,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(panels[5], GroupLayout.PREFERRED_SIZE, 130,
												GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(next_page_btn)
								.addComponent(prev_page_btn).addComponent(page_count_label)))
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(panels[0], GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(panels[3], GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap()));
		
		startView.setLayout(groupLayout);
		startView.setVisible(true);
		getContentPane().add(startView);
		setVisible(true);
		//getContentPane().setLayout(groupLayout);
	}
}
