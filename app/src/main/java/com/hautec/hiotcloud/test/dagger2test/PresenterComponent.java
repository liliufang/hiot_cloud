package com.hautec.hiotcloud.test.dagger2test;

import com.hautec.hiotcloud.test.mvptest.TestMVPActivity;

import dagger.Component;

/**
 * 测试注入器接口
 */
@Component(modules = TestModule.class)
public interface PresenterComponent {

    void inject(TestMVPActivity activity);
}
