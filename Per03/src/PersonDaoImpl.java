// Soal 5c

public class PersonDaoImpl implements PersonDao{
	public void save(Person11 p){
		System.out.println("Menyimpan Person11");
	}

	public void delete(Person11 p){
		System.out.println("Menghapus Person11");
	}
	
	public Person11 getById(Long id){
		Person11 p = new Person11();
		p.setId(id);
		p.setNama("Satria");
		return p;		
	}
}