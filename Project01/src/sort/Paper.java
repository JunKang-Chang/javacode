package sort;	//�Զ�������	ʵ��Comparable�ӿ��µ�compareTo����  ���ݷ�����ֵ����0,����0С��0��������ʽ



class Paper implements java.lang.Comparable<Paper> {
	private int click;
	private String content;
	
	public int getClick() {
		return click;
	}
	public void setClick(int click) {
		this.click = click;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public Paper(int click, String content) {
		super();
		this.click = click;
		this.content = content;
	}
	

	public int compareTo(Paper p){//���ȱȽϵ����,�����ͬ�Ƚ���������
		int result=-(this.click-p.click); //������������,�Ƚ�ֱ�����
		if (0 == result) {
			result = (this.content.compareTo(p.content)); //�������Ͳ��ܵ���compareTo����ֱ�ӱȽ�
			}
		
		return result;
	}
		

	public String toString() {
        return "�����:"+click+","+"����:"+content;
	}
            

}

