package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۡ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C9145 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f27686;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C9145 f27687;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C2795 f27688;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9145 m23511() {
        if (f27687 == null) {
            synchronized (C9145.class) {
                if (f27687 == null) {
                    C9145 c9145 = new C9145();
                    f27687 = c9145;
                    int i = C19023.f59933;
                    String str = C19023.f59932;
                    c9145.f27688 = new C2795(new C4206(i));
                    f27686 = true;
                }
            }
        }
        return f27687;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23521(int i, String str, String str2, Throwable th) {
        C2795 c2795;
        if (f27686) {
            String strM51027 = C22927.m51027();
            if (!TextUtils.isEmpty(strM51027)) {
                String strM37867 = C16014.m37867(strM51027, " SDK_VERSION:3.5.18.lite");
                if (this.f27688 == null) {
                    return;
                }
                C19729.f63751.m38155(32, Thread.currentThread(), System.currentTimeMillis(), "openSDK_LOG", strM37867, null);
                this.f27688.m38155(32, Thread.currentThread(), System.currentTimeMillis(), "openSDK_LOG", strM37867, null);
                f27686 = false;
            }
        }
        C19729.f63751.m38155(i, Thread.currentThread(), System.currentTimeMillis(), str, str2, th);
        String str3 = C19023.f59932;
        if (i != (i & 60) || (c2795 = this.f27688) == null) {
            return;
        }
        c2795.m38155(i, Thread.currentThread(), System.currentTimeMillis(), str, str2, th);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final void m23520(String str, String str2) {
        m23511().m23521(1, str, str2, null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final void m23517(String str, String str2, Throwable th) {
        m23511().m23521(1, str, str2, th);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m23513(String str, String str2) {
        m23511().m23521(2, str, str2, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m23512(Exception exc) {
        m23511().m23521(2, "KEYSTORE", "Exception", exc);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final void m23518(String str, String str2) {
        m23511().m23521(4, str, str2, null);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final void m23519(String str, String str2) {
        m23511().m23521(8, str, str2, null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final void m23516(String str, String str2) {
        m23511().m23521(16, str, str2, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m23514(String str, String str2, Throwable th) {
        m23511().m23521(16, str, str2, th);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m23515() {
        synchronized (C9145.class) {
            C9145 c9145M23511 = m23511();
            C2795 c2795 = c9145M23511.f27688;
            if (c2795 != null) {
                c2795.m8634();
                c9145M23511.f27688.m8636();
                c9145M23511.f27688 = null;
            }
            if (f27687 != null) {
                f27687 = null;
            }
        }
    }
}
