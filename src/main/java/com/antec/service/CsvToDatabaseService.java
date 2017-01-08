/**
 * 
 */
package com.antec.service;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.supercsv.io.CsvListReader;
import org.supercsv.io.ICsvListReader;
import org.supercsv.prefs.CsvPreference;

import com.antec.model.entity.Areamaster;
import com.antec.model.entity.AreamasterExample;
import com.antec.model.mapper.AreamasterMapper;

/**
 * @author shenzhaohong
 *
 */
@Service
public class CsvToDatabaseService {
	
	@Autowired
	private AreamasterMapper areamasterMapper;
	
	@Transactional
	public void csvFileToDatabase(File csvFile) {
		Areamaster areamaster=new Areamaster();
		ICsvListReader iCsvListReader=null;
		
		AreamasterExample areamasterExample=new AreamasterExample();
		areamasterExample.createCriteria().andIdGreaterThan(0);
		areamasterMapper.deleteByExample(areamasterExample);
		
		try {
			 iCsvListReader=new CsvListReader(new FileReader(csvFile), CsvPreference.EXCEL_PREFERENCE);
			
			List<String> lineData=null;
			
			while ((lineData = iCsvListReader.read()) != null) {
				
				if (lineData == null || lineData.size() == 0) {
					continue;
				}
				areamaster.setId(Integer.parseInt(lineData.get(0)));
				areamaster.setParentid(Integer.parseInt(lineData.get(1)));
				areamaster.setName(lineData.get(2));
				areamaster.setRegintype(lineData.get(3));
				areamasterMapper.insert(areamaster);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (iCsvListReader != null) {
				try {
					iCsvListReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
