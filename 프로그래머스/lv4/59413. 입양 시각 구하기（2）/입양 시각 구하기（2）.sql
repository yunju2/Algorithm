set @hour = -1;
select @hour := @hour +1 hour,
(select count(*)
from ANIMAL_OUTS
where @hour = hour(datetime))
from ANIMAL_OUTS
where @hour < 23