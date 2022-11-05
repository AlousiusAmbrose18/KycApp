package com.jspider.KycAPP;

import java.util.List;

import com.jspider.KycAPP.Entity.KycEntity;
import com.jspider.KycAPP.Repositary.KycRepositary;

public class App 
{
    public static void main( String[] args )
    {

    	KycEntity k = new KycEntity();
    	KycRepositary kycRepositary = new KycRepositary();
    	
    	k.setId(444L);
    	k.setFirstName("aaa");
    	k.setLastName("bbb");
    	k.setContactNum(78954L);
    	k.setCity("zzzz");
    	k.setState("Tamilnadu");
    	k.setCountry("India");
    	k.setPincode("605402");
    	k.setDocType("pan card");
    	k.setIsDocVerified(false);
    	
    	kycRepositary.saveDoc(k);
    	
   // 	System.out.println(kycRepositary.verifyDocById(222L));
    	
    	
//    	List<KycEntity> list = kycRepositary.findAll();
//    	
//    	for (KycEntity kycEntity : list) {
//			System.out.println(kycEntity);
//			System.out.println();
//			System.out.println();
//		}
    	
//   	List<KycEntity> list = kycRepositary.findAllByDocType("pan card");
//   	for (KycEntity kycEntity : list) {
//		System.out.println(kycEntity);
//		System.out.println();
//		System.out.println();
//	}
    	
//    	kycRepositary.updateCityAndPincodeByContactNum("kochin", "25852", 78954L);
    	
 //  	kycRepositary.deleteRecByFirstAndLastName("alo","saga");
    	
    	
    }
}
