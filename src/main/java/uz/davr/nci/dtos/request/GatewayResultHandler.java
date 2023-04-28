package uz.davr.nci.dtos.request;

import java.time.Instant;
import java.util.Map;

public interface GatewayResultHandler {
    void preSaveRequestParams(Map<String, Object> var1, Instant var2);

    Long getBillId();
}
