export default n => {
  let primes = []

  for(let m = 2; m <= Math.sqrt(n); m++) {
    while(n % m == 0) {
      primes.push(m)
      n/=m
    }
  }

  return primes.concat(n > 1 ? n : [])
}
