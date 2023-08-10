// На вершине лесенки, содержащей N ступенек, находится мячик, который начинает прыгать по ним вниз, к основанию.
// Мячик может прыгнуть на следующую ступеньку, на ступеньку через одну или через 2.
// (То есть, если мячик лежит на 8-ой ступеньке, то он может переместиться на 5-ую, 6-ую или 7-ую.)
// Определить число всевозможных «маршрутов» мячика с вершины на землю.


function ballPossibleWays(n){
    if (n === 1) return 1;
    if (n === 2) return 2;
    if (n === 3) return 4;

    return ballPossibleWays(n - 1) + ballPossibleWays(n - 2) + ballPossibleWays(n - 3);
}

function ballPossibleWaysTabulation(n) {
    if (n === 1) return 1;
    if (n === 2) return 2;
    if (n === 3) return 4;

    let cache1 = 1;
    let cache2 = 2;
    let cache3 = 4;
    let result = cache1 + cache2 + cache3;

    for (i = 4; i <= n; i++){
        result = cache1 + cache2 + cache3;
        cache1 = cache2;
        cache2 = cache3;
        cache3 = result;
    }
    return result;
}

console.log(ballPossibleWays(6));
console.log(ballPossibleWaysTabulation(6));