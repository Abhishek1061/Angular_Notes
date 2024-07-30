

export class Student{
    private studentId : number;
    private studentName: string;
    private studentDepartment: string;

    constructor(studentId:number, studentName: string, studentDepartment:string){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentDepartment =studentDepartment;
    }

    displayStudent():void{
        console.log(`Student ID: ${this.studentId}, Student Name: ${this.studentName}, Student Department: ${this.studentDepartment}`);
    }

    hasCondition(department :string):boolean{
        return this.studentDepartment.toLowerCase() === department.toLowerCase();
    }
}

const studentDetails = new Student(1, "Abhishek Kadam", "Developer");
studentDetails.displayStudent();
if(studentDetails.hasCondition("Developer")){
    console.log(`Student is a developer`);
}else{
    console.log(`Not a developer`);
}