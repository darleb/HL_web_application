CREATE TABLE students(
    student_id    int not null,
    y_of_add      date not null,
    z_number      int,
    faculty       VARCHAR
) PARTITION BY LIST(faculty);