from typing import List

def factors_of(n:int) -> List[int]:
    m, primes = 2, []
    while m * m <= n:
        while n % m == 0:
            primes.append(m)
            n //= m
        m += 1
    return primes if not n > 1 else primes + [n]

