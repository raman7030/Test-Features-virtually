package l;

import com.alipay.sdk.m.b0.a;

/* JADX INFO: renamed from: l.֡ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9IV */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0386 implements InterfaceC21614 {
    AES_128_CCM(1, "AES/CCM/NoPadding", 11, 16),
    AES_128_GCM(2, a.f, 12, 16),
    AES_256_CCM(3, "AES/CCM/NoPadding", 11, 32),
    AES_256_GCM(4, a.f, 12, 32);


    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f1826;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f1827;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f1828;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f1829;

    EnumC0386(long j, String str, int i, int i2) {
        this.f1826 = j;
        this.f1828 = str;
        this.f1827 = i;
        this.f1829 = i2;
    }

    @Override // l.InterfaceC21614
    public long getValue() {
        return this.f1826;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m1879() {
        return this.f1828;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int m1881() {
        return this.f1827;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int m1880() {
        return this.f1829;
    }
}
