package by.rw.tt.dao;

import java.util.List;

import by.rw.tt.entity.expestdb.Armino;

public interface ArminoDao{
	
	List<Armino> getAllByMesIndex(int mesidx);
	
}
