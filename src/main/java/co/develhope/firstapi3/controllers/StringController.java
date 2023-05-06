package co.develhope.firstapi3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strings")
public class StringController {

    @GetMapping
    public String getStrings(@RequestParam String stString, @RequestParam String ndString){
        if(stString.isEmpty()){
            return  "The first parameter is Empty";
        }else if(ndString.isEmpty()) {
            return ndString;
        }
        return stString +" " + ndString;
    }
}
