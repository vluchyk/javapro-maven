SELECT * FROM public.homework;

SELECT ls.id, ls.name, ls.updated_at, ls.homework_id, h.name AS hw_name, h.description AS hw_description
FROM public.lesson AS ls
LEFT JOIN public.homework AS h ON h.id = ls.homework_id;

SELECT ls.id, ls.name, ls.updated_at, ls.homework_id, h.name AS hw_name, h.description AS hw_description
FROM public.lesson AS ls
LEFT JOIN public.homework AS h ON h.id = ls.homework_id
ORDER BY ls.updated_at;

SELECT s.id, s.name, s.updated_at,
       ls.id AS lesson_id, ls.name AS lesson_name, ls.updated_at AS lesson_updated_at, ls.homework_id
FROM public.schedule AS s
LEFT JOIN public.aux_schedule_lesson AS sls ON sls.schedule_id = s.id
LEFT JOIN public.lesson AS ls ON ls.id = sls.lesson_id;

SELECT s.name, COUNT(sls.lesson_id) AS lessons
FROM public.schedule AS s
LEFT JOIN public.aux_schedule_lesson sls ON sls.schedule_id = s.id
GROUP BY s.name;