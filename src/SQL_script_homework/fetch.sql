-- Retrieving all Homework records
SELECT * FROM Homework;

-- Retrieving all Lesson records, including Homework data
SELECT Lesson.*, Homework.* 
FROM Lesson
LEFT JOIN Homework ON Lesson.homework_id = Homework.id;

-- Get all Lesson records (including Homework data) sorted by update time
SELECT Lesson.*, Homework.* 
FROM Lesson
LEFT JOIN Homework ON Lesson.homework_id = Homework.id
ORDER BY Lesson.updatedAt;

-- Retrieving all Schedule entries, including Lesson data
SELECT Schedule.*, Lesson.*
FROM Schedule
LEFT JOIN Lesson ON Schedule.lesson_id = Lesson.id;

-- Getting the number of Lessons for each Schedule
SELECT Schedule.id, Schedule.name, Schedule.updatedAt, COUNT(ScheduleLesson.lesson_id) as lesson_count
FROM Schedule
LEFT JOIN ScheduleLesson ON Schedule.id = ScheduleLesson.schedule_id
GROUP BY Schedule.id;
