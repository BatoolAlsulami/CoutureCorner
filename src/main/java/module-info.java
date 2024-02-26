module com.mycompany.couturecorner {
    requires javafx.controls;
    requires org.hibernate.orm.core;   
    requires java.naming; 
    requires java.persistence; 
    requires java.sql;
    requires javafx.base;
    requires javafx.graphics;

    opens com.mycompany.couturecorner to org.hibernate.orm.core; 
    exports com.mycompany.couturecorner;
}
