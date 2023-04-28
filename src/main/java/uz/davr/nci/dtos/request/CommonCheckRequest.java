package uz.davr.nci.dtos.request;

import java.util.Map;

public interface CommonCheckRequest {
    Long getTranId();

    void setTranId(Long var1);

    Integer getAmountRatio();

    void setAmountRatio(Integer var1);

    Double getGatewayAmount();

    void setGatewayAmount(Double var1);

    Integer getCurrency();

    void setCurrency(Integer var1);

    Map<String, Object> getAgentParams();

    void setAgentParams(Map<String, Object> var1);

    String getAccount();

    void setAccount(String var1);

    Long getAmount();

    void setAmount(Long var1);

    Long getRecipientId();

    void setRecipientId(Long var1);

    Map<String, Object> getParams();

    void setParams(Map<String, Object> var1);

    String getAgentTranId();

    void setAgentTranId(String var1);

    String getRequestGroup();

    void setRequestGroup(String var1);

    String getRequestSubGroup();

    void setRequestSubGroup(String var1);

    CommonCheckRequest recipientId(Long var1);

    CommonCheckRequest account(String var1);

    CommonCheckRequest amount(Long var1);

    CommonCheckRequest params(Map<String, Object> var1);

    CommonCheckRequest agentParams(Map<String, Object> var1);

    CommonCheckRequest currency(Integer var1);

    CommonCheckRequest tranId(String var1);

    CommonCheckRequest gatewayAmount(Double var1);

    CommonCheckRequest amountRatio(Integer var1);

    CommonCheckRequest agentTranId(String var1);

    CommonCheckRequest requestGroup(String var1);

    CommonCheckRequest requestSubGroup(String var1);

    CommonCheckRequest tranId(Long var1);

    public interface RequireAmount {
    }
}
