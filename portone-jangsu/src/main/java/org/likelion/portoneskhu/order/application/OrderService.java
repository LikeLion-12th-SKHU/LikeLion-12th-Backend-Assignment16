package org.likelion.portoneskhu.order.application;

import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.likelion.portoneskhu.member.domain.Member;
import org.likelion.portoneskhu.order.domain.Order;
import org.likelion.portoneskhu.order.domain.repository.OrderRepository;
import org.likelion.portoneskhu.payment.domain.Payment;
import org.likelion.portoneskhu.payment.domain.Status;
import org.likelion.portoneskhu.payment.domain.repository.PaymentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final PaymentRepository paymentRepository;

    @Transactional
    public Order createOrder(Member member) {
        // 임시 결제내역 생성
        Payment payment = Payment.builder()
                .price(10000L)
                .status(Status.PENDING)
                .build();

        paymentRepository.save(payment);

        // 주문 생성
        Order order = Order.builder()
                .productName("빼빼로_오리지날_8갑")
                .price(1000L)
                .orderUid(UUID.randomUUID().toString())
                .member(member)
                .payment(payment)
                .build();

        return orderRepository.save(order);
    }
}
