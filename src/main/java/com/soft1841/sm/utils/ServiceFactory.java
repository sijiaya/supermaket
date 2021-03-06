package com.soft1841.sm.utils;

import com.soft1841.sm.entity.Seller;
import com.soft1841.sm.service.*;
import com.soft1841.sm.service.SellerService;
import com.soft1841.sm.service.impl.*;

import java.util.List;

public class ServiceFactory {
    public static SellerLoginService getSellerServiceInstance() {
        return new SellerLoginServiceImpl();
    }

    public static TypeService getTypeServiceInstance() {
        return new TypeServiceImpl();
    }

    public static GoodsService getGoodServiceInstance() {
        return new GoodsServiceImpl();
    }

    public static AdminService getAdminsServiceInstance() {
        return new AdminServiceImpl();
    }

    public static MemberService getMemberServiceInstance() {
        return new MemberServiceImpl();
    }

    public static SellerService getSellersServiceInstance() {
        return new SellerServiceImpl();
    }

    public static MemberService getMemberInstance() {
        return new MemberServiceImpl();
    }
}



