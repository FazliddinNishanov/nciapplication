package uz.davr.nci.data;

import uz.davr.nci.dtos.GatewayResult;
import uz.davr.nci.enums.TransactionStatus;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class MockGatewayResultData {

    public static GatewayResult gatewayResultCheck(){
        GatewayResult result = new GatewayResult();
        result.setSuccess(true);
        Map<String,Object> responseJson = new HashMap<>();
        responseJson.put("CHECK", "CHECKresponseJson");
        result.setResponseJson(responseJson);
        result.setResponseTime(Instant.parse("2023-03-03T11:24:20.00Z"));
        result.setResponseCode("05");
        result.setResponseText("Response Text gatewayResultCheck");
        result.setExtId("AAdd--vfsv");
        result.setBillId(631555115L);
        result.setStatus(TransactionStatus.CHECKING);
        result.setRecommendedSenderAmountCents(8855113344L);
        return result;
    }
    public static GatewayResult gatewayResultPay(){
        GatewayResult result = new GatewayResult();
        result.setSuccess(true);
        Map<String,Object> responseJson = new HashMap<>();
        responseJson.put("PAY", "PAYresponseJson");
        result.setResponseJson(responseJson);
        result.setResponseTime(Instant.parse("2023-02-03T11:15:25.00Z"));
        result.setResponseCode("05");
        result.setResponseText("Response Text gatewayResultPay");
        result.setExtId("AAdd--vfsv");
        result.setBillId(56679878788L);
        result.setStatus(TransactionStatus.PAYING);
        result.setRecommendedSenderAmountCents(8855113344L);
        return result;
    }
    public static GatewayResult gatewayResultCancel(){
        GatewayResult result = new GatewayResult();
        result.setSuccess(true);
        Map<String,Object> responseJson = new HashMap<>();
        responseJson.put("ABS", "responseJson");
        result.setResponseJson(responseJson);
        result.setResponseTime(Instant.parse("2023-04-03T11:25:30.00Z"));
        result.setResponseCode("05");
        result.setResponseText("Response Text");
        result.setExtId("AAdd--vfsv");
        result.setBillId(4451564854L);
        result.setStatus(TransactionStatus.CANCELLED);
        result.setRecommendedSenderAmountCents(8855113344L);
        return result;
    }



}
