package com.test.service.impl;

import com.test.service.KafkaProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.util.SerializationUtils;

import java.util.Date;
import java.util.Random;

/**
 * @author ：qixuewei@jinlianchu.com
 * @Description ：
 * @ClassName ：KafkaProducerServiceImpl
 * @date ：2018/3/28 14:07
 */
public class KafkaProducerServiceImpl implements KafkaProducerService {

	public static final String TEST_TOPIC ="TEST_TOPIC";

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	KafkaTemplate kafkaTemplate;

	@Override
	public void sendMQ() {

		//主题
		logger.info("定时任务调度开始!");
		try {
			//分区
			int partition = new Random().nextInt(10);
			//int partition =Integer.parseInt(map.get("partition").toString());
			//key
			String key = "test"+new Date().getTime();
			//value
			String value ="kafka producer first mesage"+new Date().getTime();
			kafkaTemplate.send(TEST_TOPIC,partition,key, SerializationUtils.serialize(value));
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("kafka 消息发送失败",e);
		}
	}
}
