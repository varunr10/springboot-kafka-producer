//package com.kafka.producer.resource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//@RequestMapping("kafka")
//public class UserResource1 {
//
//	@Autowired
//	private KafkaTemplate<String, String> kafkaTemplate;
//
//	private static final String TOPIC_NAME = "kafka_topic2";
//
//	@GetMapping("/publish/{name}")
//	public String publishMessageToTopic(@PathVariable("name") String userName) {
//
//		try {
//			kafkaTemplate.send(TOPIC_NAME, userName);
//		}
//		catch(Exception ex) {
//			ex.printStackTrace();
//			return "Failed to publish message to "+ TOPIC_NAME;
//		}
//		return "Published successfully to "+ TOPIC_NAME;
//	}
//}
//
