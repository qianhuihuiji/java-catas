# java-catas-with-junit
使用 Junit 进行的 TDD 编程小练习，为了方便，使用[https://start.spring.io/](https://start.spring.io/)生成一个项目。

>注：例子使用的jdk为open-jdk-19

- 最小质因子：PrimeFactorsTest
  
我们期望获得一个正整数的最小质因子的数字，例如：对于 1，我们期望得到 []；对于 2，我们期望得到 [2]；对于 4，则是 [2,2]；对于 6，则是 [2,3]；对于 20，则是 [2,2,5]；对于 100，则是 [2,2,5,5]... 我们以 TDD 的开发模型来一步步的完成这个 Kata。

- 罗马数字转换：RomanNumeralsConverterTest

跟据罗马数字的规则，对于 1，应该返回 I；对于 2，返回 II；对于 5，返回 V。按照以下规则：

| 数值   | 罗马数字 |
|------|------|
| 1    | I    |
| 2    | II   |
| 4    | IV   |
| 5    | V    |
| 9    | IX   |
| 10   | X    |
| 40   | XL   |
| 50   | L    |
| 90   | XC   |
| 100  | C    |
| 400  | CD   |
| 500  | D    |
| 900  | DM   |
| 1000 | M    |

我们只进行 50 以下的数字转换，其他的规则是类似的。

- 保龄球游戏：BowlingGameTest

规则说明：[保龄球游戏](https://baike.baidu.com/item/%E4%BF%9D%E9%BE%84%E7%90%83/68096#2_2)

- 字符串计算
  
首先我们定义几条规则：

1. StringCalculator::add('') 的结果是 0；
2. StringCalculator::add('1,2,3') 的结果是 6；
3. 参数不能包含负数；
4. StringCalculator::add('1,2,3,1000') 的结果是 6，即只计算100以内的，并且会过滤超出范围的数字；
5. 允许用换行符 \n 进行分割；

- FizzBuzz 游戏

首先我们简单了解下规则：写一个程序按自然数的顺序打印数字，但是在遇到 3 的倍数时用 “fizz” 替代数字，5 的倍数用 “buzz” 代替，既是 3 的倍数又是 5 的倍数打印 “fizzbuzz”。

- 网球得分
  首先你需要花点时间熟悉一下 [网球计分](https://baike.baidu.com/item/%E7%BD%91%E7%90%83%E8%A7%84%E5%88%99#4) 的规则，然后我们简单记录一下：

| 得分/比分 | 英文表示             |
|-------|------------------|
| 0     | Love             |
| 1-0   | Fifteen-Love     |
| 2-0   | Thirty-Love      |
| 3-0   | Forty-Love       |
| 4-0   | Winner           |
| 4-3   | Advantage Player |
| 4-4   | Deuce            |
| 1-1   | Fifteen-All      |
| 2-2   | Thirty-All       |
