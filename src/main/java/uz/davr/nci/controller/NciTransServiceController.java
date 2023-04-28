package uz.davr.nci.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.davr.nci.dtos.GatewayResult;
import uz.davr.nci.dtos.SharedCancelDTO;
import uz.davr.nci.dtos.SharedPayDTO;
import uz.davr.nci.dtos.request.SharedCheckDTO;
import uz.davr.nci.service.NciTransService;

@RestController
@RequestMapping("/api/nci")
@RequiredArgsConstructor
public class NciTransServiceController {

    private final NciTransService nciTransService;

    @GetMapping("/check")
    public ResponseEntity<GatewayResult> check(@RequestBody SharedCheckDTO checkDTO ){
        return ResponseEntity.ok(nciTransService.check(checkDTO));
      }

    @GetMapping("/pay")
    public ResponseEntity<GatewayResult> pay(@RequestBody SharedPayDTO sharedPayDTO){
        return ResponseEntity.ok(nciTransService.pay(sharedPayDTO));
    }

    @GetMapping("/cancel")
    public ResponseEntity<GatewayResult> cancel(@RequestBody SharedCancelDTO sharedCancelDTO){
        return ResponseEntity.ok(nciTransService.cancel(sharedCancelDTO));
    }

}
