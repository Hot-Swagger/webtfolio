package com.webtfolio.entity;

public class SkillView extends Skill{
	private long count;
	
	public SkillView() {
		// TODO Auto-generated constructor stub
	}

	public SkillView(String skillId, String description, long count) {
		super(skillId, description);
		this.count = count;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}
	
}
