package com.example.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDatabaseConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);
    private WikimeadiaRepository wikimeadiaRepository;

    public KafkaDatabaseConsumer(WikimeadiaRepository wikimeadiaRepository) {
        this.wikimeadiaRepository = wikimeadiaRepository;
    }

    @KafkaListener(
           topics = "wikimedia_recent_changes",
           groupId ="myGroup1"
   )
    public void consume(String eventMesaage){
        LOGGER.info(String.format("message received -> %s",eventMesaage));
        WikimeadiaDatabase wikimeadiaDatabase=new WikimeadiaDatabase();
        wikimeadiaDatabase.setWikiEventData(eventMesaage);


        wikimeadiaRepository.save(wikimeadiaDatabase);

    }



}
