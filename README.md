# 100% Test Coverage

This little project is created after a discussion with a person from SonarSource, who claimed that 100% test coverage is the most important cornerstone of programming.

Here we have two classes with tests:
- Hundred class has 100%-coverage, while "featuring" at least 3 problems like NPEs or IndexOutOfBounds
- Fifty class has 50%-coverage, with all edge cases addressed

Which is not the case:
- Quite often code and tests are created by the same person, so he/she may overlook some problems, this is especially true so concurency issues, and for NPE handling.
- Quite often tests are copy-pasted, so there are some irrelevant inits, like JEE/WELD frameworks, in-memory tests DB and so on
- It is tempting to abuse some unit tests metrics
- It is quite easy to miss use mockito

All in all, when you are writing your code:
- know what you are doing
- remember what you are testing
- document with tests all edge cases

You do not need 100% code coverage, you need to be sure you covered all relevant cases :)
