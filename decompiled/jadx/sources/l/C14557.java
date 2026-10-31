package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ܳܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: W9ED */
/* JADX INFO: loaded from: classes5.dex */
public final class C14557 extends C9620 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f44576 = C11321.m27961(C14557.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumSet f44577;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f44578;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f44579;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f44580;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C8914 f44581;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f44582;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f44583;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C19498 f44584;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f44585;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34745(C12441 c12441) {
        c12441.m26073(8, C8208.f25224);
        c12441.m26082();
        this.f44578 = c12441.m26100();
        c12441.m26096(2);
        this.f44585 = c12441.m26099();
        this.f44577 = C15262.m36278(c12441.m26082(), EnumC20909.class);
        byte[] bArr = new byte[8];
        c12441.m26087(8, bArr);
        this.f44579 = bArr;
        c12441.m26096(8);
        if (this.f44577.contains(EnumC20909.NTLMSSP_NEGOTIATE_TARGET_INFO)) {
            this.f44582 = c12441.m26100();
            c12441.m26096(2);
            this.f44583 = c12441.m26099();
        } else {
            c12441.m26096(8);
        }
        if (this.f44577.contains(EnumC20909.NTLMSSP_NEGOTIATE_VERSION)) {
            C19498 c19498 = new C19498();
            c19498.m44909(c12441);
            this.f44584 = c19498;
            f44576.mo7100(c19498, "Windows version = {}");
        } else {
            c12441.m26096(8);
        }
        if (this.f44578 > 0) {
            c12441.m26097(this.f44585);
            this.f44580 = c12441.m26073(this.f44578 / 2, C8208.f25225);
        }
        if (this.f44582 > 0) {
            c12441.m26097(this.f44583);
            C8914 c8914 = new C8914();
            c8914.m22984(c12441);
            this.f44581 = c8914;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m34749() {
        return this.f44580;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m34746() {
        return this.f44579;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumSet m34744() {
        return this.f44577;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8914 m34747() {
        return this.f44581;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19498 m34748() {
        return this.f44584;
    }

    public final String toString() {
        return "NtlmChallenge{\n  targetName='" + this.f44580 + "',\n  negotiateFlags=" + this.f44577 + ",\n  serverChallenge=" + C1152.m3949(this.f44579) + ",\n  version=" + this.f44584 + ",\n  targetInfo=" + this.f44581 + "\n}";
    }
}
