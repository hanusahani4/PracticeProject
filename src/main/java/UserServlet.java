import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;

@WebServlet("/user")
public class UserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement Create operation
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String password = request.getParameter("password");
        Connection conn = null;
        try {
            conn = MySQLConnector.connect();

        if (null!=conn) {
            String sql = "INSERT INTO user (firstname, lastname,password) VALUES (?, ?, ?)";
             PreparedStatement stmt;

                stmt = conn.prepareStatement(sql);
                stmt.setString(1, firstname);
                stmt.setString(2, lastname);
                stmt.setString(3, password);
                stmt.executeUpdate();
           
            }
         } catch (SQLException ex) {
                Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement Read operation
        /*
        List<User> users = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword)) {
            String sql = "SELECT * FROM users";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String username = rs.getString("username");
                        String email = rs.getString("email");
                        User user = new User(id, username, email);
                        users.add(user);
                    }
                }
            }
        } catch (SQLException e) {
            // Handle exception
            
        }

        request.setAttribute("users", users);
        request.getRequestDispatcher("list.jsp").forward(request, response);
*/
    }

}
