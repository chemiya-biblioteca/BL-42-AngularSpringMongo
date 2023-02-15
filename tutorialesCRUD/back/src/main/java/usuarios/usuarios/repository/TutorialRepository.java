package usuarios.usuarios.repository;



import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import usuarios.usuarios.model.Tutorial;


public interface TutorialRepository extends MongoRepository<Tutorial, String> {
  List<Tutorial> findByPublished(boolean published);//consultas del repositorio
  List<Tutorial> findByTitleContaining(String title);
}
