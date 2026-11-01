package p067l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ܳ᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 27NH */
/* JADX INFO: loaded from: classes4.dex */
public final class C16461 {

    /* JADX INFO: renamed from: ֫ */
    public final String f48344;

    /* JADX INFO: renamed from: ۧ */
    public final int f48345;

    /* JADX INFO: renamed from: ܳ */
    public final String f48346;

    /* JADX INFO: renamed from: ܽ */
    public final String f48347;

    /* JADX INFO: renamed from: ܿ */
    public final String f48348;

    /* JADX INFO: renamed from: ᩳ */
    public final int f48349;

    public C16461(int i, int i2, String str, String str2, String str3, String str4) {
        this.f48345 = i;
        this.f48349 = i2;
        this.f48346 = str;
        this.f48344 = str2;
        this.f48348 = str3;
        this.f48347 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C16461.class == obj.getClass()) {
            C16461 c16461 = (C16461) obj;
            if (this.f48345 == c16461.f48345 && this.f48349 == c16461.f48349 && TextUtils.equals(this.f48346, c16461.f48346) && TextUtils.equals(this.f48344, c16461.f48344) && TextUtils.equals(this.f48348, c16461.f48348) && TextUtils.equals(this.f48347, c16461.f48347)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.f48345 * 31) + this.f48349) * 31;
        String str = this.f48346;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f48344;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f48348;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f48347;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
