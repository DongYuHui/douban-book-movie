package com.kyletung.simplebookmovie.event;

/**
 * All rights reserved by Author<br>
 * Author: Dong YuHui<br>
 * Email: <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a><br>
 * Blog: <a href="http://www.kyletung.com">www.kyletung.com</a><br>
 * Create Time: 2016/07/11 at 21:25<br>
 * <br>
 * FixMe
 */
public class UserEvent {

    private String mUserId;

    public UserEvent(String userId) {
        this.mUserId = userId;
    }

    public String getUserId() {
        return mUserId;
    }

    public void setUserId(String userId) {
        mUserId = userId;
    }

    @Override
    public String toString() {
        return "UserEvent{" +
                "mUserId='" + mUserId + '\'' +
                '}';
    }

}
