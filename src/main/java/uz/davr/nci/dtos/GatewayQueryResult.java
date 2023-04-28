package uz.davr.nci.dtos;

import uz.davr.nci.enums.RecipientType;
import uz.davr.nci.projection.GatewayResultParamProjection;

import java.io.Serializable;
import java.util.Set;

public class GatewayQueryResult implements Serializable, GatewayResultParamProjection {
    private static final long serialVersionUID = 1L;
    private Double agentFee = 0.0;
    private Boolean gatewayActive = false;
    private Boolean recipientActive = false;
    private Boolean agentRecipientActive = false;
    private Boolean hasCheck = false;
    private Boolean hasPay = false;
    private Boolean hasStatus = false;
    private Boolean hasCancel = false;
    private Boolean hasDeposit = false;
    private String gatewayBean;
    private String gatewayName;
    private Long recipientId;
    private String recipientShortName;
    private String recipientServiceId;
    private Double systemFee = 0.0;
    private Double systemCommissionUp = 0.0;
    private Double systemCommissionDown = 0.0;
    private Integer recipientAmountRatio = 100;
    private Integer recipientCcy = 860;
    private Long recipientMinAmount;
    private Long recipientMaxAmount;
    private Integer recipientLimitRatio = 100;
    private String eposMerchant;
    private String eposTerminal;
    private Integer eposPort;
    private Set<Integer> agentCurrencies = Set.of(860);
    private RecipientType recipientType;
    private Long settingId;
    private String jsonParams;
    private String category;

    public GatewayQueryResult withAgentFee(Double agentFee) {
        this.agentFee = agentFee;
        return this;
    }

    public GatewayQueryResult withGatewayActive(Boolean gatewayActive) {
        this.gatewayActive = gatewayActive;
        return this;
    }

    public GatewayQueryResult withRecipientActive(Boolean recipientActive) {
        this.recipientActive = recipientActive;
        return this;
    }

    public GatewayQueryResult withAgentRecipientActive(Boolean agentRecipientActive) {
        this.agentRecipientActive = agentRecipientActive;
        return this;
    }

    public GatewayQueryResult withHasCheck(Boolean hasCheck) {
        this.hasCheck = hasCheck;
        return this;
    }

    public GatewayQueryResult withHasPay(Boolean hasPay) {
        this.hasPay = hasPay;
        return this;
    }

    public GatewayQueryResult withHasStatus(Boolean hasStatus) {
        this.hasStatus = hasStatus;
        return this;
    }

    public GatewayQueryResult withHasCancel(Boolean hasCancel) {
        this.hasCancel = hasCancel;
        return this;
    }

    public GatewayQueryResult withHasDeposit(Boolean hasDeposit) {
        this.hasDeposit = hasDeposit;
        return this;
    }

    public GatewayQueryResult withGatewayBean(String gatewayBean) {
        this.gatewayBean = gatewayBean;
        return this;
    }

    public GatewayQueryResult withGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
        return this;
    }

    public GatewayQueryResult withRecipientId(Long recipientId) {
        this.recipientId = recipientId;
        return this;
    }

    public GatewayQueryResult withRecipientShortName(String recipientShortName) {
        this.recipientShortName = recipientShortName;
        return this;
    }

    public GatewayQueryResult withRecipientServiceId(String recipientServiceId) {
        this.recipientServiceId = recipientServiceId;
        return this;
    }

    public GatewayQueryResult withSystemFee(Double systemFee) {
        this.systemFee = systemFee;
        return this;
    }

    public GatewayQueryResult withSystemCommissionUp(Double systemCommissionUp) {
        this.systemCommissionUp = systemCommissionUp;
        return this;
    }

    public GatewayQueryResult withSystemCommissionDown(Double systemCommissionDown) {
        this.systemCommissionDown = systemCommissionDown;
        return this;
    }

    public GatewayQueryResult withRecipientAmountRatio(Integer recipientAmountRatio) {
        this.recipientAmountRatio = recipientAmountRatio;
        return this;
    }

    public GatewayQueryResult withRecipientCcy(Integer recipientCcy) {
        this.recipientCcy = recipientCcy;
        return this;
    }

    public GatewayQueryResult withRecipientMinAmount(Long recipientMinAmount) {
        this.recipientMinAmount = recipientMinAmount;
        return this;
    }

    public GatewayQueryResult withRecipientMaxAmount(Long recipientMaxAmount) {
        this.recipientMaxAmount = recipientMaxAmount;
        return this;
    }

    public GatewayQueryResult withRecipientLimitRatio(Integer recipientLimitRatio) {
        this.recipientLimitRatio = recipientLimitRatio;
        return this;
    }

    public GatewayQueryResult withEposMerchant(String eposMerchant) {
        this.eposMerchant = eposMerchant;
        return this;
    }

    public GatewayQueryResult withEposTerminal(String eposTerminal) {
        this.eposTerminal = eposTerminal;
        return this;
    }

    public GatewayQueryResult withEposPort(Integer eposPort) {
        this.eposPort = eposPort;
        return this;
    }

    public GatewayQueryResult withAgentCurrencies(Set<Integer> agentCurrencies) {
        this.agentCurrencies = agentCurrencies;
        return this;
    }

    public GatewayQueryResult withRecipientType(RecipientType recipientType) {
        this.recipientType = recipientType;
        return this;
    }

    public GatewayQueryResult withSettingId(Long settingId) {
        this.settingId = settingId;
        return this;
    }

    public GatewayQueryResult withJsonParams(String jsonParams) {
        this.jsonParams = jsonParams;
        return this;
    }

    public GatewayQueryResult withCategory(String category) {
        this.category = category;
        return this;
    }

    public Double getAgentFee() {
        return this.agentFee;
    }

    public Boolean getGatewayActive() {
        return this.gatewayActive;
    }

    public Boolean getRecipientActive() {
        return this.recipientActive;
    }

    public Boolean getAgentRecipientActive() {
        return this.agentRecipientActive;
    }

    public Boolean getHasCheck() {
        return this.hasCheck;
    }

    public Boolean getHasPay() {
        return this.hasPay;
    }

    public Boolean getHasStatus() {
        return this.hasStatus;
    }

    public Boolean getHasCancel() {
        return this.hasCancel;
    }

    public Boolean getHasDeposit() {
        return this.hasDeposit;
    }

    public String getGatewayBean() {
        return this.gatewayBean;
    }

    public String getGatewayName() {
        return this.gatewayName;
    }

    public Long getRecipientId() {
        return this.recipientId;
    }

    public String getRecipientShortName() {
        return this.recipientShortName;
    }

    public String getRecipientServiceId() {
        return this.recipientServiceId;
    }

    public Double getSystemFee() {
        return this.systemFee;
    }

    public Double getSystemCommissionUp() {
        return this.systemCommissionUp;
    }

    public Double getSystemCommissionDown() {
        return this.systemCommissionDown;
    }

    public Integer getRecipientAmountRatio() {
        return this.recipientAmountRatio;
    }

    public Integer getRecipientCcy() {
        return this.recipientCcy;
    }

    public Long getRecipientMinAmount() {
        return this.recipientMinAmount;
    }

    public Long getRecipientMaxAmount() {
        return this.recipientMaxAmount;
    }

    public Integer getRecipientLimitRatio() {
        return this.recipientLimitRatio;
    }

    public String getEposMerchant() {
        return this.eposMerchant;
    }

    public String getEposTerminal() {
        return this.eposTerminal;
    }

    public Integer getEposPort() {
        return this.eposPort;
    }

    public Set<Integer> getAgentCurrencies() {
        return this.agentCurrencies;
    }

    public RecipientType getRecipientType() {
        return this.recipientType;
    }

    public Long getSettingId() {
        return this.settingId;
    }

    public String getJsonParams() {
        return this.jsonParams;
    }

    public String getCategory() {
        return this.category;
    }

    public void setAgentFee(Double agentFee) {
        this.agentFee = agentFee;
    }

    public void setGatewayActive(Boolean gatewayActive) {
        this.gatewayActive = gatewayActive;
    }

    public void setRecipientActive(Boolean recipientActive) {
        this.recipientActive = recipientActive;
    }

    public void setAgentRecipientActive(Boolean agentRecipientActive) {
        this.agentRecipientActive = agentRecipientActive;
    }

    public void setHasCheck(Boolean hasCheck) {
        this.hasCheck = hasCheck;
    }

    public void setHasPay(Boolean hasPay) {
        this.hasPay = hasPay;
    }

    public void setHasStatus(Boolean hasStatus) {
        this.hasStatus = hasStatus;
    }

    public void setHasCancel(Boolean hasCancel) {
        this.hasCancel = hasCancel;
    }

    public void setHasDeposit(Boolean hasDeposit) {
        this.hasDeposit = hasDeposit;
    }

    public void setGatewayBean(String gatewayBean) {
        this.gatewayBean = gatewayBean;
    }

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    public void setRecipientId(Long recipientId) {
        this.recipientId = recipientId;
    }

    public void setRecipientShortName(String recipientShortName) {
        this.recipientShortName = recipientShortName;
    }

    public void setRecipientServiceId(String recipientServiceId) {
        this.recipientServiceId = recipientServiceId;
    }

    public void setSystemFee(Double systemFee) {
        this.systemFee = systemFee;
    }

    public void setSystemCommissionUp(Double systemCommissionUp) {
        this.systemCommissionUp = systemCommissionUp;
    }

    public void setSystemCommissionDown(Double systemCommissionDown) {
        this.systemCommissionDown = systemCommissionDown;
    }

    public void setRecipientAmountRatio(Integer recipientAmountRatio) {
        this.recipientAmountRatio = recipientAmountRatio;
    }

    public void setRecipientCcy(Integer recipientCcy) {
        this.recipientCcy = recipientCcy;
    }

    public void setRecipientMinAmount(Long recipientMinAmount) {
        this.recipientMinAmount = recipientMinAmount;
    }

    public void setRecipientMaxAmount(Long recipientMaxAmount) {
        this.recipientMaxAmount = recipientMaxAmount;
    }

    public void setRecipientLimitRatio(Integer recipientLimitRatio) {
        this.recipientLimitRatio = recipientLimitRatio;
    }

    public void setEposMerchant(String eposMerchant) {
        this.eposMerchant = eposMerchant;
    }

    public void setEposTerminal(String eposTerminal) {
        this.eposTerminal = eposTerminal;
    }

    public void setEposPort(Integer eposPort) {
        this.eposPort = eposPort;
    }

    public void setAgentCurrencies(Set<Integer> agentCurrencies) {
        this.agentCurrencies = agentCurrencies;
    }

    public void setRecipientType(RecipientType recipientType) {
        this.recipientType = recipientType;
    }

    public void setSettingId(Long settingId) {
        this.settingId = settingId;
    }

    public void setJsonParams(String jsonParams) {
        this.jsonParams = jsonParams;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String toString() {
        Double var10000 = this.getAgentFee();
        return "GatewayQueryResult(agentFee=" + var10000 + ", gatewayActive=" + this.getGatewayActive() + ", recipientActive=" + this.getRecipientActive() + ", agentRecipientActive=" + this.getAgentRecipientActive() + ", hasCheck=" + this.getHasCheck() + ", hasPay=" + this.getHasPay() + ", hasStatus=" + this.getHasStatus() + ", hasCancel=" + this.getHasCancel() + ", hasDeposit=" + this.getHasDeposit() + ", gatewayBean=" + this.getGatewayBean() + ", gatewayName=" + this.getGatewayName() + ", recipientId=" + this.getRecipientId() + ", recipientShortName=" + this.getRecipientShortName() + ", recipientServiceId=" + this.getRecipientServiceId() + ", systemFee=" + this.getSystemFee() + ", systemCommissionUp=" + this.getSystemCommissionUp() + ", systemCommissionDown=" + this.getSystemCommissionDown() + ", recipientAmountRatio=" + this.getRecipientAmountRatio() + ", recipientCcy=" + this.getRecipientCcy() + ", recipientMinAmount=" + this.getRecipientMinAmount() + ", recipientMaxAmount=" + this.getRecipientMaxAmount() + ", recipientLimitRatio=" + this.getRecipientLimitRatio() + ", eposMerchant=" + this.getEposMerchant() + ", eposTerminal=" + this.getEposTerminal() + ", eposPort=" + this.getEposPort() + ", agentCurrencies=" + this.getAgentCurrencies() + ", recipientType=" + this.getRecipientType() + ", settingId=" + this.getSettingId() + ", jsonParams=" + this.getJsonParams() + ", category=" + this.getCategory() + ")";
    }

    public GatewayQueryResult() {
        this.recipientType = RecipientType.SIMPLE;
    }

    public GatewayQueryResult(Double agentFee, Boolean gatewayActive, Boolean recipientActive, Boolean agentRecipientActive, Boolean hasCheck, Boolean hasPay, Boolean hasStatus, Boolean hasCancel, Boolean hasDeposit, String gatewayBean, String gatewayName, Long recipientId, String recipientShortName, String recipientServiceId, Double systemFee, Double systemCommissionUp, Double systemCommissionDown, Integer recipientAmountRatio, Integer recipientCcy, Long recipientMinAmount, Long recipientMaxAmount, Integer recipientLimitRatio, String eposMerchant, String eposTerminal, Integer eposPort, Set<Integer> agentCurrencies, RecipientType recipientType, Long settingId, String jsonParams, String category) {
        this.recipientType = RecipientType.SIMPLE;
        this.agentFee = agentFee;
        this.gatewayActive = gatewayActive;
        this.recipientActive = recipientActive;
        this.agentRecipientActive = agentRecipientActive;
        this.hasCheck = hasCheck;
        this.hasPay = hasPay;
        this.hasStatus = hasStatus;
        this.hasCancel = hasCancel;
        this.hasDeposit = hasDeposit;
        this.gatewayBean = gatewayBean;
        this.gatewayName = gatewayName;
        this.recipientId = recipientId;
        this.recipientShortName = recipientShortName;
        this.recipientServiceId = recipientServiceId;
        this.systemFee = systemFee;
        this.systemCommissionUp = systemCommissionUp;
        this.systemCommissionDown = systemCommissionDown;
        this.recipientAmountRatio = recipientAmountRatio;
        this.recipientCcy = recipientCcy;
        this.recipientMinAmount = recipientMinAmount;
        this.recipientMaxAmount = recipientMaxAmount;
        this.recipientLimitRatio = recipientLimitRatio;
        this.eposMerchant = eposMerchant;
        this.eposTerminal = eposTerminal;
        this.eposPort = eposPort;
        this.agentCurrencies = agentCurrencies;
        this.recipientType = recipientType;
        this.settingId = settingId;
        this.jsonParams = jsonParams;
        this.category = category;
    }
}
