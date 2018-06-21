package guesAndGuessDemo;

/**
 * ������ҵ�����:���֡����ԡ�����
 * 
 * @author һ����������
 * @version 1.0
 * @time 2018��6��10������2:33:57
 */
public class comPlayer {

	/** �������� */
	private String computerName;
	/** ���Է��� */
	private int score;

	/** ��һ�γ���ʱ���̨�� && ������Ϣ����Ϊ */
	private final int messageFirst = 1;
	private String[] firstWord = { "����һȭ =>from computer", "���Ҷ�ȭ =>from computer", "������ȭ =>from computer",
			"������ȭ =>from computer", "������ȭ =>from computer" };

	/** ʤ����ʱ���̨�� && ������Ϣ���� */
	private final int messageWin = 2;
	private String[] winWord = { "����Ӯ��x1 =>from computer", "����Ӯ��x2 =>from computer", "����Ӯ��x3 =>from computer",
			"����Ӯ��x4 =>from computer", "����Ӯ��x5 =>from computer", };

	/** ʧ�ܵ�ʱ���̨�� && ������Ϣ����Ϊ */
	private final int messageLost = 3;
	private String[] lostWord = { "��������x1 =>from computer", "��������x2 =>from computer", "��������x3 =>from computer",
			"��������x4 =>from computer", "��������x5 =>from computer", };

	/**
	 * ѡ������Ϣ
	 */
	public void sendMessage(int messageType) {
		int Index = (int) ((Math.random() * 1000) % 5);
		switch (messageType) {
		case messageFirst:
			System.out.println(firstWord[Index]);
			break;
		case messageWin:
			System.out.println(winWord[Index]);
			break;
		case messageLost:
			System.out.println(lostWord[Index]);
			break;
		}

	}

	public String getComputerName() {
		return computerName;
	}

	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
