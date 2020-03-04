package com.boardPrograms.web.board.service;

import com.boardPrograms.web.board.model.Params;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.boardPrograms.web.board.model.AccessVO;

@Repository
public interface AccessService {
	public List<AccessVO> getAccessList(final Params params);
	public List<AccessVO> listAccessList();
}

