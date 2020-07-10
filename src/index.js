#!/usr/bin/env node

import factorsOf from './prime-factors'

console.log(...factorsOf(parseInt(process.argv[2])))
