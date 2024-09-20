package com.codingtree.app.rest.Repo;

import com.codingtree.app.rest.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
