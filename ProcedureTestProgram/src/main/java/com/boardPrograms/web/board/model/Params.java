
package com.boardPrograms.web.board.model;

import java.util.HashMap;
import java.util.List;

public class Params {
	private String sWorkSect;
	private String sGRPVDN;
	private String sCallListName;
	private String sPreNext;
	private int iSequence;
	private String sFieldName;
	private String sAccount;
	private String sText;
	private String sFilterSect;
	private List<AccessVO> refResult;	
	
	public String getsWorkSect() {
		return sWorkSect;
	}
	public void setsWorkSect(String sWorkSect) {
		this.sWorkSect = sWorkSect;
	}
	public String getsGRPVDN() {
		return sGRPVDN;
	}
	public void setsGRPVDN(String sGRPVDN) {
		this.sGRPVDN = sGRPVDN;
	}
	public String getsCallListName() {
		return sCallListName;
	}
	public void setsCallListName(String sCallListName) {
		this.sCallListName = sCallListName;
	}
	public String getsPreNext() {
		return sPreNext;
	}
	public void setsPreNext(String sPreNext) {
		this.sPreNext = sPreNext;
	}
	public int getiSequence() {
		return iSequence;
	}
	public void setiSequence(int iSequence) {
		this.iSequence = iSequence;
	}
	public String getsFieldName() {
		return sFieldName;
	}
	public void setsFieldName(String sFieldName) {
		this.sFieldName = sFieldName;
	}
	public String getsAccount() {
		return sAccount;
	}
	public void setsAccount(String sAccount) {
		this.sAccount = sAccount;
	}
	public String getsText() {
		return sText;
	}
	public void setsText(String sText) {
		this.sText = sText;
	}
	public String getsFilterSect() {
		return sFilterSect;
	}
	public void setsFilterSect(String sFilterSect) {
		this.sFilterSect = sFilterSect;
	}
	public List<AccessVO> getRefResult() {
		return refResult;
	}
	public void setRefResult(List<AccessVO> refResult) {
		this.refResult = refResult;
	}
	
	
	
	
}
