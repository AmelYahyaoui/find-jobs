package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.cg.freelanceapp.dto.JobDTO;
import com.cg.freelanceapp.entities.Job;

@Repository
public interface IJobService {

	void close(Long id);

	Job findById(Long id);
	
	List<Object> findJobsBySkillName(String name);
	
	List<Object> findAll();
	
	List<Object> findAllActiveJobs();
	
	Job postJob(JobDTO jobDto);
	
	void awardJob(Long jobId, Long freelancerId);
}
