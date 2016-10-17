package br.com.marcio.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.marcio.model.Usuario;

public class UsuarioDAO {
	private Connection con = ConexaoFactory.getConnection();

	public void cadastrar(Usuario user) {
		String sql = "INSERT INTO usuario (nome,login,senha) VALUES (?,?,?)";
		try (PreparedStatement preparador = con.prepareStatement(sql)) {
			preparador.setString(1, user.getNome());
			preparador.setString(2, user.getLogin());
			preparador.setString(3, user.getSenha());
			preparador.execute();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void alterar(Usuario user) {
		String sql = "UPDATE usuario SET nome=?, login=?, senha=? WHERE id=?";
		try (PreparedStatement preparador = con.prepareStatement(sql)) {
			preparador.setString(1, user.getNome());
			preparador.setString(2, user.getLogin());
			preparador.setString(3, user.getSenha());
			preparador.setInt(4, user.getId());
			preparador.execute();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void excluir(Usuario user) {
		String sql = "DELETE FROM usuario WHERE id=?";
		try (PreparedStatement preparador = con.prepareStatement(sql)) {
			
			preparador.setInt(1, user.getId());
			preparador.execute();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

}
