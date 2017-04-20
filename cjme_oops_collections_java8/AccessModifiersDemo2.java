public class AccessModifiersDemo2{		
		public static void main(String args[]){
			AccessModifiersDemo1 accessDemo1 = new AccessModifiersDemo1();
			
			//error: a has private access in AccessModifiersDemo1
			//System.out.println("private: " +accessDemo1.a);
			
			System.out.println("default/package: " +accessDemo1.b);
			System.out.println("protected: " +accessDemo1.c);
			System.out.println("public: " +accessDemo1.d);
		}
}