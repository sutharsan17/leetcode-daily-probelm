
Select p.product_name , s.year , s.price from Sales s
left join product p
on s.product_id=p.product_id