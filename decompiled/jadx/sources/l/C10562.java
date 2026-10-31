package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۤ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L51L */
/* JADX INFO: loaded from: classes3.dex */
public final class C10562 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f31696;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f31697;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f31698;

    public C10562(C2095 c2095) {
        this.f31696 = c2095.getClass().getName();
        this.f31697 = c2095.m6910();
        this.f31698 = c2095.m6925();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10562)) {
            return false;
        }
        C10562 c10562 = (C10562) obj;
        return this.f31697 == c10562.f31697 && this.f31698 == c10562.f31698 && TextUtils.equals(this.f31696, c10562.f31696);
    }

    public final int hashCode() {
        return this.f31696.hashCode() + ((((this.f31697 + 527) * 31) + this.f31698) * 31);
    }
}
