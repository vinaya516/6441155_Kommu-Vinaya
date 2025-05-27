SELECT 
    u.full_name,
    e.title AS event_title,
    e.city,
    e.start_date,
    e.end_date
FROM Registrations r
JOIN Users u ON r.user_id = u.user_id
JOIN Events e ON r.event_id = e.event_id
WHERE e.status = 'upcoming'
  AND e.city = u.city
ORDER BY e.start_date;