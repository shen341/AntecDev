/**
 * 
 */
package com.antec.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antec.constant.CollectKbnEnum;
import com.antec.constant.RecordCheckFlgEnum;
import com.antec.dao.UncheckRecordDto;
import com.antec.model.entity.Collectinitinfo;
import com.antec.model.entity.CollectinitinfoExample;
import com.antec.model.mapper.CollectinitinfoMapper;

/**
 * @author shenzhaohong
 *
 */
@Service
public class CollectDataService {
	
	@Autowired
	private CollectinitinfoMapper collectinitinfoMapper;
	

	/**
	 * 
	 * get data by primary key
	 * 
	 * @param id
	 * @return
	 */
	public Collectinitinfo getRecordByKey(Integer id) {		
		Collectinitinfo collectinitinfo=collectinitinfoMapper.selectByPrimaryKey(id);
		return collectinitinfo;
	}
	
	/**
	 * get all unchecked records
	 * 
	 * @return
	 */
	public List<UncheckRecordDto> getAllUncheckRecord() {
	
		List<UncheckRecordDto> uncheckRecordDtos=new ArrayList<>();
		List<Collectinitinfo> collectinitinfos= new ArrayList<>();
		
		CollectinitinfoExample collectinitinfoExample=new CollectinitinfoExample();
		collectinitinfoExample.createCriteria().andCheckflgEqualTo(RecordCheckFlgEnum.UNCHECK_FLG.getFlg());
		collectinitinfos=collectinitinfoMapper.selectByExample(collectinitinfoExample);
		if (collectinitinfos != null && collectinitinfos.size() >0) {
			for (Collectinitinfo collectinitinfo : collectinitinfos) {
				UncheckRecordDto uncheckRecordDto= new UncheckRecordDto();
				BeanUtils.copyProperties(collectinitinfo, uncheckRecordDto);
				//TODO
				uncheckRecordDto.setKbnName(CollectKbnEnum.BUILD_KBN.getKbnName());
				uncheckRecordDtos.add(uncheckRecordDto);
				
			}
		}
		
		return uncheckRecordDtos;
			
	}

}
