package com.sensorsdata.analytics.android.runtime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by zhaochuang on 2018/5/3.
 */

@Aspect
public class EditTextTrackAspectj {

    private final static String TAG = EditTextTrackAspectj.class.getCanonicalName();

    @After("execution(* android.text.TextWatcher.afterTextChanged(android.text.Editable))")
    public void onTextChanged(final JoinPoint joinPoint) throws Throwable {
        AopUtil.sendTrackEventToSDK(joinPoint, "onViewOnClick");
    }

}
