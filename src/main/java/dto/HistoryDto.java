package dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class HistoryDto {
	
	private int id;         // 번호
    private double lnt;     // X좌표
    private double lat;     // Y좌표
    private Date srcDttm;   // 조회일자

    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLnt() {
		return lnt;
	}
	public void setLnt(double lnt) {
		this.lnt = lnt;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public Date getSrcDttm() {
		return srcDttm;
	}
	public void setSrcDttm(Date srcDttm) {
		this.srcDttm = srcDttm;
	}
}
	
