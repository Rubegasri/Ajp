var mongoose=require('mongoose');
mongoose.connect('mongodb://localhost:27017/thirdmsc');
var db=mongoose.connection;
db.once('open',function()
{
    console.log("connection succeded");
})
const User=mongoose.model('student',{name:{type:String},
age:{type:Number},
rollno:{type:Number},
dept:{type:String},
gpa:{type:Number},
address:{type:String}});
User.insertMany([{name:"kalai",age:23,rollno:24,dept:"msc",gpa:9.00,address:"erode"},
{name:"pavi",age:24,rollno:34,dept:"msc",gpa:8.00,address:"erode"}
]).then(function(){
    console.log("data inserted")

}).catch(function(error){
    console.log(error)
});
User.find({name:"kalai"}).then(customer=>{console.log(customer)});

