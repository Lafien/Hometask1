CREATE TABLE public.book
(
id_book serial primary key,
name_book text  NOT NULL,
costs numeric NOT NULL,
warehouse text  NOT NULL,
quantity integer NOT NULL
);

CREATE TABLE public.buyer
(
id serial primary key,
surname text NOT NULL,
residence text NOT NULL,
discount integer NOT NULL
);

CREATE TABLE public.shop
(
id_shop serial primary key,
name_shop text,
locations text,
commission integer NOT NULL
);

CREATE TABLE public.buy
(
id_number serial primary key,
date_buy timestamp without time zone NOT NULL,
seller integer NOT NULL,
buyer integer NOT NULL,
book integer NOT NULL,
amount integer NOT NULL,
summ numeric NOT NULL,
CONSTRAINT buy_book_fkey FOREIGN KEY (book)
REFERENCES public.books (id_book) MATCH SIMPLE
ON UPDATE NO ACTION
ON DELETE NO ACTION,
CONSTRAINT buy_buyer_fkey FOREIGN KEY (buyer)
REFERENCES public.buyer (id) MATCH SIMPLE
ON UPDATE NO ACTION
ON DELETE NO ACTION,
CONSTRAINT buy_seller_fkey FOREIGN KEY (seller)
REFERENCES public.shop (id_shop) MATCH SIMPLE
ON UPDATE NO ACTION
ON DELETE NO ACTION
);
