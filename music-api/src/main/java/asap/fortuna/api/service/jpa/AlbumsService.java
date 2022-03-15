package asap.fortuna.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asap.fortuna.api.entity.Album;
import asap.fortuna.api.repository.AlbumsRepository;
import asap.fortuna.api.service.IAlbumsService;

@Service
public class AlbumsService implements IAlbumsService {

	@Autowired
	private AlbumsRepository albumsRepository;
	
	@Override
	public List<Album> buscarTodos() {
		return albumsRepository.findAll();
	}

	@Override
	public void guardar(Album album) {
		albumsRepository.save(album);		
	}

	@Override
	public void eliminar(int idAlbum) {
		albumsRepository.deleteById(idAlbum);
		
	}

}
