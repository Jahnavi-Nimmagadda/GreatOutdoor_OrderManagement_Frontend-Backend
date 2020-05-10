package com.cg.go.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.go.dao.CartDao;
import com.cg.go.dto.CartDTO;

@Service
@Transactional
public class CartServiceImpl implements CartService {


	@Autowired
	private CartDao pdao;

	public CartDao getDao1() {
		return pdao;
	}

    @Override
public List<CartDTO>  getDeleteByOrderIdDetails(String userId) {

return  pdao.findByUserId(userId);
			}

}
