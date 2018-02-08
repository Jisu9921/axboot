package axboot.domain.crud;

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
@Table(name = "CRUD")
@Comment(value = "")
@Alias("crud")
public class Crud extends SimpleJpaModel<Integer> {
    @Id
    @Column(name = "ID", precision = 10, nullable = false)
    @Comment(value = "")
    private Integer id;
    @Column(name = "CONTENTS", length = 25)
    @Comment(value = "")
    private String contents;
    @Override
    public Integer getId() {
        return id;
    }
}