-- Homework table with id, name and description variables
CREATE TABLE Homework (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    description VARCHAR(255)
);

-- Lesson table with id, name, updatedAt and homework_id variables
CREATE TABLE Lesson (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    updatedAt DATE,
    homework_id INT,
    FOREIGN KEY (homework_id) REFERENCES Homework(id)
);

-- Schedule table with id, name, updatedAt and lesson_id variables
CREATE TABLE Schedule (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    updatedAt DATE,
    lesson_id INT,
    FOREIGN KEY (lesson_id) REFERENCES Lesson(id)
);

-- Table that connects Schedule and Lesson tables between each other
CREATE TABLE ScheduleLesson (
    schedule_id INT,
    lesson_id INT,
    PRIMARY KEY (schedule_id, lesson_id),
    FOREIGN KEY (schedule_id) REFERENCES Schedule(id),
    FOREIGN KEY (lesson_id) REFERENCES Lesson(id)
);
