package me.dio.credit.application.system.service

import me.dio.credit.application.system.entity.Credit

interface ICreditService {
    fun save(credit: Credit): Credit
    fun findAllByCustomer(custormerId: Long): List<Credit>
    fun findByCreditCode(customerId: Long, creditCode: java.util.UUID): Credit
}