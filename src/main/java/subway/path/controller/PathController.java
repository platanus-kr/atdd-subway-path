package subway.path.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/path")
public class PathController {
    @GetMapping
    public ResponseEntity<Void> getPath(@RequestParam Long source, @RequestParam Long target) {


        return ResponseEntity.ok().build();
    }
}
