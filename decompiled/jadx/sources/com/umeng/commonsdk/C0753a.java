package com.umeng.commonsdk;

import android.content.Context;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.umeng.commonsdk.a */
/* JADX INFO: compiled from: 6BL1 */
/* JADX INFO: loaded from: classes.dex */
public class C0753a {

    /* JADX INFO: renamed from: a */
    public static Class f3050a;

    /* JADX INFO: renamed from: b */
    public static Method f3051b;

    static {
        try {
            f3050a = UMInnerImpl.class;
            Method declaredMethod = UMInnerImpl.class.getDeclaredMethod("initAndSendInternal", Context.class);
            if (declaredMethod != null) {
                f3051b = declaredMethod;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2728a(Context context) {
        Method method;
        if (context == null || !UMUtils.isMainProgress(context)) {
            return;
        }
        if (SdkVersion.SDK_TYPE != 1) {
            Class cls = f3050a;
            if (cls == null || (method = f3051b) == null) {
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
