package br.ulbra.DAO;

import br.ulbra.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDao {

    Connection con;

    public UsuarioDao() throws SQLException {
        con = ConnectionFactory.getConnection();
    }

    public boolean checkLogin(String nome, String senha, String login) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        try {

            stmt = (PreparedStatement) con.prepareStatement(
                    "SELECT * FROM tbusuario WHERE nomeusu = ? and senhausu = ? and emailusu = ?");
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            stmt.setString(3, login);

            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }
    public void create(Usuario u){
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("insert into tbusuario(nomeusu, senhausu, emailusu values(?, ?, ?)");
            stmt.setString(1, u.getNomeUsu());
            stmt.setString(2, u.getSenhaUsu());
            stmt.setString(3, u.getEmailUsu());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro:"+ex.getMessage());
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

}
