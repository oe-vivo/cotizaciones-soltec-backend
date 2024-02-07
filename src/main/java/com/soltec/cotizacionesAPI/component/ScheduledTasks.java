package com.soltec.cotizacionesAPI.component;

import com.soltec.cotizacionesAPI.services.CtApiService;
import com.soltec.cotizacionesAPI.services.SyscommApiService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
    private final SyscommApiService syscommApiService;
    private final CtApiService ctApiService;

    public ScheduledTasks(SyscommApiService syscommApiService, CtApiService ctApiService){
        this.ctApiService=ctApiService;
        this.syscommApiService=syscommApiService;
    }

    @Scheduled(fixedRate = 3600000)//refresh cada hora
    public void actualizarProductosBd(){


    }
}

