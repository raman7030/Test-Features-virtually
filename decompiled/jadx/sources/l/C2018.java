package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: l.֫ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D9XS */
/* JADX INFO: loaded from: classes3.dex */
public final class C2018 extends AbstractC18246 {
    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ۜ */
    public final int mo2483(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2485(int i, byte[] bArr) {
        return 0;
    }

    public C2018(InterfaceC1023 interfaceC1023) {
        super(interfaceC1023, (byte) 37, (byte) 0);
        this.f56701 = new String("\\PIPE\\LANMAN");
        this.f56702 = 8;
        this.f56712 = 0;
        this.f56700 = OpenAuthTask.Duplex;
    }

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ܽ */
    public final int mo2484(byte[] bArr) {
        try {
            byte[] bytes = "WrLeh\u0000B13BWz\u0000".getBytes("ASCII");
            C1480.m5122(0L, 0, bArr);
            System.arraycopy(bytes, 0, bArr, 2, bytes.length);
            int length = bytes.length;
            C1480.m5122(1L, 2 + length, bArr);
            C1480.m5122(this.f56716, length + 4, bArr);
            return length + 6;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    @Override // l.AbstractC18246, l.AbstractC11422
    public final String toString() {
        return new String(C9045.m23341(new StringBuilder("NetShareEnum["), super.toString(), "]"));
    }
}
