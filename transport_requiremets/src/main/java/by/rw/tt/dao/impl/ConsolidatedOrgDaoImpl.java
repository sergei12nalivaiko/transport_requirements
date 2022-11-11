package by.rw.tt.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import by.rw.tt.dao.AbstractDao;
import by.rw.tt.dao.ConsolidatedOrgDao;
import by.rw.tt.entity.sp.ConsolidatedOrgSP;

@Stateless
public class ConsolidatedOrgDaoImpl extends AbstractDao implements ConsolidatedOrgDao{

	@Override
	public List<ConsolidatedOrgSP> findAllConsolidatedOrgs() {
		CriteriaBuilder cb = emIb23.getCriteriaBuilder();
		CriteriaQuery<ConsolidatedOrgSP> cq = cb.createQuery(ConsolidatedOrgSP.class);
		Root<ConsolidatedOrgSP> org = cq.from(ConsolidatedOrgSP.class);
		cq.select(org);
		return emIb23.createQuery(cq).getResultList();
	}

	@Override
	public boolean isUnique(ConsolidatedOrgSP consolidatedOrgSP) {
		CriteriaBuilder criteriaBuilder = emIb23.getCriteriaBuilder();
		CriteriaQuery<ConsolidatedOrgSP> cq = criteriaBuilder.createQuery(ConsolidatedOrgSP.class);
		Root<ConsolidatedOrgSP> from = cq.from(ConsolidatedOrgSP.class);
		cq.select(from);
		Predicate predicate1 = criteriaBuilder.equal(from.get("consOrgNum"), consolidatedOrgSP.getConsOrgNum());
		cq.where(predicate1);
		return emIb23.createQuery(cq).getResultList().isEmpty();
	}

	@Override
	public void saveConsolidatedOrg(ConsolidatedOrgSP consolidatedOrgSP) {
		emIb23.persist(consolidatedOrgSP);	
	}
	
	
	
	

}
