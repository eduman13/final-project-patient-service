insert into patient(id, name, photo, surnames, birthday, social_security_number, number, portal, street, doctor_id) values
(1, 'Claudia', '../../assets/avatar/avatar2.png','Alonso Campoamor', '1991-12-21', '566765456344R', 3, 5, 'C/ Falsa', 2),
(2, 'Elena', '../../assets/avatar/avatar3.png','Celio Amador', '1987-04-01', '656787690876G', 5, 15, 'C/ Falsa', 1),
(3, 'Joel', '../../assets/avatar/avatar1.png','Inmaculada Campos', '1965-10-12', '435213456765A', 4, 28, 'C/ Falsa', 2),
(4, 'Baudelio', '../../assets/avatar/avatar4.png','Gala María', '1995-05-20', '903417654567S', 4, 23, 'C/ Falsa', 3),
(5, 'Iván', '../../assets/avatar/avatar5.png','Carmina Contreras', '1995-07-02', '398787095612W', 1, 7, 'C/ Falsa', 1),
(6, 'Marcos', '../../assets/avatar/avatar1.png','López Pérez', '1995-02-08', '812315676513A', 6, 69, 'C/ Falsa', 3),
(7, 'Eduardo', '../../assets/avatar/avatar4.png','García Espeso', '1995-04-25', '723451762509E', 5, 42, 'C/ Falsa', 2),
(8, 'Víctor', '../../assets/avatar/avatar5.png','Martín Campollanos', '1995-09-18', '873761251318B', 2, 15, 'C/ Falsa', 2),
(9, 'Guillermo', '../../assets/avatar/avatar4.png','Martínez García', '1995-12-20', '709067484756A', 3, 1, 'C/ Falsa', 1),
(10, 'María', '../../assets/avatar/avatar3.png','Toyas Lecea', '1995-09-10', '1189347056794D', 5, 20, 'C/ Falsa', 3);

insert into medical_history(id, information, date_issue, doctor_id, patient_id) values
(1, 'Diabetic', '2009-07-09', 1, 2);

insert into family_background(patient_id, information) values
(2, 'Father suffered a heart attack at the age of 70 (smoker). Hypertensive mother fedagergbved dsgvdwge ve fef we fe wfe');

insert into medication(patient_id, information) values
(2, 'cvndsvhndwVBDWv cvidSAVHIODA´V CVUWDhvdew');

