CREATE VIEW v_EMV_DEPT_VIEW
AS
select e.employee_id 사번,
       e.first_name || ' ' || e.last_name 이름,
       e.job_id 직책,
       d.ename 부서명,
       d.loc 부서위치
from employees e JOIN dept d
ON e.department_id = d.deptno;





select *
from v_EMV_DEPT_VIEW;