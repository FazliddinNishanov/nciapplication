package uz.davr.nci.dtos;

public class SharedCancelDTO {
    private String login;
    private GatewayQueryResult recipientParams;
    private Long tranId;
    private Long billId;
    private String recipientTrId;
    private Double gatewayAmount;

    public SharedCancelDTO() {
    }

    public SharedCancelDTO tranId(Long tranId) {
        this.tranId = tranId;
        return this;
    }

    public SharedCancelDTO login(String login) {
        this.login = login;
        return this;
    }

    public SharedCancelDTO recipientParams(GatewayQueryResult recipientParams) {
        this.recipientParams = recipientParams;
        return this;
    }

    public SharedCancelDTO billId(Long billId) {
        this.billId = billId;
        return this;
    }

    public SharedCancelDTO recipientTrId(String recipientTrId) {
        this.recipientTrId = recipientTrId;
        return this;
    }

    public SharedCancelDTO gatewayAmount(Double gatewayAmount) {
        this.gatewayAmount = gatewayAmount;
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

    public Long getBillId() {
        return this.billId;
    }

    public String getRecipientTrId() {
        return this.recipientTrId;
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

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public void setRecipientTrId(String recipientTrId) {
        this.recipientTrId = recipientTrId;
    }

    public void setGatewayAmount(Double gatewayAmount) {
        this.gatewayAmount = gatewayAmount;
    }

    public String toString() {
        String var10000 = this.getLogin();
        return "SharedCancelDTO(login=" + var10000 + ", recipientParams=" + this.getRecipientParams() + ", tranId=" + this.getTranId() + ", billId=" + this.getBillId() + ", recipientTrId=" + this.getRecipientTrId() + ", gatewayAmount=" + this.getGatewayAmount() + ")";
    }
}
