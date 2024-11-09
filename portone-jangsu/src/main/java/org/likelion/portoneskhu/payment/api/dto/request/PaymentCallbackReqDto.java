package org.likelion.portoneskhu.payment.api.dto.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public record PaymentCallbackReqDto(
        String paymentUid,
        String orderUid

) {
}
