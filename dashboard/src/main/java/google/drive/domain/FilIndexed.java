package google.drive.domain;

import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class FilIndexed extends AbstractEvent {

    private Long id;
    private String file_id;
    private List<String> keywords;
}
