package p067l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: l.֫ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D9XS */
/* JADX INFO: loaded from: classes3.dex */
public final class C4287 extends AbstractC19710 {
    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ۜ */
    public final int mo4839(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ᩷ */
    public final int mo4841(int i, byte[] bArr) {
        return 0;
    }

    public C4287(InterfaceC3341 interfaceC3341) {
        super(interfaceC3341, (byte) 37, (byte) 0);
        this.f59919 = new String("\\PIPE\\LANMAN");
        this.f59920 = 8;
        this.f59930 = 0;
        this.f59918 = OpenAuthTask.Duplex;
    }

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ܽ */
    public final int mo4840(byte[] bArr) {
        try {
            byte[] bytes = "WrLeh\u0000B13BWz\u0000".getBytes("ASCII");
            C3775.m7364(0L, 0, bArr);
            System.arraycopy(bytes, 0, bArr, 2, bytes.length);
            int length = bytes.length;
            C3775.m7364(1L, 2 + length, bArr);
            C3775.m7364(this.f59934, length + 4, bArr);
            return length + 6;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    @Override // p067l.AbstractC19710, p067l.AbstractC13224
    public final String toString() {
        return new String(C10965.m25286(new StringBuilder("NetShareEnum["), super.toString(), "]"));
    }
}
