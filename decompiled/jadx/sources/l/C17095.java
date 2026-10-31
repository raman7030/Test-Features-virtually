package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ܿۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46YI */
/* JADX INFO: loaded from: classes4.dex */
public final class C17095 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f52400;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f52401;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Charset f52402;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f52403;

    public C17095(Charset charset, String str, int i, byte[] bArr) {
        this.f52402 = charset;
        this.f52403 = str;
        this.f52401 = i;
        this.f52400 = bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m40113() {
        byte[] bArr = this.f52400;
        return bArr == null ? new byte[0] : (byte[]) bArr.clone();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40112(byte[] bArr) {
        return C14272.m33924(bArr) == C14272.m33921(this.f52403);
    }
}
