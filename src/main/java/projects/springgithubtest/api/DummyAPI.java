package projects.springgithubtest.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import projects.springgithubtest.model.DummyModel;

import java.util.HashMap;

@RestController()
public class DummyAPI {

    @GetMapping("/dummy")
    public ResponseEntity<DummyModel> dummy() {
        DummyModel dummyModel = new DummyModel("It is dummy api");
        return new ResponseEntity<>(dummyModel, HttpStatus.OK);
    }

    @GetMapping("/dummy-and-dummy")
    public ResponseEntity<?> dummy2() {
        DummyModel dummyModel1 = new DummyModel("It is first dummy api");
        DummyModel dummyModel2 = new DummyModel("It is second dummy api");
        HashMap<Long, DummyModel> hashMap = new HashMap<>();
        hashMap.put(1L, dummyModel1);
        hashMap.put(2L, dummyModel2);
        return new ResponseEntity<>(hashMap, HttpStatus.OK);
    }

}
