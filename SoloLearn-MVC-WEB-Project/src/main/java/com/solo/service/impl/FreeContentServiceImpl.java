package com.solo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solo.entity.FreeContent;
import com.solo.repo.IFreeContentRepo;
import com.solo.service.IFreeContentService;

@Service
public class FreeContentServiceImpl implements IFreeContentService {

	@Autowired
	private IFreeContentRepo contentRepo;

	@Override
	public FreeContent saveContent(FreeContent content) {

		return contentRepo.save(content);

	}

	@Override
	public List<FreeContent> getAllFreeContent() {

		return contentRepo.findAll();
	}

}
