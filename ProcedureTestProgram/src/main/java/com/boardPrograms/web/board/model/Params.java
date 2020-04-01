
package com.boardPrograms.web.board.model;

import java.util.List;

public class Params {
	private String sWorkSect;
	private String CampStatID;
	private String CallListName;
	private String PreNext;
	private int Sequence;
	private String FieldName;
	private String Account;
	private String Text;
	private String FilterSect;
	private List<AccessVO> refResult;
	
	public String getsWorkSect() {
		return sWorkSect;
	}
	public void setsWorkSect(String sWorkSect) {
		this.sWorkSect = sWorkSect;
	}
	public String getCampStatID() {
		return CampStatID;
	}
	public void setCampStatID(String CampStatID) {
		this.CampStatID = CampStatID;
	}
	public String getCallListName() {
		return CallListName;
	}
	public void setCallListName(String callListName) {
		CallListName = callListName;
	}
	public String getPreNext() {
		return PreNext;
	}
	public void setPreNext(String preNext) {
		PreNext = preNext;
	}
	public int getSequence() {
		return Sequence;
	}
	public void setSequence(int sequence) {
		Sequence = sequence;
	}
	public String getFieldName() {
		return FieldName;
	}
	public void setFieldName(String fieldName) {
		FieldName = fieldName;
	}
	public String getAccount() {
		return Account;
	}
	public void setAccount(String account) {
		Account = account;
	}
	public String getText() {
		return Text;
	}
	public void setText(String text) {
		Text = text;
	}
	public String getFilterSect() {
		return FilterSect;
	}
	public void setFilterSect(String filterSect) {
		FilterSect = filterSect;
	}
	public List<AccessVO> getRefResult() {
		return refResult;
	}
	public void setRefResult(List<AccessVO> refResult) {
		this.refResult = refResult;
	}
	
	
}
