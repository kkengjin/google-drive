package google.drive.domain;

import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String file_id;
    private List<String> keywords;
    private String path;
    private String file_nm;
    private Integer file_size;
    private String type;
    private Boolean is_uploaded;
}
