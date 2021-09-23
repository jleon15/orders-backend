##### Initializing dependencies
The application requires a MySQL database with the schema called 'orders', with host 'localhost' and port '3306'.

The database can be set up using the following commands:

CREATE SCHEMA `orders`;

USE `orders`;

Once the schema is created, the application will create the tables when it is executed.

To seed some orders you can run:

INSERT INTO orders.pizza_sizes
(size)
VALUES
('SMALL'),
('MEDIUM'),
('HUGE');

INSERT INTO orders.pizza_crusts
(name)
VALUES
('Stuffed'),
('Flat'),
('Thin');

INSERT INTO orders.pizzas
(name)
VALUES
('Cheese'),
('Jam and Cheese'),
('Peperonni');

INSERT INTO orders.pizza_toppings
(name, pizza_id)
VALUES
('Extra cheese', 1);

INSERT INTO orders.pizza_orders
(pizza_id, crust_id, size_id)
VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 1);


##### Running the application locally:
To run the application a gradle build must be executed followed by executing the app using the following commands from the projects directory:

1. ./gradlew build
2. ./gradlew bootRun

Make sure you are running MySQL locally on port 3306, set up Application in IntelliJ and set up the following 
environment variables:

DB_URL=jdbc:mysql://localhost:3306/orders
DB_PASSWORD=password
DB_USERNAME=username