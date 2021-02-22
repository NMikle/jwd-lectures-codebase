package com.epam.jwd.lecture.app;

import com.epam.jwd.lecture.model.BookingRole;
import com.epam.jwd.lecture.model.BookingUser;
import com.epam.jwd.lecture.model.RandomUser;
import com.epam.jwd.lecture.model.User;

public class Main {

    public static void main(String[] args) {
        final User adminUser = BookingUser.newInstance(1, "admin", "12345", "Bob", BookingRole.ADMIN);

        System.out.println(adminUser.getLogin());
        System.out.println(adminUser.getPassword());
        System.out.println(((RandomUser) adminUser).getRandomData());

//        final Class<BookingUser> clazz = BookingUser.class;
//        final Method[] bookingUserMethods = clazz.getDeclaredMethods();
//        final Method getPasswordMethod = Arrays.stream(bookingUserMethods)
//                .filter(method -> "getPassword".equals(method.getName()))
//                .findAny()
//                .orElse(null);
////        getPasswordMethod.setAccessible(true);
//        final Object returnResult = getPasswordMethod.invoke(proxiedUser, null);
//        System.out.println(returnResult);
//        Arrays.stream(bookingUserMethods).map(Method::getName).forEach(System.out::println);
    }
}
