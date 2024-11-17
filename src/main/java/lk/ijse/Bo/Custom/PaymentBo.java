package lk.ijse.Bo.Custom;

import lk.ijse.Bo.SuperBo;
import lk.ijse.Dto.PaymentDto;

import java.io.IOException;

public interface PaymentBo extends SuperBo {
    boolean savePayment(PaymentDto paymentDto) throws IOException;
}
