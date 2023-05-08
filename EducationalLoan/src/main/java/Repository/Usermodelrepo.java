package Repository;


	import org.springframework.data.jpa.repository.JpaRepository;

	import com.example.demo.Model.UserModel;

	public interface repo extends JpaRepository<UserModel, Integer> {

	}

}
