"use strict";
exports.__esModule = true;
// Define two arrays: one for names and another for salary
var empName = ['John', 'Alice', 'Bob', 'Eve', 'Charlie'];
var empSalary = [85000, 92000, 78000, 90000, 88000];
// Display names and salary using a for loop
console.log('Employee Names:');
for (var i = 0; i < empName.length; i++) {
    console.log(empName[i]);
}
console.log('\nEmployee Salary:');
for (var i = 0; i < empSalary.length; i++) {
    console.log(empSalary[i]);
}
// Display the average salary
var averageSalary = findAvg(empSalary);
console.log("\nAverage Salary: " + averageSalary.toFixed(2));
// index.ts
function findAvg(sal) {
    var totalSalary = sal.reduce(function (sum, sal) { return sum + sal; }, 0);
    var averageSalary = totalSalary / sal.length;
    return averageSalary;
}
exports.findAvg = findAvg;
