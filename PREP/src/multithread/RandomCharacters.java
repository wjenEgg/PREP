package multithread;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RandomCharacters extends JFrame implements ActionListener {

	/**
	 * @param args
	 */
	private final static int SIZE = 3;
	private JCheckBox checkboxes[];
	private Lock lockObject = new ReentrantLock(true);
	private RunnableObject[] randomCharacters = new RunnableObject[SIZE];
	public RandomCharacters(){
		checkboxes = new JCheckBox[SIZE];
		setLayout(new GridLayout (SIZE, 2, 5, 5));
		ExecutorService runner = Executors.newFixedThreadPool(SIZE);
		for (int count = 0; count < SIZE; count++){
			JLabel outputJLabel = new JLabel();
			outputJLabel.setBackground(Color.GREEN);
			outputJLabel.setOpaque(true);
			add(outputJLabel);
			checkboxes[count] = new JCheckBox("Suspended");
			checkboxes[count].addActionListener(this);
			add(checkboxes[count]);
			randomCharacters[count] = new RunnableObject(lockObject, outputJLabel);
			runner.execute(randomCharacters[count]);
		}
		setSize(275, 90);
		setVisible(true);
		runner.shutdown();
	}
	public void actionPerformed(ActionEvent event){
		for (int count = 0; count< checkboxes.length;count++){
			if (event.getSource()==checkboxes[count])
				randomCharacters[count].toggle();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomCharacters application = new RandomCharacters();
		application.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
