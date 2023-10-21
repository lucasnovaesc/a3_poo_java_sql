package DAO;
import java.sql.PreparedStatement;
/* teste */
import java.sql.SQLException;

import Conexao.Conexao;

public class ProdutoDAO {
    
    public void cadastrarProduto(Produto produto) {

        String sql = "INSERT INTO PRODUTO (ID, NOME, PRECO, DESCRICAO) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, produto.getId());
            ps.setString(2, produto.getNome());
            ps.setDouble(3, produto.getPreco());
            ps.setString(4, produto.getDescricao());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
