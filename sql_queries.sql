//1
select * from jobs
where min_salary>10000;
//2
select first_name, hire_date from employees
where extract(year from hire_date) between 1980 and 1995;
//3
select first_name, hire_date from employees
where job_id='IT_PROG' or job_id='SA_MAN';
//4
select * from employees
where hire_date>'01-Jan-2000';
//5
select*from employees
where employee_id=150 or employee_id=160;
//6
select first_name, salary, comission_pct, hire_date from employees
where salary<10000;
//7
select job_title ,(max_salary-min_salary) from jobs 
where max_salary between 10000 and 20000; 
//8
select first_name, round(salary,-3) from employees;
//9
select *from jobs 
order by job_title desc;
//10
select first_name, last_name from employees 
where first_name like 'S%' or last_name like 'S%';
//11
select * from employees
where extract(month from hire_date)=5;
//12
select * from employees 
where comission_pct is null
and (salary between 5000 and 10000) 
and department_id=30;
//13
select first_name, hire_date, last_day(hire_date)+1 from employees;
//14
select first_name,hire_date, floor((sysdate-hire_date)/365) from employees;
//15
select first_name from employees 
where extract(year from hire_date)=1997;
//16
select initcap(first_name), initcap(last_name) from employees;
//17
select job_title, substr(job_title,1,instr(job_title,' ')-1) from jobs;
//18
select length(first_name) from employees
where instr(last_name,'b')>3;
//19
select upper(first_name),lower(email)from employees
where upper(first_name)=upper(email);
//20
select first_name from employees
where extract(year from hire_date)=extract(year from sysdate);
//21
select sysdate-to_date('01-jan-2011') from dual;
//22
select to_char(hire_date,'MM'), count(*) from employees
where to_char(hire_date,'YYYY')= 2000
group by to_char(hire_date,'MM');
//23
select manager_id, count(*) from employees
group by manager_id;
//24
select employee_id, start_date-1 from job_history;
//25
select count(*) from employees
where extract(day from hire_date)>15;
//26
select country_id,count(city) from locations
group by country_id;
//27
select department_id,avg(salary) from employees
where comission_pct is not null
group by department_id;
//28
select job_ID, count(*), sum(salary), max(salary)- min(salary) from employees
group by job_id;
//29
select job_id, avg(salary) from employees
group by job_id
having avg(salary)>10000;
//30
select extract(year from hire_date), count(*) from employees
group by extract(year from hire_date)
having count(*)>10;
//31
select department_id, count(comission_pct) from employees
group by department_id
having count(comission_pct)>5;
//32
select employee_id, count(employee_id) from job_history
group by employee_id
having count(employee_id)>1;
//33
select job_id from job_history
where (end_date-start_date)>2
group by job_id
having count(*)>1;
//34
select department_id,to_char(hire_date, 'YYYY'),count(*) from employees
group by department_id, to_char(hire_date, 'YYYY')
order by department_id;
//35
select distinct department_id from employees 
group by department_id,manager_id
having count(employee_id)>5;
//36
update employees set salary=8000
where employee_id=115 and salary<6000;
//37
insert into employees  (employee_id, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE,JOB_ID, SALARY, DEPARTMENT_ID) 
Values (207, 'ANGELA', 'SNYDER','ANGELA','215 253 4737', SYSDATE, 'SA_MAN', 12000, 80);
//38
delete from departments 
where department_id=20;
//39
update employees set job_id='IT_PROG'
where employee_id=110
and job_id like 'IT%';
//40
insert into departments (department_id, department_name ,manager_id,location_id)
values (280,'Maintainance',120,1200);
//41
select department_name, count(*) from employees natural join departments
group by department_name;
//42
select job_title,employee_id,end_date-start_date from job_history natural join jobs
where department_id=30;
//43
select department_name, first_name from departments join employees on departments.manager_id=employees.employee_id;
//44
select department_name, first_name, city from departments 
join employees on departments.manager_id=employees.employee_id
join locations on departments.location_id=locations.location_id;
//45
select country_name, city,department_name from locations
join countries on locations.country_id=countries.country_id
join departments on locations.location_id= departments.location_id;
//46
select job_title,department_name, last_name, start_date from job_history
join jobs on job_history.job_id=jobs.job_id
join employees on job_history.employee_id=employees.employee_id
join departments on job_history.department_id=departments.department_id
where extract(year from start_date) between 1990 and 2000;
//47
select job_title, avg(salary) from employees
join jobs on employees.job_id=jobs.job_id
group by job_title;
//48
select job_title, first_name, max_salary-salary from employees natural join jobs;
//49
select last_name, job_title from employees natural join jobs
where comission_pct is not null
and department_id= 30;
//50
select j.* from job_history j
join employees e on j.employee_id=e.employee_id
where salary>15000;