package zoukunhong.Exam_12758_20161229_1.entity;

import java.util.Date;

public class Language {
	private Integer language_id;
	private String name;
	private Date last_update;
	
	public Language() {
	}
	
	public Language(Integer language_id, String name, Date last_update) {
		super();
		this.language_id = language_id;
		this.name = name;
		this.last_update = last_update;
	}

	public Integer getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(Integer language_id) {
		this.language_id = language_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getlast_update() {
		return last_update;
	}
	public void setlast_update(Date last_update) {
		this.last_update = last_update;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((language_id == null) ? 0 : language_id.hashCode());
		result = prime * result + ((last_update == null) ? 0 : last_update.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Language other = (Language) obj;
		if (language_id == null) {
			if (other.language_id != null)
				return false;
		} else if (!language_id.equals(other.language_id))
			return false;
		if (last_update == null) {
			if (other.last_update != null)
				return false;
		} else if (!last_update.equals(other.last_update))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Language [language_id=" + language_id + ", name=" + name + ", last_update=" + last_update + "]";
	}
	
}
