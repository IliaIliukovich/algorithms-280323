function fibonacci(n) {
    if (n === 0) return 0;
    if (n === 1) return 1;
    return fibonacci(n - 1) + fibonacci(n - 2);
}

function fibonacciMemo(n) {
    if (n === 0) return 0;
    if (n === 1) return 1;

    let cache = new Array(n + 1);
    cache.fill(0);
    cache[1] = 1;
    return fibonacciMemoRecursion(n, cache);
}

function fibonacciMemoRecursion(n, cache) {
    if (n === 0) return 0;
    if (n === 1) return 1;
    if (cache[n] !== 0) return cache[n];
    cache[n] = fibonacciMemoRecursion(n - 1, cache) + fibonacciMemoRecursion(n - 2, cache);
    return cache[n];
}

console.log(fibonacci(10));
console.log(fibonacciMemo(10));