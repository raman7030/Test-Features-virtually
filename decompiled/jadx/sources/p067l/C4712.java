package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۖۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes2.dex */
public final class C4712 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C4455 f10655;

    /* JADX INFO: renamed from: ۜ */
    public final int f10656;

    /* JADX INFO: renamed from: ۡ */
    public final long f10657;

    /* JADX INFO: renamed from: ۢ */
    public final C3310 f10658;

    /* JADX INFO: renamed from: ۧ */
    public final C24905 f10659;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f10660;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC16716 f10661;

    /* JADX INFO: renamed from: ܿ */
    public final int f10662;

    /* JADX INFO: renamed from: ᩳ */
    public final C17984 f10663;

    /* JADX INFO: renamed from: ᩷ */
    public final long f10664;

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC16716 f10665;

    public C4712(int i, long j, int i2, long j2, boolean z, C4455 c4455, InterfaceC16716 interfaceC16716, InterfaceC16716 interfaceC16717, C24905 c24905, C3310 c3310, C17984 c17984) {
        this.f10662 = i;
        this.f10657 = j;
        this.f10656 = i2;
        this.f10664 = j2;
        this.f10660 = z;
        this.f10655 = c4455;
        this.f10661 = interfaceC16716;
        this.f10665 = interfaceC16717;
        this.f10659 = c24905;
        this.f10658 = c3310;
        this.f10663 = c17984;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4712)) {
            return false;
        }
        C4712 c4712 = (C4712) obj;
        return this.f10660 == c4712.f10660 && this.f10662 == c4712.f10662 && this.f10656 == c4712.f10656 && this.f10657 == c4712.f10657 && this.f10664 == c4712.f10664 && this.f10655.equals(c4712.f10655) && C12826.equals(this.f10661, c4712.f10661) && C12826.equals(this.f10665, c4712.f10665) && C12826.equals(this.f10659, c4712.f10659) && this.f10658.equals(c4712.f10658) && C12826.equals(this.f10663, c4712.f10663);
    }

    public final int hashCode() {
        int i = (((((this.f10660 ? 1231 : 1237) * 31) + this.f10662) * 31) + this.f10656) * 31;
        long j = this.f10657;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f10664;
        return C12826.hashCode(this.f10663) + ((this.f10658.hashCode() + ((C12826.hashCode(this.f10659) + ((C12826.hashCode(this.f10665) + ((C12826.hashCode(this.f10661) + ((this.f10655.hashCode() + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f10662), Long.valueOf(this.f10657), Integer.valueOf(this.f10656), Long.valueOf(this.f10664), Boolean.valueOf(this.f10660), this.f10655, this.f10661, this.f10665, this.f10659, this.f10658, this.f10663};
        String[] strArrSplit = "generation;requestId;mediaToken;positionMs;gestureMode;actual;directFactory;mediaFactory;cacheSession;rangeProbeSession;fileFactory".length() == 0 ? new String[0] : "generation;requestId;mediaToken;positionMs;gestureMode;actual;directFactory;mediaFactory;cacheSession;rangeProbeSession;fileFactory".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C4712.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֡ */
    public final long m9990() {
        return this.f10657;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4455 m9991() {
        return this.f10655;
    }

    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC16716 m9992() {
        return this.f10665;
    }

    /* JADX INFO: renamed from: ۘ */
    public final int m9993() {
        return this.f10656;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m9994() {
        return this.f10660;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C17984 m9995() {
        return this.f10663;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C24905 m9996() {
        return this.f10659;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC16716 m9997() {
        return this.f10661;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final long m9998() {
        return this.f10664;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final C3310 m9999() {
        return this.f10658;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m10000() {
        return this.f10662;
    }
}
