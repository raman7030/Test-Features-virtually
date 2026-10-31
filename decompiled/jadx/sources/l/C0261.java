package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.֡۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8RW */
/* JADX INFO: loaded from: classes2.dex */
public final class C0261 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f1544;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f1545;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f1546;

    public C0261(String str, boolean z, boolean z2) {
        this.f1544 = str;
        this.f1545 = z;
        this.f1546 = z2;
    }

    public final int hashCode() {
        return ((C11010.m27349(31, 31, this.f1544) + (this.f1545 ? 1231 : 1237)) * 31) + (this.f1546 ? 1231 : 1237);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == C0261.class) {
            C0261 c0261 = (C0261) obj;
            if (TextUtils.equals(this.f1544, c0261.f1544) && this.f1545 == c0261.f1545 && this.f1546 == c0261.f1546) {
                return true;
            }
        }
        return false;
    }
}
