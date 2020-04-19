package com.hautec.hiotcloud.test.mvptest;

import android.widget.TextView;
import android.widget.Toast;

import com.hautec.hiotcloud.test.mvptest.model.User;

public class TestPresenter  {
  private TestView view;
    public TestPresenter(TestView view) {
        this.view = view;
    }
    public void login(User user){
        if ("liliufang".equals(user.getUserName()) && "123".equals(user.getPassword())){
            view.showMessage("登录成功");

        }else{
            view.showMessage("登录失败");

        }
    }
}
