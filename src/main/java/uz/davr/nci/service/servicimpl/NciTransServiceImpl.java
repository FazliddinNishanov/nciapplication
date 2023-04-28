package uz.davr.nci.service.servicimpl;

import org.springframework.stereotype.Service;
import uz.davr.nci.data.MockGatewayResultData;
import uz.davr.nci.dtos.GatewayResult;
import uz.davr.nci.dtos.SharedCancelDTO;
import uz.davr.nci.dtos.SharedPayDTO;
import uz.davr.nci.dtos.request.*;
import uz.davr.nci.service.NciTransService;


@Service
public class NciTransServiceImpl implements NciTransService {

    @Override
    public GatewayResult check(SharedCheckDTO sharedCheckDTO) {
        return MockGatewayResultData.gatewayResultCheck();
    }
    @Override
    public GatewayResult pay(SharedPayDTO sharedPayDTO) {
        return MockGatewayResultData.gatewayResultPay();
    }
    @Override
    public GatewayResult cancel(SharedCancelDTO sharedCancelDTO) {
        return MockGatewayResultData.gatewayResultCancel();
    }

}
