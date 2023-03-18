# wikimedia_data_warehousing
basically this application is streamed line data storing appication this takes java object as input then changes to string form and store into MYSQL database using Kafka Queue 
this application takes the dumped data from the existing api and serialised java object form into json format then transfer
the data into the data base using the kafka messaging queue.
in this only one topic is exiting called my_topic and no data replicated and the topic is partitioned in into 3 part because
it contain three types of logs serial no., data_id, event_data

