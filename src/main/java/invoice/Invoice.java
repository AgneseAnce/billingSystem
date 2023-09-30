package invoice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Timestamp;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
    private String invoiceNumber;
    private Timestamp createdAt;
    private Date dueBy;
    private String logoURL;
    private Signature signingMethod;
    private String notes;
    private Date issuedAt;
}
