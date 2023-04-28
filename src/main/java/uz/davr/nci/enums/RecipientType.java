package uz.davr.nci.enums;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import uz.davr.nci.dtos.SharedI18n;

public enum RecipientType {
    SIMPLE(new SharedI18n[]{new SharedI18n(Lang.UZ, "ODDIY"), new SharedI18n(Lang.RU, "ПРОСТОЙ"), new SharedI18n(Lang.EN, "SIMPLE")}),
    GIFT(new SharedI18n[]{new SharedI18n(Lang.UZ, "SOVG'A"), new SharedI18n(Lang.RU, "ПОДАРОК"), new SharedI18n(Lang.EN, "GIFT CARD")}),
    PIN(new SharedI18n[]{new SharedI18n(Lang.UZ, "PIN KOD"), new SharedI18n(Lang.RU, "ПИН КОД"), new SharedI18n(Lang.EN, "PIN CODE")}),
    AMOUNT_DICTATOR(new SharedI18n[]{new SharedI18n(Lang.UZ, "MIQDORINI BELGILAYDIGAN XIZMAT"), new SharedI18n(Lang.RU, "УСЛУГА, ДИКТУЮЩАЯ СУММА"), new SharedI18n(Lang.EN, "AMOUNT DICTATOR")}),
    INVOICE(new SharedI18n[]{new SharedI18n(Lang.UZ, "BIR MARTALIK TO'LOV"), new SharedI18n(Lang.RU, "ОДНОРОЗОВЫЙ ПЛАТЕЖ"), new SharedI18n(Lang.EN, "INVOICE")}),
    @JsonEnumDefaultValue
    OTHER(new SharedI18n[]{new SharedI18n(Lang.UZ, "BOSHQA"), new SharedI18n(Lang.RU, "РАЗНОЕ"), new SharedI18n(Lang.EN, "OTHER")});

    private final SharedI18n[] i18ns;

    private RecipientType(SharedI18n... i18ns) {
        this.i18ns = i18ns;
    }
}
