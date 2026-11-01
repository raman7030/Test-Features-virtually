package p067l;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۗۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8TA */
/* JADX INFO: loaded from: classes2.dex */
public final class C5346 implements InterfaceC16361 {

    /* JADX INFO: renamed from: ֫ */
    public final int f12599;

    /* JADX INFO: renamed from: ۜ */
    public final int f12600;

    /* JADX INFO: renamed from: ۧ */
    public final int f12601;

    /* JADX INFO: renamed from: ܳ */
    public final byte[] f12602;

    /* JADX INFO: renamed from: ܽ */
    public final String f12603;

    /* JADX INFO: renamed from: ܿ */
    public final String f12604;

    /* JADX INFO: renamed from: ᩳ */
    public final int f12605;

    /* JADX INFO: renamed from: ᩻ */
    public final int f12606;

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C10307 mo3421() {
        return null;
    }

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ byte[] mo3423() {
        return null;
    }

    public C5346(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f12606 = i;
        this.f12604 = str;
        this.f12603 = str2;
        this.f12600 = i2;
        this.f12605 = i3;
        this.f12601 = i4;
        this.f12599 = i5;
        this.f12602 = bArr;
    }

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ֫ */
    public final void mo3422(C19715 c19715) {
        c19715.m44827(this.f12606, this.f12602);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f12604 + ", description=" + this.f12603;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5346.class == obj.getClass()) {
            C5346 c5346 = (C5346) obj;
            if (this.f12606 == c5346.f12606 && this.f12604.equals(c5346.f12604) && this.f12603.equals(c5346.f12603) && this.f12600 == c5346.f12600 && this.f12605 == c5346.f12605 && this.f12601 == c5346.f12601 && this.f12599 == c5346.f12599 && Arrays.equals(this.f12602, c5346.f12602)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12602) + ((((((((C12832.m29411(C12832.m29411((this.f12606 + 527) * 31, 31, this.f12604), 31, this.f12603) + this.f12600) * 31) + this.f12605) * 31) + this.f12601) * 31) + this.f12599) * 31);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5346 m11598(C19203 c19203) {
        int iM43739 = c19203.m43739();
        String strM26815 = C11669.m26815(c19203.m43705(c19203.m43739(), StandardCharsets.US_ASCII));
        String strM43705 = c19203.m43705(c19203.m43739(), StandardCharsets.UTF_8);
        int iM437310 = c19203.m43739();
        int iM437311 = c19203.m43739();
        int iM437312 = c19203.m43739();
        int iM437313 = c19203.m43739();
        int iM437314 = c19203.m43739();
        byte[] bArr = new byte[iM437314];
        c19203.m43707(0, iM437314, bArr);
        return new C5346(iM43739, strM26815, strM43705, iM437310, iM437311, iM437312, iM437313, bArr);
    }
}
