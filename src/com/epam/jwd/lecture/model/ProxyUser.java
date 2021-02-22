package com.epam.jwd.lecture.model;

import com.epam.jwd.lecture.sql.Bark;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProxyUser implements InvocationHandler {

    private final User user;

    public ProxyUser(User user) {
        this.user = user;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        final Class<?> methodsClass = method.getDeclaringClass();

        for (Class<?> interf : user.getClass().getInterfaces()) {
            if (methodsClass.isAssignableFrom(interf)) {
                try {
                    System.out.printf("method %s found on interface %s. Invoking for user object\n", method.getName(), interf.getSimpleName());
                    return method.invoke(user, args);
                } catch (InvocationTargetException e) {
                    throw e.getTargetException();
                }
            }
        }
        if (method.isAnnotationPresent(Bark.class)) {
            System.out.println("Bark! Bark!");
        } else {
            System.out.printf("some implementation for method %s should be here\n", method.getName());
        }
        return null; //todo: NPE on primitive types;
    }

}
