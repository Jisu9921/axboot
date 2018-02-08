package axboot.domain.crud;

import org.springframework.stereotype.Service;
import axboot.domain.BaseService;
import javax.inject.Inject;
import com.chequer.axboot.core.parameter.RequestParams;
import java.util.List;

@Service
public class CrudService extends BaseService<Crud, Integer> {
    private CrudRepository crudRepository;
    @Inject
    public CrudService(CrudRepository crudRepository) {
        super(crudRepository);
        this.crudRepository = crudRepository;
    }
    public List gets(RequestParams requestParams) {
        return findAll();
    }
}