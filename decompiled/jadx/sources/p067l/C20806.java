package p067l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.᩵ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C20806 {

    /* JADX INFO: renamed from: ֫ */
    public Object f65376;

    /* JADX INFO: renamed from: ۧ */
    public Object f65377;

    /* JADX INFO: renamed from: ֫ */
    public static void m46966(C20806 c20806, Object obj) {
        c20806.f65377 = obj;
        c20806.f65376 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46967(C20806 c20806, String str) {
        c20806.f65377 = null;
        c20806.f65376 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46968(C20806 c20806, String str, InterfaceC2699 interfaceC2699) {
        Object obj = c20806.f65377;
        if (obj == null) {
            return;
        }
        String strMo4191 = interfaceC2699.mo4191(obj);
        if (TextUtils.isEmpty(strMo4191) || !TextUtils.equals(strMo4191, str)) {
            return;
        }
        c20806.f65376 = obj;
        c20806.f65377 = null;
    }

    /* JADX INFO: renamed from: ܽ */
    public static Object m46970(C20806 c20806) {
        return c20806.f65376;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m46969(C20806 c20806) {
        c20806.f65376 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46965(C20806 c20806) {
        c20806.f65377 = null;
        c20806.f65376 = null;
    }
}
