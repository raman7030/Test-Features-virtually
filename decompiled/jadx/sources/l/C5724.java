package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes3.dex */
public final class C5724 extends AbstractC13301 implements InterfaceC7505 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC7505 f17645;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C9958 f17646;

    public C5724(InterfaceC7505 interfaceC7505, C9958 c9958) {
        this.f17645 = interfaceC7505;
        this.f17646 = c9958;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5724)) {
            return false;
        }
        C5724 c5724 = (C5724) obj;
        return C11003.equals(this.f17645, c5724.f17645) && C11003.equals(this.f17646, c5724.f17646);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f17646) + (C11003.hashCode(this.f17645) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f17645, this.f17646};
        String[] strArrSplit = "delegate;token".length() == 0 ? new String[0] : "delegate;token".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C5724.class, sb, "[");
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

    @Override // l.InterfaceC7505
    public final long length() {
        return this.f17645.length();
    }

    @Override // l.InterfaceC7505
    /* JADX INFO: renamed from: ۧ */
    public final void mo8637(long j, byte[] bArr, int i, int i2) {
        this.f17645.mo8637(j, bArr, i, i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f17646.close();
    }
}
