package ie.atu.SpringBootProjects.SetterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
public class LibraryController {
    private LibraryService libraryService;

    @Autowired
    public void setLibraryService(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book) {
        libraryService.addBook(book);
        return "Book added to the library: " + book.getTitle();
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks() {
        return libraryService.getBooks();
    }
}
