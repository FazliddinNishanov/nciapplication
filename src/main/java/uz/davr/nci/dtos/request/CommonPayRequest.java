package uz.davr.nci.dtos.request;

import uz.davr.nci.enums.PayType;

import java.util.Map;

public interface CommonPayRequest {
    Long getBillId();

    void setBillId(Long var1);

    Long getAmount();

    void setAmount(Long var1);

    PayType getType();

    void setType(PayType var1);

    Double getGatewayAmount();

    void setGatewayAmount(Double var1);

    Long getSettingId();

    void setSettingId(Long var1);

    Map<String, Object> getParams();

    void setParams(Map<String, Object> var1);

    Map<String, Object> getAgentParams();

    void setAgentParams(Map<String, Object> var1);

    Long getTranId();

    void setTranId(Long var1);

    CommonPayRequest billId(Long var1);

    CommonPayRequest amount(Long var1);

    CommonPayRequest params(Map<String, Object> var1);

    CommonPayRequest type(PayType var1);

    CommonPayRequest settingId(Long var1);

    CommonPayRequest agentParams(Map<String, Object> var1);
}
