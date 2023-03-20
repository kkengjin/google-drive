package google.drive.domain;

import google.drive.IndexerApplication;
import google.drive.domain.FilIndexed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Index_table")
@Data
public class Index {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileId;

    @ElementCollection
    private List<String> keywords;

    @PostPersist
    public void onPostPersist() {
        FilIndexed filIndexed = new FilIndexed(this);
        filIndexed.publishAfterCommit();
    }

    public static IndexRepository repository() {
        IndexRepository indexRepository = IndexerApplication.applicationContext.getBean(
            IndexRepository.class
        );
        return indexRepository;
    }

    public static void indexFile(FileUploaded fileUploaded) {
        /** Example 1:  new item 
        Index index = new Index();
        repository().save(index);

        FilIndexed filIndexed = new FilIndexed(index);
        filIndexed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(index->{
            
            index // do something
            repository().save(index);

            FilIndexed filIndexed = new FilIndexed(index);
            filIndexed.publishAfterCommit();

         });
        */

    }
}
