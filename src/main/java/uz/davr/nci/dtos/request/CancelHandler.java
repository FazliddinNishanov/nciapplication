package uz.davr.nci.dtos.request;

import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.Map;

public interface CancelHandler {
    void saveRequestParams(@NotNull Map<String, Object> var1, @NotNull Instant var2);

    Map<String, Object> getPayRequestJson();

    Map<String, Object> getPayResponseJson();

    String getAccount();

    Integer getCurrency();

    String getExtId();
}
