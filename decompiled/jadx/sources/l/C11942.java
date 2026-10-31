package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۨ᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: PAGY */
/* JADX INFO: loaded from: classes4.dex */
public final class C11942 implements InterfaceC23230 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Charset f35702;

    public C11942(Charset charset) {
        this.f35702 = charset;
    }

    @Override // l.InterfaceC23230
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo29129(int i, int i2, byte[] bArr) {
        return new String(bArr, i, i2, this.f35702);
    }

    @Override // l.InterfaceC23230
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] mo29130(String str) {
        return str.getBytes(this.f35702);
    }
}
