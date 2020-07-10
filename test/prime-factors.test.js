import factorsOf from 'prime-factors'

describe('prime factors', () => {
  it('no factors', () => {
    expect(factorsOf(1)).toEqual([])
  })

  it('prime numbers', () => {
    expect(factorsOf(2)).toEqual([2])
    expect(factorsOf(3)).toEqual([3])
  })

  it('composite number that containing same factors', () => {
    expect(factorsOf(4)).toEqual([2, 2])
    expect(factorsOf(8)).toEqual([2, 2, 2])
    expect(factorsOf(9)).toEqual([3, 3])
  })

  it('composite number that containing diff factors', () => {
    expect(factorsOf(6)).toEqual([2, 3])
  })

  it('big prime number', () => {
    let value = 0x7fffffff
    expect(factorsOf(value)).toEqual([value])
  })
})
