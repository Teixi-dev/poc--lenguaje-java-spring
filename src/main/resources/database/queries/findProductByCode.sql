SELECT code, name, detail, price, stock
FROM products
WHERE code = :productCode;