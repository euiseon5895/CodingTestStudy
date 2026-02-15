-- 코드를 입력하세요
SELECT p.product_code as PRODUCT_CODE, sum(p.price * o.sales_amount) as SALES
from  offline_sale o left join product p
on o.product_id = p.product_id
group by p.product_code
order by SALES desc, PRODUCT_CODE asc;