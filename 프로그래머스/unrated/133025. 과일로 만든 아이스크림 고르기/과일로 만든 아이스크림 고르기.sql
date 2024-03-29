SELECT F.FLAVOR FROM FIRST_HALF AS F
WHERE F.FLAVOR IN
(SELECT I.FLAVOR FROM ICECREAM_INFO AS I WHERE I.INGREDIENT_TYPE LIKE 'f%')
AND F.TOTAL_ORDER > 3000
ORDER BY F.TOTAL_ORDER DESC;