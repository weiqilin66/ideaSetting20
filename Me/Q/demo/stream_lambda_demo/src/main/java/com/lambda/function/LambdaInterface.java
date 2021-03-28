package com.lambda.function;

/**
 * @Description:
 * 1. lambda无法单独出现，需要一个函数式接口来盛放，
 * 2. 函数式接口： 一个接口定义唯一一个抽象方法
 * 可以说lambda表达式方法体是函数式接口的实现，lambda实例化函数式接口，可以将函数作为方法参数，或者将代码作为数据对待。
 *
 * 3. 语法格式（将函数作为接口的参数）
 * (parameters) -> expression
 * 或
 * (parameters) ->{ statements; }  statements即多个expression
 *
 * 4. 简写特性
 * 可选类型声明：不需要声明参数类型，编译器可以统一识别参数值。
 * 可选的参数圆括号：一个参数无需定义圆括号，但多个参数需要定义圆括号。
 * 可选的大括号：如果主体包含了一个语句，就不需要使用大括号。
 * 可选的返回关键字：如果主体只有一个表达式返回值则编译器会自动返回值，大括号需要指定明表达式返回了一个数值
 *
 * 5. 方法引用
 * --重写了函数式接口的抽象方法并在重写的方法中调用被引用的方法
 *
 * a 静态方法引用--类名::静态方法名
 * funcInterface func = A::B;
 * 被引用的方法参数列表和函数式接口中抽象方法的参数一致！！
 * 接口的抽象方法没有返回值，引用的方法可以有返回值也可以没有
 * 接口的抽象方法有返回值，引用的方法必须有相同类型的返回值！！
 * a2 特定类型的方法引用--类名::非静态方法
 * 特定类型方法引用，在Comparator函数式接口的抽象方法中传入的参数有两个，
 * 可是compareToIgnoreCase()方法参数只有一个，第一个传入的参数作调用对象
 * 这就满足了特定类型的方法引用，所以可以简化成类名::非静态方法的形式
 *
 * b 实例方法引用--对象名::非静态方法名
 * Object o = new Object();
 * funcInterface func = o::method;
 * 或 funcInterface func = new Object()::method;
 *
 * c 构造方法引用--类名::new
 * --被引用的类必须存在一个构造方法与函数式接口的抽象方法参数列表一致
 * funcInterface func = Student::new;
 *
 * d 类中方法调用父类或本类方法引用
 * this::方法名
 * super::方法名
 *
 * @author: LinWeiQi
 */
@FunctionalInterface
public interface LambdaInterface {
    int add(int value);
}
