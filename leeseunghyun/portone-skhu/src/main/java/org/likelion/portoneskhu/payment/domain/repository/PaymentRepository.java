package org.likelion.portoneskhu.payment.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<org.likelion.portoneskhu.payment.domain.Payment, Long> {
}