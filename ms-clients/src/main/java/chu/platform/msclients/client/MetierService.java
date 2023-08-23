package chu.platform.msclients.client;//package chu.platform.msclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(name = "ms-metier")
public interface MetierService {

    @GetMapping("/metier/api/listmetier")
    public ResponseEntity<List<String>> listAllMetiers(@RequestHeader("Authorization") String token);



}