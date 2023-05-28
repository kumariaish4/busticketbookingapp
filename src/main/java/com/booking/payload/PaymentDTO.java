package com.booking.payload;

import java.time.LocalDate;
import lombok.*;

import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDTO {

    private Long paymentId;

    @NotBlank(message = "Payment type cannot be blank")
    private String paymentType;

    @NotBlank(message = "Card number cannot be blank")
    @Pattern(regexp = "\\d{16}", message = "Card number should be a 16-digit number")
    private String cardNumber;

    @NotBlank(message = "Card holder name cannot be blank")
    private String cardHolderName;

    @NotBlank(message = "CVV cannot be blank")
    @Pattern(regexp = "\\d{3}", message = "CVV should be a 3-digit number")
    private String cvv;

    @NotNull(message = "Expiry month cannot be null")
    @Positive(message = "Expiry month should be positive")
    @Max(value = 12, message = "Expiry month should not be greater than 12")
    private Integer expiryMonth;

    @NotNull(message = "Expiry year cannot be null")
    @Positive(message = "Expiry year should be positive")
    private Integer expiryYear;

    @NotNull(message = "Payment amount cannot be null")
    @Positive(message = "Payment amount should be positive")
    private Double paymentAmount;
}
