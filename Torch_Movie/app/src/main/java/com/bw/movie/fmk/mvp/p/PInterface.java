package com.bw.movie.fmk.mvp.p;

import java.util.HashMap;

/**
 * @Auther: 付明锟
 * @Date: 2019/5/9 17:11
 * @Description:
 */
public interface PInterface {

    //登录
    public interface PInterfaceDengLu {
        void getDengLu(HashMap<String, String> map);
        void onDsply();
    }
    //注册
    public interface PInterfaceZhuCe {
        void getZhuCe(HashMap<String, String> map);
        void onDsply();
    }


}
