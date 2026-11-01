package p067l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ܿۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46YI */
/* JADX INFO: loaded from: classes4.dex */
public final class C18615 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f55583;

    /* JADX INFO: renamed from: ۧ */
    public final int f55584;

    /* JADX INFO: renamed from: ܽ */
    public final Charset f55585;

    /* JADX INFO: renamed from: ᩳ */
    public final String f55586;

    public C18615(Charset charset, String str, int i, byte[] bArr) {
        this.f55585 = charset;
        this.f55586 = str;
        this.f55584 = i;
        this.f55583 = bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m42358() {
        byte[] bArr = this.f55583;
        return bArr == null ? new byte[0] : (byte[]) bArr.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m42357(byte[] bArr) {
        return C15932.m36057(bArr) == C15932.m36054(this.f55586);
    }
}
