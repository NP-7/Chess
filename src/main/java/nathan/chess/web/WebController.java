//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//public class WebController {
//
//    @GetMapping("/")
//    public String index(Model model) {
//        model.addAttribute("name", "Spring Boot 4.0 RC1");
//        return "index"; // corresponds to templates/index.html
//    }
//
//    @PostMapping("/nextMovement")
//    public String nextMovement(@RequestParam("nextMovement") String inputText, Model model) {
//        String upper = inputText.toUpperCase();
//        model.addAttribute("name", upper);
//        return "index";
//    }
//}
