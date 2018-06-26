package guesAndGuessDemo;

/**
 * 电脑玩家的数据:名字、语言、分数
 * 
 * @author 一本正经修仙
 * @version 1.0
 * @time 2018年6月10日下午2:33:57
 */
public class comPlayer {

	/** 电脑名字 */
	private String computerName;
	/** 电脑分数 */
	private int score;

	/** 第一次出手时候的台词 && 定义消息类型为 */
	private final int messageFirst = 1;
	private String[] firstWord = { "吃我一拳 =>from computer", "吃我二拳 =>from computer", "吃我三拳 =>from computer",
			"吃我四拳 =>from computer", "吃我五拳 =>from computer" };

	/** 胜利的时候的台词 && 定义消息类型 */
	private final int messageWin = 2;
	private String[] winWord = { "老子赢了x1 =>from computer", "老子赢了x2 =>from computer", "老子赢了x3 =>from computer",
			"老子赢了x4 =>from computer", "老子赢了x5 =>from computer", };

	/** 失败的时候的台词 && 定义消息类型为 */
	private final int messageLost = 3;
	private String[] lostWord = { "老子输了x1 =>from computer", "老子输了x2 =>from computer", "老子输了x3 =>from computer",
			"老子输了x4 =>from computer", "老子输了x5 =>from computer", };

	/**
	 * 选择发送消息
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
