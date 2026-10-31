package l;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7D9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9438 extends C6759 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public StringBuilder f28618;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC20727 f28619;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f28620;

    @Override // l.C6759
    /* JADX INFO: renamed from: ܽ */
    public final int mo5678() {
        int iOrdinal = this.f28619.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return this.f28618.toString().getBytes(StandardCharsets.UTF_8).length;
        }
        if (iOrdinal != 2) {
            throw new IncompatibleClassChangeError();
        }
        return this.f28620.size();
    }

    @Override // l.C6759, l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        super.mo2828(interfaceC0408);
        int iOrdinal = this.f28619.ordinal();
        if (iOrdinal == 0) {
            ((C6053) interfaceC0408).m16881();
            return;
        }
        if (iOrdinal == 1) {
            ((C6053) interfaceC0408).m16886(this.f28618.toString());
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        ArrayList arrayList = this.f28620;
        int i = C23424.f75225;
        int size = arrayList.size();
        byte[] bArr = new byte[size];
        for (int i2 = 0; i2 < size; i2++) {
            bArr[i2] = ((Byte) arrayList.get(i2)).byteValue();
        }
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.getClass();
        c6053.m16883(size, bArr);
    }
}
