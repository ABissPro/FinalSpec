Для создания файлов с помощью команды `cat` в терминале операционной системы Linux необходимо выполнить следующие команды:

1. Создание файла "Домашние животные" и заполнение его содержимым:

```
cat > "Pets"
dog
cat
hamster
Ctrl + D
```

2. Создание файла "Вьючные животные" и заполнение его содержимым:

```
cat > "Pack animals"
horse
camel
dunkeys
Ctrl + D
```

3. Объединение файлов с помощью команды `cat`:

```
cat "Pets" "Pack animals" > "Human friends"
```

4. Просмотр содержимого созданного файла:

```
cat "Human friends"
```

5. Переименование файла "Друзья человека" на "Животные":

```
mv "Human friends" "Animals"
```

Для создания директории и перемещения файла в нее в терминале операционной системы Linux можно выполнить следующие команды:

1. Создание директории "my_directory":

```
mkdir my_directory
```

2. Перемещение файла "Животные" в созданную директорию:

```
mv "Animals" my_directory/
```
