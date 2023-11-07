package dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BookmarkDto {
	private int id;             // 번호
    private int gId;            // 북마크 그룹 번호
    private String mgrNo;       // 와이파이 관리 번호
    private Date regDttm;       // 등록일자
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public String getMgrNo() {
		return mgrNo;
	}
	public void setMgrNo(String mgrNo) {
		this.mgrNo = mgrNo;
	}
	public Date getRegDttm() {
		return regDttm;
	}
	public void setRegDttm(Date regDttm) {
		this.regDttm = regDttm;
	}
	
}
