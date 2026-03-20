package com.example.Spring.Web;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/items")
public class ItemController {
private final ItemRepository repo;
public ItemController(ItemRepository repo){
this.repo = repo;
}
@GetMapping
public List<Item> getAll(){
return repo.findAll();
}
@PostMapping
public Item create(@RequestBody Item item){
return repo.save(item);
}
}
