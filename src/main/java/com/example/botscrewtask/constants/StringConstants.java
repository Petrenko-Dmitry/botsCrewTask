package com.example.botscrewtask.constants;

public class StringConstants {
    public final static String TWO_PARAMS_FORMAT = "%s. %s";
    public final static String CHOOSE_COMMAND_MESSAGE = "Choose command:";
    public final static String FIRST_COMMAND = "Who is head of department {department_name}?";
    public final static String SECOND_COMMAND = "Show {department_name} statistics.";
    public final static String THIRD_COMMAND = "Show the average salary for the department {department_name}.";
    public final static String FOURTH_COMMAND = "Show count of employee for {department_name}.";
    public final static String FIFTH_COMMAND = "Global search by {template}.";
    public final static String CHOOSE_DEPARTMENT_MESSAGE = "Choose department:";
    public final static String TYPE_TEMPLATE_MESSAGE = "Type template:";
    public final static String UNKNOWN_COMMAND_MESSAGE = "Unknown command.";
    public final static String UNKNOWN_COMMAND_TYPE_NUMBER_MESSAGE = UNKNOWN_COMMAND_MESSAGE + " Type natural number!";

    public final static String HEAD_OF_DEPARTMENT_FORMAT = "Head of %s department is %s";
    public final static String DEPARTMENT_STATISTIC_FORMAT = "assistants - %s,\nassociate professors - %s,\nprofessors - %s";
    public final static String AVERAGE_SALARY_FORMAT = "The average salary of %s is %s";
    public final static String EMPLOYEE_COUNT_FORMAT = "Employee count: %s";
}
