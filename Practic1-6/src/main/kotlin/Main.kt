fun main(args: Array<String>) {
    print("Введите 1 число: "); var n1 = readln().toInt();
    print("Введите 2 число: "); var n2 = readln().toInt();
    if((n1 + n2) % 2 != 0)
    {
        println("$n1 + $n2 = " + (n1+n2).toString());
    } else
        if((n1 - n2) % 2 != 0)
        {
            println("$n1 - $n2 = " + (n1-n2).toString());
        } else
            if((n1 * n2) % 2 != 0)
            {
                ("$n1 * $n2 = " + (n1*n2).toString());
            } else
                if((n1 / n2) % 2 != 0)
                {
                    println("$n1 / $n2 = " + (n1/n2).toString());
                } else
                    println("Не могу сделать нечетное число");
}