package ru.gb.Lesson5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.gb.Lesson5.model.Timesheet;

import java.util.List;

public interface TimesheetRepository extends JpaRepository<Timesheet, Long> {

    List<Timesheet> findByProjectId(Long projectId);

    List<Timesheet> findByEmployeeId(Long EmployeeId);


//    @Query("select t from Timesheet t where t.projectId = :projectId order by t.createdAt desc")
//    List<Timesheet> findByProjectId(Long projectId);
}
