package p067l;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7D9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11338 extends C8792 {

    /* JADX INFO: renamed from: ۗ */
    public StringBuilder f31565;

    /* JADX INFO: renamed from: ۙ */
    public EnumC22067 f31566;

    /* JADX INFO: renamed from: ᩶ */
    public ArrayList f31567;

    @Override // p067l.C8792
    /* JADX INFO: renamed from: ܽ */
    public final int mo7908() {
        int iOrdinal = this.f31566.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return this.f31565.toString().getBytes(StandardCharsets.UTF_8).length;
        }
        if (iOrdinal != 2) {
            throw new IncompatibleClassChangeError();
        }
        return this.f31567.size();
    }

    @Override // p067l.C8792, p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        super.mo5157(interfaceC2756);
        int iOrdinal = this.f31566.ordinal();
        if (iOrdinal == 0) {
            ((C8121) interfaceC2756).m18810();
            return;
        }
        if (iOrdinal == 1) {
            ((C8121) interfaceC2756).m18815(this.f31565.toString());
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        ArrayList arrayList = this.f31567;
        int i = C24630.f77971;
        int size = arrayList.size();
        byte[] bArr = new byte[size];
        for (int i2 = 0; i2 < size; i2++) {
            bArr[i2] = ((Byte) arrayList.get(i2)).byteValue();
        }
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.getClass();
        c8121.m18812(size, bArr);
    }
}
