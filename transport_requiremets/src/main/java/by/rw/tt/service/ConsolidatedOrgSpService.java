package by.rw.tt.service;

import java.util.List;

import by.rw.tt.entity.sp.ConsolidatedOrgSP;

public interface ConsolidatedOrgSpService {
	
	List<ConsolidatedOrgSP> findAllConsolidatedOrgs();
	boolean isUnique(ConsolidatedOrgSP consolidatedOrgSP);
	void saveConsolidatedOrg(ConsolidatedOrgSP consolidatedOrgSP);

}
