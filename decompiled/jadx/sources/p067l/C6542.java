package p067l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۙۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 2216 */
/* JADX INFO: loaded from: classes2.dex */
public class C6542 {

    /* JADX INFO: renamed from: ֫ */
    public String f16891;

    /* JADX INFO: renamed from: ۧ */
    public int f16892;

    /* JADX INFO: renamed from: ܽ */
    public int f16893;

    public C6542(String str, int i, int i2) {
        this.f16891 = str;
        this.f16892 = i;
        this.f16893 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6542)) {
            return false;
        }
        C6542 c6542 = (C6542) obj;
        int i = c6542.f16893;
        String str = c6542.f16891;
        int i2 = c6542.f16892;
        int i3 = this.f16893;
        String str2 = this.f16891;
        int i4 = this.f16892;
        if (i4 < 0 || i2 < 0) {
            return TextUtils.equals(str2, str) && i3 == i;
        }
        return TextUtils.equals(str2, str) && i4 == i2 && i3 == i;
    }

    public final int hashCode() {
        return C12826.hash(this.f16891, Integer.valueOf(this.f16893));
    }
}
