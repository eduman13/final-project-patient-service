insert into patient(id, name, photo, surnames, birthday, social_security_number, number, portal, street, doctor_id) values
(1, 'Claudia', '../../assets/avatar/avatar2.png','Alonso Campoamor', '1991-12-21', '566765456344R', 3, 5, 'C/ Falsa', 2),
(2, 'Elena', '../../assets/avatar/avatar3.png','Celio Amador', '1987-04-01', '656787690876G', 5, 15, 'C/ Falsa', 1),
(3, 'Joel', '../../assets/avatar/avatar1.png','Inmaculada Campos', '1965-10-12', '435213456765A', 4, 28, 'C/ Falsa', 2),
(4, 'Baudelio', '../../assets/avatar/avatar4.png','Gala María', '1976-05-20', '903417654567S', 4, 23, 'C/ Falsa', 3),
(5, 'Iván', '../../assets/avatar/avatar5.png','Carmina Contreras', '1953-07-02', '398787095612W', 1, 7, 'C/ Falsa', 1),
(6, 'Marcos', '../../assets/avatar/avatar1.png','López Pérez', '1930-02-08', '812315676513A', 6, 69, 'C/ Falsa', 3),
(7, 'Eduardo', '../../assets/avatar/avatar4.png','García Espeso', '1945-04-25', '723451762509E', 5, 42, 'C/ Falsa', 2),
(8, 'Víctor', '../../assets/avatar/avatar5.png','Martín Campollanos', '1987-09-18', '873761251318B', 2, 15, 'C/ Falsa', 2),
(9, 'Guillermo', '../../assets/avatar/avatar4.png','Martínez García', '1992-12-20', '709067484756A', 3, 1, 'C/ Falsa', 1),
(10, 'María', '../../assets/avatar/avatar3.png','Toyas Lecea', '1989-09-10', '1189347056794D', 5, 20, 'C/ Falsa', 3);

insert into medical_history(id, information, date_issue, doctor_id, patient_id) values
(1, 'Diabetic', '2009-07-09', 2, 1),
(2, 'Epilepsy', '2009-07-09', 1, 2),
(3, 'Autism, Diabetic', '2009-07-09', 2, 3),
(4, 'Cancer', '2009-07-09', 3, 4),
(5, 'Diabetic', '2009-07-09', 1, 5),
(6, 'Arthritis', '2009-07-09', 3, 6),
(7, 'Diabetic', '2009-07-09', 2, 7),
(8, 'Diabetic', '2009-07-09', 2, 8),
(9, 'Ebola', '2009-07-09', 1, 9),
(10, 'Diabetic', '2009-07-09', 3, 10);

insert into family_background(patient_id, information) values
(1, 'Mother suffers from arrhythmia.'),
(2, 'Father suffered a heart attack at the age of 70 (smoker).'),
(3, 'The father had lung cancer. Diabetic mother.'),
(4, 'Hypertensive father and mother.'),
(5, 'Her uncle on mother''s side had parkinson''s'),
(6, 'Her mother had breast cancer.'),
(7, 'Father suffered a heart attack at the age of 56 (alcoholic).'),
(8, 'Her grandfather suffered a stroke. Her mother is hypertensive.'),
(9, 'His aunt on the mother''s side died of a heart attack'),
(10, 'Her diabetic mother. His father is diabetic and he suffered from arrhythmia');

insert into medication(patient_id, information) values
(1, 'Paracetamol'),
(2, 'Paracetamol. Ibuprofeno'),
(3, 'Paracetamol'),
(4, 'Paracetamol'),
(5, 'Paracetamol'),
(6, 'Paracetamol'),
(7, 'Paracetamol'),
(8, 'Paracetamol. Ibuprofeno'),
(9, 'Paracetamol'),
(10, 'Paracetamol');

