pragma solidity 0.5.0;
contract Talk {
    string comment;
    address to;
    uint flag;
    constructor() public{
        flag = 0;
    }
    function setComment(string memory co) public{
        comment = co;
    }
    function getComment() public view returns (string memory) {
        return comment;
    }
    function setCmtTo(address ads) public {
        to = ads;
        flag = 1;
    }
    function getTo() public view returns (address){
        return to;
    }
    function getFlag() public view returns (uint){
        return flag;
    }
    function getAddress() public view returns (address) {
        return msg.sender;
    }
}

contract TalkUser {
    string name;
    string password;
    Talk mySend;
    Talk myReply;
    constructor(string memory na, string memory pa) public {
        name = na;
        password = pa;
    }
    function send(string memory comment) public {
        mySend = new Talk();
        mySend.setComment(comment);
        mySend.getComment();
        mySend.getAddress();
    }
    function reply(string memory comment, address to) public {
        myReply = new Talk();
        myReply.setComment(comment);
        myReply.setCmtTo(to);
        myReply.getComment();
        myReply.getTo();
        myReply.getAddress();
    }
}
