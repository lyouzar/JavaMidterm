package datastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class UseMap {

    public static <List> void main(String[] args) throws SQLException {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        Connection connection = null;
        Statement statement = null;
        Map<String, java.util.List<String>> list = new HashMap<String, java.util.List<String>>();


        java.util.List<String> list1 = new ArrayList();
        list1.add("UK");
        list1.add("Belgium");
        list1.add("Spain");
        list1.add("Italy");

        java.util.List<String> list2 = new ArrayList();
        list2.add("USA");
        list2.add("Canada");
        list2.add("Brazil");


        java.util.List<String> list3 = new ArrayList();
        list3.add("China");
        list3.add("Pakistan");
        list3.add("India");

        list.put("Europe", list1);
        list.put("America", list2);
        list.put("Asia", list3);

        list.forEach((k, v) -> System.out.println("Key = "
                + k + ", Value = " + v));

        System.out.println(" using iterator");
        Iterator<Map.Entry<String, java.util.List<String>>> itr = list.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, java.util.List<String>> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());


        }
        String url = "jdbc:mysql://localhost/JavaMidterm?serverTimezone=UTC&useSSL=false";
        String user = "root";
        String password = "marrakech37";

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("something wrong with your connection");
        } finally {
            statement.close();
            connection.close();
        }
    }
}
