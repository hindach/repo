package hind.spring.hindousha;

import java.util.List;

import java.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
@GetMapping("/books")
public List<Book> getAllbooks(){
	
	return Arrays.asList(new Book(1L,"mahalala","hind"));
}
}
