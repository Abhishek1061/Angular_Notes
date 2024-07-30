
export class transaction{
    private  transactionID: number;
    private amount:  number;
    private transactionType : string;

    constructor(transactionID:number, amount: number, transactionType: string){
        this.transactionID = transactionID;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    displayTransaction(): void{
        console.log(`Transaction ID: ${this.transactionID}, Amount: ${this.amount}, Transaction Type: ${this.transactionType}`)
    }

    isCredit():boolean{
        return this.transactionType === "Credit"
    }
    

}

const sampleTransaction = new transaction(1, 50000, "Credit");
    sampleTransaction.displayTransaction();
    if(sampleTransaction.isCredit())
    {
        console.log("This transaction is a credit");
    }
else
{
    console.log("This transaction is not credited");
}
    