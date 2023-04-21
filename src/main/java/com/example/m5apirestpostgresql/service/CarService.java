package com.example.m5apirestpostgresql.service;

import com.example.m5apirestpostgresql.domain.Car;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

// Un servicio lo usamos para utilizarlo como capa intermedia entre un controlador y un repositorio para liberar carga de trabajo
// en nuestro caso nuestro Repositorio es una interfaz por lo que la implementación se debe de hacer en el servicio.
// El controlador solamente se debe de utilizar para gestionar peticiones (sin lógica de negocio)

public interface CarService {

    //spring repository methods

    List<Car> findAll();
    Optional<Car> findById(Long id);
    Long count();
    Car save(Car car);
    void deleteById(Long id);
    void deleteAll();
    void deleteAll(List<Car> cars);
    void deleteAllById(List<Long> ids);

    //custom methods

    List<Car> findByDoors(Integer doors);
    List<Car> findByManufacturerAndModel(String manufacturer, String model);
    List<Car> findByDoorsGreaterThanEqual(Integer doors);
    List<Car> findByModelContaining(String model);
    List<Car> findByYearIn(List<Integer> years);
    List<Car> findByYearBetween(Integer startYear, Integer endYear);
    List<Car> findByReleaseDateBetween(LocalDate startDate, LocalDate endDate);
    List<Car> findByAvailableTrue();
    Long deleteAllByAvailableFalse();
}
