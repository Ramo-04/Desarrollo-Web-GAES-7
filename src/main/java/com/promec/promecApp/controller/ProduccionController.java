package com.promec.promecApp.controller;
import com.promec.promecApp.entities.Produccion;
import com.promec.promecApp.servicie.Imp.ProduccionImp;
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
public class ProduccionController {

    @Autowired
    private ProduccionImp produccionImp;

    @PostMapping("create")
    public ResponseEntity<Map<String, Object>> create (@RequestBody Map<String, Object> request) {
        Map<String, Object> response = new HashMap<>();

        try {
            System.out.println("@@@@"+ request);
            Produccion produccion = new Produccion();
            produccion.setId(Long.parseLong(request.get("id").toString()));
            produccion.setDescripcion_producto(request.get("descripcion_producto").toString());
            produccion.setTrabajadores_disponibles(Integer.parseInt( request.get("trabajadores_disponibles").toString()));
            produccion.setElementos_stock(Integer.parseInt( request.get("elementos_stock").toString()));
            this.produccionImp.create(produccion);
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
            List<Produccion> produccionList=this.produccionImp.findAll();
            response.put("status", "succes");
            response.put("data", produccionList);
        }catch (Exception e){
            response.put("status",HttpStatus.BAD_GATEWAY);
            response.put("data",e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);


        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
