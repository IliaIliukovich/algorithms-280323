// Дан отсортированный массив, в котором все элементы встречаются дважды (один за другим),
// а один элемент появляется только один раз.
// Написать метод для нахождения этого элемента. Определить асимптотическую сложность алгоритма.

function findBinary(array) {
    let start = 0;
    let end = array.length - 1;
    while (start !== end) {
        let middle = (end - start) / 2 + start;
        if (array[middle] !== array[middle - 1] && array[middle] !== array[middle + 1]) return array[middle];

        let leftCount;
        let isDoubleLetterToLeft = array[middle] === array[middle - 1];
        if (isDoubleLetterToLeft) {
            leftCount = middle - 1 - start;
        } else {
            leftCount = middle - start;
        }

        if (leftCount % 2 === 1) {
            end = isDoubleLetterToLeft ? middle - 2 : middle - 1;
        } else {
            start = isDoubleLetterToLeft ? middle + 1 : middle + 2;
        }
    }
    return array[start];
}

function findBinaryRecursive(array){
    return innerRecursion(array, 0, array.length - 1);
}

function innerRecursion(array, start, end) {
        if (start === end) return array[start]; // base case

        let middle = (end - start) / 2 + start;
        if (array[middle] !== array[middle - 1] && array[middle] !== array[middle + 1]) return array[middle];

        let leftCount;
        let isDoubleLetterToLeft = array[middle] === array[middle - 1];
        if (isDoubleLetterToLeft) {
            leftCount = middle - 1 - start;
        } else {
            leftCount = middle - start;
        }

        if (leftCount % 2 === 1) {
            end = isDoubleLetterToLeft ? middle - 2 : middle - 1;
        } else {
            start = isDoubleLetterToLeft ? middle + 1 : middle + 2;
        }
        return innerRecursion(array, start, end);
}

let array = [1, 1, 2, 2, 3, 3, 4, 4, 5];
console.log(findBinary(array));
console.log(findBinaryRecursive(array));
