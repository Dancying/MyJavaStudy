package guesAndGuessDemo;

/**
 * ������ҵ�����:���֡����ԡ�����
 * 
 * @author һ����������
 * @version 1.0
 * @time 2018��6��10������2:33:57
 */
public class humanPlayer {

	/** ������� */
	private String playerName;
	/** ��ҷ��� */
	private int score;

	/** ��һ�γ���ʱ���̨�� && ������Ϣ����Ϊ */
	private final int messageFirst = 1;
	private String[] firstWord = { "����һȭ", "���Ҷ�ȭ", "������ȭ", "������ȭ", "������ȭ" };

	/** ʤ����ʱ���̨�� && ������Ϣ����Ϊ */
	private final int messageWin = 2;
	private String[] winWord = { "����Ӯ��x1", "����Ӯ��x2", "����Ӯ��x3", "����Ӯ��x4", "����Ӯ��x5", };

	/** ʧ�ܵ�ʱ���̨�� && ������Ϣ����Ϊ */
	private final int messageLost = 3;
	private String[] lostWord = { "��������x1", "��������x2", "��������x3", "��������x4", "��������x5", };

	/**
	 * ѡ������Ϣ����
	 */
	public void sendMessage(int messageType) {
		int Index = (int) ((Math.random() * 1000) % 5);
		switch (messageType) {
		// ��һ�γ��ַ���
		case messageFirst:
			System.out.println(firstWord[Index]);
			break;
		// ���ʤ������
		case messageWin:
			System.out.println(winWord[Index]);
			break;
		// ʧ��ʱ�ķ���
		case messageLost:
			System.out.println(lostWord[Index]);
			break;
		}

	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
