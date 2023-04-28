package uz.davr.nci.enums;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import uz.davr.nci.dtos.SharedI18n;

import java.util.Arrays;
import java.util.Optional;

public enum TransactionStatus {
    NEW(new SharedI18n[]{new SharedI18n(Lang.UZ, "YANGI"), new SharedI18n(Lang.RU, "НОВЫЙ"), new SharedI18n(Lang.EN, "NEW")}),
    CHECK_OK(new SharedI18n[]{new SharedI18n(Lang.UZ, "TEKSHIRUV O'TDI"), new SharedI18n(Lang.RU, "ПРОВЕРКА ПРОШЛА"), new SharedI18n(Lang.EN, "CHECK_OK")}),
    CHECKING(new SharedI18n[]{new SharedI18n(Lang.UZ, "TEKSHIRUV O'TMOQDA"), new SharedI18n(Lang.RU, "ПРОВЕРКА"), new SharedI18n(Lang.EN, "CHECKING")}),
    CHECK_FAIL(new SharedI18n[]{new SharedI18n(Lang.UZ, "TEKSHIRUV O'TMADI"), new SharedI18n(Lang.RU, "ПРОВЕРКА НЕ ПРОШЛА"), new SharedI18n(Lang.EN, "CHECK_FAIL")}),
    WAITING(new SharedI18n[]{new SharedI18n(Lang.UZ, "KUTISH"), new SharedI18n(Lang.RU, "ОЖИДАНИЕ"), new SharedI18n(Lang.EN, "WAITING")}),
    PAYING(new SharedI18n[]{new SharedI18n(Lang.UZ, "TO'LOV"), new SharedI18n(Lang.RU, "ОПЛАТА"), new SharedI18n(Lang.EN, "PAYING")}),
    SUCCESS(new SharedI18n[]{new SharedI18n(Lang.UZ, "MUVAFFAQIYATLI"), new SharedI18n(Lang.RU, "УСПЕШНО"), new SharedI18n(Lang.EN, "SUCCESS")}),
    FAILED(new SharedI18n[]{new SharedI18n(Lang.UZ, "MUVAFFAQQIYATSIZLIK"), new SharedI18n(Lang.RU, "НЕ УДАЛОСЬ"), new SharedI18n(Lang.EN, "FAILED")}),
    CANCELLED(new SharedI18n[]{new SharedI18n(Lang.UZ, "BEKOR QILINGAN"), new SharedI18n(Lang.RU, "ОТМЕНЕНО"), new SharedI18n(Lang.EN, "CANCELLED")}),
    REVERSED(new SharedI18n[]{new SharedI18n(Lang.UZ, "QAYTARISH"), new SharedI18n(Lang.RU, "ВОЗВРАТ"), new SharedI18n(Lang.EN, "REVERSED")}),
    INVOICE_SENDING(new SharedI18n[]{new SharedI18n(Lang.UZ, "tolov uchun hisob jo'natish"), new SharedI18n(Lang.RU, "ОТПРАВКА СЧЕТА НА ОПЛАТА"), new SharedI18n(Lang.EN, "INVOICE SENDING")}),
    INVOICE_SENT(new SharedI18n[]{new SharedI18n(Lang.UZ, "TO'LOV UCHUN HISOB YUBORILGAN"), new SharedI18n(Lang.RU, "ОТПРАВЛЕН СЧЕТ НА ОПЛАТУ"), new SharedI18n(Lang.EN, "INVOICE_SENT")}),
    INVOICE_PAID(new SharedI18n[]{new SharedI18n(Lang.UZ, "TO'LOV UCHUN HISOB"), new SharedI18n(Lang.RU, "ОПЛАЧЕН СЧЕТ НА ОПЛАТУ"), new SharedI18n(Lang.EN, "INVOICE_PAID")}),
    FINISHED(new SharedI18n[]{new SharedI18n(Lang.UZ, "TUGAGAN"), new SharedI18n(Lang.RU, "ЗАВЕРШЕН"), new SharedI18n(Lang.EN, "FINISHED")}),
    EXPIRED(new SharedI18n[]{new SharedI18n(Lang.UZ, "MUDDATI TUGAGAGAN"), new SharedI18n(Lang.RU, "ИСТЕКШИЙ"), new SharedI18n(Lang.EN, "EXPIRED")}),
    INVOICE_REJECTED(new SharedI18n[]{new SharedI18n(Lang.UZ, "TO'LOV UCHUN HISOB RAD ETILGAN"), new SharedI18n(Lang.RU, "ОТКЛОНЕН СЧЕТ НА ОПЛАТУ"), new SharedI18n(Lang.EN, "INVOICE_REJECTED")}),
    POSTPONED(new SharedI18n[]{new SharedI18n(Lang.UZ, "QOLDIRILDI"), new SharedI18n(Lang.RU, "ОТЛОЖЕН"), new SharedI18n(Lang.EN, "POSTPONED")}),
    OTHER(new SharedI18n[]{new SharedI18n(Lang.UZ, "BOSHQA"), new SharedI18n(Lang.RU, "РАЗНОЕ"), new SharedI18n(Lang.EN, "OTHER")}),
    DEBITED(new SharedI18n[]{new SharedI18n(Lang.UZ, "MABLAG'LAR YECHIB OLINDI"), new SharedI18n(Lang.RU, "СРЕДСТВА СПИСАНЫ"), new SharedI18n(Lang.EN, "DEBITED")}),
    CANCEL_FAILED(new SharedI18n[]{new SharedI18n(Lang.UZ, "BEKOR QILINMADI"), new SharedI18n(Lang.RU, "ОТМЕНИТЬ НЕ УДАЛОСЬ"), new SharedI18n(Lang.EN, "CANCEL FAILED")}),
    R_CANCEL_FAILED(new SharedI18n[]{new SharedI18n(Lang.UZ, "QABUL QILUVCHI BEKOR QILINMADI"), new SharedI18n(Lang.RU, "Получателя отменить не удалось"), new SharedI18n(Lang.EN, " RECIPIENT CANCEL FAILED")}),
    S_CANCEL_FAILED(new SharedI18n[]{new SharedI18n(Lang.UZ, "YUBORUVCHI BEKOR QILINMADI"), new SharedI18n(Lang.RU, "ПРАВИТУЛЯ ОТМЕНИТЬ НЕ УДАЛОСЬ"), new SharedI18n(Lang.EN, "SENDER CANCEL FAILED")}),
    RECIPIENT_CANCELLED(new SharedI18n[]{new SharedI18n(Lang.UZ, "QABUL QILUVCHI BEKOR QILINDI"), new SharedI18n(Lang.RU, "ПОЛУЧАТЕЛЬ ОТМЕНЕН"), new SharedI18n(Lang.EN, "RECIPIENT CANCELLED")}),
    SENDER_CANCELLED(new SharedI18n[]{new SharedI18n(Lang.UZ, "YUBORUVCHI BEKOR QILINDI"), new SharedI18n(Lang.RU, "ОТПРАВИТЕЛЬ ОТМЕНЕН"), new SharedI18n(Lang.EN, "SENDER CANCELLED")}),
    S_NEED_CONFIRM(new SharedI18n[]{new SharedI18n(Lang.UZ, "YUBORUVCHI TASDIQLASHI KERAK"), new SharedI18n(Lang.RU, "ОТПРАВИТЕЛЮ НЕОБХОДИМО ПОДТВЕРДИТЬ"), new SharedI18n(Lang.EN, "SENDER NEED CONFIRM")}),
    R_NEED_CONFIRM(new SharedI18n[]{new SharedI18n(Lang.UZ, "QABUL QILUVCHI TASDIQLASHI KERAK"), new SharedI18n(Lang.RU, "ПОЛУЧАТЕЛЮ НЕОБХОДИМО ПОДТВЕРДИТЬ"), new SharedI18n(Lang.EN, "RECIPIENT NEED CONFIRM")}),
    HOLD_SUCCESS(new SharedI18n[]{new SharedI18n(Lang.UZ, "MUVOFAQQIYATLI HOLDGA QO'YILDI"), new SharedI18n(Lang.RU, "УСПЕШНАЯ ХОЛДИРОВАНИЕ"), new SharedI18n(Lang.EN, "HOLD SUCCESS")}),
    HOLD_ERROR(new SharedI18n[]{new SharedI18n(Lang.UZ, "MUVOFAQQIYATSIZ HOLD"), new SharedI18n(Lang.RU, "НЕ УСПЕШНАЯ ХОЛДИРОВАНИЕ"), new SharedI18n(Lang.EN, "HOLD ERROR")}),
    HOLD_WAITING(new SharedI18n[]{new SharedI18n(Lang.UZ, "NO ANIQ HOLD"), new SharedI18n(Lang.RU, "ОЖИДАНИЕ ХОЛДИРОВАНИЕ"), new SharedI18n(Lang.EN, "WAITING HOLD")}),
    HOLD_CANCELLED(new SharedI18n[]{new SharedI18n(Lang.UZ, "HOLD BEKOR QILINDI"), new SharedI18n(Lang.RU, "ОТМЕНА ХОЛДИРОВАНИЕ"), new SharedI18n(Lang.EN, "HOLD CANCELLED")}),
    HOLD_CONFIRM_ERROR(new SharedI18n[]{new SharedI18n(Lang.UZ, "TASDIQLASHDA XATOLIK"), new SharedI18n(Lang.RU, "ОШИБКА ПОДТВЕРЖДЕНИЕ"), new SharedI18n(Lang.EN, "CONFIRM ERROR")}),
    HOLD_CONFIRM_CANCELLED(new SharedI18n[]{new SharedI18n(Lang.UZ, "TASDIQLASH BEKOR QILINDI"), new SharedI18n(Lang.RU, "ОТМЕНА ПОДТВЕРЖДЕНИЕ"), new SharedI18n(Lang.EN, "HOLD CONFIRM CANCELLED")}),
    GATEWAY_SUCCESS(new SharedI18n[]{new SharedI18n(Lang.UZ, "GATEWAY STATUS MUVOFAQQIYATLI"), new SharedI18n(Lang.RU, "УСПЕШНАЯ СТАТУС ШЛЮЗА"), new SharedI18n(Lang.EN, "GATEWAY SUCCESS")}),
    GATEWAY_FAILED(new SharedI18n[]{new SharedI18n(Lang.UZ, "GATEWAY STATUS MUVOFAQQIYATSIZ"), new SharedI18n(Lang.RU, "НЕ УСПЕШНАЯ СТАТУС ШЛЮЗА"), new SharedI18n(Lang.EN, "GATEWAY ERROR")}),
    @JsonEnumDefaultValue
    UNKNOWN(new SharedI18n[]{new SharedI18n(Lang.UZ, "No'malum xatolik"), new SharedI18n(Lang.RU, "Не известная ошибка"), new SharedI18n(Lang.EN, "Unknown exception")});

    private final SharedI18n[] i18ns;

    private TransactionStatus(SharedI18n... i18ns) {
        this.i18ns = i18ns;
    }

    public static Optional<TransactionStatus> fromText(String name) {
        return Arrays.stream(values()).filter((bl) -> {
            return bl.name().equalsIgnoreCase(name);
        }).findFirst();
    }
}
