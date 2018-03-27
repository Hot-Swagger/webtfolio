package com.webtfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.webtfolio.dao.NoteDao;
import com.webtfolio.entity.Note;

public class NoteService {

	@Autowired
	private NoteDao noteDao;
	
	public List<Note> getNoteList(Integer page) {
		
		//noteDao = new MyBatisNoteDao();
		
		return noteDao.getList(page);
	}

	public Note getNote(Integer id) {
		
		//noteDao = new MyBatisNoteDao()();
		
		return noteDao.get(id);
	}
	
}
