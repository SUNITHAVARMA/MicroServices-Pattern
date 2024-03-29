package com.stackroute.muzixservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "track")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Track {
    @Id

    private String id;
    private String name;
    private String description;

}
