package p067l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۡ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C11060 {

    /* JADX INFO: renamed from: ۧ */
    public static boolean f30626;

    /* JADX INFO: renamed from: ܽ */
    public static C11060 f30627;

    /* JADX INFO: renamed from: ֫ */
    public C5025 f30628;

    /* JADX INFO: renamed from: ֫ */
    public static C11060 m25462() {
        if (f30627 == null) {
            synchronized (C11060.class) {
                if (f30627 == null) {
                    C11060 c11060 = new C11060();
                    f30627 = c11060;
                    int i = C20448.f63162;
                    String str = C20448.f63161;
                    c11060.f30628 = new C5025(new C6366(i));
                    f30626 = true;
                }
            }
        }
        return f30627;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25472(int i, String str, String str2, Throwable th) {
        C5025 c5025;
        if (f30626) {
            String strM53418 = C24158.m53418();
            if (!TextUtils.isEmpty(strM53418)) {
                String strM40053 = C17588.m40053(strM53418, " SDK_VERSION:3.5.18.lite");
                if (this.f30628 == null) {
                    return;
                }
                C21119.f66382.m40367(32, Thread.currentThread(), System.currentTimeMillis(), "openSDK_LOG", strM40053, null);
                this.f30628.m40367(32, Thread.currentThread(), System.currentTimeMillis(), "openSDK_LOG", strM40053, null);
                f30626 = false;
            }
        }
        C21119.f66382.m40367(i, Thread.currentThread(), System.currentTimeMillis(), str, str2, th);
        String str3 = C20448.f63161;
        if (i != (i & 60) || (c5025 = this.f30628) == null) {
            return;
        }
        c5025.m40367(i, Thread.currentThread(), System.currentTimeMillis(), str, str2, th);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static final void m25471(String str, String str2) {
        m25462().m25472(1, str, str2, null);
    }

    /* JADX INFO: renamed from: ۧ */
    public static final void m25468(String str, String str2, Throwable th) {
        m25462().m25472(1, str, str2, th);
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m25464(String str, String str2) {
        m25462().m25472(2, str, str2, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m25463(Exception exc) {
        m25462().m25472(2, "KEYSTORE", "Exception", exc);
    }

    /* JADX INFO: renamed from: ܽ */
    public static final void m25469(String str, String str2) {
        m25462().m25472(4, str, str2, null);
    }

    /* JADX INFO: renamed from: ܿ */
    public static final void m25470(String str, String str2) {
        m25462().m25472(8, str, str2, null);
    }

    /* JADX INFO: renamed from: ۧ */
    public static final void m25467(String str, String str2) {
        m25462().m25472(16, str, str2, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m25465(String str, String str2, Throwable th) {
        m25462().m25472(16, str, str2, th);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m25466() {
        synchronized (C11060.class) {
            C11060 c11060M25462 = m25462();
            C5025 c5025 = c11060M25462.f30628;
            if (c5025 != null) {
                c5025.m10694();
                c11060M25462.f30628.m10696();
                c11060M25462.f30628 = null;
            }
            if (f30627 != null) {
                f30627 = null;
            }
        }
    }
}
