package chap9.anonymous.implement;

public class Button {
	OnClickListener listener;
	
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}
}
