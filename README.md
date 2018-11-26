pragma solidity 0.5.0;
contract Talk {
    string comment;
    address to;
    uint flag;
    function Talk(){
        flag = 0;
    }
    function setComment(string co) public{
        comment = co;
    }
    function getComment() public returns (string) {
        return comment;
    }
    function setCmtTo(address ads) public {
        to = ads;
        flag = 1;
    }
    function getTo() public returns (address){
        return to;
    }
    function getFlag() public returns (uint){
        return flag;
    }
    function getAddress() public returns (address) {
        return msg.sender;
    }
}

contract TalkUser {
    string name;
    string password;
    Talk mySend;
    Talk myReply;
    function TalkUser(string na, string pa){
        name = na;
        password = pa;
    }
    function send(string comment) public {
        mySend = new Talk();
        mySend.setComment(comment);
        mySend.getComment();
        mySend.getAddress();
    }
    function reply(string comment, address to) public {
        myReply = new Talk();
        myReply.setComment(comment);
        myReply.setCmtTo(to);
        myReply.getComment();
        myReply.getTo();
        myReply.getAddress();
    }
}
