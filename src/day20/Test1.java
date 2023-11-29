package day20;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.function.IntToDoubleFunction;

public class Test1 {
    public static void main(String[] args) throws IOException, ParseException {
        //day12-1.2 API-Runtime
//        test1();
        //day12-1.2 API-Runtime
//        test2();
        //2.1 Date日期类
//        test3();
//        2.2 SimpleDateFormat
//        test4();
//        2.3秒杀案例
//        test5();
//        2.4 Calendar
//        test6();
//        2.5目标搞清楚为什么要用JDK8新增的时间
//        test7();
//        2.6 LocalDate、LocalTime 、LocalDateTime的使用
//        test8();
//        2.7 Zoned、ZonedDateTime
//        test9();
//        3.4 Instant
//        test10();
//        3.5 DateTimeFormatter
//        test11();
//        3.6掌握Period和Duration的作用
//        test12();
//        4.0  Arrays类
//        test13();

    }

    /**
     * day12-1.2 API-Runtime
     */
    public static void test1() {
        Runtime r = Runtime.getRuntime();
        System.out.println(r.availableProcessors());
        System.out.println(r.totalMemory() / 1024.0 + "KB");  //1024 = 1k
        System.out.println(r.totalMemory() / 1024.0 / 1024.0 + "MB");  //1024*1024 = 1MB
        System.out.println(r.freeMemory() / 1024.0 / 1024.0 + "MB");
    }

    /**
     * 1.3 API-BigDecimal讲解
     */
    public static void test2() {
        //目标：掌握BigDecimal的使用，解决小数运算失真问题
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);  // 0.30000000000000004
        System.out.println("---------------------------");

        //1.把他们编译成字符串封装成BigDecimal对象来运算
//        BigDecimal a1 = new BigDecimal(Double.toString(a));
//        BigDecimal b1 = new BigDecimal(Double.toString(b));

        //推荐用以下方式：把小数转化成字符串得到BigDecimal对象来使用。
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        // 这是加法~~
        BigDecimal c1 = a1.add(b1);
        System.out.println(c1);
        //这是减法~~
        BigDecimal c2 = a1.subtract(b1);
        System.out.println(c2);
        //这是乘法~~
        BigDecimal c3 = a1.multiply(b1);
        System.out.println(c3);
        //这是除法~~
        BigDecimal c4 = a1.divide(b1);
        System.out.println(c4);

        //除法的一个小小的问题
        BigDecimal i = new BigDecimal("0.1");
        BigDecimal j = new BigDecimal("0.3");
//        BigDecimal k = i.divide(j);   //这个结果是除不尽的，而BigDecimal是精度位，所以会报错
        //因此我们采用给小数点的方式告诉它保留多少位
        BigDecimal k = i.divide(j, 2, RoundingMode.HALF_UP);
        System.out.println(k);

        //最后把BigDecimal转化为double类型的数据
        double kd = k.doubleValue();
        System.out.println(kd);

    }

    /**
     * 2.1 Date日期类
     */
    public static void test3() {
        // 目标拿到Date日期类的使用
        //1. 创建一个Date对象，代表系统当前时间信息的
        Date d = new Date();
        System.out.println(d);

        //2.拿到时间毫秒值
        long time = d.getTime();
        System.out.println(time);

        //3.把时间毫秒值转化成日期对象，2s之后的时间是多少
        time += 2 * 1000;
        Date d2 = new Date(time);
        System.out.println(d2);
        //4. 直接把日期对象的时间通过setTime方法进行修改
        Date d3 = new Date();
        d3.setTime(time);
        System.out.println(d3);
    }

    /**
     * 2.2 SimpleDateFormat
     */
    public static void test4() {
        //目标：掌握SimpleDateFormat的使用
        //1. 准备一些时间
        Date d = new Date();
        System.out.println(d);

        long time = d.getTime();
        System.out.println(time);

        //2.格式化日期对象，时间，毫秒值
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM年dd日 HH:mm:ss EEE a");
        String str = simpleDateFormat.format(d);
        String str2 = simpleDateFormat.format(time);
        System.out.println(str);
        System.out.println(str2);

        //3.创建简单的日期格式化对象，指定时间格式必须与被解析的时间格式一模一样，否则会出bug
        String dataStr = "2023-11-28 20:04:30";
        //指定时间格式必须与被解析的时间格式一模一样，否则会出bug
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = simpleDateFormat1.parse(dataStr);
            System.out.println(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 2.3 时间秒杀案例
     */
    public static void test5() throws ParseException {
        //开始下单时间、结束时间、小贾下单时间、小皮下单时间
        String start = "2023年11月11日 0:0:0";
        String end = "2023年11月11日 0:10:0";
        String xj = "2023年11月11日 0:01:18";
        String xp = "2023年11月11日 0:10:57";

        //2.获取字符串时间日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //3.用日期格式化对象将字符串时间化为 日期对象
        Date startDt = sdf.parse(start);
        Date endDt = sdf.parse(end);
        Date xjDt = sdf.parse(xj);
        Date xpDt = sdf.parse(xp);

        // 4. 用日期对象来获取相应的时间毫秒值
        long startTime = startDt.getTime();
        long endTime = endDt.getTime();
        long xjTime = xjDt.getTime();
        long xpTime = xpDt.getTime();

        // 5.利用时间毫秒值进行比较
        if (xjTime >= startTime && xjTime <= endTime) {
            System.out.println("恭喜小贾秒杀成功");
        } else {
            System.out.println("很遗憾小贾您秒杀失败");
        }
        if (xpTime >= startTime && xpTime <= endTime) {
            System.out.println("恭喜小皮秒杀成功");
        } else {
            System.out.println("小皮秒杀失败");
        }
    }

    /**
     * 2.4 Calendar
     */
    public static void test6() {
        // 目标：掌握Calendar的使用和特点
        //1.得到系统此时时间对应的  日历对象
        Calendar now = Calendar.getInstance();
        System.out.println(now);

        //2.从日历对象中获取日历中的某个信息
        int year = now.get(Calendar.YEAR);  //获取年份
        System.out.println(year);

        int days = now.get(Calendar.DAY_OF_YEAR);//获取一年中的今天 1-365天
        System.out.println(days);

        //3. 拿到日历中记录的日期对象
        Date d = now.getTime();
        System.out.println(d);

        //4.拿到时间毫秒值
        long time = now.getTimeInMillis();
        System.out.println(time);

        //5.修改日历中的某个信息
        now.set(Calendar.MONTH, 9);  //修改月份为10月份  因为这里是从0-11月计算的
        now.set(Calendar.DAY_OF_YEAR, 125);  //改成一年中的第125天
        System.out.println(now);

        //6.为某个信息增加或者减少多少
        now.add(Calendar.DAY_OF_YEAR, 100);  //增加100天
        now.add(Calendar.DAY_OF_YEAR, -10);  //减一百天
        now.add(Calendar.DAY_OF_MONTH, 6);  //增加6个月
        now.add(Calendar.HOUR, 12);  //增加12个小时
        System.out.println(now);
    }

    /**
     * 2.5目标搞清楚为什么要用JDK8新增的时间
     */
    public static void test7() {
        // 传统的时间类 （Date、SimpleDateFormat、Calendar）存在如下问题
        //1. 设计不合理、使用不方便
        Date d = new Date();
//        System.out.println(d.getYear()+1900);
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        //2. 都是可变对象，修改后会丢失最开始的时间信息

        //3.线程不安全。

        //4.不能精确到纳秒，只能精确到毫秒
        //1秒 = 10000毫秒
        //1毫秒 = 1000微秒
        //1微秒=  1000纳秒
//        ----------不推荐使用JDK8之前的时间--------------------

    }

    /**
     * 2.6LocalDate、LocalTime 、LocalDateTime的使用
     */
    public static void test8() {

        // 0.获取本地日期对象(不可变对象)   LocalDate 获取年月日信息
        LocalDate ld = LocalDate.now();
        System.out.println(ld);   //年 月 日  2023-11-28
        //1.获取日期对象的信息
        int year = ld.getYear();  //年
        int month = ld.getMonthValue(); //月1-12
        int day = ld.getDayOfMonth(); // 日
        int dayOfYear = ld.getDayOfYear();  //一年中的第几天
        int dayOfWeek = ld.getDayOfWeek().getValue();  //星期几
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(dayOfYear);
        System.out.println(dayOfWeek);

        //2. 直接修改某个信息：withYaer  withMonth、withDayOfMonth、withDayOfYear
        LocalDate d1 = ld.withYear(2099);
        LocalDate d2 = ld.withMonth(12);
        LocalDate d3 = ld.withDayOfMonth(1);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(ld);

        //3.把信息加多少：plusYears、plusMonths、playDays、plusWeeks
        LocalDate d4 = ld.plusYears(2);
        LocalDate d5 = ld.plusMonths(-2);
        System.out.println(d4);
        System.out.println(d5);

        //4. 把信息减多少,minusYears、minusMonths、minusDays、minusWeeks
        LocalDate d6 = ld.minusYears(2);
        System.out.println(d6);

        //5. 获取指定日期的LocalDate对象 public static LocalDate of(int year,int month,int day, int week)
        LocalDate d7 = LocalDate.of(2099, 12, 12);
        System.out.println(d7);
        //6.判断两个时间对象，是否相等、在前还是灾后，equals、ifBefore、isAfter
        System.out.println(d6.equals(d7));
        System.out.println(d6.isAfter(d7));
        System.out.println(d6.isBefore(d7));

        System.out.println("--------分割线---------------");

        //说明一下LocalTime是获取的 时 分 秒 纳秒； 这个对象也是不可变的
        //假设：LocatTime lt = LocalTime.now();
        // lt.getHour()  时
        // lt.getMinute() 分
        // lt.getSecond()秒
        // lt.getNano() 纳秒
        // 其他的加的方法减的方法都是和LocalTime一样的。
        // plusHours、plusMinutes ....等等是加
        // minusHours、minusMinutes ...等等是减
        // withHour、withMinutes ...等等是修改
        // 也可以获取指定的时间  也是调用的LocalTime.of方法获取指定的时间
        //也可以比较equals、isBefore、isAfter

        // LocalDateTime就是LocalDate和LocalTime的结合。用的方法也是他们的和起来的方式
        // 其他的将LocalTime和LocalDate 换成LocalDateTime就可以了

        //最后一个知识点：LocalDateTime可以转换为LocalDate和LocalTime
        //同时LocalDate和LocalTime 一起转化能为LocalDateTime

    }

    /**
     * 2.7 Zoneld、ZonedDateTime
     */
    public static void test9() {
        // 目标：了解时区和带时区的时间
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId.getId());
        System.out.println(zoneId);

        // public static Set<String> getAvailableZoneIds(): 获取Java全部支持时区Id
        System.out.println(ZoneId.getAvailableZoneIds());

        //public static ZoneId of(String ZoneId);  //把某个时区id封装成ZoneId对象
        ZoneId zoneId1 = ZoneId.of("America/New_York");

        //2.ZoneDateTime:带时区的时间
        ZonedDateTime now = ZonedDateTime.now(zoneId1);
        System.out.println(now);

        ZonedDateTime now1 = ZonedDateTime.now(Clock.systemUTC());
        System.out.println(now1);
        // 获取系统默认时区的ZoneDateTime对象
        ZonedDateTime now2 = ZonedDateTime.now();
        System.out.println(now2);


    }

    /**
     * 3.4 Instant
     */
    public static void test10() {
        // 1. 创建爱你Instant的对象 获取此时刻时间信息
        Instant now = Instant.now();
        // 2. 获取总秒数
        long second = now.getEpochSecond();

        //3. 不够一秒的纳秒数
        int nano = now.getNano();
        System.out.println(nano);

        System.out.println(now);
        Instant instant = now.plusNanos(111);

        // Instant 的作用是什么呢？ 用于做代码的性能分析 或者记录用户操作的时间点
        Instant instant1 = Instant.now();
        // 代码执行。。。。
        Instant instant2 = Instant.now();

        System.out.println(instant2.getNano() - instant1.getNano());


    }

    /**
     * 3.5 DateTimeFormatter
     */
    public static void test11() {
        // 1. 创建一个日期时间格式化器对象出来
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

        //2. 对时间进行格式化
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        String format = dateTimeFormatter.format(now);
        System.out.println(format);

        //3. 格式化时间，另一种方法
        String format1 = now.format(dateTimeFormatter);  //反向格式化
        System.out.println(format1);

        //4. 解析时间 解析时间的一般使用LocalDateTime提供的方法进行解析
        String dateStr = "2029年12月12日 12:12:50";
        LocalDateTime parse = LocalDateTime.parse(dateStr, dateTimeFormatter);
        System.out.println(parse);

    }

    /**
     * 目标：掌握Period和Duration的作用
     */
    public static void test12() {
        //LocalDate和Period搭配使用
        //1.用LocalDate去创建连个之间的差值
        LocalDate localDate = LocalDate.of(2023, 11, 11);
        LocalDate localDate1 = LocalDate.of(2023, 10, 11);
//      2.创建period对象，封装两个日期对象
        Period period = Period.between(localDate, localDate1);
        System.out.println("两个时间的差值为：");
        System.out.println(period.getYears() + "年");
        System.out.println(period.getMonths() + "月");
        System.out.println(period.getDays() + "天");

        System.out.println("--------------------");

        //LocalDateTime和Duration搭配使用 精确到纳秒
        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 12, 13, 14, 15, 50);
        LocalDateTime localDateTime1 = LocalDateTime.of(2021, 12, 13, 14, 15, 16, 19);

        //创建Duration对象
        Duration duration = Duration.between(localDateTime, localDateTime1);
        System.out.println(duration.toDays()); // 间隔多少天
        System.out.println(duration.toHours()); //间隔多少小时
        System.out.println(duration.toMinutes()); //间隔多少分
        System.out.println(duration.toSeconds());//间隔多少秒
        System.out.println(duration.toMillis());//间隔多少毫秒
        System.out.println(duration.toNanos());//间隔多少纳秒


    }

    /**
     * 4 Array类的使用
     */
    public static void test13() {
//        1. public static String toString(类型[]arr)
        int[] arr = {10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(arr));

        // 2. public static 类型[] copyOfRange(类型[]arr,其实索引,结束索引)； 拷贝数组(指定范围，左开右闭)
        int[] arr2 = Arrays.copyOfRange(arr, 1, 4);  //[ 20 30 40 ]
        System.out.println(Arrays.toString(arr2));

        //3.拷贝数组，可以指定新数组的长度
        int[] arr3 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(arr3));

        //4.public static setAll(double[]array,InToDoubleFunction generator) 把数组中的原数据改为新数据存进去
        double[] prices = {140, 99, 100, 125.5};

        Arrays.setAll(prices, new IntToDoubleFunction() {  //这是一个匿名内部类，详见用法见笔记
            @Override
            public double applyAsDouble(int value) {
                return prices[value] * 0.8;
            }
        });

        //Lambda表达式1
        Arrays.setAll(prices, (int value) -> {
            return prices[value] * 0.8;
        });

        //Lambda表达式2  参数类型可以不写
        Arrays.setAll(prices, (value) -> {
            return prices[value] = 0.8;
        });

        //Lambda 表达式3  如果只有一个参数 那么参数类型可以省略 同时括号也可以省略
        Arrays.setAll(prices, value -> {
            return prices[value] * 0.8;
        });

        //Lambda 表达式4 Lambda方法体中只有一行代码，可以省略大括号不写，同时也要省略分号。如果这是一条return语句，也必须去掉return不写
        Arrays.setAll(prices, value -> prices[value] * 0.8);

        /* setAll里面的写法
        * public static void setAll(double[] array, IntToDoubleFunction generator) {
        Objects.requireNonNull(generator);
        for (int i = 0; i < array.length; i++)
        array[i] = generator.applyAsDouble(i);
    }
        * */
        System.out.println(Arrays.toString(prices));

        //5.对数组进行排序  默认是升序
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));
    }

}
