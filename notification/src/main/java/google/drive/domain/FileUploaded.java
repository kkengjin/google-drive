package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String fileId;
    private Object keywords;
    private String path;
    private String fileNm;
    private Integer fileSize;
    private String type;
    private Boolean isUploaded;
}
