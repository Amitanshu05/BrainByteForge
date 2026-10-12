# Write your MySQL query statement below
SELECT score , `rank`
FROM (
    SELECT s.score AS score ,
    DENSE_RANK() OVER (ORDER BY s.score DESC) AS `rank`
    FROM Scores s
)t
ORDER BY score DESC;