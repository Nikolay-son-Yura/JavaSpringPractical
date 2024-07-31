package ru.gb.Lesson6.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.gb.Lesson5.model.Employee;

import java.time.LocalDate;


@Data
@Entity
@Table(name = "timesheet")
public class Timesheet {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @EqualsAndHashCode.Include
    private Long id;
    private Long projectId;
    private Long EmployeeId;
    private Integer minutes;
    private LocalDate createdAt;

}
