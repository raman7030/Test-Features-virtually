package l;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: U5Z7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19039 extends C0881 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43890(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                throw new IllegalArgumentException(C9045.m23341(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof InterfaceC4222) {
            }
            C9867.m24927(activity, strArr, i);
        } else if (activity instanceof InterfaceC2811) {
            new Handler(Looper.getMainLooper()).post(new RunnableC21156(activity, strArr2, i));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m43891(Activity activity, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i >= 32) {
            return C16215.m38161(activity, str);
        }
        if (i == 31) {
            return C9161.m23571(activity, str);
        }
        if (i >= 23) {
            return C9867.m24929(activity, str);
        }
        return false;
    }
}
