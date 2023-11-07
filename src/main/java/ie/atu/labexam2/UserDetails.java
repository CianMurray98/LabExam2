package ie.atu.labexam2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetails {
    public int CustomerId;

    public Object getCustomerById() {
        return CustomerId;
    }
        public int Age;
        public Object getCustomerByAge () {
            return Age;
        }
    }
