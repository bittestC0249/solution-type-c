package problem03;

public class MyStack {
	
	private String[] buffer;
	private int idx;

	public MyStack( int size ) {
		buffer = new String[size];
	}
	
	public void push(String item) {
		if((size()-1) == idx) {
			setStack(size());
		}
		buffer[addIdx()] = item;
	}

	public String pop() {
		return buffer[subIdx()];
	}

	public boolean isEmpty() {
		return this.idx < 0;
	}
	
	public int size() {
		return buffer.length;
	}
	private int addIdx() {
		int result = idx;
		idx ++;
		return result;
	}
	private int subIdx() {
		int result = idx;
		idx --;
		return result;
	}
	private void setStack(int size) {
		String[] newbuffer = new String[size+1];
		for(int i=0;i<buffer.length;i++) {
			newbuffer[i] = buffer[i];
		}
		buffer = newbuffer;
	}
}