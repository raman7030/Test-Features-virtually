package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۖۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes2.dex */
public final class C2466 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2196 f7867;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f7868;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long f7869;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C0991 f7870;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23713 f7871;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f7872;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15097 f7873;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f7874;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16431 f7875;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f7876;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC15097 f7877;

    public C2466(int i, long j, int i2, long j2, boolean z, C2196 c2196, InterfaceC15097 interfaceC15097, InterfaceC15097 interfaceC15098, C23713 c23713, C0991 c0991, C16431 c16431) {
        this.f7874 = i;
        this.f7869 = j;
        this.f7868 = i2;
        this.f7876 = j2;
        this.f7872 = z;
        this.f7867 = c2196;
        this.f7873 = interfaceC15097;
        this.f7877 = interfaceC15098;
        this.f7871 = c23713;
        this.f7870 = c0991;
        this.f7875 = c16431;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2466)) {
            return false;
        }
        C2466 c2466 = (C2466) obj;
        return this.f7872 == c2466.f7872 && this.f7874 == c2466.f7874 && this.f7868 == c2466.f7868 && this.f7869 == c2466.f7869 && this.f7876 == c2466.f7876 && this.f7867.equals(c2466.f7867) && C11003.equals(this.f7873, c2466.f7873) && C11003.equals(this.f7877, c2466.f7877) && C11003.equals(this.f7871, c2466.f7871) && this.f7870.equals(c2466.f7870) && C11003.equals(this.f7875, c2466.f7875);
    }

    public final int hashCode() {
        int i = (((((this.f7872 ? 1231 : 1237) * 31) + this.f7874) * 31) + this.f7868) * 31;
        long j = this.f7869;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f7876;
        return C11003.hashCode(this.f7875) + ((this.f7870.hashCode() + ((C11003.hashCode(this.f7871) + ((C11003.hashCode(this.f7877) + ((C11003.hashCode(this.f7873) + ((this.f7867.hashCode() + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f7874), Long.valueOf(this.f7869), Integer.valueOf(this.f7868), Long.valueOf(this.f7876), Boolean.valueOf(this.f7872), this.f7867, this.f7873, this.f7877, this.f7871, this.f7870, this.f7875};
        String[] strArrSplit = "generation;requestId;mediaToken;positionMs;gestureMode;actual;directFactory;mediaFactory;cacheSession;rangeProbeSession;fileFactory".length() == 0 ? new String[0] : "generation;requestId;mediaToken;positionMs;gestureMode;actual;directFactory;mediaFactory;cacheSession;rangeProbeSession;fileFactory".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C2466.class, sb, "[");
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

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long m7942() {
        return this.f7869;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2196 m7943() {
        return this.f7867;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15097 m7944() {
        return this.f7877;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m7945() {
        return this.f7868;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m7946() {
        return this.f7872;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16431 m7947() {
        return this.f7875;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23713 m7948() {
        return this.f7871;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15097 m7949() {
        return this.f7873;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long m7950() {
        return this.f7876;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C0991 m7951() {
        return this.f7870;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m7952() {
        return this.f7874;
    }
}
