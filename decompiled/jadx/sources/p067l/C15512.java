package p067l;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: renamed from: l.ܰ۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N8HX */
/* JADX INFO: loaded from: classes3.dex */
public final class C15512 {

    /* JADX INFO: renamed from: ֫ */
    public final Object f44332;

    /* JADX INFO: renamed from: ۧ */
    public final C24230 f44333;

    /* JADX INFO: renamed from: ܽ */
    public final String f44334;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized LogSessionId m35302() {
        C24230 c24230;
        c24230 = this.f44333;
        c24230.getClass();
        return c24230.f76792;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m35303(LogSessionId logSessionId) {
        C24230 c24230 = this.f44333;
        c24230.getClass();
        c24230.m53539(logSessionId);
    }

    static {
        new C15512("");
    }

    public C15512(String str) {
        this.f44334 = str;
        this.f44333 = Build.VERSION.SDK_INT >= 31 ? new C24230() : null;
        this.f44332 = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15512)) {
            return false;
        }
        C15512 c15512 = (C15512) obj;
        return C12826.equals(this.f44334, c15512.f44334) && C12826.equals(this.f44333, c15512.f44333) && C12826.equals(this.f44332, c15512.f44332);
    }

    public final int hashCode() {
        return C12826.hash(this.f44334, this.f44333, this.f44332);
    }
}
