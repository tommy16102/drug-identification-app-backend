package sotree.dia.domain;

import javax.persistence.*;

@Table(name = "drug")
@Entity
public class Drug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
