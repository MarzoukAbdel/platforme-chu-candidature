package chu.platform.msmetier.controller;


import chu.platform.msmetier.dto.MetierDto;
import chu.platform.msmetier.entity.Metier;
import chu.platform.msmetier.service.MetierServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/metier/api")
@RequiredArgsConstructor

public class MetierController {

final private MetierServiceImp metierService;

    @GetMapping("/listmetier")
    @CrossOrigin(origins = "http://localhost:3000")

    public ResponseEntity<List<Metier>> getMetiers()
    {
        return ResponseEntity.ok(metierService.listAllMetiers());

    }


    @GetMapping("/metierbyid/{id}")
    public ResponseEntity<MetierDto> getMetierById(@RequestParam("id") Long id)
    {
        MetierDto metierDto = metierService.getMetierById(id);
        return ResponseEntity.ok().body(metierDto);
    }

    

    //@CrossOrigin
    @GetMapping("/listmetiers")
    public ResponseEntity<List<String>> getMetiersd()
    {
        List<String > ss = new ArrayList<>();
        ss.add("info");
        ss.add("managmlent");
        ss.add("culture");
        //return ResponseEntity.ok(metierService.listAllMetiers());
        return ResponseEntity.ok(ss);
    }
}
