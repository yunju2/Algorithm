SELECT user_id,product_id
FROM ONLINE_SALE
group by user_id,product_id
having count(*) >=2
ORDER BY user_id , product_id DESC

