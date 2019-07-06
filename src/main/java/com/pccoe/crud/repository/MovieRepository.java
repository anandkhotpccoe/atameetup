package com.pccoe.crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.pccoe.crud.entity.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long> {

}
