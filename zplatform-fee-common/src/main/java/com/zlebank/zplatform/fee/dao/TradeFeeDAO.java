/* 
 * TradeFeeDAO.java  
 * 
 * version TODO
 *
 * 2016年11月16日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.fee.dao;

import com.zlebank.zplatform.fee.bean.FeeBean;
import com.zlebank.zplatform.fee.exception.TradeFeeException;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年11月16日 上午9:47:47
 * @since 
 */
public interface TradeFeeDAO {

	/**
	 * 获取交易手续费
	 * @param feeBean
	 * @return
	 * @throws TradeFeeException 
	 */
	public long getTxnFee(FeeBean feeBean) throws TradeFeeException;
	
	/**
	 * 获取退款交易手续费
	 * @param feeBean
	 * @return
	 * @throws TradeFeeException 
	 */
	public long getRefundFee(FeeBean feeBean) throws TradeFeeException;
}
