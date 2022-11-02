package by.rw.tt.dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

import by.rw.tt.dao.AbstractDao;
import by.rw.tt.dao.ArminoDao;
import by.rw.tt.entity.expestdb.Armino;

@Stateless
public class ArminoDaoImpl extends AbstractDao implements ArminoDao{
	
	private static final String ARMINO_SQL_PATH = "arminoSQL.properties";
	private static final Properties ARMINO_SQL_PROPERTIES = new Properties();;

	@PostConstruct
	public void init() {
		try (InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(ARMINO_SQL_PATH)) {
			ARMINO_SQL_PROPERTIES.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<Armino> getAllByMesIndex(int mesidx) {
		System.out.println(String.valueOf(mesidx));
		return emDb2abd13.createQuery(ARMINO_SQL_PROPERTIES.getProperty("getAllByMesIdx").replace("mesindex", String.valueOf(mesidx)), Armino.class).getResultList();
	}
}
