package org.likelion.portoneskhu.payment.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.likelion.portoneskhu.payment.domain.Status;

@Entity
@Getter
@NoArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long price;

    private Status status;

    private String paymentUid;

    @Builder
    private Payment(Long price, Status status) {
        this.price = price;
        this.status = status;
    }

    public void updateStatus(Status status, String paymentUid) {
        this.status = status;
        this.paymentUid = paymentUid;
    }
}