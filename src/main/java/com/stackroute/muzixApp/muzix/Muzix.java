package com.stackroute.muzixApp.muzix;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Muzix {

    @Id
    private int trackId;

    private String trackName;

    private String comments;


}
