package com.codeup.springblog.repositories;

import com.codeup.springblog.models.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public interface TutorialRepository extends JpaRepository<Tutorial,  Long> {

}
