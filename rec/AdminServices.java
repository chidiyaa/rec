package com.example.Recruitiment;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AdminServices {
@Autowired
CandidatePersonalDAO candidatePersonalDao;

@Autowired
CandidateQualificationsDAO candidateQualificationDao;

@Autowired
CandidateWorkHistoryDAO candidateWorkHistoryDAO;

@Autowired
PlacedCandidatesDAO placedCandidatesDao;

@Autowired
CompanyMasterDAO companyMasterDao;

@GetMapping("/placedmonth/{month}")
public ArrayList<String> placedCountMonth(@PathVariable("month") String month) throws RecruitmentException {
	List<PlacedCandidates> placedCandidateList=placedCandidatesDao.findAll();
	List<CandidatePersonal>  candidateList=candidatePersonalDao.findAll();
	ArrayList<String> placedNames=new ArrayList<>();
	for(PlacedCandidates placedCandidate:placedCandidateList)
	{
		if(month.equalsIgnoreCase(placedCandidate.getMonth()))
		{
			for(CandidatePersonal candidate:candidateList)
			{
				if(candidate.getCandidateId().equals(placedCandidate.getCandidateId()))
				{
					placedNames.add(candidate.getCandidateName());
				}
			}
		}
	}
return placedNames;
}
	




}
