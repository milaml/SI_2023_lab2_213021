# Втора лабораториска вежба по Софтверско Инженерство
# Мила Младеновска 213021
# Control Flow Graph : ![CFG](https://github.com/milaml/SI_2023_lab2_213021/assets/129743975/aba435c2-0812-4dba-9a76-8bfe11c1bc03)

# Цикломатска Комплексност:
Цикломатската комплексност на овој код е 11, истата ја добив преку формулата V (G) = E - N + 2, каде што E е бројот на ребра а N e бројот на јазли. 
 Во случајoв Е=39, N=30 па цикломатската комплексност изнесува 11.
 # Тест случаи според критериумот Every branch
TestCase1 : user = null; AllUsers=null; <br>
Да влезе во првиот IF и да фрли excepction 
<br>
TestCase2: user(username=null;password =1234fin!.; email=finki@ukim.mk) ; AllUsers =  (username=null; password=1234fin!.; email=finki@ukim.mk) <br>
Различен username, passwordot да содржи специјални знаци, ист мејл.
<br>
TestCase3: user(username=MILA; password = mila; email = finki@ukim.mk) ; AllUsers = (username=MILA; password= mila; email=finkiukim) <br>
Passwordot да има помалце од 8 карактери и различен меил ист username. 
<br>
TestCase4: user(username=Mila; password=12345678910112341; email: mila123) ; AllUsers = (username=Mila; password=1241432131; email=bilosto) <br>
Мејлот да не содржи @ i . i password без специјален знак
<br>
TestCase5: user(username=Mila; password= finki ukim; email: finki@ukim.mk) ; AllUsers= (username=Mila; password= finki ukim; email= finki@ukim.mk) <br>
Пасвордот да содржи празно место. <br> Со овие test caseovi се исполнува Every Branch критериумот.
# Тест случаи според критериумот Multiple Condition 
Според овој критериум за условот  if (user==null || user.getPassword()==null || user.getEmail()==null) имаме 4 можни сценарија <br> 
T X X <br>
F T X <br>
F F T <br>
F F F <br>
TestCase1: User == null <br>
TestCase2: User("Mila", null, "bilosto") <br>
TestCase3: User("Mila", "password", null) <br>
TestCase4: User("Mila", "password", "bilosto")
