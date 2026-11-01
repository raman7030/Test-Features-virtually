package p067l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۤ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L51L */
/* JADX INFO: loaded from: classes3.dex */
public final class C12407 {

    /* JADX INFO: renamed from: ֫ */
    public String f34660;

    /* JADX INFO: renamed from: ۧ */
    public int f34661;

    /* JADX INFO: renamed from: ܽ */
    public int f34662;

    public C12407(C4360 c4360) {
        this.f34660 = c4360.getClass().getName();
        this.f34661 = c4360.m9036();
        this.f34662 = c4360.m9051();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12407)) {
            return false;
        }
        C12407 c12407 = (C12407) obj;
        return this.f34661 == c12407.f34661 && this.f34662 == c12407.f34662 && TextUtils.equals(this.f34660, c12407.f34660);
    }

    public final int hashCode() {
        return this.f34660.hashCode() + ((((this.f34661 + 527) * 31) + this.f34662) * 31);
    }
}
