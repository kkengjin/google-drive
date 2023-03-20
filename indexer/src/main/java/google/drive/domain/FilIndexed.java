package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FilIndexed extends AbstractEvent {

    private Long id;
    private String fileId;
    private List<String> keywords;

    public FilIndexed(Index aggregate) {
        super(aggregate);
    }

    public FilIndexed() {
        super();
    }
}
