/**
 * @author umar.tahir
 */

package com.example.webfluxdemo.service;

import com.example.webfluxdemo.schemas.inspection.StartProcess;
import com.example.webfluxdemo.schemas.inspection.StartProcessResponse;

public interface InspectionBpmService {
	public StartProcessResponse verifyBuisnessProcess(StartProcess request);
}
