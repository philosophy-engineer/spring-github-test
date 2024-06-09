package projects.springgithubtest.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import projects.springgithubtest.model.DummyModel;

@RestController()
public class DummyAPI {

    @GetMapping("/dummy")
    public ResponseEntity<DummyModel> dummy() {
        DummyModel dummyModel = new DummyModel("It is dummy api");
        return new ResponseEntity<>(dummyModel, HttpStatus.OK);
    }

}
