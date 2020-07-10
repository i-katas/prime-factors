from prime_factors import factors_of

def test_no_factors():
    assert factors_of(1) == []


def test_prime_numbers():
    assert factors_of(2) == [2]
    assert factors_of(3) == [3]


def test_composite_number_containing_same_factors():
    assert factors_of(4) == [2, 2]
    assert factors_of(8) == [2, 2, 2]
    assert factors_of(9) == [3, 3]


def test_composite_number_containing_diff_factors():
    assert factors_of(6) == [2, 3]


def test_primes_are_integers():
    assert all(isinstance(n, int) for n in factors_of(4))


def test_big_prime_number():
    big = 0x7FFFFFFF
    assert factors_of(big) == [big]

