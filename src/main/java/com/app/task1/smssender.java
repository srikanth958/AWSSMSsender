package com.app.task1;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.model.Region;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;
import com.amazonaws.services.sns.model.PublishRequest;

public class smssender {

	public static AmazonSNSClient client=null;
	public static void main(String[] args) {
		
		
//		client= (AmazonSNSClient) AmazonSNSClientBuilder.standard().withRegion(Regions.AP_SOUTH_1).build();
//		client.publish("arn:aws:sns:ap-south-1:170811126574:mailservice", "hey hi sent by sns email", "snsemail");
//		
	BasicAWSCredentials cred=new BasicAWSCredentials("AKIAI5GEMXXXX6OBNGJA", "CBG2o2NvXXXXX8EYiy/Ud6NHT9ctzG/5d/7REdG");
	 AmazonSNS sns=new AmazonSNSClient().
			 builder().
			 withRegion(Regions.AP_SOUTHEAST_2).
			 withCredentials(new AWSStaticCredentialsProvider(cred)).
			 build();
	 
	 String msg="hello from amazon sns by srikanth";
	 String mno="+91949XXXX730";
	 
	 sns.publish(new PublishRequest().withMessage(msg).withPhoneNumber(mno));
	}

}
