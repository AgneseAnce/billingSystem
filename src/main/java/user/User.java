package user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

private UUID id = UUID.randomUUID();
private String name;
private String email;
private String password;
private String taxpayerNo;
private String legalAddress;
private String bankName;
private String accountNo;
private Type taxpayerType;
private Country country;

}
