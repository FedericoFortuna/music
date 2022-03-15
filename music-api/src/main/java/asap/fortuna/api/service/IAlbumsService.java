package asap.fortuna.api.service;

import java.util.List;

import asap.fortuna.api.entity.Album;

public interface IAlbumsService {
	List<Album> buscarTodos();
	void guardar(Album album);
	void eliminar(int idAlbum);
}
