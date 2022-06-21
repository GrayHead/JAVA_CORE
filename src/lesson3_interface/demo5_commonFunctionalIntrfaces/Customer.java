package lesson3_interface.demo5_commonFunctionalIntrfaces;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    private String login;
    private String password;
}
