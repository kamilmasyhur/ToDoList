package com.maul.login.model

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.data.annotation.CreatedDate
import java.sql.Timestamp
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "user")
data class UserModel(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Int = 0,
        @Column val username: String,
        @Column val password: String,
        @JsonIgnore @CreatedDate val timeStamp: Timestamp = Timestamp(Date().time)
)