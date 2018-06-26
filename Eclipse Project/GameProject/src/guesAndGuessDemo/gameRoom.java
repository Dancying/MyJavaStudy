package guesAndGuessDemo;

import java.util.Scanner;

/**
 * 游戏房间:房间ID、密码、角色、裁判、积分
 * 
 * @author 一本正经修仙
 * @version 1.0
 * @time 2018年6月12日下午9:55:06
 */
public class gameRoom {
	public static Scanner input = new Scanner(System.in);
	/** 实例化 */
	humanPlayer humanPlayer = new humanPlayer();
	comPlayer comPlayer = new comPlayer();

	/** 房间ID */
	private long id;
	/** 房间密码 */
	private int passwd;
	/** 裁判 */
	private int judge;
	/** 积分 */
	private int score;
	
//	public String[] computerName = { "电脑1", "电脑2", "电脑3", "电脑4", "电脑5"};

	/**
	 * 开始游戏
	 */
	public void startGame() {
		startAction();
		// 房间设置 && 角色确定
		roomAndRoles();
		// 轮流出拳

		do {
			gameBody();
			System.out.println();
			if (humanPlayer.getScore() <= -20 || comPlayer.getScore() <= -20) {
				break;
			}
		} while (true);
		
		System.out.println("游戏结束!");
		System.out.println(humanPlayer.getPlayerName() + ":" + humanPlayer.getScore() + 
				"\t\t" + comPlayer.getComputerName() + ":" + comPlayer.getScore());
	}

	private void gameBody() {
		// 1、玩家出拳
		System.out.print("招数:");
		System.out.println("1、剪刀\t2、石头\t3、布");
		System.out.print("请选择:");
		int humanFist = input.nextInt();
		// 2、电脑出拳
		int comFist = (int) ((Math.random() * 1000) % 3 + 1);

		// 胜负较量
		setJudge(humanFist, comFist);
		//System.out.println(getJudge());
		//胜负信息回馈==>发送消息 	&& 积分变化
		if (getJudge() == -1) {
			System.out.println(humanPlayer.getPlayerName() + "胜利！");
			humanPlayer.setScore(humanPlayer.getScore() + 6);
			comPlayer.setScore(comPlayer.getScore() - 6);
			humanPlayer.sendMessage(1);
			humanPlayer.sendMessage(2);
			System.out.println("玩家分数：" + humanPlayer.getScore() + "\t电脑分数" + comPlayer.getScore());
		}else if (getJudge() == 1) {
			humanPlayer.setScore(humanPlayer.getScore() - 6);
			comPlayer.setScore(comPlayer.getScore() + 6);
			System.out.println(comPlayer.getComputerName() + "胜利！");
			comPlayer.sendMessage(1);
			comPlayer.sendMessage(2);
			System.out.println("玩家分数：" + humanPlayer.getScore() + "\t电脑分数" + comPlayer.getScore());
		}		
	
	}

	/**
	 * 胜负判断
	 * 
	 * @param playFist
	 *            玩家的出拳
	 * @param comFist
	 *            电脑的出拳
	 * @return 返回-1玩家胜；返回0平局；返回1电脑胜。
	 */
	private int setJudge(int playFist, int comFist) {
		// 玩家胜利的情况
		boolean isPlayWin = (playFist == 1 && comFist == 2) || (playFist == 2 && comFist == 3)
				|| (playFist == 3 && comFist == 1);
		// 平局的情况
		// boolean isFlat = playFist == comFist;
		// 电脑胜利的情况
		boolean isComWin = (comFist == 1 && playFist == 2) || (comFist == 2 && playFist == 3)
				|| (comFist == 3 && playFist == 1);

		if (isPlayWin) {
			System.out.println(humanPlayer.getPlayerName() + "VS" + comPlayer.getComputerName());
			System.out.println(humanPlayer.getPlayerName() + "胜利");
			this.judge = -1;
		} else if (isComWin) {
			System.out.println(humanPlayer.getPlayerName() + "VS" + comPlayer.getComputerName());
			System.out.println(comPlayer.getComputerName() + "胜利");
			this.judge = 1;
		} else {
			System.out.println("平局！");
			this.judge = 0;
		}
		return judge;
	}

	/**
	 * 房间设置和人物选择
	 */
	private void roomAndRoles() {
		System.out.print("设置房间ID:");
		setId(input.nextLong());
		System.out.print("设置房间密码:");
		setPasswd(input.nextInt());
//		System.out.println();

		// 玩家自定名字
		System.out.print("输入玩家昵称:");
		humanPlayer.setPlayerName(input.next());
		// VS 电脑

		String[] computerName = { "电脑1", "电脑2", "电脑3", "电脑4", "电脑5"};
		System.out.print("对战玩家:");
		System.out.print("1.电脑1\t2.电脑2\t3.电脑3\t4.电脑4\t5.电脑5");
		System.out.print("\n请选择:");
		int Index = input.nextInt();
		comPlayer.setComputerName(computerName[Index - 1]);
		System.out.println("\n" + humanPlayer.getPlayerName() + "	VS	" + comPlayer.getComputerName());
	}

	/**
	 * 游戏载入界面
	 */
	private void startAction() {
		System.out.println("载入中...");
		for (int i = 0; i < 30; i++) {
			System.out.print("*");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("\t载入成功!");
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
