package edu.utexas.se.swing.sample;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import org.apache.poi.ReadWriteExcelFile;

public class Results{

	private static final int AUTO_RESIZE_LAST_COLUMN = 0;
	private static JFrame frame;
	private JTable tableComments;
	private JLabel lblIsEverythingReady;
	private JButton btnYeBoisLets;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Results window = new Results();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Results() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @return 
	 * @return 
	 */
	
	//public File test =  new File("c:\\test.tsv");
	public Image SpotCheck = new ImageIcon(this.getClass().getResource("/SpotCheck.png")).getImage().getScaledInstance(380, 300, Image.SCALE_DEFAULT);
	private JLabel lblForReference;
	private JLabel lblLr;
	private JLabel lblLeftSideOf;
	private JTable tableHatchesTeleOp;
	private JTable tableBallsTeleOp;
	private JTable tableRatings;
	private JLabel lblSsSandstorm;
	
	//For editing the tables
	  public int row = 0;
      public int column = 0;
      public Object value = null;
      //---------------------------
      public int rowHatchesAuto = 0;
      public int columnHatchesAuto = 0;
      public Object valueHatchesAuto = null;
      //---------------------------
      public int rowHatchesTeleOp = 0;
      public int columnHatchesTeleOp = 0;
      public Object valueHatchesTeleOp = null;
      //---------------------------
      public int rowBallsAuto = 0;
      public int columnBallsAuto = 0;
      public Object valueBallsAuto = null;
      //---------------------------
      public int rowBallsTeleOp = 0;
      public int columnBallsTeleOp = 0;
      public Object valueBallsTeleOp = null;
      //-------------------------------
      public int rowComments = 0;
      public int columnComments = 0;
      public Object valueComments = null;
      //------------------------------------
      public int rowRatings = 0;
      public int columnRatings = 0;
      public Object valueRatings = null;
     
     
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Object rowData[][] = { { "Round #","Team #" ,"Side they were on", "# of Hatches (SS)", "# of Hatches (PSS)", "# of Balls (SS)", "# of Balls (PSS)",},
                               { RoundNumber.getRoundNumber(), TeamNumber.getTeamNumber(), whichSide(), countHatchesAuto(), countHatchesTeleOp(), countBallsAuto(), countBallsTeleOp() }};
        Object columnNames[] = { "Round #", "Team #", "Side", "# of Hatches (SS)", "# of Hatches (PSS)", "# of Balls (SS)", "# of Balls (PSS)"};
        
        JTable table = new JTable(rowData, columnNames);
        
        table.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
				table.getModel().setValueAt(getValue(), getRow(), getColumn());
        	}
        });
		
        table.getModel().addTableModelListener(new TableModelListener() {
        
        	  public void tableChanged(TableModelEvent e) {
        		 // System.out.println(e);
        		  if(e.getType() == TableModelEvent.UPDATE){
        			  row = e.getFirstRow();
                      column = e.getColumn();
                      value = ((TableModel) e.getSource()).getValueAt(row, column);
                  //  System.out.println(row + " " + column + " " + value);
                         
                    /*  try{
                    	  table.getModel().setValueAt(value, row, column);
                      }
                      catch(Error StackOverflowError){
                    	  System.out.println("Can't change table.");
                      }*/
        		  }
        	  }
        	});
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setColumnSelectionAllowed(true);
		table.setBounds(6, 59, 888, 38);	
		frame.getContentPane().add(table);

		String rowDataHatchesAuto[][] = { { "Types of Hatches (SS)"},
				                      { whichHatchesAuto()}};
		String columnNamesHatchesAuto[] = {"Types of Hatches"};
		
		JTable tableHatchesAuto = new JTable(rowDataHatchesAuto, columnNamesHatchesAuto);
		   tableHatchesAuto.addKeyListener(new KeyAdapter() {
	        	@Override
	        	public void keyPressed(KeyEvent e) {
					tableHatchesAuto.getModel().setValueAt(getValue(), getRow(), getColumn());
	        	}
	        });
			
	        tableHatchesAuto.getModel().addTableModelListener(new TableModelListener() {
	        
	        	  public void tableChanged(TableModelEvent e) {
	        		 // System.out.println(e);
	        		  if(e.getType() == TableModelEvent.UPDATE){
	        			  rowHatchesAuto = e.getFirstRow();
	                      columnHatchesAuto = e.getColumn();
	                      valueHatchesAuto = ((TableModel) e.getSource()).getValueAt(row, column);
	        		  }
	        	  }
	        	});
		tableHatchesAuto.setBounds(6, 153, 888, 38);
		frame.getContentPane().add(tableHatchesAuto);
		
		String rowDataHatchesTeleOp[][] = { { "Types of Hatches (PSS)"},
                                            { whichHatchesTeleOp()}};
        String columnNamesHatchesTeleOp[] = {"Types of Hatches"};

        tableHatchesTeleOp = new JTable(rowDataHatchesTeleOp, columnNamesHatchesTeleOp);
        tableHatchesTeleOp.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
    			tableHatchesTeleOp.getModel().setValueAt(getValue(), getRow(), getColumn());
        	}
        });
    	
        tableHatchesTeleOp.getModel().addTableModelListener(new TableModelListener() {
        
        	  public void tableChanged(TableModelEvent e) {
        		 // System.out.println(e);
        		  if(e.getType() == TableModelEvent.UPDATE){
        			  rowHatchesTeleOp = e.getFirstRow();
                      columnHatchesTeleOp = e.getColumn();
                      valueHatchesTeleOp = ((TableModel) e.getSource()).getValueAt(row, column);
        		  }
        	  }
        	});
        tableHatchesTeleOp.setBounds(6, 203, 888, 38);
        frame.getContentPane().add(tableHatchesTeleOp);
        
        String rowDataBallsAuto[][] = { { "Types of Balls (SS)"},
                                        { whichBallsAuto()}};
        String columnNamesBallsAuto[] = {"Types of Balls"};

        JTable tableBallsAuto = new JTable(rowDataBallsAuto, columnNamesBallsAuto);
        tableBallsAuto.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
				tableBallsAuto.getModel().setValueAt(getValue(), getRow(), getColumn());
        	}
        });
		
        tableBallsAuto.getModel().addTableModelListener(new TableModelListener() {
        
        	  public void tableChanged(TableModelEvent e) {
        		 // System.out.println(e);
        		  if(e.getType() == TableModelEvent.UPDATE){
        			  rowBallsAuto = e.getFirstRow();
                      columnBallsAuto = e.getColumn();
                      valueBallsAuto = ((TableModel) e.getSource()).getValueAt(row, column);
        		  }
        	  }
        	});
        tableBallsAuto.setBounds(6, 253, 888, 38);
        frame.getContentPane().add(tableBallsAuto);
        
        String rowDataBallsTeleOp[][] = { { "Types of Balls (PSS)"},
                                          { whichBallsTeleOp()}};
        String columnNamesBallsTeleOp[] = {"Types of Balls"};
        
        tableBallsTeleOp = new JTable(rowDataBallsTeleOp, columnNamesBallsTeleOp);
        tableBallsTeleOp.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyPressed(KeyEvent e) {
			tableBallsTeleOp.getModel().setValueAt(getValue(), getRow(), getColumn());
    	}
    });
	
    tableBallsTeleOp.getModel().addTableModelListener(new TableModelListener() {
    
    	  public void tableChanged(TableModelEvent e) {
    		 // System.out.println(e);
    		  if(e.getType() == TableModelEvent.UPDATE){
    			  rowBallsTeleOp = e.getFirstRow();
                  columnBallsTeleOp = e.getColumn();
                  valueBallsTeleOp = ((TableModel) e.getSource()).getValueAt(row, column);
    		  }
    	  }
    	});
        tableBallsTeleOp.setBounds(6, 303, 888, 38);
        frame.getContentPane().add(tableBallsTeleOp);
        
        String rowDataComments[][] = { { "Common Comments:"},
                { Comments.getCommonComments()},
                { "Other Comments:"},
                { Comments.getOtherComments()}};
        String columnNamesComments[] = {"Comments"};

        tableComments = new JTable(rowDataComments, columnNamesComments);
        tableComments.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
    			tableComments.getModel().setValueAt(getValue(), getRow(), getColumn());
        	}
        });
    	
        tableComments.getModel().addTableModelListener(new TableModelListener() {
        
        	  public void tableChanged(TableModelEvent e) {
        		 // System.out.println(e);
        		  if(e.getType() == TableModelEvent.UPDATE){
        			  rowComments = e.getFirstRow();
                      columnComments = e.getColumn();
                      valueComments = ((TableModel) e.getSource()).getValueAt(row, column);
        		  }
        	  }
        	});
        tableComments.setBounds(6, 353, 888, 64);
        frame.getContentPane().add(tableComments);
        
        lblIsEverythingReady = new JLabel("Is Everything Ready?    If not, change it directly in the tables below. Press enter after typing in the correct thing.");
        lblIsEverythingReady.setBounds(6, 3, 717, 50);
        frame.getContentPane().add(lblIsEverythingReady);
        
        btnYeBoisLets = new JButton("Ye bois, lets export");
        btnYeBoisLets.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
					try {
						ReadWriteExcelFile.writeXLSFile(
								Integer.parseInt((String) table.getValueAt(1, 0)), (int) table.getValueAt(1, 1), (String) table.getValueAt(1, 2), 
								(int) table.getValueAt(1, 3), (int) table.getValueAt(1, 4), (String) tableHatchesAuto.getValueAt(1, 0), 
						        (String) tableHatchesTeleOp.getValueAt(1, 0), (int) table.getValueAt(1, 5), (int) table.getValueAt(1, 6), 
						        (String) tableBallsAuto.getValueAt(1, 0), (String) tableBallsTeleOp.getValueAt(1, 0), 
						        (int) tableRatings.getValueAt(0, 1), (int) tableRatings.getValueAt(1, 1),
						        (String) tableComments.getValueAt(1, 0), (String) tableComments.getValueAt(3, 0));
					  } catch (NoClassDefFoundError e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						System.out.println("failure");
						JOptionPane.showMessageDialog(null, "Try resaving the Scouting2019 spreadsheet as a .xls file and renaming the book to 'Scouting Info'", 
								                            "Didn't Export", JOptionPane.ERROR_MESSAGE);
					} catch (IOException e2){
						e2.printStackTrace();
					}
					
					/*try {
						ReadWriteExcelFile.readXLSFile();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}*/
				
					DoneScreen.main(null);
					frame.dispose();
					
        	}
        });
        btnYeBoisLets.setBounds(36, 479, 200, 50);
        frame.getContentPane().add(btnYeBoisLets);
        
        JLabel lblSpotCheck = new JLabel("New label");
        lblSpotCheck.setBounds(287, 457, 279, 148);
        frame.getContentPane().add(lblSpotCheck);
        lblSpotCheck.setIcon(new ImageIcon(SpotCheck));
        
        lblForReference = new JLabel("For Reference:");
        lblForReference.setBounds(326, 429, 97, 16);
        frame.getContentPane().add(lblForReference);
        
        lblLr = new JLabel("LR =");
        lblLr.setBounds(597, 461, 61, 16);
        frame.getContentPane().add(lblLr);
        
        lblLeftSideOf = new JLabel("Left side of field, right side of rocket");
        lblLeftSideOf.setBounds(635, 461, 232, 16);
        frame.getContentPane().add(lblLeftSideOf);
        
        lblSsSandstorm = new JLabel("SS = Sandstorm       PSS = Post Sandstorm");
        lblSsSandstorm.setBounds(597, 523, 270, 16);
        frame.getContentPane().add(lblSsSandstorm);
        
        Object rowDataRating[][] = { {"Autonomous Rating", Comments.getAutoRating(), ""},
                                     {"Defensive Rating", Comments.getDefensiveRating(), ""}};
        String columnNamesRatings[] = {"Rating Name", "Rating Number", "Sizing Reasons"};
        
        tableRatings = new JTable(rowDataRating, columnNamesRatings);
        tableRatings.getColumnModel().getColumn(2).setPreferredWidth(AUTO_RESIZE_LAST_COLUMN);
        tableRatings.getColumnModel().getColumn(0).setPreferredWidth(10);
        tableRatings.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
    			tableRatings.getModel().setValueAt(getValue(), getRow(), getColumn());
        	}
        });
    	
        tableRatings.getModel().addTableModelListener(new TableModelListener() {
        
        	  public void tableChanged(TableModelEvent e) {
        		 // System.out.println(e);
        		  if(e.getType() == TableModelEvent.UPDATE){
        			  rowRatings = e.getFirstRow();
                      columnRatings = e.getColumn();
                      valueRatings = ((TableModel) e.getSource()).getValueAt(row, column);
        		  }
        	  }
        	});
        tableRatings.setBounds(6, 107, 888, 34);
        frame.getContentPane().add(tableRatings);
	
	}
	
	int getRow(){
		return row;
	}
	int getColumn(){
		return column;
	}
	Object getValue(){
		return value;
	}

	public static String whichSide() {

		if(chooseaside.getOnBlue()){
			return "Blue";
		}
		else{
			return "Red";
		}
	}
	
	
	//Counts up all of the true variables from scoutingteleop for balls
    private static int countBallsTeleOp(){
    	int count = 0;
		if(scoutingteleop.getTopLeftLvl3Ball()){count++;}
		if(scoutingteleop.getTopLeftLvl2Ball()){count++;}
		if(scoutingteleop.getTopLeftLvl1Ball()){count++;}
		if(scoutingteleop.getTopRightLvl3Ball()){count++;}
		if(scoutingteleop.getTopRightLvl2Ball()){count++;}
		if(scoutingteleop.getTopRightLvl1Ball()){count++;}
		if(scoutingteleop.getSpot1Ball()){count++;}
		if(scoutingteleop.getSpot2Ball()){count++;}
		if(scoutingteleop.getSpot3Ball()){count++;}
		if(scoutingteleop.getSpot4Ball()){count++;}
		if(scoutingteleop.getSpot5Ball()){count++;}
		if(scoutingteleop.getSpot6Ball()){count++;}
		if(scoutingteleop.getSpot7Ball()){count++;}
		if(scoutingteleop.getSpot8Ball()){count++;}
		if(scoutingteleop.getBottomLeftLvl3Ball()){count++;}
		if(scoutingteleop.getBottomLeftLvl2Ball()){count++;}
		if(scoutingteleop.getBottomLeftLvl1Ball()){count++;}
		if(scoutingteleop.getBottomRightLvl3Ball()){count++;}
		if(scoutingteleop.getBottomRightLvl2Ball()){count++;}
		if(scoutingteleop.getBottomRightLvl1Ball()){count++;}
		return count;
   }
    
  //Lists off all of the balls the robot has done from scoutingteleop
  	private static String whichBallsTeleOp() {
  		String str = "";
  		if(scoutingteleop.getTopLeftLvl3Ball()){str = str + "LL Lvl 3, ";}
  		if(scoutingteleop.getTopLeftLvl2Ball()){str = str + "LL Lvl 2, ";}
  		if(scoutingteleop.getTopLeftLvl1Ball()){str = str + "LL Lvl 1, ";}
  		if(scoutingteleop.getTopRightLvl3Ball()){str = str + "LR Lvl 3, ";}
  		if(scoutingteleop.getTopRightLvl2Ball()){str = str + "LR Lvl 2, ";}
  		if(scoutingteleop.getTopRightLvl1Ball()){str = str + "LR Lvl 1, ";}
  		if(scoutingteleop.getSpot1Ball()){str = str + "Spot 1, ";}
  		if(scoutingteleop.getSpot2Ball()){str = str + "Spot 2, ";}
  		if(scoutingteleop.getSpot3Ball()){str = str + "Spot 3, ";}
  		if(scoutingteleop.getSpot4Ball()){str = str + "Spot 4, ";}
  		if(scoutingteleop.getSpot5Ball()){str = str + "Spot 5, ";}
  		if(scoutingteleop.getSpot6Ball()){str = str + "Spot 6, ";}
  		if(scoutingteleop.getSpot7Ball()){str = str + "Spot 7, ";}
  		if(scoutingteleop.getSpot8Ball()){str = str + "Spot 8, ";}
  		if(scoutingteleop.getBottomLeftLvl3Ball()){str = str + "RL Lvl 3, ";}
  		if(scoutingteleop.getBottomLeftLvl2Ball()){str = str + "RL Lvl 2, ";}
  		if(scoutingteleop.getBottomLeftLvl1Ball()){str = str + "RL Lvl 1, ";}
  		if(scoutingteleop.getBottomRightLvl3Ball()){str = str + "RR Lvl 3, ";}
  		if(scoutingteleop.getBottomRightLvl2Ball()){str = str + "RR Lvl 2, ";}
  		if(scoutingteleop.getBottomRightLvl1Ball()){str = str + "RR Lvl 1, ";}
  		
  		if(str.equals("")){
  			return "none";
  		}
  		
  		return str;
  	}

	//Counts up all of the true variables from scoutingteleop for hatches
	private static int countHatchesTeleOp() {
		int count = 0;
		if(scoutingteleop.getTopLeftLvl3Hatch()){count++;}
		if(scoutingteleop.getTopLeftLvl2Hatch()){count++;}
		if(scoutingteleop.getTopLeftLvl1Hatch()){count++;}
		if(scoutingteleop.getTopRightLvl3Hatch()){count++;}
		if(scoutingteleop.getTopRightLvl2Hatch()){count++;}
		if(scoutingteleop.getTopRightLvl1Hatch()){count++;}
		if(scoutingteleop.getSpot1Hatch()){count++;}
		if(scoutingteleop.getSpot2Hatch()){count++;}
		if(scoutingteleop.getSpot3Hatch()){count++;}
		if(scoutingteleop.getSpot4Hatch()){count++;}
		if(scoutingteleop.getSpot5Hatch()){count++;}
		if(scoutingteleop.getSpot6Hatch()){count++;}
		if(scoutingteleop.getSpot7Hatch()){count++;}
		if(scoutingteleop.getSpot8Hatch()){count++;}
		if(scoutingteleop.getBottomLeftLvl3Hatch()){count++;}
		if(scoutingteleop.getBottomLeftLvl2Hatch()){count++;}
		if(scoutingteleop.getBottomLeftLvl1Hatch()){count++;}
		if(scoutingteleop.getBottomRightLvl3Hatch()){count++;}
		if(scoutingteleop.getBottomRightLvl2Hatch()){count++;}
		if(scoutingteleop.getBottomRightLvl1Hatch()){count++;}
		return count;
		}
	
	//Lists off all of the hatches the robot has done from scoutingteleop
		private static String whichHatchesTeleOp() {
			String str = "";
			if(scoutingteleop.getTopLeftLvl3Hatch()){str = str + "LL Lvl 3, ";}
			if(scoutingteleop.getTopLeftLvl2Hatch()){str = str + "LL Lvl 2, ";}
			if(scoutingteleop.getTopLeftLvl1Hatch()){str = str + "LL Lvl 1, ";}
			if(scoutingteleop.getTopRightLvl3Hatch()){str = str + "LR Lvl 3, ";}
			if(scoutingteleop.getTopRightLvl2Hatch()){str = str + "LR Lvl 2, ";}
			if(scoutingteleop.getTopRightLvl1Hatch()){str = str + "LR Lvl 1, ";}
			if(scoutingteleop.getSpot1Hatch()){str = str + "Spot 1, ";}
			if(scoutingteleop.getSpot2Hatch()){str = str + "Spot 2, ";}
			if(scoutingteleop.getSpot3Hatch()){str = str + "Spot 3, ";}
			if(scoutingteleop.getSpot4Hatch()){str = str + "Spot 4, ";}
			if(scoutingteleop.getSpot5Hatch()){str = str + "Spot 5, ";}
			if(scoutingteleop.getSpot6Hatch()){str = str + "Spot 6, ";}
			if(scoutingteleop.getSpot7Hatch()){str = str + "Spot 7, ";}
			if(scoutingteleop.getSpot8Hatch()){str = str + "Spot 8, ";}
			if(scoutingteleop.getBottomLeftLvl3Hatch()){str = str + "RL Lvl 3, ";}
			if(scoutingteleop.getBottomLeftLvl2Hatch()){str = str + "RL Lvl  2, ";}
			if(scoutingteleop.getBottomLeftLvl1Hatch()){str = str + "RL Lvl 1, ";}
			if(scoutingteleop.getBottomRightLvl3Hatch()){str = str + "RR Lvl 3, ";}
			if(scoutingteleop.getBottomRightLvl2Hatch()){str = str + "RR Lvl 2, ";}
			if(scoutingteleop.getBottomRightLvl1Hatch()){str = str + "RR Lvl 1, ";}
			
			if(str.equals("")){
	  			return "none";
	  		}
			return str;
		}
	
	//Counts up all of the true variables from scoutingauto for balls
	private static int countBallsAuto() {
		int count = 0;
		if(scoutingauto.getTopLeftLvl3Ball()){count++;}
		if(scoutingauto.getTopLeftLvl2Ball()){count++;}
		if(scoutingauto.getTopLeftLvl1Ball()){count++;}
		if(scoutingauto.getTopRightLvl3Ball()){count++;}
		if(scoutingauto.getTopRightLvl2Ball()){count++;}
		if(scoutingauto.getTopRightLvl1Ball()){count++;}
		if(scoutingauto.getSpot1Ball()){count++;}
		if(scoutingauto.getSpot2Ball()){count++;}
		if(scoutingauto.getSpot3Ball()){count++;}
		if(scoutingauto.getSpot4Ball()){count++;}
		if(scoutingauto.getSpot5Ball()){count++;}
		if(scoutingauto.getSpot6Ball()){count++;}
		if(scoutingauto.getSpot7Ball()){count++;}
		if(scoutingauto.getSpot8Ball()){count++;}
		if(scoutingauto.getBottomLeftLvl3Ball()){count++;}
		if(scoutingauto.getBottomLeftLvl2Ball()){count++;}
		if(scoutingauto.getBottomLeftLvl1Ball()){count++;}
		if(scoutingauto.getBottomRightLvl3Ball()){count++;}
		if(scoutingauto.getBottomRightLvl2Ball()){count++;}
		if(scoutingauto.getBottomRightLvl1Ball()){count++;}
		return count;
	}
	
	//Lists off all of the balls the robot has done from scoutingauto
	private static String whichBallsAuto() {
		String str = "";
		if(scoutingauto.getTopLeftLvl3Ball()){str = str + "LL Lvl 3, ";}
		if(scoutingauto.getTopLeftLvl2Ball()){str = str + "LL Lvl 2, ";}
		if(scoutingauto.getTopLeftLvl1Ball()){str = str + "LL Lvl 1, ";}
		if(scoutingauto.getTopRightLvl3Ball()){str = str + "LR Lvl 3, ";}
		if(scoutingauto.getTopRightLvl2Ball()){str = str + "LR Lvl 2, ";}
		if(scoutingauto.getTopRightLvl1Ball()){str = str + "LR Lvl 1, ";}
		if(scoutingauto.getSpot1Ball()){str = str + "Spot 1, ";}
		if(scoutingauto.getSpot2Ball()){str = str + "Spot 2, ";}
		if(scoutingauto.getSpot3Ball()){str = str + "Spot 3, ";}
		if(scoutingauto.getSpot4Ball()){str = str + "Spot 4, ";}
		if(scoutingauto.getSpot5Ball()){str = str + "Spot 5, ";}
		if(scoutingauto.getSpot6Ball()){str = str + "Spot 6, ";}
		if(scoutingauto.getSpot7Ball()){str = str + "Spot 7, ";}
		if(scoutingauto.getSpot8Ball()){str = str + "Spot 8, ";}
		if(scoutingauto.getBottomLeftLvl3Ball()){str = str + "RL Lvl 3, ";}
		if(scoutingauto.getBottomLeftLvl2Ball()){str = str + "RL Lvl  2, ";}
		if(scoutingauto.getBottomLeftLvl1Ball()){str = str + "RL Lvl 1, ";}
		if(scoutingauto.getBottomRightLvl3Ball()){str = str + "RR Lvl 3, ";}
		if(scoutingauto.getBottomRightLvl2Ball()){str = str + "RR Lvl 2, ";}
		if(scoutingauto.getBottomRightLvl1Ball()){str = str + "RR Lvl 1, ";}
		
		if(str.equals("")){
  			return "none";
  		}
		return str;
	}
	
	//Counts up all of the true variables from scoutingauto for hatches
	private static int countHatchesAuto(){
		int count = 0;
		if(scoutingauto.getTopLeftLvl3Hatch()){count++;}
		if(scoutingauto.getTopLeftLvl2Hatch()){count++;}
		if(scoutingauto.getTopLeftLvl1Hatch()){count++;}
		if(scoutingauto.getTopRightLvl3Hatch()){count++;}
		if(scoutingauto.getTopRightLvl2Hatch()){count++;}
		if(scoutingauto.getTopRightLvl1Hatch()){count++;}
		if(scoutingauto.getSpot1Hatch()){count++;}
		if(scoutingauto.getSpot2Hatch()){count++;}
		if(scoutingauto.getSpot3Hatch()){count++;}
		if(scoutingauto.getSpot4Hatch()){count++;}
		if(scoutingauto.getSpot5Hatch()){count++;}
		if(scoutingauto.getSpot6Hatch()){count++;}
		if(scoutingauto.getSpot7Hatch()){count++;}
		if(scoutingauto.getSpot8Hatch()){count++;}
		if(scoutingauto.getBottomLeftLvl3Hatch()){count++;}
		if(scoutingauto.getBottomLeftLvl2Hatch()){count++;}
		if(scoutingauto.getBottomLeftLvl1Hatch()){count++;}
		if(scoutingauto.getBottomRightLvl3Hatch()){count++;}
		if(scoutingauto.getBottomRightLvl2Hatch()){count++;}
		if(scoutingauto.getBottomRightLvl1Hatch()){count++;}
		return count;
	}
	
	//Lists off all of the hatches the robot has done from scoutingauto
	private static String whichHatchesAuto() {
		String str = "";
		if(scoutingauto.getTopLeftLvl3Hatch()){str = str + "LL Lvl 3, ";}
		if(scoutingauto.getTopLeftLvl2Hatch()){str = str + "LL Lvl 2, ";}
		if(scoutingauto.getTopLeftLvl1Hatch()){str = str + "LL Lvl 1, ";}
		if(scoutingauto.getTopRightLvl3Hatch()){str = str + "LR Lvl 3, ";}
		if(scoutingauto.getTopRightLvl2Hatch()){str = str + "LR Lvl 2, ";}
		if(scoutingauto.getTopRightLvl1Hatch()){str = str + "LR Lvl 1, ";}
		if(scoutingauto.getSpot1Hatch()){str = str + "Spot 1, ";}
		if(scoutingauto.getSpot2Hatch()){str = str + "Spot 2, ";}
		if(scoutingauto.getSpot3Hatch()){str = str + "Spot 3, ";}
		if(scoutingauto.getSpot4Hatch()){str = str + "Spot 4, ";}
		if(scoutingauto.getSpot5Hatch()){str = str + "Spot 5, ";}
		if(scoutingauto.getSpot6Hatch()){str = str + "Spot 6, ";}
		if(scoutingauto.getSpot7Hatch()){str = str + "Spot 7, ";}
		if(scoutingauto.getSpot8Hatch()){str = str + "Spot 8, ";}
		if(scoutingauto.getBottomLeftLvl3Hatch()){str = str + "RL Lvl 3, ";}
		if(scoutingauto.getBottomLeftLvl2Hatch()){str = str + "RL Lvl 2, ";}
		if(scoutingauto.getBottomLeftLvl1Hatch()){str = str + "RL Lvl 1, ";}
		if(scoutingauto.getBottomRightLvl3Hatch()){str = str + "RR Lvl 3, ";}
		if(scoutingauto.getBottomRightLvl2Hatch()){str = str + "RR Lvl 2, ";}
		if(scoutingauto.getBottomRightLvl1Hatch()){str = str + "RR Lvl 1, ";}
		
		if(str.equals("")){
  			return "none";
  		}
		return str;

	}


	public static JFrame getFrame() {
		return frame;
	}
   }
	

