console.log("prime numbers");

const newArray = [2, 3, 24, 77, 59, 18, 83, 15, 10, 69];
const PrimeArray = newArray.filter(num => {
    for (let i = 2; i < num; i++) {
        if (num % i === 0) return false;
    }
    return num !== 1;
});
console.log("array::" + newArray);
console.log("Prime numbers in array::" + PrimeArray);
