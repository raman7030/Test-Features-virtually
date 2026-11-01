package p067l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ܳܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: W9ED */
/* JADX INFO: loaded from: classes5.dex */
public final class C16203 extends C11511 {

    /* JADX INFO: renamed from: ۢ */
    public static final InterfaceC4410 f47683 = C13128.m30022(C16203.class);

    /* JADX INFO: renamed from: ֫ */
    public EnumSet f47684;

    /* JADX INFO: renamed from: ۜ */
    public int f47685;

    /* JADX INFO: renamed from: ۧ */
    public byte[] f47686;

    /* JADX INFO: renamed from: ܳ */
    public String f47687;

    /* JADX INFO: renamed from: ܽ */
    public C10840 f47688;

    /* JADX INFO: renamed from: ܿ */
    public int f47689;

    /* JADX INFO: renamed from: ᩳ */
    public int f47690;

    /* JADX INFO: renamed from: ᩷ */
    public C20899 f47691;

    /* JADX INFO: renamed from: ᩻ */
    public int f47692;

    /* JADX INFO: renamed from: ֫ */
    public final void m36894(C14192 c14192) {
        c14192.m28098(8, C10169.f28134);
        c14192.m28107();
        this.f47685 = c14192.m28125();
        c14192.m28121(2);
        this.f47692 = c14192.m28124();
        this.f47684 = C16873.m38439(c14192.m28107(), EnumC22240.class);
        byte[] bArr = new byte[8];
        c14192.m28112(8, bArr);
        this.f47686 = bArr;
        c14192.m28121(8);
        if (this.f47684.contains(EnumC22240.NTLMSSP_NEGOTIATE_TARGET_INFO)) {
            this.f47689 = c14192.m28125();
            c14192.m28121(2);
            this.f47690 = c14192.m28124();
        } else {
            c14192.m28121(8);
        }
        if (this.f47684.contains(EnumC22240.NTLMSSP_NEGOTIATE_VERSION)) {
            C20899 c20899 = new C20899();
            c20899.m47207(c14192);
            this.f47691 = c20899;
            f47683.mo9195(c20899, "Windows version = {}");
        } else {
            c14192.m28121(8);
        }
        if (this.f47685 > 0) {
            c14192.m28122(this.f47692);
            this.f47687 = c14192.m28098(this.f47685 / 2, C10169.f28135);
        }
        if (this.f47689 > 0) {
            c14192.m28122(this.f47690);
            C10840 c10840 = new C10840();
            c10840.m24958(c14192);
            this.f47688 = c10840;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m36898() {
        return this.f47687;
    }

    /* JADX INFO: renamed from: ۧ */
    public final byte[] m36895() {
        return this.f47686;
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumSet m36893() {
        return this.f47684;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C10840 m36896() {
        return this.f47688;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C20899 m36897() {
        return this.f47691;
    }

    public final String toString() {
        return "NtlmChallenge{\n  targetName='" + this.f47687 + "',\n  negotiateFlags=" + this.f47684 + ",\n  serverChallenge=" + C3463.m6190(this.f47686) + ",\n  version=" + this.f47691 + ",\n  targetInfo=" + this.f47688 + "\n}";
    }
}
