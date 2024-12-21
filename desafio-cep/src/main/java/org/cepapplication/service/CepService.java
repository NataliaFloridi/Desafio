package org.cepapplication.service;

import org.cepapplication.dto.CepResponseDTO;
import org.cepapplication.model.ConsultaLogEntity;
import org.cepapplication.repository.CepLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CepService {
    private final RestTemplate restTemplate;
    private final CepLogRepository cepLogRepository;

    @Value("${cep.api.url}")
    private String apiUrl;
    public CepService(RestTemplate restTemplate, CepLogRepository cepLogRepository) {
        this.restTemplate = restTemplate;
        this.cepLogRepository = cepLogRepository;
    }

    public CepResponseDTO buscarCep(String cep) {
        String url = apiUrl + cep;
        CepResponseDTO response = restTemplate.getForObject(url, CepResponseDTO.class);
        if (response != null) {
            salvarLog(cep, response);
        }
        return response;
    }

    private void salvarLog(String cep, CepResponseDTO response) {
        String resultado = response.toString();
        cepLogRepository.save(new ConsultaLogEntity(cep, resultado));
    }
}
