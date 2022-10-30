package de.suronix.springstarter.model;

import lombok.*;
import org.hibernate.annotations.Type;

import java.util.Set;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "application_user")
public class User extends AbstractEntity {

    private String username;
    private String name;

    private String Password;
    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Role> roles;
    @Lob
    @Type(type = "org.hibernate.type.ImageType")
    private byte[] profilePicture;

}
