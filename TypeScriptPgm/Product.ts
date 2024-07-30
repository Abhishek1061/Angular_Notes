export class Patient
{
    private id:number;
    private name:string;
    private medicalCondition:string;
 
    constructor(id:number,name:string,medicalCondition:string)
    {
        this.id=id;
        this.name=name;
        this.medicalCondition=medicalCondition;
    }
 
    displayDetails():void
    {
        console.log(`Patient id:${this.id},Name:${this.name},Medical Condition:${this.medicalCondition}`);
    }
 
    hasCondition(condition:string):boolean
    {
        return this.medicalCondition.toLowerCase()===condition.toLowerCase();
    }
}
const samplePatient=new Patient(1,"John Doe","Asthama");
samplePatient.displayDetails();
if(samplePatient.hasCondition("Asthama"))
{
    console.log("This patient has Asthama");
}
else
{
    console.log("This patient has no Asthama");
}


export class product{
    private id: number;
    private name: string;
    private medicalCondition: string;


    constructor(id: number,  name: string, medicalCondition: string){
        this.id = id;
        this.name = name;
        this.medicalCondition = medicalCondition;
    }

    diplayDetails():void{
        console.log(`ID:  ${this.id}, Name: ${this.name}, MedicalCondition: ${this.medicalCondition}`);
    }

    hasCondition(condition:string): boolean{
        return this.medicalCondition.toLowerCase() === condition.toLowerCase();
    }
}

const sampleData = new Patient(1, "Prasad", "Piles");
sampleData.displayDetails();
if(sampleData.hasCondition("Asthama")){
    console.log(`This patient has Asthama`)
}else{
    
}