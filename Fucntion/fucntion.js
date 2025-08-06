function calculateNetSalary(daysWorked, dailyRate, taxPercent) {
    var grossSalary = daysWorked * dailyRate;
    var taxAmount = grossSalary * (taxPercent / 100);
    var netSalary = grossSalary - taxAmount;
    return netSalary;
}
function employeeDetails(name, age, position, daysWorked, dailyRate, taxPercent) {
    var net = calculateNetSalary(daysWorked, dailyRate, taxPercent);
    return "\u0E0A\u0E37\u0E48\u0E2D: ".concat(name, ", \u0E2D\u0E32\u0E22\u0E38: ").concat(age, ", \u0E15\u0E33\u0E41\u0E2B\u0E19\u0E48\u0E07: ").concat(position, ", \u0E40\u0E07\u0E34\u0E19\u0E2A\u0E38\u0E17\u0E18\u0E34: ").concat(net, " \u0E1A\u0E32\u0E17");
}
var employeeName = "วิษณุ";
var employeeAge = 23;
var employeePosition = "Developer";
var days = 20;
var ratePerDay = 750;
var tax = 3;
var net = calculateNetSalary(days, ratePerDay, tax);
// console.log(`เงินสุทธิหลังหักภาษี: ${net} บาท`);
var employeeInfo = employeeDetails(employeeName, employeeAge, employeePosition, days, ratePerDay, tax);
// console.log(`ข้อมูลพนักงาน: ${employeeInfo}`);
var dogName = "Lisbon";
var dogAge = 5;
function sound(sound) {
    return "Sound: ".concat(sound);
}
function dog(name, age) {
    var soundOfDog = sound("woof! woof!");
    return "Dog Name: ".concat(name, "\nAge: ").concat(age, " years\n").concat(soundOfDog);
}
var dogInfo = dog(dogName, dogAge);
console.log("==== Dog Information ====\n".concat(dogInfo));
