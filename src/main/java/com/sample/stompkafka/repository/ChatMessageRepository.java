package com.sample.stompkafka.repository;

import com.sample.stompkafka.model.ChatMessage;
import com.sample.stompkafka.model.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {

}
