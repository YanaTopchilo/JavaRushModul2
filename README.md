# JavaRushModul2
Island model with simulation of animal and plant life
Параметры (размеры острова, количество животных) задаются в классе Simulation.
При создании животные и растение рандомно распределяются по острову (задание координат через Random()).
Общим для всех живых организмов является класс Organisme. Его наследуют классы Plant и Animal (наследники Predator, Herbivor).
Индивидульные параметры видов задаются через enum Species. Импорт из файлов не применяется.
Питание:
Хищники отличаются от травоядных переопределенным методом eat(). Так же у каждого хищника свой метод chanceOfEat(), определяющий через switch вкусовые предпочтения.
Утка ест и растения и гусеницу (переопреден eat()).
Размножение: 
У животных есть пол, который задается через Random() в конструкторе. Каждая самка в ячейке произведет потомство, если в ячейке есть хотя бы один самец её вида. Потомство добавляется в ту же ячейку.
Движение:
Направление и скорость движения выбираются через Random(). Если выбранные параметры перемещения невозможны (слишком много животных в новой ячейке, остров закончился), выведется соответствующее сообщение.
Смерть:
Растения умирают, когда их вес меньше или равен нулю (их съели). Убыток веса растения равен голоду травоядного.
Животные умирают от голода (при движении тратится 10% сытости) или, если их съели. Если сытость хищника меньше максимального значения, он убивает жертву любого размера (жертва гибнет вне зависимости от соотношений веса жертвы и сытости хищника).
Многопоточность:
Созданы потоки: 1. все животные двигаются; 2. все животные едят, 3. растет трава, 4. все животные размножаются.

