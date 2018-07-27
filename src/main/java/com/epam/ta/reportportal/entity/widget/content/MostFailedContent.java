package com.epam.ta.reportportal.entity.widget.content;

import javax.persistence.Column;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import static com.epam.ta.reportportal.dao.WidgetContentRepositoryConstants.*;

public class MostFailedContent implements Serializable {

	@Column(name = "unique_id")
	private String uniqueId;

	@Column(name = "name")
	private String name;

	@Column(name = TOTAL)
	private Long total;

	@Column(name = CRITERIA)
	private Long criteria;

	@Column(name = STATUS_HISTORY)
	private List<String> status;

	@Column(name = START_TIME_HISTORY)
	private List<LocalDateTime> startTime;

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Long getCriteria() {
		return criteria;
	}

	public void setCriteria(Long criteria) {
		this.criteria = criteria;
	}

	public List<String> getStatus() {
		return status;
	}

	public void setStatus(List<String> status) {
		this.status = status;
	}

	public List<LocalDateTime> getStartTime() {
		return startTime;
	}

	public void setStartTime(List<LocalDateTime> startTime) {
		this.startTime = startTime;
	}
}