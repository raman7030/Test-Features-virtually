package p067l;

import android.net.Uri;

/* JADX INFO: renamed from: l.֫᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes2.dex */
public class C4292 {

    /* JADX INFO: renamed from: ֫ */
    public final String f9533;

    /* JADX INFO: renamed from: ۧ */
    public final String f9534;

    /* JADX INFO: renamed from: ܳ */
    public final int f9535;

    /* JADX INFO: renamed from: ܽ */
    public final String f9536;

    /* JADX INFO: renamed from: ܿ */
    public final int f9537;

    /* JADX INFO: renamed from: ᩳ */
    public final String f9538;

    /* JADX INFO: renamed from: ᩻ */
    public final Uri f9539;

    public C4292(C9636 c9636) {
        this.f9539 = c9636.f26532;
        this.f9538 = c9636.f26531;
        this.f9536 = c9636.f26529;
        this.f9535 = c9636.f26528;
        this.f9537 = c9636.f26530;
        this.f9534 = c9636.f26527;
        this.f9533 = c9636.f26526;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4292)) {
            return false;
        }
        C4292 c4292 = (C4292) obj;
        return this.f9539.equals(c4292.f9539) && C12826.equals(this.f9538, c4292.f9538) && C12826.equals(this.f9536, c4292.f9536) && this.f9535 == c4292.f9535 && this.f9537 == c4292.f9537 && C12826.equals(this.f9534, c4292.f9534) && C12826.equals(this.f9533, c4292.f9533);
    }

    public final int hashCode() {
        int iHashCode = this.f9539.hashCode() * 31;
        String str = this.f9538;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9536;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f9535) * 31) + this.f9537) * 31;
        String str3 = this.f9534;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9533;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    static {
        C7470.m17250(0, 1, 2, 3, 4);
        C5792.m13032(5);
        C5792.m13032(6);
    }
}
