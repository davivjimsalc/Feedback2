package org.ejemplosclases.smga.orquestador;

import org.aspectj.weaver.Advice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;


@Configuration
public class IntegrationFlowConfig {

    @Bean
    public IntegrationFlow orchestrateFlow() {
        return IntegrationFlows.from("inputChannel")
                .handle("orderService", "processOrder", e -> e.advice(errorHandler()))
                .handle("dinosaurService", "processSensorData", e -> e.advice(errorHandler()))
                .get();
    }

}


