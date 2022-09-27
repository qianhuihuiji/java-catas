package com.nofirst.javacatas;

import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {

    private final StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void it_translate_empty_string_into_zero()
    {
        assertThat(this.stringCalculator.add("")).isEqualTo(0);
    }

    @Test
    public void it_finds_the_sum_of_one_number()
    {
        assertThat(this.stringCalculator.add("5")).isEqualTo(5);
    }


    @Test
    public void it_finds_the_sum_of_two_numbers()
    {
        assertThat(this.stringCalculator.add("1,2")).isEqualTo(3);
    }

    @Test
    public void it_finds_the_sum_of_any_numbers()
    {
        assertThat(this.stringCalculator.add("1,2,3,4,5")).isEqualTo(15);
    }

    @Test
    public void it_disallows_negative_numbers()
    {
        //2：如果抛出的异常与设定的异常相同，则这一步的断言成功并返回一个异常的顶级父类
        Throwable exception = assertThrows(InvalidParameterException.class,()->{
            //1：执行此语句会抛出一个ArithmeticException异常，被assertThrows方法捕获
            this.stringCalculator.add("1,2,-3,4,5");
        });
        //3：接下来便可以对返回的异常进行一些其他的测试
        //比如对异常的信息进行断言测试
    }

    @Test
    public void it_ignores_any_number_that_is_one_thousand_or_greater()
    {
        assertThat(this.stringCalculator.add("1,2,1000")).isEqualTo(3);
    }

//
//    @Test
//    public void it_allows_new_line_delimiters()
//    {
//        assertThat(this.stringCalculator.add("1,2\3")).isEqualTo(6);
//    }

}
