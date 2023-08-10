// Task 2. Вычислить n-й член последовательности, заданной формулами:
// a(2n) = a(n) + a(n-1),
// a(2n+1) = a(n) — a(n-1),
// a(0) = a(1) = 1.


function sequence(n) {
    if (n === 0 || n === 1) {
        return 1;
    } else if (n % 2 === 0) {
        return sequence(n / 2) + sequence(n / 2 - 1);
    } else {
        return sequence((n - 1) / 2) - sequence((n - 1) / 2 - 1);
    }
}

function sequenceMemoization(n) {
    let cache = new Array(n + 1);
    cache.fill(0)
    cache[0] = 1;
    cache[1] = 1;

    return recursiveCall(n, cache);
}

function recursiveCall(n, cache) {
    if (n === 0 || n === 1) {
        return 1;
    } else if (cache[n] !== 0) {
        return cache[n];
    } else if (n % 2 === 0) {
        let result = recursiveCall(n / 2,cache) + recursiveCall(n / 2 - 1, cache);
        cache[n] = result;
        return result;
    } else {
        let result = recursiveCall((n - 1) / 2, cache) - recursiveCall((n - 1) / 2 - 1, cache);
        cache[n] = result;
        return result;
    }

}
console.log(sequence(5));
console.log(sequenceMemoization(5));