package com.isbasi.Repository;

import com.isbasi.dto.EmailDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListenerRepository extends JpaRepository<EmailDto, Integer> {
}
