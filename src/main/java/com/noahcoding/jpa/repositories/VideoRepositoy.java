package com.noahcoding.jpa.repositories;

import com.noahcoding.jpa.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepositoy extends JpaRepository<Video, Integer> {
}
