package uz.davr.nci.enums;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;

public enum Lang {
    UZ,
    RU,
    @JsonEnumDefaultValue
    EN;

    private Lang() {
    }
}
