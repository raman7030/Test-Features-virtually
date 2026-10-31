package l;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: renamed from: l.ܰ۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N8HX */
/* JADX INFO: loaded from: classes3.dex */
public final class C13830 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f41253;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23003 f41254;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f41255;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized LogSessionId m33184() {
        C23003 c23003;
        c23003 = this.f41254;
        c23003.getClass();
        return c23003.f74053;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m33185(LogSessionId logSessionId) {
        C23003 c23003 = this.f41254;
        c23003.getClass();
        c23003.m51146(logSessionId);
    }

    static {
        new C13830("");
    }

    public C13830(String str) {
        this.f41255 = str;
        this.f41254 = Build.VERSION.SDK_INT >= 31 ? new C23003() : null;
        this.f41253 = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13830)) {
            return false;
        }
        C13830 c13830 = (C13830) obj;
        return C11003.equals(this.f41255, c13830.f41255) && C11003.equals(this.f41254, c13830.f41254) && C11003.equals(this.f41253, c13830.f41253);
    }

    public final int hashCode() {
        return C11003.hash(this.f41255, this.f41254, this.f41253);
    }
}
