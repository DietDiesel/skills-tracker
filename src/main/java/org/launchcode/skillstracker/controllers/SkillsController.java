package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Controller
public class SkillsController {

    String htmlHead = "<!DOCTYPE html>\n" +
                      "<html lang='en'>\n" +
                      "<head>\n" +
                      "    <meta charset='UTF-8'>\n" +
                      "    <title>Fave Lang Form Exercise</title>\n" +
                      "</head>\n" +
                      "<body>\n" +
                      "<div style='display:block; margin-left:auto; margin-right:auto; width:25%;'>\n";

    String htmlResponseTable1 = "<div style='width=100%; display:flex; flex-direction: column;'>\n<h3>Name:</h3>\n<h2>";
    String htmlResponseTable2 = "</h2>\n<h3>My favorite language:</h3>\n<h2>";
    String htmlResponseTable3 = "</h2>\n<h3>This one is cool too:</h3>\n<h2>";
    String htmlResponseTable4 = "</h2>\n<h3>This one... well, it doesn't suck:</h3>\n<h2>";
    String htmlResponseTable5 = "</h2>\n</div>\n";

    String htmlForm = "    <div style='width=100%; display:flex; flex-direction: column;'>\n" +
                    "        <form method=\"get\" action=\"/form\">\n" +
                    "            <label for='name'>Enter your name here:</label><br>\n" +
                    "            <input type='text' id='name' name='name'><br>\n" +
                    "            <label for='lang1'>Choose your favorite language:</label><br>\n" +
                    "            <select id='lang1' name='lang1'>\n" +
                    "                <option value='JavaScript'>JavaScript</option>\n" +
                    "                <option value='Java'>Java</option>\n" +
                    "                <option value='Python'>Python</option>\n" +
                    "                <option value='Perl'>Perl</option>\n" +
                    "            </select><br>\n" +
                    "            <select id='lang2' name='lang2'>\n" +
                    "                <option value='JavaScript'>JavaScript</option>\n" +
                    "                <option value='Java'>Java</option>\n" +
                    "                <option value='Python'>Python</option>\n" +
                    "                <option value='Perl'>Perl</option>\n" +
                    "            </select><br>\n" +
                    "            <select id='lang3' name='lang3'>\n" +
                    "                <option value='JavaScript'>JavaScript</option>\n" +
                    "                <option value='Java'>Java</option>\n" +
                    "                <option value='Python'>Python</option>\n" +
                    "                <option value='Perl'>Perl</option>\n" +
                    "            </select><br>\n" +
                    "            <input type='submit' value='Lets go!'>\n" +
                    "        </form>\n" +
                    "    </div>\n";

    String htmlEnd = "</div>\n</body>\n</html>";


//    public String fileReader(String textFileName) {
//        String output = "";
//        try {
//            FileReader fr = new FileReader(textFileName);
//            int i;
//            while((i=fr.read())!=-1)
//                output = output + (char)i;
//            fr.close();
//            return output;
//        } catch(FileNotFoundException e) {
//            return e.toString();
//        } catch(IOException e) {
//            return e.toString();
//        }
//    }
//
//    String htmlHead = fileReader("htmlHead.txt");
//    String htmlResponseTable1 = fileReader("htmlResponseTable1.txt");
//    String htmlResponseTable2 = fileReader("htmlResponseTable2.txt");
//    String htmlResponseTable3 = fileReader("htmlResponseTable3.txt");
//    String htmlResponseTable4 = fileReader("htmlResponseTable4.txt");
//    String htmlResponseTable5 = fileReader("htmlResponseTable5.txt");
//    String htmlForm = fileReader("htmlForm.txt");
//    String htmlEnd = fileReader("htmlEnd.txt");

    @GetMapping
    @ResponseBody
    public String landing() {
        return htmlHead + htmlForm + htmlEnd;
    }

    @GetMapping("form")
    @ResponseBody
    public String form(@RequestParam String name,
                       @RequestParam String lang1,
                       @RequestParam String lang2,
                       @RequestParam String lang3) {

        return htmlHead +
                htmlResponseTable1 + name +
                htmlResponseTable2 + lang1 +
                htmlResponseTable3 + lang2 +
                htmlResponseTable4 + lang3 +
                htmlResponseTable5 + htmlForm + htmlEnd;
    }
}
