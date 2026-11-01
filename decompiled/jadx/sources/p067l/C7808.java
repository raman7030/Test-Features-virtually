package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes3.dex */
public final class C7808 extends AbstractC15010 implements InterfaceC9501 {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC9501 f20490;

    /* JADX INFO: renamed from: ᩹ */
    public final C11832 f20491;

    public C7808(InterfaceC9501 interfaceC9501, C11832 c11832) {
        this.f20490 = interfaceC9501;
        this.f20491 = c11832;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7808)) {
            return false;
        }
        C7808 c7808 = (C7808) obj;
        return C12826.equals(this.f20490, c7808.f20490) && C12826.equals(this.f20491, c7808.f20491);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f20491) + (C12826.hashCode(this.f20490) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f20490, this.f20491};
        String[] strArrSplit = "delegate;token".length() == 0 ? new String[0] : "delegate;token".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C7808.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // p067l.InterfaceC9501
    public final long length() {
        return this.f20490.length();
    }

    @Override // p067l.InterfaceC9501
    /* JADX INFO: renamed from: ۧ */
    public final void mo10697(long j, byte[] bArr, int i, int i2) {
        this.f20490.mo10697(j, bArr, i, i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f20491.close();
    }
}
