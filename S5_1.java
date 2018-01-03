package shiyan5_5_6;

interface ComputerWeight {
	public double computeWeight();
}

class Television implements ComputerWeight {

	public double computeWeight() {

		return 0;
	} // ʵ��computeWeight()������
}

class Computer implements ComputerWeight {

	public double computeWeight() {

		return 0;
	} // ʵ��computeWeight()������
}

class WashMachine implements ComputerWeight {

	public double computeWeight() {

		return 0;
	} // ʵ��computeWeight()������
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
      //����totalWeights
      return totalWeights;
   }
}

public class S5_1 {
	public static void main(String args[]) {
		//�����Զ�����goodsOne����Ϊ50��goodsTwo����Ϊ22
		ComputerWeight[] goodsOne = new ComputerWeight[50], goodsTwo = new ComputerWeight[22];
		for (int i = 0; i < goodsOne.length; i++) {
			if (i % 3 == 0)
				goodsOne[i] = new Television();					//����goodsOne������Ϊi��ģ3Ϊ0��ʵ����ΪTelevision
			else if (i % 3 == 1)
				goodsOne[i] = new Computer();					//����goodsOne������Ϊi��ģ3Ϊ1��ʵ����ΪComputer
			else if (i % 3 == 2)
				goodsOne[i] = new WashMachine();				//����goodsOne������Ϊi��ģ3Ϊ2��ʵ����ΪWashMachine
		}
		for (int i = 0; i < goodsTwo.length; i++) {
			if (i % 3 == 0)
				goodsTwo[i] = new Television();					//����goodsTwo������Ϊi��ģ3Ϊ0��ʵ����ΪTelevision
			else if (i % 3 == 1)
				goodsTwo[i] = new Computer();					//����goodsTwo������Ϊi��ģ3Ϊ1��ʵ����ΪComputer
			else if (i % 3 == 2)
				goodsTwo[i] = new WashMachine();				//����goodsTwo������Ϊi��ģ3Ϊ2��ʵ����ΪWashMachine
		}
		Car ����� = new Car(goodsOne);							//����Car��ı��������ʵ����ΪCar�ಢ��ֵ����goodsOne
		System.out.println("�����װ�صĻ�������:" + �����.getTotalWeights());
		Car С���� = new Car(goodsTwo);							//����Car��ı���С����ʵ����ΪCar�ಢ��ֵ����goodsTwo
		System.out.println("С����װ�صĻ�������:" + С����.getTotalWeights());
	}
}
