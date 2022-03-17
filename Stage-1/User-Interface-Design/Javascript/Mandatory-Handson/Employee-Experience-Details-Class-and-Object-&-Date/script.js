class Employee {
    constructor(name, designation, year_of_experience) {
        this.name = name;
        this.designation = designation;
        this.year_of_experience = year_of_experience;
    }
}

function createEmployee(name, designation, year_of_experience) {
    return new Employee(name, designation, year_of_experience);
}

function validateObject(employee) {
    if (employee instanceof Employee)
        return true;
    return false;
}

function displayEmployee(name, designation, year_of_experience) {
    const emp = createEmployee(name, designation, year_of_experience);
    if (validateObject(emp)) {
        serviceYears = 2020 - emp.year_of_experience;
        result = emp.name + " is serving the position of " + emp.designation + " since " + serviceYears;
        return result;
    }
}