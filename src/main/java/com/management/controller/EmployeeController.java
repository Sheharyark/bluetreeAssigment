package com.management.controller;


import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class EmployeeController {
	
	

    @Autowired
    private EmployeeServiceImplemployeeServiceImpl;

    @GetMapping("/")
    public String viewHomePage(Model model) {
model.addAttribute("allemplist", employeeServiceImpl.getAllEmployee());
        return "index";
    }

    @GetMapping("/addnew")
    public String addNewEmployee(Model model) {
        Employee employee = new Employee();
model.addAttribute("employee", employee);
        return "newemployee";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
employeeServiceImpl.save(employee);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String updateForm(@PathVariable(value = "id") long id, Model model) {
        Employee employee = employeeServiceImpl.getById(id);
model.addAttribute("employee", employee);
        return "update";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteThroughId(@PathVariable(value = "id") long id) {
employeeServiceImpl.deleteViaId(id);
        return "redirect:/";

    }

}
