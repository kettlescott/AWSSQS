package com.automation.client;

import com.amazonaws.services.sqs.AmazonSQS;
import java.util.Map;

/**
 * Created by Scott wang
 */
interface QueueRule {

    String build (AmazonSQS client , String qName, Map<String,String> config);
}
