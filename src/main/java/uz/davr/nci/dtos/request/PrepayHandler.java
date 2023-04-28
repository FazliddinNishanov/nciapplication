package uz.davr.nci.dtos.request;

import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.Map;

public interface PrepayHandler {
    void saveRequestParams(@NotNull Map<String, Object> var1, @NotNull Instant var2);

    Map<String, Object> getCheckRequestJson();

    Map<String, Object> getCheckResponseJson();

    String getAccount();

    Integer getCurrency();

    String getExtId();
}
