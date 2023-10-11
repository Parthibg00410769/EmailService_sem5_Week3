package ie.atu.SpringBootProjects.SetterInjection;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {
    private List<Book> library = new ArrayList<>();
    public void addBook(Book book){
        library.add(book);
    }
    public List<Book> getBooks(){
        return library;
    }



}
