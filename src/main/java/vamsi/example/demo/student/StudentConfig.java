package vamsi.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.JULY;
import static java.util.Calendar.OCTOBER;

@Configuration
public class StudentConfig {

    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student vamsi = new Student(
                    "Vamsi",
                    "vamsipalle95@gmail.com",
                    LocalDate.of(1995, Month.JULY, 28),
                    25
            );

            Student varsha = new Student(
                    "Vamsi",
                    "varshapalle99@gmail.com",
                    LocalDate.of(1999, Month.OCTOBER, 4),
                    21
            );

            repository.saveAll(
                    List.of(vamsi, varsha)
            );
        };
    }
}
