package p067l;

import com.alipay.sdk.p010m.p014b0.C0087a;

/* JADX INFO: renamed from: l.֡ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9IV */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC2735 implements InterfaceC22910 {
    AES_128_CCM(1, "AES/CCM/NoPadding", 11, 16),
    AES_128_GCM(2, C0087a.f317f, 12, 16),
    AES_256_CCM(3, "AES/CCM/NoPadding", 11, 32),
    AES_256_GCM(4, C0087a.f317f, 12, 32);


    /* JADX INFO: renamed from: ۙ */
    public long f4603;

    /* JADX INFO: renamed from: ᩶ */
    public int f4604;

    /* JADX INFO: renamed from: ᩸ */
    public String f4605;

    /* JADX INFO: renamed from: ᩹ */
    public int f4606;

    EnumC2735(long j, String str, int i, int i2) {
        this.f4603 = j;
        this.f4605 = str;
        this.f4604 = i;
        this.f4606 = i2;
    }

    @Override // p067l.InterfaceC22910
    public long getValue() {
        return this.f4603;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m4270() {
        return this.f4605;
    }

    /* JADX INFO: renamed from: ܿ */
    public int m4272() {
        return this.f4604;
    }

    /* JADX INFO: renamed from: ۧ */
    public int m4271() {
        return this.f4606;
    }
}
