package com.hautec.hiotcloud.test.mvptest;

import android.widget.TextView;
import android.widget.Toast;

import com.hautec.hiotcloud.base.BasePresenter;
import com.hautec.hiotcloud.base.BaseView;
import com.hautec.hiotcloud.test.dagger2test.ThirdObj;
import com.hautec.hiotcloud.test.mvptest.model.User;

import javax.inject.Inject;

public class TestPresenter extends BasePresenter <TestView>{
    @Inject
    ThirdObj thirdObj;
    @Inject
    public TestPresenter() {
    }

    public void login(User user){
        thirdObj.thirdAction();
        if ("liliufang".equals(user.getUserName()) && "123".equals(user.getPassword())){
            getView().showMessage("登录成功");

        }else{
            getView().showMessage("登录失败");

        }
    }

}
