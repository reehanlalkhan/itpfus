package org.itpfus.comRunner;

import org.itpfus.comAssignment.DecoyDuckWithAbstractKeyword;
import org.itpfus.comAssignment.DomesticDuckWithAbstract;
import org.itpfus.comAssignment.MallardDuckWithAbstractClass;
import org.itpfus.comAssignment.ParentDuck;

public class MainClass {

	public static void main(String[] args) {
//		ParentDuck duck= new ParentDuck();
		ParentDuck duck = new DomesticDuckWithAbstract();
		ParentDuck dc= new MallardDuckWithAbstractClass();
		ParentDuck pd= new DecoyDuckWithAbstractKeyword();
		
		duck.quack();
		duck.fly();
		duck.display();
		System.out.println("\n");
		dc.quack();
		dc.fly();
		dc.display();
		System.out.println("\n");
		pd.quack();
		pd.fly();
		pd.display();
		

	}

}
