var Tx = require('ethereumjs-tx').Transaction;
const Web3 = require('web3');
const web3 = new Web3(new Web3.providers.HttpProvider('https://rinkeby.infura.io/v3/912db4e761714175adda50403cac5bfc'))
const account1 = '0x029952e9822Ae48539d05d2283bfDc0d167006aC';
const account2 ='0xF4Fa49C691644Cc721f49A56F2ea7c5310E4Cbfd';
const privatekey1 = Buffer.from('2740A9ED23F7F7B32765FCA0CB3050E99E809F483F2C0D1691BB1F3D6DB35367','hex');
//console.log(web3.eth.accounts.create())
/*web3.eth.getBalance(account2,(err,bal)=>{
    console.log('account 2 balance', web3.utils.fromWei(bal,'ether'))
})*/
//const contractAddress = '0x0a17316a86f053FA4E6BE6293c82396A2970913B'
/*const contractABI =[{"inputs":[{"internalType":"string","name":"businessKey","type":"string"}],"name":"createCollaboration","outputs":[{"internalType":"bytes32","name":"instanceID","type":"bytes32"}],"stateMutability":"view","type":"function"},{"inputs":[{"internalType":"bytes32","name":"instanceID","type":"bytes32"},{"internalType":"string","name":"businessKey","type":"string"},{"internalType":"string","name":"taskName","type":"string"},{"internalType":"string","name":"executor","type":"string"},{"internalType":"string","name":"additionalInfo","type":"string"}],"name":"registerActivity","outputs":[],"stateMutability":"nonpayable","type":"function"}]
var applyscholarshipContract = new web3.eth.Contract(contractABI,contractAddress);

applyscholarshipContract.methods.balanceOf(account1).call((err,result) => {
    console.log(result)
})*/
//const contractAddress ='0x0a17316a86f053FA4E6BE6293c82396A2970913B'


//const contract = new web3.eth.Contract(contractABI,contractAddress)

web3.eth.getTransactionCount(account2,(err,txCount)=>{
    //Smart Contract data
const data ='0x608060405234801561001057600080fd5b506105e8806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c8063255450631461003b57806384f5e97d146102c5575b600080fd5b6102c3600480360360a081101561005157600080fd5b81019080803590602001909291908035906020019064010000000081111561007857600080fd5b82018360208201111561008a57600080fd5b803590602001918460018302840111640100000000831117156100ac57600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f8201169050808301925050505050505091929192908035906020019064010000000081111561010f57600080fd5b82018360208201111561012157600080fd5b8035906020019184600183028401116401000000008311171561014357600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290803590602001906401000000008111156101a657600080fd5b8201836020820111156101b857600080fd5b803590602001918460018302840111640100000000831117156101da57600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f8201169050808301925050505050505091929192908035906020019064010000000081111561023d57600080fd5b82018360208201111561024f57600080fd5b8035906020019184600183028401116401000000008311171561027157600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290505050610394565b005b61037e600480360360208110156102db57600080fd5b81019080803590602001906401000000008111156102f857600080fd5b82018360208201111561030a57600080fd5b8035906020019184600183028401116401000000008311171561032c57600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f82011690508083019250505050505050919291929050505061046d565b6040518082815260200191505060405180910390f35b6000808681526020019081526020016000206040518060800160405280868152602001858152602001848152602001838152509080600181540180825580915050600190039060005260206000209060040201600090919091909150600082015181600001908051906020019061040c92919061050d565b50602082015181600101908051906020019061042992919061050d565b50604082015181600201908051906020019061044692919061050d565b50606082015181600301908051906020019061046392919061050d565b5050505050505050565b600081426040516020018080602001838152602001828103825284818151815260200191508051906020019080838360005b838110156104ba57808201518184015260208101905061049f565b50505050905090810190601f1680156104e75780820380516001836020036101000a031916815260200191505b509350505050604051602081830303815290604052805190602001209050809050919050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061054e57805160ff191683800117855561057c565b8280016001018555821561057c579182015b8281111561057b578251825591602001919060010190610560565b5b509050610589919061058d565b5090565b6105af91905b808211156105ab576000816000905550600101610593565b5090565b9056fea26469706673582212205443e11296e702061ad4570a2ac94573e0c49ca220ef0897cf54be87b012ee7c64736f6c634300060a0033'
 
//create a transaction object
const txObject ={
    //from:account2,
    nonce: web3.utils.toHex(txCount),
    to:account1,
    value:web3.utils.toHex(web3.utils.toWei('0.1','ether')),
    gasLimit: web3.utils.toHex(21000),
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
    console.log('err',err,'txHash:',txHash)
    //use this txHash to find the contact on Etherscon!
    
})
})
