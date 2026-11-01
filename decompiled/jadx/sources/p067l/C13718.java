package p067l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۨ᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: PAGY */
/* JADX INFO: loaded from: classes4.dex */
public final class C13718 implements InterfaceC24446 {

    /* JADX INFO: renamed from: ֫ */
    public final Charset f38713;

    public C13718(Charset charset) {
        this.f38713 = charset;
    }

    @Override // p067l.InterfaceC24446
    /* JADX INFO: renamed from: ֫ */
    public final String mo31183(int i, int i2, byte[] bArr) {
        return new String(bArr, i, i2, this.f38713);
    }

    @Override // p067l.InterfaceC24446
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo31184(String str) {
        return str.getBytes(this.f38713);
    }
}
