package com.test.service.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.util.SerializationUtils;

/**
 * @author ：qixuewei@jinlianchu.com
 * @Description ：
 * @ClassName ：KafkaTestMessageListener
 * @date ：2018/3/28 15:04
 */
public class KafkaTestMessageListener implements MessageListener<String,byte[]> {


	@Override
	public void onMessage(ConsumerRecord<String,byte[]> record) {

		String value = (String) SerializationUtils.deserialize(record.value());
		System.out.println("接收到kafka的消息是:"+value);
	}
}
