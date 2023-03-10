# Простейший проект на Java

**Задача**: написать иерархию животных, 
разбив их на хищников и травоядных.

Создать несколько экземпляров разных животных,
рассадив их по двум клеткам,
так чтобы хищники не съели травоядных.

## Работа с git

Склонировать внешний репозиторий:
```
git clone https://github.com/junnied/animals.git
```

Создание пустого репозитория:
```
git init
```

Затем можно к локальному репозиторию подключить удалённый:
```
git remote add origin https://github.com/junnied/animals.git
```

* `origin` - имя репозитория
* `https://github.com/junnied/animals.git` - ссылка на удалённый репозиторий

После редактирования кода нужно сделать коммит (зафиксировать):
```
git add . 
git commit -am "Подробный комментарий о том, что сделано"
```

Выгрузка в удалённый репозиторий:
```
git push <имя репозитория> <имя ветки>
```

Например: `git push origin main`.

Для отладки отдельный возможностей программы (feature), создаются отдельные ветки.
Создание ветки:
```
git checkout -b <имя ветки>
```

Смена ветки:
```
git checkout <имя ветки>
```

Перед работой с git, желательно посмотреть текущий статус:
```
git status
```

Другие полезные команды git: 
* `pull` - обновить текущую ветку из удалённого репозитория
* `merge` - объединить текущую ветку с другой
* `stash` - "стащить", спрятать изменения, чтобы выгрузить их на другой ветке
* `git stash apply` - извлечь спрятанные изменения в другую ветку (после смены ветки).
* `git reset --hard` - возврат к последнему коммиту.

## Задания:
0. Настроить Кириллицу при выводе в консоль IntelliJ IDE.
1. Создать собаку, на базе неё бульдога. 
2. В классе Animal cделать метод boolean.
   Если хищник true, если травоядное то false.
3. ***Тернарный оператор*** (или тернарная операция) 
в языке Java часто используется вместо оператора if-else. 
Он содержит три выражения - отсюда и происходит 
название оператора.

Общая форма тернарного оператора:
*выражение1 ? выражение2 : выражение3*

*Выражение1* обозначает любое выражение, вычисление 
которого дает логическое значение типа boolean.

Если *выражение1==true*, то вычисляется *выражение2*, 
в противном случае – *выражение3*.

*Выражение2 и выражение3* должны возвращать значение 
одинакового (или совместимого) типа, которым не может 
быть тип void.

4. Разобрать и выучить определения:

***Statement или инструкция*** это фрагмент кода, 
изменяющий состояние окружения в котором выполняется программа.

***Expression или выражение*** это фрагмент кода, 
результатом которого является некая величина.

***Блок*** - набор из нескольких инструкций.

Из определения следует:
- sum = 2 + 3; - инструкция содержащая выражение;
- var sum; - просто инструкция без выражения;
- 2+3; - просто выражение, но выражения без инструкций 
бессмысленны (кроме случаев отладки), т.к. с результатом 
нужно что-то делать/где-то хранить его.

***Операторы*** это специальные символы, которые осуществляют 
операции над операндами (переменными и значениями). 
Например, «+» это оператор, который производит сложение.

*Основные операторы языка Java:*
- арифметические операторы;
- операторы сравнения;
- побитовые операторы;
- логические операторы;
- операторы присваивания;
- прочие операторы.

***Переменная*** — это контейнер, в котором может храниться 
некоторое значение данных для дальнейшего использования 
в программе. 

Каждая переменная имеет тип, имя и значение. 
Тип определяет, какую информацию может хранить 
переменная или диапазон допустимых значений.
Присвоение значения переменной называется ***инициализацией***.

***Константа*** также используется для хранения данных.
Но в отличие от переменных константам можно 
присвоить значение только один раз.
Константа объявляется также, как и переменная,
только вначале идет ключевое слово **final**.
Как правило, константы имеют имена в верхнем регистре.

***Типы данных*** в Java делят на две большие группы: 
*примитивные и ссылочные*. 

В состав *примитивных типов* (или просто примитивов) 
входят четыре подвида и восемь типов данных:
1) целые числа (byte, short, int, long);
2) числа с плавающей точкой (float, double);
3) логический (boolean);
4) символьный (char).

*Примитивы* занимают фиксированный объём ОЗУ, например: 
байт = 8 бит, short = 

*Ссылочные типы данных* ещё называют ссылками. 
К ним относятся все классы, интерфейсы, массивы, 
а также тип данных String. <br>Ссылочные* занимают непредсказуемый объём ОЗУ. Работа с ними 
ведётся по адресам (ссылкам).
java.lang.Object@12edcd21 