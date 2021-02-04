package com.epam.jwd.lecture.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Stack;

public enum ConnectionPool {
    INSTANCE;

    private static final int INITIAL_CONNECTIONS_AMOUNT = 8;

    private final Stack<ProxyConnection> connections = new Stack<>();

    public Connection retrieveConnection() {
        return connections.pop();
    }

    public void returnConnection(Connection connection) {
        //todo: check connection on fake
        connections.push((ProxyConnection) connection);
    }

    private void init() throws SQLException {
        //todo: database initialization procedures
        for (int i = 0; i < INITIAL_CONNECTIONS_AMOUNT; i++) {
            final Connection realConnection = DriverManager.getConnection("", "", "");
            final ProxyConnection proxyConnection = new ProxyConnection(realConnection);
            connections.push(proxyConnection);
        }
    }

    private void destroy() {
        //todo: connection destroy procedures
        connections.forEach(ProxyConnection::closeConnection); //real close
    }
}
