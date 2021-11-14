CREATE TABLE students_fpmm PARTITION OF students FOR VALUEs in ('fpmm');
CREATE TABLE students_gnf PARTITION OF students FOR VALUEs in ('gnf');
CREATE TABLE students_gum PARTITION OF students FOR VALUEs in ('gum');