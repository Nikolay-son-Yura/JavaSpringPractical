package ru.gb.Lesson5.service;

import org.springframework.stereotype.Service;
import ru.gb.Lesson5.model.Employee;
import ru.gb.Lesson5.model.Timesheet;
import ru.gb.Lesson5.repository.EmployeeRepository;
import ru.gb.Lesson5.repository.TimesheetRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class EmployeeService {
    //    private Long id=1L;
    private final EmployeeRepository employeeRepository;
    private final TimesheetRepository timesheetRepository;

    public EmployeeService(EmployeeRepository employeeRepository, TimesheetRepository timesheetRepository) {
        this.employeeRepository = employeeRepository;
        this.timesheetRepository = timesheetRepository;
    }

    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    public List<Timesheet> getTimesheetsByProjectId(Long id) {
        if (employeeRepository.findById(id).isEmpty()) {
            throw new NoSuchElementException("Employee with id = " + id + " does not exists");
        }

        return timesheetRepository.findByProjectId(id);
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee create(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }
}
