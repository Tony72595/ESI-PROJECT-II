package org.esi.scholarship_second.ApplySecond;

import java.util.Random;
import java.io.IOException;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import java.math.BigInteger;

import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.admin.Admin;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.DefaultGasProvider;



public class FirstRoundDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		
		
        int gpa = (int) execution.getVariable("gpa");
        if(gpa>=3) {
        	execution.setVariable("gpa", gpa);
        }else {
        	execution.setVariable("Decline", gpa);
        }
 
		
		}
			
    //private void init() throws Exception {
		//"http://193.205.92.133:8545"
		// Web3j web3j=Web3j.build(new HttpService("http://193.205.92.133:8545"));
		
		
		//Credentials credentials = getCredentialFromPrivateKey(<privateKey>);
		//byte[] signedMessage = TransactionEncoder.signMessage(<transaction>, credentials);
		//String hexValue = Numeric.toHexString(signedMessage);
		
        
        
      
        
	}

	


