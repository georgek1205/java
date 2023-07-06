package test;

public class Test01 {

	public static void main(String[] args) {

		int[][] scores = {
			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
			    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
			};

		//문제1
		for(int i = 0; i < scores.length; i++)
		{
			int sum = 0;
			for(int j = 0; j < scores[i].length; j++)
			{
				sum += scores[i][j];
			}
			System.out.println((i + 1) + "번째 학생의 평균 : " + sum / (double)scores[i].length);
		}
		System.out.println("");
		//문제2
		for(int i = 0; i < scores.length; i++)
		{
			int max = scores[i][0];	
			for(int j = 1; j < scores[i].length; j++)
			{
				 if(scores[i][j] > max)
				 {
					 max = scores[i][j];
				 }
			}
			System.out.println((i + 1) + "번째 학생의 최고점  " + max);
		}
		
		//문제3
		double [] average_max = new double[5];
		double highest = average_max[0];
		for(int i = 0; i < scores.length; i++)
		{
			int sum = 0;
			for(int j = 0; j < scores[i].length; j++)
			{
				sum += scores[i][j];
			}
			average_max[i] = sum/(double)scores[i].length;
		}
		for(int i = 1; i < average_max.length; i++)
		{
			if(average_max[i] > highest)
			{
				highest = average_max[i];
			}
		}
		for(int i = 0; i < average_max.length; i++)
		{
			if(average_max[i] == highest)
			{
				System.out.println("평균이 가장 높은 학생 : " + (i+1) + "번째 학생\n" + "평균 : " + highest);
			}
		}
		System.out.println();
		//문제4
		int max = scores[0][4];
		for(int i = 0; i < scores.length; i++)
		{
			if(scores[i][4] > max)
			{
				max = scores[i][4];
			}
		}
		for(int i = 0; i < scores.length; i++)
		{
			for(int j = 0; j < scores[i].length; j++)
			{
				if(scores[i][j] == max)
				{
					System.out.println("index 4 과목의 최고 성적자는 " + i +"번째 학생\n점수 : " + max);
				}
			}
		}
		System.out.println();
		//문제5
		double[] rangemax = new double[scores.length];
		double highest_inrange = rangemax[0];
		for(int i = 0; i < scores.length; i++)
		{
			int sum_inrange = 0;
			for(int j = 3; j < 8; j++)
			{
				sum_inrange += scores[i][j];
			}
			rangemax[i] = sum_inrange/5.0;
		}
		for(int i = 1; i < rangemax.length; i++)
		{
			if(rangemax[i] > highest_inrange)
			{
				highest_inrange = rangemax[i];
			}
		}
		for(int i = 0; i < rangemax.length; i++)
		{
			if(rangemax[i] == highest_inrange)
			{
				System.out.println("평균이 가장 높은 학생 :  " + i + "번 index\n평균 : " + highest_inrange);
			}
		}
		
		//포문을 여러개 쓰지말고, 그냥 아에 마지막 반복까지 최대값을 찾고, 그 최대값과 그 인덱스도같이 저장하자.  그러면 더 간결하게 코드가 가능. 즉, 한개의 중첩 포문으로 최대 최소 구현가능.
	}

}
