package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearL implements ActionListener {
	private Master math;
	public ClearL(Master mat) {
		this.math = mat;
	}
	public void actionPerformed(ActionEvent e) {
		math.DoClear();
	}
}