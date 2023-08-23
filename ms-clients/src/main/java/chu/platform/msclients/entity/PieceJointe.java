package chu.platform.msclients.entity;//package chu.platform.msclient.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class PieceJointe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String fileName;
    private String fileType;
    private long fileSize;
    private String status;
    @Lob
    private byte[] fileData; // Storing the file content as a byte array


}
