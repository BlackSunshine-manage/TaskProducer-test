package corp.testing.example.core.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class TaskControllerImpl implements ApiApi {

    @Autowired
    private TaskRepositoryImpl warehouse;

    @Override
    public ResponseEntity<List<Task>> findAll() {
        return ApiApi.super.findAll();
    }

    //    @PostMapping(path="/add") // Map ONLY POST Requests
//    public @ResponseBody String createTask (
//            @RequestParam String name,
//            @RequestParam String email) {
//        // @ResponseBody means the returned String is the response, not a view name
//        // @RequestParam means it is a parameter from the GET or POST request
//
//        TaskEntityImpl n = new TaskEntityImpl();
//        n.setName(name);
//        n.setEmail(email);
//        warehouse.save(n);
//        return "Saved";
//    }
//
//    @GetMapping(path="/all")
//    public @ResponseBody Iterable<TaskEntityImpl> getAllUsers() {
//        // This returns a JSON or XML with the users
//        return warehouse.findAll();
//    }
}