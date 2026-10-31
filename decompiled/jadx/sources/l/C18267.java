package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A9XQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18267 extends AbstractC12601 {

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final byte f56802;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public InterfaceC14325[] f56803;

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        return 0;
    }

    public C18267(InterfaceC1023 interfaceC1023, byte b) {
        super(interfaceC1023);
        this.f56802 = b;
    }

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC14325[] m42599() {
        return this.f56803;
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) throws C17771 {
        if (C1480.m5121(i, bArr) != 9) {
            throw new C17771("Expected structureSize = 9");
        }
        int iM10453 = m10453() + C1480.m5121(i + 2, bArr);
        int iM5123 = C1480.m5123(i + 4, bArr);
        int i2 = i + 8;
        ArrayList arrayList = new ArrayList();
        do {
            C0837 c0837 = this.f56802 == 3 ? new C0837(m10458(), true) : null;
            if (c0837 != null) {
                c0837.mo2557(i2, iM5123, bArr);
                arrayList.add(c0837);
                int iM3112 = c0837.m3112();
                if (iM3112 <= 0) {
                    break;
                }
                i2 += iM3112;
            } else {
                break;
            }
        } while (i2 < iM10453 + iM5123);
        this.f56803 = (InterfaceC14325[]) arrayList.toArray(new InterfaceC14325[arrayList.size()]);
        return i2 - i;
    }
}
