package by.rw.tt.service.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import by.rw.tt.dao.ArminoDao;
import by.rw.tt.entity.expestdb.Armino;
import by.rw.tt.service.ArminoService;

@Stateless
public class ArminoServiceImpl implements ArminoService{
	
	@EJB
	private ArminoDao arminoDao;

	@Override
	public List<Armino> getAllByMesIndex(int mesidx) {
		return arminoDao.getAllByMesIndex(mesidx);
	}

}
