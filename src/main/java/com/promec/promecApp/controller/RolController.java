package com.promec.promecApp.controller;
import com.promec.promecApp.entities.Rol;
import com.promec.promecApp.servicie.Imp.RolImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping(path = "/api/Rol", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.HEAD})
@CrossOrigin("*")
public class RolController {

    @Autowired
    private RolImp rolImp;

    @PostMapping("create")
    public ResponseEntity<Map<String, Object>> create (@RequestBody Map<String, Object> request) {
        Map<String, Object> response = new HashMap<>();

        try {
            System.out.println("@@@@"+ request);
            Rol rol = new Rol();
            rol.setId(Long.parseLong(request.get("Id").toString()));
            this.rolImp.create(rol);
            response.put("status", "succes");
            response.put("data", "Registro exitoso");
        }catch (Exception e){
            response.put("status",HttpStatus.BAD_GATEWAY);
            response.put("data",e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);


        }
        return new ResponseEntity<>(response, HttpStatus.OK);


    }
    @GetMapping("all")
    public ResponseEntity<Map<String, Object>> findAll(){
        Map<String, Object> response = new HashMap<>();

        try {
            List<Rol> rolList=this.rolImp.findAll();
            response.put("status", "succes");
            response.put("data", rolList);
        }catch (Exception e){
            response.put("status",HttpStatus.BAD_GATEWAY);
            response.put("data",e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);


        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
