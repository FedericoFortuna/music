package asap.fortuna.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import asap.fortuna.api.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
