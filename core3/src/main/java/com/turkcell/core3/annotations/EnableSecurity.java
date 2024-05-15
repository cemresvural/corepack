package com.turkcell.core3.annotations;


import org.springframework.context.annotation.ComponentScan;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ComponentScan(basePackages = {"com.turkcell.core3"})// ana proje dışında tarama yapılmasını istediğimiz paket isimleri
public @interface EnableSecurity {
}
