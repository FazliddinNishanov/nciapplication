package uz.davr.nci.dtos;

import uz.davr.nci.dtos.request.CommonPayRequest;

public class SharedPayDTO {
    private String login;
    private GatewayQueryResult recipientParams;
    private Long tranId;
    private CommonPayRequest payDTO;
    private Double gatewayAmount;

    public SharedPayDTO() {
    }

    public SharedPayDTO tranId(Long tranId) {
        this.tranId = tranId;
        return this;
    }

    public SharedPayDTO payDTO(CommonPayRequest payDTO) {
        this.payDTO = payDTO;
        return this;
    }

    public SharedPayDTO gatewayAmount(Double gatewayAmount) {
        this.gatewayAmount = gatewayAmount;
        return this;
    }

    public SharedPayDTO login(String login) {
        this.login = login;
        return this;
    }

    public SharedPayDTO recipientParams(GatewayQueryResult recipientParams) {
        this.recipientParams = recipientParams;
        return this;
    }

    public String getLogin() {
        return this.login;
    }

    public GatewayQueryResult getRecipientParams() {
        return this.recipientParams;
    }

    public Long getTranId() {
        return this.tranId;
    }

    public CommonPayRequest getPayDTO() {
        return this.payDTO;
    }

    public Double getGatewayAmount() {
        return this.gatewayAmount;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setRecipientParams(GatewayQueryResult recipientParams) {
        this.recipientParams = recipientParams;
    }

    public void setTranId(Long tranId) {
        this.tranId = tranId;
    }

    public void setPayDTO(CommonPayRequest payDTO) {
        this.payDTO = payDTO;
    }

    public void setGatewayAmount(Double gatewayAmount) {
        this.gatewayAmount = gatewayAmount;
    }

    public String toString() {
        String var10000 = this.getLogin();
        return "SharedPayDTO(login=" + var10000 + ", recipientParams=" + this.getRecipientParams() + ", tranId=" + this.getTranId() + ", payDTO=" + this.getPayDTO() + ", gatewayAmount=" + this.getGatewayAmount() + ")";
    }
}
