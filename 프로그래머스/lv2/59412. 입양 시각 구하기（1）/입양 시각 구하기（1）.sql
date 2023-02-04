select DISTINCT hour(datetime) HOUR,
count(hour(datetime))
from ANIMAL_OUTS
where hour(datetime) between '9' and '20'
group by HOUR
order by HOUR