package axboot.domain.eventPage;

import com.chequer.axboot.core.domain.base.AXBootJPAQueryDSLRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventPageRepository extends AXBootJPAQueryDSLRepository<EventPage, Integer> {
}