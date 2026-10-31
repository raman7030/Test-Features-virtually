package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۙۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 2216 */
/* JADX INFO: loaded from: classes2.dex */
public class C4392 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f14075;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f14076;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f14077;

    public C4392(String str, int i, int i2) {
        this.f14075 = str;
        this.f14076 = i;
        this.f14077 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4392)) {
            return false;
        }
        C4392 c4392 = (C4392) obj;
        int i = c4392.f14077;
        String str = c4392.f14075;
        int i2 = c4392.f14076;
        int i3 = this.f14077;
        String str2 = this.f14075;
        int i4 = this.f14076;
        if (i4 < 0 || i2 < 0) {
            return TextUtils.equals(str2, str) && i3 == i;
        }
        return TextUtils.equals(str2, str) && i4 == i2 && i3 == i;
    }

    public final int hashCode() {
        return C11003.hash(this.f14075, Integer.valueOf(this.f14077));
    }
}
