select department_id 부서번호,
       salary 급여,
       RANK() Over(order by salary DESC) AS RANK,
       DENSE_RANK() Over(order by salary DESC) AS D_RANK,
       ROW_NUMBER() Over(order by salary DESC) AS R_NUM
from employees
where department_id = 50;