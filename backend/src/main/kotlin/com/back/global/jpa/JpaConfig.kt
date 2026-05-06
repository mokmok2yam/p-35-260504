package com.back.global.jpa

import com.querydsl.jpa.impl.JPAQueryFactory
import jakarta.persistence.EntityManager
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class JpaConfig (
    private val entityManger : EntityManager
){
    @Bean
    fun jpaQueryFactory(): JPAQueryFactory{
        return JPAQueryFactory(entityManger)
    }

}