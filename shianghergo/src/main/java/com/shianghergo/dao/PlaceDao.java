package com.shianghergo.dao;

import java.util.List;

import com.shianghergo.model.PlaceBean;

public interface PlaceDao {
	List<PlaceBean> getAllPlace();
	void setLatLngs(Double lat,Double lng,String loca);
}
