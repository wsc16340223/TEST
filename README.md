pragma solidity 0.5.0;

contract TalkUser {
    string name;
    string password;
    string comment;
    string reply;
    address to;
    constructor() public {
        name = "";
        password = "";
    }
    function setName(string memory na) public {
        name = na;
    }
    function getName() public view returns (string memory) {
        return name;
    }
    function setPass(string memory pa) public {
        password = pa;
    }
    function getPass() public view returns (string memory) {
        return password;
    }
    function setComment(string memory co) public{
        comment = co;
    }
    function getComment() public view returns (string memory) {
        return comment;
    }
    function setReply(string memory co, address ads) public{
        reply = co;
        to = ads;
    }
    function getReply() public view returns (string memory) {
        return reply;
    }
    function setCmtTo(address ads) public {
        to = ads;
    }
    function getTo() public view returns (address){
        return to;
    }
    
    function getAddress() public view returns (address) {
        return msg.sender;
    }
    
    
}






var talkuserContract = web3.eth.contract([{"constant":true,"inputs":[],"name":"getName","outputs":[{"name":"","type":"string"}],"payable":false,"stateMutability":"view","type":"function"},{"constant":true,"inputs":[],"name":"getPass","outputs":[{"name":"","type":"string"}],"payable":false,"stateMutability":"view","type":"function"},{"constant":true,"inputs":[],"name":"getAddress","outputs":[{"name":"","type":"address"}],"payable":false,"stateMutability":"view","type":"function"},{"constant":false,"inputs":[{"name":"pa","type":"string"}],"name":"setPass","outputs":[],"payable":false,"stateMutability":"nonpayable","type":"function"},{"constant":true,"inputs":[],"name":"getReply","outputs":[{"name":"","type":"string"}],"payable":false,"stateMutability":"view","type":"function"},{"constant":false,"inputs":[{"name":"co","type":"string"},{"name":"ads","type":"address"}],"name":"setReply","outputs":[],"payable":false,"stateMutability":"nonpayable","type":"function"},{"constant":true,"inputs":[],"name":"getTo","outputs":[{"name":"","type":"address"}],"payable":false,"stateMutability":"view","type":"function"},{"constant":false,"inputs":[{"name":"ads","type":"address"}],"name":"setCmtTo","outputs":[],"payable":false,"stateMutability":"nonpayable","type":"function"},{"constant":false,"inputs":[{"name":"na","type":"string"}],"name":"setName","outputs":[],"payable":false,"stateMutability":"nonpayable","type":"function"},{"constant":true,"inputs":[],"name":"getComment","outputs":[{"name":"","type":"string"}],"payable":false,"stateMutability":"view","type":"function"},{"constant":false,"inputs":[{"name":"co","type":"string"}],"name":"setComment","outputs":[],"payable":false,"stateMutability":"nonpayable","type":"function"},{"inputs":[],"payable":false,"stateMutability":"nonpayable","type":"constructor"}]);




var talkuser = talkuserContract.new(
   {
     from: web3.eth.accounts[0], 
     data: '0x608060405234801561001057600080fd5b50602060405190810160405280600081525060009080519060200190610037929190610064565b5060206040519081016040528060008152506001908051906020019061005e929190610064565b50610109565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106100a557805160ff19168380011785556100d3565b828001600101855582156100d3579182015b828111156100d25782518255916020019190600101906100b7565b5b5090506100e091906100e4565b5090565b61010691905b808211156101025760008160009055506001016100ea565b5090565b90565b610b34806101186000396000f3fe608060405234801561001057600080fd5b50600436106100c6576000357c010000000000000000000000000000000000000000000000000000000090048063672b6ee61161008e578063672b6ee614610359578063714926851461043457806395ebffb71461047e578063c47f0027146104c2578063cc7730441461057d578063e8742b5514610600576100c6565b806317d7de7c146100cb578063359c4a811461014e57806338cc4831146101d157806344e9fd4b1461021b57806348f48a9c146102d6575b600080fd5b6100d36106bb565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156101135780820151818401526020810190506100f8565b50505050905090810190601f1680156101405780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b61015661075d565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101561019657808201518184015260208101905061017b565b50505050905090810190601f1680156101c35780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6101d96107ff565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b6102d46004803603602081101561023157600080fd5b810190808035906020019064010000000081111561024e57600080fd5b82018360208201111561026057600080fd5b8035906020019184600183028401116401000000008311171561028257600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290505050610807565b005b6102de610821565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101561031e578082015181840152602081019050610303565b50505050905090810190601f16801561034b5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6104326004803603604081101561036f57600080fd5b810190808035906020019064010000000081111561038c57600080fd5b82018360208201111561039e57600080fd5b803590602001918460018302840111640100000000831117156103c057600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290803573ffffffffffffffffffffffffffffffffffffffff1690602001909291905050506108c3565b005b61043c61091f565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b6104c06004803603602081101561049457600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610949565b005b61057b600480360360208110156104d857600080fd5b81019080803590602001906401000000008111156104f557600080fd5b82018360208201111561050757600080fd5b8035906020019184600183028401116401000000008311171561052957600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f82011690508083019250505050505050919291929050505061098d565b005b6105856109a7565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156105c55780820151818401526020810190506105aa565b50505050905090810190601f1680156105f25780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6106b96004803603602081101561061657600080fd5b810190808035906020019064010000000081111561063357600080fd5b82018360208201111561064557600080fd5b8035906020019184600183028401116401000000008311171561066757600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290505050610a49565b005b606060008054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156107535780601f1061072857610100808354040283529160200191610753565b820191906000526020600020905b81548152906001019060200180831161073657829003601f168201915b5050505050905090565b606060018054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156107f55780601f106107ca576101008083540402835291602001916107f5565b820191906000526020600020905b8154815290600101906020018083116107d857829003601f168201915b5050505050905090565b600033905090565b806001908051906020019061081d929190610a63565b5050565b606060038054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156108b95780601f1061088e576101008083540402835291602001916108b9565b820191906000526020600020905b81548152906001019060200180831161089c57829003601f168201915b5050505050905090565b81600390805190602001906108d9929190610a63565b5080600460006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505050565b6000600460009054906101000a900473ffffffffffffffffffffffffffffffffffffffff16905090565b80600460006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555050565b80600090805190602001906109a3929190610a63565b5050565b606060028054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610a3f5780601f10610a1457610100808354040283529160200191610a3f565b820191906000526020600020905b815481529060010190602001808311610a2257829003601f168201915b5050505050905090565b8060029080519060200190610a5f929190610a63565b5050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f10610aa457805160ff1916838001178555610ad2565b82800160010185558215610ad2579182015b82811115610ad1578251825591602001919060010190610ab6565b5b509050610adf9190610ae3565b5090565b610b0591905b80821115610b01576000816000905550600101610ae9565b5090565b9056fea165627a7a7230582059b5b329690e4523b218748d1b56382a2fb35bf6b2e8410e312f0951a02289b60029', 
     gas: '3000000'
   }, function (e, contract){
    console.log(e, contract);
    if (typeof contract.address !== 'undefined') {
         console.log('Contract mined! address: ' + contract.address + ' transactionHash: ' + contract.transactionHash);
    }
 })
