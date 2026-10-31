package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۗۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7VC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3148 extends AbstractC20082 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f9833 = "vt100";

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f9836 = 80;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f9838 = 24;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f9837 = 640;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f9834 = 480;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f9835 = C19356.f62660;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9571(String str) {
        this.f9833 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9570(int i, int i2, int i3, int i4) {
        this.f9836 = i;
        this.f9838 = i2;
        this.f9837 = i3;
        this.f9834 = i4;
    }

    @Override // l.AbstractC20082
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9572(C7381 c7381, AbstractC19791 abstractC19791) {
        super.mo9572(c7381, abstractC19791);
        C16261 c16261 = new C16261();
        C8087 c8087 = new C8087(c16261);
        c8087.m21457();
        c16261.m38234((byte) 98);
        c16261.m38245(abstractC19791.f63918);
        byte[] bArr = C19356.f62660;
        Charset charset = StandardCharsets.UTF_8;
        c16261.m38256("pty-req".getBytes(charset));
        c16261.m38234(m46275() ? (byte) 1 : (byte) 0);
        c16261.m38256(C19356.m44592(this.f9833, charset));
        c16261.m38245(this.f9836);
        c16261.m38245(this.f9838);
        c16261.m38245(this.f9837);
        c16261.m38245(this.f9834);
        c16261.m38256(this.f9835);
        m46273(c8087);
    }
}
