package com.promec.promecApp.controller;
import com.promec.promecApp.entities.Inventario;
import com.promec.promecApp.servicie.Imp.InventarioImp;
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
@RequestMapping(path = "/api/Produccion", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.HEAD})
@CrossOrigin("*")
public class InventarioController {

    @Autowired
    private InventarioImp inventarioImp;

    @PostMapping("create")
    public ResponseEntity<Map<String, Object>> create (@RequestBody Map<String, Object> request) {
        Map<String, Object> response = new HashMap<>();

        try {
            System.out.println("@@@@"+ request);
            Inventario inventario = new Inventario();
            inventario.setId(Long.parseLong(request.get("id").toString()));
            inventario.setEntrada_inventario(Integer.parseInt(request.get("entrada_inventario").toString()));
            inventario.setSalida_inventario(Integer.parseInt(request.get("salida_inventario").toString()));
            inventario.setPrecio_entrada(Integer.parseInt(request.get("precio_entrada").toString()));
            inventario.setPrecio_salida((Integer.parseInt(request.get("precio_salida").toString())));
            this.inventarioImp.create(inventario);
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
            List<Inventario> inventarioList=this.inventarioImp.findAll();
            response.put("status", "succes");
            response.put("data", inventarioList);
        }catch (Exception e){
            response.put("status",HttpStatus.BAD_GATEWAY);
            response.put("data",e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);


        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}