package guesAndGuessDemo;

/**
 * 人类玩家的数据:名字、语言、分数
 * 
 * @author 一本正经修仙
 * @version 1.0
 * @time 2018年6月10日下午2:33:57
 */
public class humanPlayer {

	/** 玩家名字 */
	private String playerName;
	/** 玩家分数 */
	private int score;

	/** 第一次出手时候的台词 && 定义消息类型为 */
	private final int messageFirst = 1;
	private String[] firstWord = { "吃我一拳", "吃我二拳", "吃我三拳", "吃我四拳", "吃我五拳" };

	/** 胜利的时候的台词 && 定义消息类型为 */
	private final int messageWin = 2;
	private String[] winWord = { "老子赢了x1", "老子赢了x2", "老子赢了x3", "老子赢了x4", "老子赢了x5", };

	/** 失败的时候的台词 && 定义消息类型为 */
	private final int messageLost = 3;
	private String[] lostWord = { "老子输了x1", "老子输了x2", "老子输了x3", "老子输了x4", "老子输了x5", };

	/**
	 * 选择发送消息类型
	 */
	public void sendMessage(int messageType) {
		int Index = (int) ((Math.random() * 1000) % 5);
		switch (messageType) {
		// 第一次出手发言
		case messageFirst:
			System.out.println(firstWord[Index]);
			break;
		// 获得胜利发言
		case messageWin:
			System.out.println(winWord[Index]);
			break;
		// 失败时的发言
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
