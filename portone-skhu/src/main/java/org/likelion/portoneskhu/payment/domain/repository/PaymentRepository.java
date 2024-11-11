package org.likelion.portoneskhu.payment.domain.repository;

import org.likelion.portoneskhu.payment.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
