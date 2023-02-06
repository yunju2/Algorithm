select car_type CAR_TYPE,
count(car_type) CARS
from CAR_RENTAL_COMPANY_CAR
where options regexp '통풍시트|가죽시트|열선시트'
group by car_type
order by car_type