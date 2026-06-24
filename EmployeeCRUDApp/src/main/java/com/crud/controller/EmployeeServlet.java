package com.crud.controller;

import com.crud.dao.EmployeeDAO;
import com.crud.model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {

	private EmployeeDAO dao;
	
	@Override
    public void init() {
        dao = new EmployeeDAO();
        System.out.println("Employee Servlet Initialized");
    }
	@Override
	protected void doGet(HttpServletRequest request,
	                     HttpServletResponse response)
	        throws ServletException, IOException {

	    String action = request.getParameter("action");

	    if (action == null) {
	        action = "LIST";
	    }

	    switch (action) {

	        case "NEW":
	            request.getRequestDispatcher("addEmployee.jsp")
	                    .forward(request, response);
	            break;

	        case "INSERT":
	            insertEmployee(request, response);
	            break;

	        case "EDIT":
	            showEditForm(request, response);
	            break;

	        case "UPDATE":
	            updateEmployee(request, response);
	            break;

	        case "DELETE":
	            deleteEmployee(request, response);
	            break;

	        default:
	            listEmployees(request, response);
	            break;
	    }
	}

	@Override
	protected void doPost(HttpServletRequest request,
	                      HttpServletResponse response)
	        throws ServletException, IOException {

	    doGet(request, response);
	}
    private void listEmployees(HttpServletRequest request,
                               HttpServletResponse response)
            throws ServletException, IOException {

        List<Employee> employees =
                dao.getAllEmployees();

        request.setAttribute("employeeList", employees);

        request.getRequestDispatcher(
                "employeeList.jsp")
                .forward(request, response);
    }

    private void insertEmployee(HttpServletRequest request,
                                HttpServletResponse response)
            throws IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String department = request.getParameter("department");
        double salary =
                Double.parseDouble(request.getParameter("salary"));

        Employee employee =
                new Employee(name, email, department, salary);

        dao.addEmployee(employee);

        response.sendRedirect("employee");
    }

    private void showEditForm(HttpServletRequest request,
                              HttpServletResponse response)
            throws ServletException, IOException {

        int id =
                Integer.parseInt(request.getParameter("id"));

        Employee employee =
                dao.getEmployeeById(id);

        request.setAttribute("employee", employee);

        request.getRequestDispatcher(
                "editEmployee.jsp")
                .forward(request, response);
    }

    private void updateEmployee(HttpServletRequest request,
                                HttpServletResponse response)
            throws IOException {

        int id =
                Integer.parseInt(request.getParameter("id"));

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String department = request.getParameter("department");

        double salary =
                Double.parseDouble(request.getParameter("salary"));

        Employee employee =
                new Employee(id, name, email, department, salary);

        dao.updateEmployee(employee);

        response.sendRedirect("employee");
    }

    private void deleteEmployee(HttpServletRequest request,
                                HttpServletResponse response)
            throws IOException {

        int id =
                Integer.parseInt(request.getParameter("id"));

        dao.deleteEmployee(id);

        response.sendRedirect("employee");
    }
}