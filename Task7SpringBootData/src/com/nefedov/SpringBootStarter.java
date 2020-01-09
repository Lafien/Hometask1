package com.nefedov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStarter {

  /*  private static final Logger log = LoggerFactory.getLogger(SpringBootStarter.class);

    @Autowired
    private BookService bookService;

    @Autowired
    private BuyerService buyerService;

    @Autowired
    private ShopService shopService;

    @Autowired
    private BuyService buyService;*/

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarter.class, args);
    }

   /* @Override
    public void run(String... args) {
        log.info("retreive by name");
        bookService.retrieveByName("Капитанская дочка. Оригинал").forEach(System.out::println);

        log.info("retreive by name1");
        buyerService.retrieveBySurname("Судаева").forEach(System.out::println);

        log.info("retreive by name1");
        shopService.retrieveByNameShop("Удиви себя").forEach(System.out::println);

        log.info("retreive by name1");
        buyService.findById(3).forEach(System.out::println);

    }*/

    /*@Override
    public void run(String... args) {

        log.info("find all");
        employeeService.findAll().forEach(System.out::println);

        log.info("find by id");
        System.out.println(employeeService.findById(2));

        log.info("find by name");
        employeeService.findByName("Gleb").forEach(System.out::println);

        log.info("save new employee");

        employeeService.save(new Employee("Andrew","Vice President",1000000.00));

        log.info("retreive by name");
        employeeService.retrieveByName("Gleb").forEach(System.out::println);

    }*/
}

