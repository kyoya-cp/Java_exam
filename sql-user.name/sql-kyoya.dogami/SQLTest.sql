/* ----
	問1
*/ ----
-- INSERT INTO items( id, category_id, name, price ) VALUES ( 13, 1, '鰯', 150 ), ( 14, 2, '羊', 650 ) ;
-- SELECT * FROM items ORDER BY id ASC ;


/* ----
	問2
*/ ----
-- UPDATE items SET price = price * 0.9 ;
-- SELECT * FROM items ORDER BY id ASC ;

/* ----
	問3
*/ ----
-- DELETE FROM employees WHERE end_date < '2013-04-01' ;
-- SELECT * FROM employees ORDER BY id ASC ;


/* ----
	問4
*/ ----
-- SELECT * FROM employees WHERE start_date = ( SELECT min( start_date ) FROM employees WHERE end_date is null ) ;


/* ----
	問5
*/ ----
-- SELECT a.name AS region, p.name AS prefecture FROM regions AS a INNER JOIN prefectures AS p ON a.code = p.region_code ;


/* ----
	問6
*/ ----
-- SELECT sum( population ) FROM populations ;


/* ----
	問7
*/ ----
-- SELECT pre.name AS prefecture, pop.population
-- FROM prefectures AS pre, populations AS pop
-- INNER JOIN genders AS gen
-- ON pop.gender_code = gen.code
-- WHERE pre.region_code = '80'
-- ;


/* ----
	問8
*/ ----
-- SELECT 
-- FROM populations AS pop
-- INNER JOIN generations AS gen
-- ON gen.code = pop.generation_code
-- ;
