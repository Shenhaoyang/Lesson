package shiyan5_5_6;

interface ComputerWeight {
	public double computeWeight();
}

class Television implements ComputerWeight {

	public double computeWeight() {

		return 0;
	} // 实现computeWeight()方法。
}

class Computer implements ComputerWeight {

	public double computeWeight() {

		return 0;
	} // 实现computeWeight()方法。
}

class WashMachine implements ComputerWeight {

	public double computeWeight() {

		return 0;
	} // 实现computeWeight()方法。
}

class Car {
	ComputerWeight[] goods;
	double totalWeights = 0;

	Car(ComputerWeight[] goods) {
		this.goods = goods;
	}

	public double getTotalWeights()
   {
      totalWeights=0;
      for(int i = 0; i<goods.length; i++) 
      {
    	  totalWeights = totalWeights + goods[i].computeWeight();
      }
      //计算totalWeights
      return totalWeights;
   }
}

public class S5_1 {
	public static void main(String args[]) {
		//创建自定数组goodsOne容量为50，goodsTwo容量为22
		ComputerWeight[] goodsOne = new ComputerWeight[50], goodsTwo = new ComputerWeight[22];
		for (int i = 0; i < goodsOne.length; i++) {
			if (i % 3 == 0)
				goodsOne[i] = new Television();					//数组goodsOne中索引为i的模3为0的实例化为Television
			else if (i % 3 == 1)
				goodsOne[i] = new Computer();					//数组goodsOne中索引为i的模3为1的实例化为Computer
			else if (i % 3 == 2)
				goodsOne[i] = new WashMachine();				//数组goodsOne中索引为i的模3为2的实例化为WashMachine
		}
		for (int i = 0; i < goodsTwo.length; i++) {
			if (i % 3 == 0)
				goodsTwo[i] = new Television();					//数组goodsTwo中索引为i的模3为0的实例化为Television
			else if (i % 3 == 1)
				goodsTwo[i] = new Computer();					//数组goodsTwo中索引为i的模3为1的实例化为Computer
			else if (i % 3 == 2)
				goodsTwo[i] = new WashMachine();				//数组goodsTwo中索引为i的模3为2的实例化为WashMachine
		}
		Car 大货车 = new Car(goodsOne);							//定义Car类的变量大货车实例化为Car类并传值数组goodsOne
		System.out.println("大货车装载的货物重量:" + 大货车.getTotalWeights());
		Car 小货车 = new Car(goodsTwo);							//定义Car类的变量小货车实例化为Car类并传值数组goodsTwo
		System.out.println("小货车装载的货物重量:" + 小货车.getTotalWeights());
	}
}
