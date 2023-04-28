package uz.davr.nci.dtos;

import uz.davr.nci.enums.TransactionStatus;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class GatewayResult {
    private boolean success;
    private Map<String, Object> responseJson;
    private Instant responseTime;
    private String responseCode;
    private String responseText;
    private String extId;
    private Long billId;
    private TransactionStatus status;
    private Long recommendedSenderAmountCents;
    /** @deprecated */
    @Deprecated
    private Map<String, String> more;

    public GatewayResult() {
        this.status = TransactionStatus.NEW;
        this.more = new HashMap(0);
    }

    public boolean isSuccess() {
        return this.success;
    }

    public GatewayResult success(boolean success) {
        this.success = success;
        return this;
    }

    public GatewayResult responseJson(Map<String, Object> responseJson) {
        this.responseJson = responseJson;
        return this;
    }

    public GatewayResult responseTime(Instant responseTime) {
        this.responseTime = responseTime;
        return this;
    }

    public GatewayResult responseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    public GatewayResult responseText(String responseText) {
        this.responseText = responseText;
        return this;
    }

    public GatewayResult extId(String extId) {
        this.extId = extId;
        return this;
    }

    public GatewayResult more(Map<String, String> more) {
        if (more != null) {
            this.more = more;
        }

        return this;
    }

    public GatewayResult addMore(String name, String more) {
        if (this.more == null) {
            this.more = new HashMap(5);
        }

        this.more.put(name, more);
        return this;
    }

    public GatewayResult withSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public GatewayResult withResponseJson(Map<String, Object> responseJson) {
        this.responseJson = responseJson;
        return this;
    }

    public GatewayResult withResponseTime(Instant responseTime) {
        this.responseTime = responseTime;
        return this;
    }

    public GatewayResult withResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    public GatewayResult withResponseText(String responseText) {
        this.responseText = responseText;
        return this;
    }

    public GatewayResult withExtId(String extId) {
        this.extId = extId;
        return this;
    }

    public GatewayResult withStatus(TransactionStatus status) {
        this.status = status;
        return this;
    }

    public GatewayResult withMore(Map<String, String> more) {
        this.more = more;
        return this;
    }

    public GatewayResult withBillId(Long billId) {
        this.billId = billId;
        return this;
    }

    public GatewayResult withRecommendedSenderAmountCents(Long recommendedSenderAmountCents) {
        this.recommendedSenderAmountCents = recommendedSenderAmountCents;
        return this;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setResponseJson(Map<String, Object> responseJson) {
        this.responseJson = responseJson;
    }

    public void setResponseTime(Instant responseTime) {
        this.responseTime = responseTime;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public void setResponseText(String responseText) {
        this.responseText = responseText;
    }

    public void setExtId(String extId) {
        this.extId = extId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public void setRecommendedSenderAmountCents(Long recommendedSenderAmountCents) {
        this.recommendedSenderAmountCents = recommendedSenderAmountCents;
    }

    /** @deprecated */
    @Deprecated
    public void setMore(Map<String, String> more) {
        this.more = more;
    }

    public Map<String, Object> getResponseJson() {
        return this.responseJson;
    }

    public Instant getResponseTime() {
        return this.responseTime;
    }

    public String getResponseCode() {
        return this.responseCode;
    }

    public String getResponseText() {
        return this.responseText;
    }

    public String getExtId() {
        return this.extId;
    }

    public Long getBillId() {
        return this.billId;
    }

    public TransactionStatus getStatus() {
        return this.status;
    }

    public Long getRecommendedSenderAmountCents() {
        return this.recommendedSenderAmountCents;
    }

    /** @deprecated */
    @Deprecated
    public Map<String, String> getMore() {
        return this.more;
    }

    public String toString() {
        boolean var10000 = this.isSuccess();
        return "GatewayResult(success=" + var10000 + ", responseJson=" + this.getResponseJson() + ", responseTime=" + this.getResponseTime() + ", responseCode=" + this.getResponseCode() + ", responseText=" + this.getResponseText() + ", extId=" + this.getExtId() + ", billId=" + this.getBillId() + ", status=" + this.getStatus() + ", recommendedSenderAmountCents=" + this.getRecommendedSenderAmountCents() + ", more=" + this.getMore() + ")";
    }
}
