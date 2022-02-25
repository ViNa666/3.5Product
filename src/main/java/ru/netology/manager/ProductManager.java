package ru.netology.manager;

import ru.netology.domain.Product;
import ru.netology.repository.ProductRepository;

public class ProductManager {
    private ProductRepository repository;

    public ProductManager(ProductRepository repository) {
        this.repository = repository;
    }

    public ProductManager() {

    }

    public void add(Product item) {
        repository.save(item);
    }

    public Product[] searchBy(String search) {
        Product[] result = new Product[0];
        for (Product product : repository.findAll()) {
            if (product.matches(search)) {
                int length = result.length + 1;
                Product[] tmp = new Product[length];
                System.arraycopy(result, 0, tmp, 0, result.length);
                int lastIndex = tmp.length - 1;
                tmp[lastIndex] = product;

                result = tmp;

            }
        }
        return result;
    }


}

