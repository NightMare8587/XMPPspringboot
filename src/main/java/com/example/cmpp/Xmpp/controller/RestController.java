package com.example.cmpp.Xmpp.controller;

import com.example.cmpp.Xmpp.model.FcmModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @PostMapping("/fcm")
    public void receiveFCMdata(@RequestBody FcmModel fcmModel) {
        System.out.println("got request data");
    }

    @GetMapping("/lol")
    public String sendBack() {
        return "You Lol";
    }
}
