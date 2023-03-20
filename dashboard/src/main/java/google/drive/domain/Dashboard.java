package google.drive.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Dashboard_table")
@Data
public class Dashboard {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Integer fileSize;
    private String fileNm;
    private String videoUrl;
    private Boolean inexYn;
    private Boolean uploadYn;
    private String type;
    private String path;
    private Boolean isuploaded;
    private Boolean isindexed;
}
