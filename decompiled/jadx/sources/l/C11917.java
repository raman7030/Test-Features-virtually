package l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۨ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: BA24 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11917 extends AbstractC13306 {

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public String f35634;

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) {
        return 0;
    }

    public C11917(String str, InterfaceC1023 interfaceC1023) {
        super(interfaceC1023, 3);
        this.f35634 = str;
    }

    @Override // l.AbstractC13306
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC12601 mo6638(InterfaceC18663 interfaceC18663) {
        return new C23205(interfaceC18663.mo27540());
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10438(AbstractC3429 abstractC3429) {
        abstractC3429.m10445(-1);
        return super.mo10438(abstractC3429);
    }

    @Override // l.InterfaceC7578
    public final int size() {
        return AbstractC3429.m10428((this.f35634.length() * 2) + 72);
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        C1480.m5122(9L, i, bArr);
        C1480.m5122(0, i + 2, bArr);
        byte[] bytes = this.f35634.getBytes(StandardCharsets.UTF_16LE);
        C1480.m5122(bytes.length, i + 6, bArr);
        int i2 = i + 8;
        C1480.m5122(i2 - m10453(), i + 4, bArr);
        System.arraycopy(bytes, 0, bArr, i2, bytes.length);
        return (i2 + bytes.length) - i;
    }
}
