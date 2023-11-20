CREATE TABLE public.homework
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
    name character varying(32) NOT NULL,
    description character varying(100),
    PRIMARY KEY (id)
);
	
CREATE TABLE public.lesson
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
    name character varying(32) NOT NULL,
    updated_at timestamp without time zone,
    homework_id bigint,
    PRIMARY KEY (id),
    CONSTRAINT homework_id FOREIGN KEY (homework_id)
        REFERENCES public.homework (id) MATCH SIMPLE
);
	
CREATE TABLE public.schedule
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
    name character varying(32) NOT NULL,
    updated_at timestamp without time zone,
    PRIMARY KEY (id)
);	

CREATE TABLE public.aux_schedule_lesson
(
    schedule_id bigint NOT NULL,
    lesson_id bigint NOT NULL,
    CONSTRAINT schedule_id FOREIGN KEY (schedule_id)
        REFERENCES public.schedule (id) MATCH SIMPLE,
    CONSTRAINT lesson_id FOREIGN KEY (lesson_id)
        REFERENCES public.lesson (id) MATCH SIMPLE
);