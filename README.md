# 100% Test Coverage

This little project is created after a discussion with a person from SonarSource, who claimed that 100% test coverage is the most important cornerstone of programming.

Quite often
- Code and tests are created by the same person, so he/she may overlook some problems, this is especially true so concurency issues, and for NPE handling
- Tests are copy-pasted, so there are some irrelevant inits, like JEE/WELD frameworks, in-memory tests DB and so on
- It is tempting to abuse some unit tests metrics
- It is quite easy to missuse mockito
In the result one may have awful 100% coverage as the one show in this project

Here we have:
- Hundred class with 100%-coverage and "featuring" at least 3 problems like NPEs or IndexOutOfBounds
- Fifty class with 50%-coverage and all edge cases addressed

All in all, when you are writing your code:
- know what you are doing
- remember what you are testing
- document with tests all edge cases

You do not need 100% code coverage, you need to be sure you covered all relevant cases :)
