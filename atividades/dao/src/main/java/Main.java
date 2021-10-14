
import dao.PessoaDAO;
import dao.ProdutoDAO;
import entities.Pessoa;
import entities.Produto;
import java.util.List;

/**
 *
 * @author rafael
 */
public class Main {
    public static void main(String[] args) {
        PessoaDAO pessoaDao = new PessoaDAO();
        Pessoa p = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        Pessoa p4 = new Pessoa();
        Pessoa p5 = new Pessoa();
        
        p.setName("a");
        p2.setName("b");
        p3.setName("c");
        p4.setName("d");
        p5.setName("e");
        
        pessoaDao.save(p);
        pessoaDao.save(p2);
        pessoaDao.save(p3);
        pessoaDao.save(p4);
        pessoaDao.save(p5);
        
        List<Pessoa> pessoaResultList = pessoaDao.findAll();
        
        for(Pessoa pessoa : pessoaResultList){
            System.out.println("Pessoa: " +pessoa.getName());
        }
        ProdutoDAO produtoDao = new ProdutoDAO();
        Produto pr = new Produto();
        Produto pr2 = new Produto();
        Produto pr3 = new Produto();
        Produto pr4 = new Produto();
        Produto pr5 = new Produto();
        
        pr.setDescricao("a");
        pr2.setDescricao("b");
        pr3.setDescricao("c");
        pr4.setDescricao("d");
        pr5.setDescricao("e");

        produtoDao.save(pr);
        produtoDao.save(pr2);
        produtoDao.save(pr3);
        produtoDao.save(pr4);
        produtoDao.save(pr5);

        List<Produto> produtoResultlist = produtoDao.findAll();
        
        for(Produto produto : produtoResultlist){
            System.out.println("Produto: " +produto.getDescricao());
        }
        
        pessoaDao.delete(p);
        
        p2.setName("novo nome");
        pessoaDao.update(p2); 

        pessoaResultList = pessoaDao.findAll();
        
        for(Pessoa pessoa : pessoaResultList){
            System.out.println("Pessoa: " +pessoa.getName());
        }
    }
}
