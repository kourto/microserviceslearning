package uqtr.learningmicroservices.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService() {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstname(request.firstname())
                .lastname(request.lastname())
                .email(request.email())
                .build();
        //  todo: check if email valid
        //  todo: check if email not taken
        //  todo: store customer in db
    }
}
