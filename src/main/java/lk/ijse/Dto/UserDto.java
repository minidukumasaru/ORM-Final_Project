package lk.ijse.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    private String user_id;
    private String username;
    private String password;
    private String user_email;
    private String user_phone;
    private String user_role;
    private Date user_date;
}
