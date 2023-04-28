package uz.davr.nci.projection;

import uz.davr.nci.enums.RecipientType;

import java.io.Serializable;
import java.util.Set;

public interface GatewayResultParamProjection extends Serializable {
    Boolean getGatewayActive();

    Boolean getRecipientActive();

    Boolean getAgentRecipientActive();

    Boolean getHasCheck();

    Boolean getHasPay();

    Boolean getHasStatus();

    Boolean getHasCancel();

    Boolean getHasDeposit();

    String getGatewayBean();

    String getGatewayName();

    Long getRecipientId();

    String getRecipientShortName();

    Double getAgentFee();

    String getRecipientServiceId();

    Double getSystemFee();

    Double getSystemCommissionUp();

    Double getSystemCommissionDown();

    Integer getRecipientAmountRatio();

    Integer getRecipientCcy();

    Long getRecipientMinAmount();

    Long getRecipientMaxAmount();

    Integer getRecipientLimitRatio();

    String getEposMerchant();

    String getEposTerminal();

    Integer getEposPort();

    Set<Integer> getAgentCurrencies();

    RecipientType getRecipientType();

    Long getSettingId();

    String getJsonParams();

    String getCategory();
}
