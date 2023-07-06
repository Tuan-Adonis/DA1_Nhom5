package Utilies;

import DomainModels.ChiTietSP;
import DomainModels.HoaDon;
import DomainModels.HoaDonCT;
import DomainModels.KhachHang;
import DomainModels.NhaCungCap;
import DomainModels.NhanVien;
import DomainModels.SanPham;
import DomainModels.MauSac;
import DomainModels.Loai;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static final SessionFactory FACTORY;
    private static Session SESSION; // cổng kết nối

    static {
        Configuration conf = new Configuration();

       Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=DA1_NHOM5;encrypt=true;trustServerCertificate=true;");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "123456");
        properties.put(Environment.SHOW_SQL, "true");

        conf.setProperties(properties);
        conf.addAnnotatedClass(ChiTietSP.class);
        conf.addAnnotatedClass(HoaDon.class);
        conf.addAnnotatedClass(HoaDonCT.class);
        conf.addAnnotatedClass(KhachHang.class);
        conf.addAnnotatedClass(NhaCungCap.class);
        conf.addAnnotatedClass(NhanVien.class);
        conf.addAnnotatedClass(SanPham.class);
        conf.addAnnotatedClass(MauSac.class);
        conf.addAnnotatedClass(Loai.class);

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);

    }

   public static Session getSession() {
        if (SESSION == null || !SESSION.isConnected()) {
            SESSION = FACTORY.openSession();
        }
        return SESSION;
    }

   public static final String HOSTNAME = "localhost";
    public static final String PORT = "1433";
    public static final String DBNAME = "DA1_NHOM5";
    public static final String USERNAME = "sa";
    public static final String PASSWORD = "123456";

    public static Connection getConnection() {

        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://" + HOSTNAME + ":" + PORT + ";"
                + "databaseName=" + DBNAME + ";encrypt=true;trustServerCertificate=true;";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(connectionUrl, USERNAME, PASSWORD);
        } // Handle any errors that may have occurred.
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
   
    public static void main(String[] args) {
        System.out.println(getConnection());
        System.out.println("thanh cog");
    }
}
