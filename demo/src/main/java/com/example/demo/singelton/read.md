“How to inject a prototype scope bean in a singleton scope bean?”

“when a prototyped scoped bean is injected in a singleton scoped bean, then on each request of singleton bean, we will get the same instance of prototype scoped bean, but there are certain ways where we can get a new instance of prototyped scoped bean also.
The solutions are:
- Injecting an ApplicationContext in Singleton bean and then getting the new instance of prototyped scoped bean from this ApplicationContext
- Lookup method injection using @Lookup
- Using scoped proxy

Injecting ApplicationContext:
To inject the ApplicationContext in Singleton bean, we can either use @Autowired annotation or we can implement ApplicationContextAware interface”

Excerpt From
Grokking The Java Developer Interview: More Than 200 Questions To Crack The Java, Spring, SpringBoot & Hibernate Interview
Arora, Jatin
This material may be protected by copyright.