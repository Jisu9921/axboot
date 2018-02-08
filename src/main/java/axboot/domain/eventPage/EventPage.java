package axboot.domain.eventPage;

import com.chequer.axboot.core.annotations.ColumnPosition;
import axboot.domain.SimpleJpaModel;
import lombok.*;
import org.apache.ibatis.type.Alias;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import com.chequer.axboot.core.annotations.Comment;
import javax.persistence.*;


@Setter
@Getter
@DynamicInsert
@DynamicUpdate
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "EVENT_PAGE")
@Comment(value = "")
@Alias("eventPage")
public class EventPage extends SimpleJpaModel<Integer> {
    @Id
    @Column(name = "ID", precision = 10, nullable = false)
    @Comment(value = "")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "NAME", length = 25)
    @Comment(value = "")
    private String name;
    @Column(name = "PARTNER", length = 25)
    @Comment(value = "")
    private String partner;
    @Column(name = "TYPE", length = 25)
    @Comment(value = "")
    private String type;
    @Column(name = "TOKEN_LIFE_SEC", precision = 10)
    @Comment(value = "")
    private Integer tokenLifeSec;
    @Column(name = "DRAW_PLAN_ID", precision = 10)
    @Comment(value = "")
    private Integer drawPlanId;
    @Column(name = "SHUTDOWN", length = 1)
    @Comment(value = "")
    private String shutdown;
    @Column(name = "INFO", length = 255)
    @Comment(value = "")
    private String info;
    @Column(name = "APP_ID", length = 25)
    @Comment(value = "")
    private String appId;
    @Column(name = "TEMPLATE", length = 25)
    @Comment(value = "")
    private String template;
    @Column(name = "TEMPLATE_PARAMS", length = 255)
    @Comment(value = "")
    private String templateParams;
    @Override
    public Integer getId() {
        return id;
    }
}