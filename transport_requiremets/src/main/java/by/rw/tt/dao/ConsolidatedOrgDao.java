package by.rw.tt.dao;

import java.util.List;

import by.rw.tt.entity.sp.ConsolidatedOrgSP;

public interface ConsolidatedOrgDao {

	List<ConsolidatedOrgSP> findAllConsolidatedOrgs();
	boolean isUnique(ConsolidatedOrgSP consolidatedOrgSP);
	void saveConsolidatedOrg(ConsolidatedOrgSP consolidatedOrgSP);
}
