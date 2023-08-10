// fibonacci sequence
// 0 1 1 2 3 5 8 13
// f(0) = 0
// f(1) = 1
// f(2) = 1
// f(3) = 2
// f(4) = 3

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

function fibonacciTabulation(n){
    if (n === 0) return 0;
    if (n === 1) return 1;
    let cache = new Array(n + 1);
    cache.fill(0);
    cache[1] = 1;

    for (i = 2; i < n + 1; i++){
        cache[i] = cache[i - 1] + cache[i - 2];
    }
    return cache[n];
}

function fibonacciTabulationOptimized(n){
    if (n === 0) return 0;
    if (n === 1) return 1;
    let cache1 = 0;
    let cache2 = 1;
    let result = 1;

    for (i = 2; i < n + 1; i++){
        result = cache1 + cache2;
        cache1 = cache2;
        cache2 = result;
    }
    return result;
}

console.log(fibonacci(30));
console.log(fibonacciMemo(30));
console.log(fibonacciTabulation(30));
console.log(fibonacciTabulationOptimized(30));
