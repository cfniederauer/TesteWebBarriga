package testSuite;

import org.junit.runner.RunWith;
import tests.*;

@RunWith(org.junit.runners.Suite.class)
@org.junit.runners.Suite.SuiteClasses(
        {
                TestContaCriacao.class,
                TestContaAlteracao.class,
                TestMovimentacaoCriacao.class,
                TestResumoMensalExcluiMovimentacao.class,
                TestContaExclusao.class
        }
)
public class Suite {
}
