package com.example.botscrewtask.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

import static com.example.botscrewtask.constants.StringConstants.*;
import static org.apache.logging.log4j.util.Strings.EMPTY;

@Service
public class UniversityService {
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private LectorService lectorService;

    @PostConstruct
    public void processCommand() {
        var scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(CHOOSE_COMMAND_MESSAGE);
                System.out.println(String.format(TWO_PARAMS_FORMAT, 1, FIRST_COMMAND));
                System.out.println(String.format(TWO_PARAMS_FORMAT, 2, SECOND_COMMAND));
                System.out.println(String.format(TWO_PARAMS_FORMAT, 3, THIRD_COMMAND));
                System.out.println(String.format(TWO_PARAMS_FORMAT, 4, FOURTH_COMMAND));
                System.out.println(String.format(TWO_PARAMS_FORMAT, 5, FIFTH_COMMAND));

                int choice;
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException ex) {
                    System.out.println(UNKNOWN_COMMAND_TYPE_NUMBER_MESSAGE);
                    continue;
                }


                var departmentName = EMPTY;
                var searchTemplate = EMPTY;

                if (choice != 5) {
                    var departments = this.departmentService.findAllDepartmentsName();
                    System.out.println(CHOOSE_DEPARTMENT_MESSAGE);
                    departments.forEach(
                            department -> System.out.println(String.format(TWO_PARAMS_FORMAT, departments.indexOf(department) + 1, department))
                    );

                    departmentName = departments.get(Integer.parseInt(scanner.nextLine()) - 1);
                } else {
                    System.out.println(TYPE_TEMPLATE_MESSAGE);
                    searchTemplate = scanner.nextLine();
                }

                switch (choice) {
                    case 1:
                        System.out.println(this.departmentService.getHeadOfDepartment(departmentName));
                        break;
                    case 2:
                        System.out.println(this.departmentService.getDepartmentStatistics(departmentName));
                        break;
                    case 3:
                        System.out.println(this.departmentService.getAverageSalary(departmentName));
                        break;
                    case 4:
                        System.out.println(this.departmentService.getEmployeeCount(departmentName));
                        break;
                    case 5:
                        var result = this.lectorService.globalSearch(searchTemplate.trim());
                        System.out.println(String.join(", ", result));
                        break;
                    default:
                        System.out.println(UNKNOWN_COMMAND_MESSAGE);
                        break;
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
