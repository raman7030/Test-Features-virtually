package com.umeng.commonsdk;

import android.content.Context;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: 6BL1 */
/* JADX INFO: loaded from: classes.dex */
public class a {
    public static Class a;
    public static Method b;

    static {
        try {
            a = UMInnerImpl.class;
            Method declaredMethod = UMInnerImpl.class.getDeclaredMethod("initAndSendInternal", Context.class);
            if (declaredMethod != null) {
                b = declaredMethod;
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context) {
        Method method;
        if (context == null || !UMUtils.isMainProgress(context)) {
            return;
        }
        if (SdkVersion.SDK_TYPE != 1) {
            Class cls = a;
            if (cls == null || (method = b) == null) {
                return;
            }
            try {
                method.invoke(cls, context);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        UMConfigureInternation.sendInternal(context);
    }
}
