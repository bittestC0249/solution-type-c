package problem02;

public class MyService extends BaseService {

	@Override
	public void service(String state) {
		if(state.equals("오후")) {
			String result = afternoon();
			System.out.println(result);
		}else {
			super.service(state);
		}
	}

	@Override
	public String day() {
		// TODO Auto-generated method stub
		return "낮서비스시작";
	}

	@Override
	public String night() {
		// TODO Auto-generated method stub
		return "밤서비스시작";
	}
	
	public String afternoon() {
		return "오후서비스시작";
	}
}
