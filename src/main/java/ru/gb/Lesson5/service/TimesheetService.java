package ru.gb.Lesson5.service;

import org.springframework.stereotype.Service;
import ru.gb.Lesson5.model.Timesheet;
import ru.gb.Lesson5.repository.ProjectRepository;
import ru.gb.Lesson5.repository.TimesheetRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TimesheetService {

    private final TimesheetRepository timesheetRepository;
    private final ProjectRepository projectRepository;

    public TimesheetService(TimesheetRepository timesheetRepository, ProjectRepository projectRepository) {
        this.timesheetRepository = timesheetRepository;
        this.projectRepository = projectRepository;
    }

    public Optional<Timesheet> findById(Long id) {
        return timesheetRepository.findById(id);
    }

    public List<Timesheet> findAll() {
        return timesheetRepository.findAll();
    }

    public Timesheet create(Timesheet timesheet) {
        return timesheetRepository.save(timesheet);
    }

    public void delete(Long id) {
        timesheetRepository.deleteById(id);
    }
}
