package uz.davr.nci.service;

import org.springframework.stereotype.Service;
import uz.davr.nci.dtos.GatewayResult;
import uz.davr.nci.dtos.SharedCancelDTO;
import uz.davr.nci.dtos.SharedPayDTO;
import uz.davr.nci.dtos.request.CancelHandler;
import uz.davr.nci.dtos.request.GatewayResultHandler;
import uz.davr.nci.dtos.request.PrepayHandler;
import uz.davr.nci.dtos.request.SharedCheckDTO;

import javax.validation.constraints.NotNull;

@Service
public interface NciTransService {

    GatewayResult check(SharedCheckDTO sharedCheckDTO /*, GatewayResultHandler gatewayResultHandler*/);

    GatewayResult pay(SharedPayDTO sharedPayDTO /*, PrepayHandler prepayHandler*/);

    GatewayResult cancel(@NotNull SharedCancelDTO sharedCancelDTO /*, @NotNull CancelHandler cancelHandler*/);
}
