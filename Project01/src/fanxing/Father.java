package fanxing;
/**
 * 
 泛型=泛化类型	  只能是引用类型		
 自定义泛型可能包含多种类型,在实例化时要替换成具体类型
 */
public abstract class Father<T1,T2> {
	T1 age;
	public abstract void test(T2 name);
}



//保留

class C1<T1,T2> extends Father<T1,T2>{			//子类全部保留自定义泛型
	@Override
	public void test(T2 name) {
		//this.age-->T1
	}
	
}	

class C2<T2> extends Father<Integer,T2>{		//子类部分保留自定义泛型
	@Override
	public void test(T2 name) {
		//this.age-->Integer
	}}





//不保留

class C3 extends Father<Integer,String>{		//具体类型
	@Override
	public void test(String name) {
	//	this.age-->Integer
	}}

class C4 extends Father{					//无类型,擦除
	@Override
	public void test(Object name) {
		//this.age-->Object
	}}
