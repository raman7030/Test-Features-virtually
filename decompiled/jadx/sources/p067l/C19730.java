package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A9XQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19730 extends AbstractC14345 {

    /* JADX INFO: renamed from: ᩴ֫ */
    public final byte f60019;

    /* JADX INFO: renamed from: ᩵֫ */
    public InterfaceC15983[] f60020;

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8765(int i, byte[] bArr) {
        return 0;
    }

    public C19730(InterfaceC3341 interfaceC3341, byte b) {
        super(interfaceC3341);
        this.f60019 = b;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public final InterfaceC15983[] m44858() {
        return this.f60020;
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ۧ */
    public final int mo8760(int i, byte[] bArr) throws C19258 {
        if (C3775.m7363(i, bArr) != 9) {
            throw new C19258("Expected structureSize = 9");
        }
        int iM12492 = m12492() + C3775.m7363(i + 2, bArr);
        int iM7365 = C3775.m7365(i + 4, bArr);
        int i2 = i + 8;
        ArrayList arrayList = new ArrayList();
        do {
            C3164 c3164 = this.f60019 == 3 ? new C3164(m12497(), true) : null;
            if (c3164 != null) {
                c3164.mo4913(i2, iM7365, bArr);
                arrayList.add(c3164);
                int iM5426 = c3164.m5426();
                if (iM5426 <= 0) {
                    break;
                }
                i2 += iM5426;
            } else {
                break;
            }
        } while (i2 < iM12492 + iM7365);
        this.f60020 = (InterfaceC15983[]) arrayList.toArray(new InterfaceC15983[arrayList.size()]);
        return i2 - i;
    }
}
