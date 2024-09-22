package com.codingtree.app.rest.Repo;

import com.codingtree.app.rest.Models.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Students, Long> {
}
