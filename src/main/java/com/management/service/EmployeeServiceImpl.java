package com.management.service;
import com.management.employeeModel.Employee;
@Service
Public class EmployeeServiceImpl {
	
	
	
	@AutowiredprivateEmployeeRepositoryempRepo;
	
	public List<Employee>getAllEmployee()
	    {
	returnempRepo.findAll();
	    }
	
	publicvoidsave(Employee employee)
	    {
	empRepo.save(employee);
	    }
	
	public Employee getById(Long id)
	    {
	        Optional<Employee>optional = empRepo.findById(id);
	        Employee employee = null;
	if (optional.isPresent())
	employee = optional.get();
	else
	thrownewRuntimeException(
	"Employee not found for id : " + id);
	returnemployee;
	    }
	
	publicvoiddeleteViaId(longid)
	    {
	empRepo.deleteById(id);
	    }

}

