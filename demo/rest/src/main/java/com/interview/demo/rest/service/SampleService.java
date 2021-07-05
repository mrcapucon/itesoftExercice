package com.interview.demo.rest.service;

import com.interview.demo.entity.SampleEntity;
import com.interview.demo.repository.SampleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


/**
 * TODO : Correct this class
 *
 * The type Sample service.
 */
@RestController
@RequestMapping("/samples")
public class SampleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SampleService.class);


    /**
     * The Sample repository.
     */
    @Autowired
    SampleRepository sampleRepository;


    /**
     * Gets sample.
     *
     * @return the sample
     */
    @GetMapping
    @Produces(MediaType.APPLICATION_JSON)
    public List<SampleEntity> getSample() {
        LOGGER.error("endpoint all called");
        return this.sampleRepository.findAll();
    }


    /**
     * Delete response.
     *
     * @param id the id
     * @return the response
     */
    @DeleteMapping(value="/delete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@PathVariable("id") final Long id) {
        this.sampleRepository.deleteById(id);
        return Response.ok().build();
    }

    /**
     * Create invoice.
     *
     * @param id    the id
     * @param query the query
     */
    @PutMapping("create/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void createInvoice(@PathVariable("id") final Long id, @RequestParam("query") final String query){
        this.sampleRepository.save(new SampleEntity().setSampleName(id+query));
    }

}
