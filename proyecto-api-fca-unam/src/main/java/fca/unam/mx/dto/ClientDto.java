package fca.unam.mx.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClientDto {
    private Long id;
    private String name;
    private String paterno;
    private String materno;
    private String aRFC;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ColumnName("nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ColumnName("apellido_paterno")
    public String getpaterno() {
        return paterno;
    }

    public void setpaterno(String paterno) {
        this.paterno = paterno;
    }

     @ColumnName("apellido_materno")
    public String getmaterno() {
        return materno;
    }

    public void setmaterno(String materno) {
        this.materno = materno;
    }

     @ColumnName("RFC")
    public String getaRFC() {
        return aRFC;
    }

    public void setaRFC(String aRFC) {
        this.aRFC = aRFC;
    }

}
