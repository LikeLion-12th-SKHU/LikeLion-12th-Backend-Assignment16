package org.likelion.portoneskhu.payment.domain.repository;

import org.likelion.portoneskhu.payment.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
