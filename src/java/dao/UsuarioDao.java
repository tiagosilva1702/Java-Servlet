package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Usuario;
import util.DbUtil;

/**
 *
 * @author TIAGO
 */
public class UsuarioDao {

    private Connection connection;

    public UsuarioDao() {
        connection = DbUtil.getConnection();
    }

    public void CriarUsuario(Usuario usuario) {
        try {
            String sql = "INSERT INTO USUARIO (NOME, EMAIL) "
            + "VALUES ("+ usuario.getNome()+ ", " +usuario.getEmail()+")";
            
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            
            /*PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into Usuario (nome, email) values (?,? )");
            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setString(2, usuario.getEmail());
            preparedStatement.executeUpdate(); */
            
            System.out.println("Inserido com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Usuario> ListarUsuario() {
        List<Usuario> listaDeUsuario = new ArrayList<Usuario>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Usuario");
            while (rs.next()) {
                Usuario user = new Usuario();
                user.setUsuarioId(rs.getInt("usuarioid"));
                user.setNome(rs.getString("nome"));
                user.setDataNascimento(rs.getDate("datanascimento"));
                user.setEmail(rs.getString("email"));
                listaDeUsuario.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaDeUsuario;
    }
}
