-- 상품코드 별 매출액(판매가 *판매량) 합계를 출력 매출액을 기준으로 내림차순 정렬, 같으면 상품코드를 기준으로 오름차순 해주세요

SELECT 
    p.product_code,
    SUM(o.sales_amount*p.price) AS SALES
FROM product p join offline_sale o
ON p.product_id=o.product_id
GROUP BY p.product_code
ORDER BY SALES desc, product_code asc;