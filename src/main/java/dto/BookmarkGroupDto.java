package dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BookmarkGroupDto {
	private int id;            
    private String name;        // 그룹명
    private int seq;            // 순서
    private Date regDttm;       // 등록일자
    private Date uptDttm;       // 수정일자
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public Date getRegDttm() {
		return regDttm;
	}
	public void setRegDttm(Date regDttm) {
		this.regDttm = regDttm;
	}
	public Date getUptDttm() {
		return uptDttm;
	}
	public void setUptDttm(Date uptDttm) {
		this.uptDttm = uptDttm;
	}
	
}
