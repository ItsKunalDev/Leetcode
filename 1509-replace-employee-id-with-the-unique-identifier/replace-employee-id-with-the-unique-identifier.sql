# Write your MySQL query statement below
select  e.unique_id as unique_id , eu.name as name
from  Employees eu
left join EmployeeUNI e
on eu.id=e.id;