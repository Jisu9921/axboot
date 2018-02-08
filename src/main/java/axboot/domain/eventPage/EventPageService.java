package axboot.domain.eventPage;

import org.springframework.stereotype.Service;
import axboot.domain.BaseService;
import javax.inject.Inject;
import com.chequer.axboot.core.parameter.RequestParams;
import java.util.List;

@Service
public class EventPageService extends BaseService<EventPage, Integer> {
    private EventPageRepository eventPageRepository;
    @Inject
    public EventPageService(EventPageRepository eventPageRepository) {
        super(eventPageRepository);
        this.eventPageRepository = eventPageRepository;
    }
    public List gets(RequestParams requestParams) {
        return findAll();
    }
}