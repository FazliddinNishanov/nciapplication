package uz.davr.nci.dtos.request;

import uz.davr.nci.dtos.GatewayQueryResult;

public class SharedCheckDTO {
    private String login;
    private GatewayQueryResult recipientParams;
    private CommonCheckRequest checkDTO;
    private Long tranId;
    private Double gatewayAmount;

    public SharedCheckDTO() {
    }

    public SharedCheckDTO login(String login) {
        this.login = login;
        return this;
    }

    public SharedCheckDTO recipientParams(GatewayQueryResult recipientParams) {
        this.recipientParams = recipientParams;
        return this;
    }

    public SharedCheckDTO checkDTO(CommonCheckRequest checkDTO) {
        this.checkDTO = checkDTO;
        return this;
    }

    public SharedCheckDTO tranId(Long tranId) {
        this.tranId = tranId;
        return this;
    }

    public SharedCheckDTO gatewayAmount(Double gatewayAmount) {
        this.gatewayAmount = gatewayAmount;
        return this;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setRecipientParams(GatewayQueryResult recipientParams) {
        this.recipientParams = recipientParams;
    }

    public void setCheckDTO(CommonCheckRequest checkDTO) {
        this.checkDTO = checkDTO;
    }

    public void setTranId(Long tranId) {
        this.tranId = tranId;
    }

    public void setGatewayAmount(Double gatewayAmount) {
        this.gatewayAmount = gatewayAmount;
    }

    public String getLogin() {
        return this.login;
    }

    public GatewayQueryResult getRecipientParams() {
        return this.recipientParams;
    }

    public CommonCheckRequest getCheckDTO() {
        return this.checkDTO;
    }

    public Long getTranId() {
        return this.tranId;
    }

    public Double getGatewayAmount() {
        return this.gatewayAmount;
    }

    public String toString() {
        String var10000 = this.getLogin();
        return "SharedCheckDTO(login=" + var10000 + ", recipientParams=" + this.getRecipientParams() + ", checkDTO=" + this.getCheckDTO() + ", tranId=" + this.getTranId() + ", gatewayAmount=" + this.getGatewayAmount() + ")";
    }
}
