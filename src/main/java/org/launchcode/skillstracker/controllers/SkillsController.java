package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody

public class SkillsController {

    @GetMapping
    public static String introText() {
        return "<html>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Programming Languages</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "<li>Ruby</li>" +
                "</ol>" +
                "</html>";
    }

    @GetMapping("form")
    public String form() {
        return "<html>" +
                "<form method='post' action='formdata'>" +
                "<h2>Name:</h2>" +
                "<input type='text' name='name'>" +
                "<h2>My favorite language</h2>" +
                "<select name='language1' id='language1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "</select>" +
                "<h2>My second favorite language</h2>" +
                "<select name='language2' id='language2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "</select>" +
                "<h2>My third favorite language</h2>" +
                "<select name='language3' id='language3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "</select>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</html>";

    }

    @PostMapping("formdata")
    public String formResults(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3){

        return "<html>" +
                "<h1>"+ name +"</h1>" +
                "<table>" +
                "<tr>" +
                "<th> Favorite Languages</th>" +
                "</tr>" +
                "<tr><td>" + language1 + "</td></tr>" +
                "<tr><td>" + language2 + "</td></tr>" +
                "<tr><td>" + language3 + "</td></tr>" +
                "</table>" +
                "</html>";

}

}
