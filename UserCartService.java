package com.dailycodebuffer.ecommerce.website.service;

import com.dailycodebuffer.ecommerce.website.entity.Cart;
import com.dailycodebuffer.ecommerce.website.entity.UserCart;

import java.util.List;

public interface UserCartService {
    void saveProduct(UserCart cart) ;

    List<UserCart> findByUserId(Long sno);

    void deleteItemById(Long sno);

    UserCart findById(Long sno);

    void saveRealMe7i(UserCart cart);

    void savePredator(UserCart cart);

}
