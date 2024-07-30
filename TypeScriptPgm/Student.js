"use strict";
exports.__esModule = true;
var Student = /** @class */ (function () {
    function Student(studentId, studentName, studentDepartment) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentDepartment = studentDepartment;
    }
    Student.prototype.displayStudent = function () {
        console.log("Student ID: " + this.studentId + ", Student Name: " + this.studentName + ", Student Department: " + this.studentDepartment);
    };
    Student.prototype.hasCondition = function (department) {
        return this.studentDepartment.toLowerCase() === department.toLowerCase();
    };
    return Student;
}());
exports.Student = Student;
var studentDetails = new Student(1, "Abhishek Kadam", "Developer");
studentDetails.displayStudent();
if (studentDetails.hasCondition("Developer")) {
    console.log("Student is a developer");
}
else {
    console.log("Not a developer");
}
