package com.hautec.hiotcloud.test.mvptest;

import android.widget.TextView;
import android.widget.Toast;

import com.hautec.hiotcloud.base.BasePresenter;
import com.hautec.hiotcloud.base.BaseView;
import com.hautec.hiotcloud.test.mvptest.model.User;

public class TestPresenter extends BasePresenter <TestView>{
    public TestPresenter() {
    }

    public void login(User user){
        if ("liliufang".equals(user.getUserName()) && "123".equals(user.getPassword())){
            getView().showMessage("登录成功");

        }else{
            getView().showMessage("登录失败");

        }
    }

}
