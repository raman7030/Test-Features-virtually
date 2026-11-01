package p067l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.֡۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8RW */
/* JADX INFO: loaded from: classes2.dex */
public final class C2616 {

    /* JADX INFO: renamed from: ֫ */
    public final String f4322;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f4323;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f4324;

    public C2616(String str, boolean z, boolean z2) {
        this.f4322 = str;
        this.f4323 = z;
        this.f4324 = z2;
    }

    public final int hashCode() {
        return ((C12832.m29411(31, 31, this.f4322) + (this.f4323 ? 1231 : 1237)) * 31) + (this.f4324 ? 1231 : 1237);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == C2616.class) {
            C2616 c2616 = (C2616) obj;
            if (TextUtils.equals(this.f4322, c2616.f4322) && this.f4323 == c2616.f4323 && this.f4324 == c2616.f4324) {
                return true;
            }
        }
        return false;
    }
}
