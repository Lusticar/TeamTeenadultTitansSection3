package GameObject;

import java.io.Serializable;
import java.util.HashMap;

public class SaveData implements Serializable{

	private int saveId;
	private Players playerData;
	private HashMap<String, Items> itemList;
	private HashMap<String, Monsters> monsterList;
	private HashMap<String, Rooms> roomList;


	public SaveData(int saveId, Players playerData, HashMap<String, Items> itemList,
			HashMap<String, Monsters> monsterList, HashMap<String, Rooms> roomList) {
		super();
		this.saveId = saveId;
		this.playerData = playerData;
		this.itemList = itemList;
		this.monsterList = monsterList;
		this.roomList = roomList;
	}

	public int getSaveId() {
		return saveId;
	}

	public void setSaveId(int saveId) {
		this.saveId = saveId;
	}

	public Players getPlayerData() {
		return playerData;
	}

	public void setPlayerData(Players playerData) {
		this.playerData = playerData;
	}

	public HashMap<String, Items> getItemList() {
		return itemList;
	}

	public void setItemList(HashMap<String, Items> itemList) {
		this.itemList = itemList;
	}

	public HashMap<String, Monsters> getMonsterList() {
		return monsterList;
	}

	public void setMonsterList(HashMap<String, Monsters> monsterList) {
		this.monsterList = monsterList;
	}

	public HashMap<String, Rooms> getRoomList() {
		return roomList;
	}

	public void setRoomList(HashMap<String, Rooms> roomList) {
		this.roomList = roomList;
	}

}