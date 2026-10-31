package l;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۗۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8TA */
/* JADX INFO: loaded from: classes2.dex */
public final class C3133 implements InterfaceC14723 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f9796;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f9797;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f9798;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] f9799;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f9800;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f9801;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f9802;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f9803;

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C8353 mo1025() {
        return null;
    }

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ byte[] mo1027() {
        return null;
    }

    public C3133(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f9803 = i;
        this.f9801 = str;
        this.f9800 = str2;
        this.f9797 = i2;
        this.f9802 = i3;
        this.f9798 = i4;
        this.f9796 = i5;
        this.f9799 = bArr;
    }

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ֫ */
    public final void mo1026(C18252 c18252) {
        c18252.m42568(this.f9803, this.f9799);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f9801 + ", description=" + this.f9800;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3133.class == obj.getClass()) {
            C3133 c3133 = (C3133) obj;
            if (this.f9803 == c3133.f9803 && this.f9801.equals(c3133.f9801) && this.f9800.equals(c3133.f9800) && this.f9797 == c3133.f9797 && this.f9802 == c3133.f9802 && this.f9798 == c3133.f9798 && this.f9796 == c3133.f9796 && Arrays.equals(this.f9799, c3133.f9799)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9799) + ((((((((C11010.m27349(C11010.m27349((this.f9803 + 527) * 31, 31, this.f9801), 31, this.f9800) + this.f9797) * 31) + this.f9802) * 31) + this.f9798) * 31) + this.f9796) * 31);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3133 m9555(C17714 c17714) {
        int iM41493 = c17714.m41493();
        String strM24800 = C9786.m24800(c17714.m41459(c17714.m41493(), StandardCharsets.US_ASCII));
        String strM41459 = c17714.m41459(c17714.m41493(), StandardCharsets.UTF_8);
        int iM41494 = c17714.m41493();
        int iM41495 = c17714.m41493();
        int iM41496 = c17714.m41493();
        int iM41497 = c17714.m41493();
        int iM41498 = c17714.m41493();
        byte[] bArr = new byte[iM41498];
        c17714.m41461(0, iM41498, bArr);
        return new C3133(iM41493, strM24800, strM41459, iM41494, iM41495, iM41496, iM41497, bArr);
    }
}
