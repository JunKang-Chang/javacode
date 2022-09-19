package sort;	//自定义排序	实现Comparable接口下的compareTo方法  根据返回数值大于0,等于0小于0决定排序方式



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
	

	public int compareTo(Paper p){//优先比较点击数,如果相同比较内容字数
		int result=-(this.click-p.click); //基本数据类型,比较直接相减
		if (0 == result) {
			result = (this.content.compareTo(p.content)); //引用类型才能调用compareTo方法直接比较
			}
		
		return result;
	}
		

	public String toString() {
        return "点击数:"+click+","+"内容:"+content;
	}
            

}

