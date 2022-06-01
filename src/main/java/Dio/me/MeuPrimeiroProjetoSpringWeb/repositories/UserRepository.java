package Dio.me.MeuPrimeiroProjetoSpringWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Dio.me.MeuPrimeiroProjetoSpringWeb.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
	

}
