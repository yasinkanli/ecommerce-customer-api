CREATE TABLE customer (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(100),
                          email VARCHAR(100)
);

CREATE TABLE orders (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        product_name VARCHAR(100),
                        amount DECIMAL(10, 2),
                        customer_id BIGINT,
                        CONSTRAINT fk_customer FOREIGN KEY (customer_id) REFERENCES customer(id)
);