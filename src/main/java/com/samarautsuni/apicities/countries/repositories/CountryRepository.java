package com.samarautsuni.apicities.countries.repositories;

import com.samarautsuni.apicities.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
