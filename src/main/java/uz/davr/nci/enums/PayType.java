package uz.davr.nci.enums;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import uz.davr.nci.dtos.SharedI18n;

public enum PayType {
    CASH(new SharedI18n[0]),
    UZCARD(new SharedI18n[0]),
    VISA(new SharedI18n[0]),
    AGENT(new SharedI18n[0]),
    @JsonEnumDefaultValue
    UNKNOWN(new SharedI18n[]{new SharedI18n(Lang.UZ, "NOMA'LUM"), new SharedI18n(Lang.RU, "НЕИЗВЕСТНЫЙ"), new SharedI18n(Lang.EN, "UNKNOWN")}),
    PAYME(new SharedI18n[0]),
    HUMO(new SharedI18n[0]),
    PC(new SharedI18n[0]),
    P2P(new SharedI18n[0]),
    NCI(new SharedI18n[0]),
    DEPOSIT(new SharedI18n[0]),
    ANOR_AGENT(new SharedI18n[0]),
    REPLENISH(new SharedI18n[0]),
    UZCARD_CREDIT(new SharedI18n[0]),
    BPC(new SharedI18n[0]),
    HUMO_CREDIT(new SharedI18n[0]);

    private final SharedI18n[] i18ns;

    private PayType(SharedI18n... i18ns) {
        this.i18ns = i18ns;
    }
}
