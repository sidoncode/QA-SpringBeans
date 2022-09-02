package com.example.demo;


import org.springframework.stereotype.Component;

@Component("college")
public class College {

    Principal principal = new Principal();

    // singleton -> single object of a class //
    // Principle -> principle -> used in the method of other class ( test of college Class)
    // 1) singleton 2) dependable factor of one class with the other. -> Dependency Injection //

    public void test(){
        principal.principalinfo();
        System.out.println("Test College Method");
    }


}
