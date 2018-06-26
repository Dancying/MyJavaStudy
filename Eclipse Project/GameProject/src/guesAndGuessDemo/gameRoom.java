package guesAndGuessDemo;

import java.util.Scanner;

/**
 * ��Ϸ����:����ID�����롢��ɫ�����С�����
 * 
 * @author һ����������
 * @version 1.0
 * @time 2018��6��12������9:55:06
 */
public class gameRoom {
	public static Scanner input = new Scanner(System.in);
	/** ʵ���� */
	humanPlayer humanPlayer = new humanPlayer();
	comPlayer comPlayer = new comPlayer();

	/** ����ID */
	private long id;
	/** �������� */
	private int passwd;
	/** ���� */
	private int judge;
	/** ���� */
	private int score;
	
//	public String[] computerName = { "����1", "����2", "����3", "����4", "����5"};

	/**
	 * ��ʼ��Ϸ
	 */
	public void startGame() {
		startAction();
		// �������� && ��ɫȷ��
		roomAndRoles();
		// ������ȭ

		do {
			gameBody();
			System.out.println();
			if (humanPlayer.getScore() <= -20 || comPlayer.getScore() <= -20) {
				break;
			}
		} while (true);
		
		System.out.println("��Ϸ����!");
		System.out.println(humanPlayer.getPlayerName() + ":" + humanPlayer.getScore() + 
				"\t\t" + comPlayer.getComputerName() + ":" + comPlayer.getScore());
	}

	private void gameBody() {
		// 1����ҳ�ȭ
		System.out.print("����:");
		System.out.println("1������\t2��ʯͷ\t3����");
		System.out.print("��ѡ��:");
		int humanFist = input.nextInt();
		// 2�����Գ�ȭ
		int comFist = (int) ((Math.random() * 1000) % 3 + 1);

		// ʤ������
		setJudge(humanFist, comFist);
		//System.out.println(getJudge());
		//ʤ����Ϣ����==>������Ϣ 	&& ���ֱ仯
		if (getJudge() == -1) {
			System.out.println(humanPlayer.getPlayerName() + "ʤ����");
			humanPlayer.setScore(humanPlayer.getScore() + 6);
			comPlayer.setScore(comPlayer.getScore() - 6);
			humanPlayer.sendMessage(1);
			humanPlayer.sendMessage(2);
			System.out.println("��ҷ�����" + humanPlayer.getScore() + "\t���Է���" + comPlayer.getScore());
		}else if (getJudge() == 1) {
			humanPlayer.setScore(humanPlayer.getScore() - 6);
			comPlayer.setScore(comPlayer.getScore() + 6);
			System.out.println(comPlayer.getComputerName() + "ʤ����");
			comPlayer.sendMessage(1);
			comPlayer.sendMessage(2);
			System.out.println("��ҷ�����" + humanPlayer.getScore() + "\t���Է���" + comPlayer.getScore());
		}		
	
	}

	/**
	 * ʤ���ж�
	 * 
	 * @param playFist
	 *            ��ҵĳ�ȭ
	 * @param comFist
	 *            ���Եĳ�ȭ
	 * @return ����-1���ʤ������0ƽ�֣�����1����ʤ��
	 */
	private int setJudge(int playFist, int comFist) {
		// ���ʤ�������
		boolean isPlayWin = (playFist == 1 && comFist == 2) || (playFist == 2 && comFist == 3)
				|| (playFist == 3 && comFist == 1);
		// ƽ�ֵ����
		// boolean isFlat = playFist == comFist;
		// ����ʤ�������
		boolean isComWin = (comFist == 1 && playFist == 2) || (comFist == 2 && playFist == 3)
				|| (comFist == 3 && playFist == 1);

		if (isPlayWin) {
			System.out.println(humanPlayer.getPlayerName() + "VS" + comPlayer.getComputerName());
			System.out.println(humanPlayer.getPlayerName() + "ʤ��");
			this.judge = -1;
		} else if (isComWin) {
			System.out.println(humanPlayer.getPlayerName() + "VS" + comPlayer.getComputerName());
			System.out.println(comPlayer.getComputerName() + "ʤ��");
			this.judge = 1;
		} else {
			System.out.println("ƽ�֣�");
			this.judge = 0;
		}
		return judge;
	}

	/**
	 * �������ú�����ѡ��
	 */
	private void roomAndRoles() {
		System.out.print("���÷���ID:");
		setId(input.nextLong());
		System.out.print("���÷�������:");
		setPasswd(input.nextInt());
//		System.out.println();

		// ����Զ�����
		System.out.print("��������ǳ�:");
		humanPlayer.setPlayerName(input.next());
		// VS ����

		String[] computerName = { "����1", "����2", "����3", "����4", "����5"};
		System.out.print("��ս���:");
		System.out.print("1.����1\t2.����2\t3.����3\t4.����4\t5.����5");
		System.out.print("\n��ѡ��:");
		int Index = input.nextInt();
		comPlayer.setComputerName(computerName[Index - 1]);
		System.out.println("\n" + humanPlayer.getPlayerName() + "	VS	" + comPlayer.getComputerName());
	}

	/**
	 * ��Ϸ�������
	 */
	private void startAction() {
		System.out.println("������...");
		for (int i = 0; i < 30; i++) {
			System.out.print("*");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("\t����ɹ�!");
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPasswd() {
		return passwd;
	}

	public void setPasswd(int passwd) {
		this.passwd = passwd;
	}

	public int getJudge() {
		return judge;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
