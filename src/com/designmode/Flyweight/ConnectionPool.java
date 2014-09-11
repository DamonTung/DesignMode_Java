/**
 * 实现对象共享，以下是数据库连接池的源码，通过连接池的管理实现了数据库连接的共享，不需要每一次都创建连接，提升了系统性能；
 */
package com.designmode.Flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * @author DamonTung
 * @date 2014年9月10日
 * @description 数据库连接池使用的即为享元模式，
 */
public class ConnectionPool {
	private String url = "";
	private String username = "";
	private String password = "";
	private String driverClassName = "";

	private int poolSize = 100;
	private static ConnectionPool instance = null;
	Connection connection = null;

	private Vector<Connection> pool;

	/**
	 * 
	 */
	public ConnectionPool() {
		// TODO Auto-generated constructor stub
		pool = new Vector<Connection>(poolSize);

		for (int i = 0; i < poolSize; i++) {
			try {
				Class.forName(driverClassName);
				connection = DriverManager.getConnection(url, username,
						password);
				pool.add(connection);
			} catch (SQLException | ClassNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	/** 返回连接到连接池 */
	public synchronized void release() {
		pool.add(connection);
	}

	/** 返回连接池中的一个数据库连接 */
	public synchronized Connection getConnection() {
		if (pool.size() > 0) {
			Connection connection = pool.get(0);
			pool.remove(connection);
			return connection;
		} else {
			return null;
		}
	}

}
