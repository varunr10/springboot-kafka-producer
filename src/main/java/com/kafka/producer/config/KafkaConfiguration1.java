//package com.kafka.producer.config;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.apache.kafka.clients.producer.ProducerConfig;
//import org.apache.kafka.common.serialization.StringSerializer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.core.DefaultKafkaProducerFactory;
//import org.springframework.kafka.core.ProducerFactory;
//import org.springframework.kafka.support.serializer.JsonSerializer;
//
//import com.kafka.producer.model.User1;
//
//@Configuration
//public class KafkaConfiguration1 {
//	
//	@Bean
//	public ProducerFactory<String, User1> producerFactory(){
//	
//		Map<String, Object> kafkaConfig = new HashMap<>();
//		
//		kafkaConfig.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "192.168.1.55:9092");
//		kafkaConfig.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//		kafkaConfig.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
//		
//		return new DefaultKafkaProducerFactory<>(kafkaConfig);
//	}
//}
