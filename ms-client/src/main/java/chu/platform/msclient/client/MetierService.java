//package chu.platform.msclient.client;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.List;
//
//@FeignClient(name = "ms-metier", url = "http://localhost:8082/metier/api")
//public interface MetierService {
//
//    @GetMapping("/listmetier")
//    public ResponseEntity<List<String>> listAllMetiers();
//
//
//
//}