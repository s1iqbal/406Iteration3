import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.BoxLayout;


public class EditReportPanel extends JPanel {
	HomeLibrary library;
	
	public EditReportPanel(HomeLibrary library) {
		this.library=library;
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JList list_1 = new JList();
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"test", "test"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		add(list_1);
		
		JRadioButton radioButton = new JRadioButton("New radio button");
		add(radioButton);
		
	}
}
