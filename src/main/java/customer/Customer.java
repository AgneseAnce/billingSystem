package customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import user.Country;
import user.Type;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private UUID id = UUID.randomUUID();
    private String name;
    private String taxpayerNo;
    private String legalAddress;
    private String bankName;
    private String accountNo;
    private Type taxpayerType;
    private Country country;

}