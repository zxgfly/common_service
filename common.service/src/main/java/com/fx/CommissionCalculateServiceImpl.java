package com.fx;



import com.fx.crm.cron.comm.impl.NewCommCalculateServiceImpl;
import com.fx.payment.exception.PayException;
import com.fx.util.SpringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;
import java.util.Calendar;


/**
 * Created by bei2love@gmail.com on 15/6/10.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring/applicationContext.xml")
public class CommissionCalculateServiceImpl {



    private static final Logger logger = LoggerFactory.getLogger(CommissionCalculateServiceImpl.class);


    @Test
    public void calCommissionTest(){

    	Calendar date=Calendar.getInstance();
		Calendar today=Calendar.getInstance();
//		Calendar today4=Calendar.getInstance();
		today.set(2015,11,02);
		date.set(2015,11,01);
		while(date.before(today)){
			try {
				//trySettleIBCommission(date);
				//SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
//				String str2 = sf.format(date.getTime());
				Calendar today2 = (Calendar)date.clone();
//				Calendar today3 = (Calendar)date.clone();
				today2.add(Calendar.DAY_OF_MONTH, -1);
//				String str1 = sf.format(today2.getTime());
				NewCommCalculateServiceImpl commCalculateService = SpringUtils.getBean(NewCommCalculateServiceImpl.class);
	          //  commCalculateService.calCommission(today2.getTime(), date.getTime());
				try {
					commCalculateService.calculateMonthlyIbCommission(date);
				} catch (PayException e) {
					e.printStackTrace();
				}
			} catch (ParseException e) {
				e.printStackTrace();
			}
			date.add(Calendar.DAY_OF_MONTH, 1);
		}
    }
    
    public static void main(String[] args) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/applicationContext.xml");
//    	Calendar date=Calendar.getInstance();
//		Calendar today=Calendar.getInstance();
//		date.set(2015, 8, 2);
//		while(date.before(today)){
//			try {
//				Calendar today2 = (Calendar)date.clone();
//				today2.add(Calendar.DAY_OF_MONTH, -1);
//				ICommCalculateService commCalculateService = SpringUtils.getBean(ICommCalculateService.class);
//	            commCalculateService.calCommission(today2.getTime(), date.getTime());
//				try {
//					commCalculateService.calculateMonthlyIbCommission(date);
//				} catch (PayException e) {
//					e.printStackTrace();
//				}
//			} catch (ParseException e) {
//				e.printStackTrace();
//			}
//			date.add(Calendar.DAY_OF_MONTH, 1);
//		}
    	
    	Calendar date=Calendar.getInstance();
		Calendar today=Calendar.getInstance();
//		Calendar today4=Calendar.getInstance();
		today.set(2016,5,9);
		date.set(2016, 5,8);
		while(date.before(today)){
			try {
				//trySettleIBCommission(date);
				//SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
//				String str2 = sf.format(date.getTime());
				Calendar today2 = (Calendar)date.clone();
//				Calendar today3 = (Calendar)date.clone();
				today2.add(Calendar.DAY_OF_MONTH, -1);
//				String str1 = sf.format(today2.getTime());
				NewCommCalculateServiceImpl commCalculateService = SpringUtils.getBean(NewCommCalculateServiceImpl.class);
	            commCalculateService.calCommission(today2.getTime(), date.getTime());
				try {
					commCalculateService.calculateMonthlyIbCommission(date);
				} catch (PayException e) {
					e.printStackTrace();
				}
			} catch (ParseException e) {
				e.printStackTrace();
			}
			date.add(Calendar.DAY_OF_MONTH, 1);
		}
	}
}

