package p067l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.۬᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W8GP */
/* JADX INFO: loaded from: classes3.dex */
public final class C15100 {

    /* JADX INFO: renamed from: ֫ */
    public final String f43115;

    /* JADX INFO: renamed from: ۧ */
    public final int f43116;

    /* JADX INFO: renamed from: ܽ */
    public final C10307 f43117;

    /* JADX INFO: renamed from: ܿ */
    public final int f43118;

    /* JADX INFO: renamed from: ᩳ */
    public final C10307 f43119;

    public C15100(String str, C10307 c10307, C10307 c10308, int i, int i2) {
        C23877.m52957(i == 0 || i2 == 0);
        if (!TextUtils.isEmpty(str)) {
            this.f43115 = str;
            c10307.getClass();
            this.f43119 = c10307;
            c10308.getClass();
            this.f43117 = c10308;
            this.f43118 = i;
            this.f43116 = i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15100.class == obj.getClass()) {
            C15100 c15100 = (C15100) obj;
            if (this.f43118 == c15100.f43118 && this.f43116 == c15100.f43116 && this.f43115.equals(c15100.f43115) && this.f43119.equals(c15100.f43119) && this.f43117.equals(c15100.f43117)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43117.hashCode() + ((this.f43119.hashCode() + C12832.m29411((((this.f43118 + 527) * 31) + this.f43116) * 31, 31, this.f43115)) * 31);
    }
}
