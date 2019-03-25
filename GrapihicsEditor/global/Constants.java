package global;




import shape.Ellipce;
import shape.Line;
import shape.Rectangle;
import shape.Select;
import shape.Shape;


public class Constants {
	
	public enum EMainFrame {
		x(200),
		y(100),
		w(400),
		h(600)
		;
		private int value;
		private EMainFrame(int value) {
			this.value = value;
		}
		public int getValue() {
			return this.value;
		}
		
	}
	public enum EToolBar{
		select("���θ����", new Select()),
		rectangle("�׸�", new Rectangle()),
		elipse("���׶��",  new Ellipce()),
		line("��",  new Line())
		;
		private String text;
		private Shape shape;
		private EToolBar(String text, Shape shape) {
			this.text = text;
			this.shape = shape;
		}
		public String getText() {
			return this.text;
		}
		public Shape getshape() {
			return this.shape;
		}
	}
	public enum EMenu {
		filemenu("����"),
		editMenu("Edit"),
		;
		private String text;
		private EMenu(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
	}
	public enum EFileMenu{
		newItem("���θ����"),
		openItem("Edit"),
		;
		private String text;
		private EFileMenu(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
	}
	
}
