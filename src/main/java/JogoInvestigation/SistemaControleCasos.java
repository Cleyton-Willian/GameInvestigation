package JogoInvestigation;
import java.util.List;

public interface SistemaControleCasos {
    void cadastrarCaso(String Local, String Data, String Hora, String acontecimento, String CodigoCaso)
            throws codigoCasoNaoExisteException;

    List<Casos> pesquisarCasoPorLocal(String Local);

    List<Casos> pesquisarCasoPorData(String Data);

    List<Casos> pesquisarCasoPorHora(String Hora);

    List<Casos> pesquisarCasoPorCodigo(String Codigo);

    List<Casos> apagarCaso(String codigoCaso)
            throws casoNaoExisteException;
}
