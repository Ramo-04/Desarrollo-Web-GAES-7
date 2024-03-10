package com.promec.promecApp.controller;
import com.promec.promecApp.entities.Servicio;
import com.promec.promecApp.servicie.Imp.ServicioImp;
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
public class ServicioController {

    @Autowired
    private ServicioImp servicioImp;

    @PostMapping("create")
    public ResponseEntity<Map<String, Object>> create (@RequestBody Map<String, Object> request) {
        Map<String, Object> response = new HashMap<>();

        try {
            System.out.println("@@@@"+ request);
            Servicio servicio = new Servicio();
            servicio.setId(Long.parseLong(request.get("id").toString()));
            servicio.setNombreServicio(request.get("nombre_servicio").toString());
            servicio.setDescripcionServicio(( request.get("descripcion_servicio").toString()));
            servicio.setCalidadServicio(( request.get("calidad_servicio").toString()));
            servicio.setTipo_servicio(( request.get("tipo_servicio").toString()));
            this.servicioImp.create(servicio);
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
            List<Servicio> servicioList=this.servicioImp.findAll();
            response.put("status", "succes");
            response.put("data", servicioList);
        }catch (Exception e){
            response.put("status",HttpStatus.BAD_GATEWAY);
            response.put("data",e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);


        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
