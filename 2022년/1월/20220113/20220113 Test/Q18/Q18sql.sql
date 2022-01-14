select department_id 부서번호,
       salary 월급
from employees

UNION

select null,
       SUM(salary)
from employees 
group by department_id

UNION

select null,
       SUM(salary)
from employees;