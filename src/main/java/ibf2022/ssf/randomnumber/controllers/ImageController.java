package ibf2022.ssf.randomnumber.controllers;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = { "/", "/index.html" }, produces = MediaType.TEXT_HTML_VALUE)
public class ImageController {
    private Logger logger = Logger.getLogger(ImageController.class.getName());

    @GetMapping
    public String getRandomNumber(Model model) {
        Random random = new Random();
        int rand = random.nextInt(0, 31);
        logger.log(Level.INFO, "imgIndex = %d".formatted(rand));
        model.addAttribute("randomNumber", rand);
        return "index";
    }

}
