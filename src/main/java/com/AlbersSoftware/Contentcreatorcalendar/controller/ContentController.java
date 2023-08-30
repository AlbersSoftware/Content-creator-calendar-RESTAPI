package com.AlbersSoftware.Contentcreatorcalendar.controller;

import com.AlbersSoftware.Contentcreatorcalendar.model.Content;
import com.AlbersSoftware.Contentcreatorcalendar.model.Status;
import com.AlbersSoftware.Contentcreatorcalendar.repository.ContentCollectionRepository;
import com.AlbersSoftware.Contentcreatorcalendar.repository.ContentJdbcRepository;
import com.AlbersSoftware.Contentcreatorcalendar.repository.ContentRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/content")
@CrossOrigin
public class ContentController {

private final ContentRepository repository;

// In memory repository
//private final ContentCollectionRepository repository;

//JDBC repository
//private final ContentJdbcRepository repository;

    // for in memory repository change: public ContentController(ContentRepository repository)
    //  to: public ContentController(ContentCollectionRepository repository)
    // or public ContentController(ContentJdbcRepository repository) for: jdbc
    public ContentController(ContentRepository repository) {
        this.repository = repository;
    }
    // make a request and find all the pieces of content in the system
    @GetMapping("")
    public List<Content> findAll(){
        return repository.findAll();

    }
    @GetMapping("/{id}")
    public Content findById(@PathVariable Integer id){
        return repository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Content not found"));
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void create(@Valid @RequestBody Content content){
        repository.save(content);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@RequestBody Content content,@PathVariable Integer id){
    if(!repository.existsById(id)){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Content not found");
    }
    repository.save(content);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        repository.deleteById(id);
        // change to: repository.delete(id); for in memory or JDBC

    }

    @GetMapping("/filter/{keyword}")
    public List<Content> filterByTitle(@PathVariable String keyword) {
        return repository.findAllByTitleContains(keyword);
    }
    @GetMapping("/filter/type/{type}")
    public List<Content> filterByType(@PathVariable String type) {
        return repository.findAllByContentType(type.toUpperCase());
    }

    @GetMapping("/filter/status/{status}")
    public List<Content> findByStatus(@PathVariable Status status){
        return repository.listByStatus(status);
    }

}
