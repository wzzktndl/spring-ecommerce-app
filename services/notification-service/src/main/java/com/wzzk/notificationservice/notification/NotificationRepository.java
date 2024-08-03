package com.wzzk.notificationservice.notification;

import com.wzzk.notificationservice.kafka.payment.PaymentConfirmation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<Notification,String> {
}
