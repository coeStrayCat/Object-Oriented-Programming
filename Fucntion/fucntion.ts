function calculateNetSalary(
  daysWorked: number,
  dailyRate: number,
  taxPercent: number
): number {
  const grossSalary = daysWorked * dailyRate;
  const taxAmount = grossSalary * (taxPercent / 100);
  const netSalary = grossSalary - taxAmount;
  return netSalary;
}

function employeeDetails(
  name: string,
  age: number,
  position: string,
  daysWorked: number,
  dailyRate: number,
  taxPercent: number
): string {
  const net = calculateNetSalary(daysWorked, dailyRate, taxPercent);
  return `ชื่อ: ${name}, อายุ: ${age}, ตำแหน่ง: ${position}, เงินสุทธิ: ${net} บาท`;
} 

const employeeName = "วิษณุ";
const employeeAge = 23;
const employeePosition = "Developer"; 
const days = 20;
const ratePerDay = 750;
const tax = 3;

const net = calculateNetSalary(days, ratePerDay, tax);
// console.log(`เงินสุทธิหลังหักภาษี: ${net} บาท`);

const employeeInfo = employeeDetails(
  employeeName,
  employeeAge,
  employeePosition,
  days,
  ratePerDay,
  tax
);

// console.log(`ข้อมูลพนักงาน: ${employeeInfo}`);


const dogName: string = "Lisbon"; 
const dogAge: number = 5;

function sound(sound: string) {
  return `Sound: ${sound}`;
}
function dog(name: string, age: number) {
  const soundOfDog = sound("woof! woof!");
  return `Dog Name: ${name}\nAge: ${age} years\n${soundOfDog}`;
}

const dogInfo = dog(dogName, dogAge);
console.log(`==== Dog Information ====\n${dogInfo}`);