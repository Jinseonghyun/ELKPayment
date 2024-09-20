package com.elkpayment.Controller;

import com.elkpayment.dto.PaymentRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private static final Logger logger = LoggerFactory.getLogger(PaymentController.class);

    @PostMapping("/payment")
    public String processPayment(@RequestBody PaymentRequest paymentRequest) {
        logger.info("결제 시작: 사용자 ID {}, 금액 {}", paymentRequest.getUserId(), paymentRequest.getAmount());

        logger.info("결제 완료: 사용자 ID {}, 금액 {}", paymentRequest.getUserId(), paymentRequest.getAmount());
        return "결제가 성공적으로 처리되었습니다.";
    }
}
