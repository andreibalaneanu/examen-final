package ro.tefacprogramator.m4.examen.serverapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Type")
public class Type {
    
    //campuri
    @Id
    @Column(name = "TypeID")
    private int id;

    @Column(name = "TypeName")
    private String TypeName;


    //geters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeName() {
        return TypeName;
    }

    public void setTypeName(String typeName) {
        TypeName = typeName;
    }

    

}
