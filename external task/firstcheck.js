const { Client, logger } = require("camunda-external-task-client-js");
const { Variables } = require("camunda-external-task-client-js");
var Tx = require('ethereumjs-tx').Transaction;
const Web3 = require('web3');
// configuration for the Client:
//  - 'baseUrl': url to the Workflow Engine
//  - 'logger': utility to automatically log important events
const config = { baseUrl: "http://localhost:8080/engine-rest", use: logger };

// create a Client instance with custom configuration 
const client = new Client(config);

// susbscribe to the topic: 'creditScoreChecker'
client.subscribe("FirstRoundCheck", async function({ task, taskService }) {
  
  
  let gpa = 0
  if (gpa>=3){
     const processVariables = new Variables();
     processVariables.set("gpa", gpa);
    
  }else
    processVariables = new Variables();
    processVariables.set("Decline",gpa);
    
  // complete the task


const web3 = new Web3(new Web3.providers.HttpProvider('put your provider here'))
const account1 = '';
const account2 ='';
const privatekey1 = Buffer.from('','hex');
//console.log(web3.eth.accounts.create())
/*web3.eth.getBalance(account2,(err,bal)=>{
    console.log('account 2 balance', web3.utils.fromWei(bal,'ether'))
})*/
const contractAddress = ''
/*const contractABI =[{"inputs":[{"internalType":"string","name":"businessKey","type":"string"}],"name":"createCollaboration","outputs":[{"internalType":"bytes32","name":"instanceID","type":"bytes32"}],"stateMutability":"view","type":"function"},{"inputs":[{"internalType":"bytes32","name":"instanceID","type":"bytes32"},{"internalType":"string","name":"businessKey","type":"string"},{"internalType":"string","name":"taskName","type":"string"},{"internalType":"string","name":"executor","type":"string"},{"internalType":"string","name":"additionalInfo","type":"string"}],"name":"registerActivity","outputs":[],"stateMutability":"nonpayable","type":"function"}]
var applyscholarshipContract = new web3.eth.Contract(contractABI,contractAddress);

applyscholarshipContract.methods.balanceOf(account1).call((err,result) => {
    console.log(result)
})*/
//const contractAddress ='0x0a17316a86f053FA4E6BE6293c82396A2970913B'


//const contract = new web3.eth.Contract(contractABI,contractAddress)

web3.eth.getTransactionCount(account2,(err,txCount)=>{
    //Smart Contract data
const data =''
 
//create a transaction object
const txObject ={
    //from:account2,
    nonce: web3.utils.toHex(txCount),
    to:account1,
    value:web3.utils.toHex(web3.utils.toWei('0.01','ether')),
    gasLimit: web3.utils.toHex(211000),
    gasPrice:web3.utils.toHex(web3.utils.toWei('10','gwei')) ,
    data:data

}

//sign a transcation
const tx = new Tx(txObject,{'chain':'rinkeby'})
tx.sign(privatekey1)

const serializedTx = tx.serialize()
const raw ='0x'+ serializedTx.toString('hex')

//broadcast a transaction
web3.eth.sendSignedTransaction(raw,(err,txHash) => {
    console.log('err',err, 'txHash:',txHash)
    //use this txHash to find the contact on Etherscon!
    
})
})
await taskService.complete(task, processVariables);
});

