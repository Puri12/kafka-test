package com.sample.stompkafka.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class ChatMessage {

    public enum MessageType {
        ENTER, TALK
    }
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private MessageType type;
    @Column
    //채팅방 ID
    private String roomId;
    @Column
    //보내는 사람
    private String sender;
    @Column
    //내용
    private String message;
}