package com.jakubzegar.pracadyplomowaserwer.domain.entity;

import com.jakubzegar.pracadyplomowaserwer.domain.repository.TimeLogRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TimeLogTest {
    @Autowired
    private TimeLogRepository timeLogRepository;

    @Test
    public void chcekSizeOfGivenTimeLogList() {
        // given
        // when
        List<TimeLog> found = timeLogRepository.getUsersLogs("hgft4jdb6h3hjuemp9a1283jdk342");

        // then
        assertThat(found.size()).isGreaterThan(0);
    }
}