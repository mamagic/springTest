package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.Marker;
import com.shop.frame.MyService;
import com.shop.mapper.MarkerMapper;

@Service
public class MarkerService implements MyService<Integer, Marker> {

	@Autowired
	MarkerMapper mapper;

	@Override
	public void register(Marker v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(Marker v) throws Exception {
		mapper.update(v);
	}

	@Override
	public Marker get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Marker> get() throws Exception {
		return mapper.selectall();
	}

}
