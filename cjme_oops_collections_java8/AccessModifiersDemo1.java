public class AccessModifiersDemo1{
		private int a=20;
		int b=25;
		protected int c=30;
		public int d=40;
		
		public static void main(String args[]){
			AccessModifiersDemo1 accessDemo1 = new AccessModifiersDemo1();
			System.out.println("private: " +accessDemo1.a);
			System.out.println("default/package: " +accessDemo1.b);
			System.out.println("protected: " +accessDemo1.c);
			System.out.println("public: " +accessDemo1.d);
		}
}