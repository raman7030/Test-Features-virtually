package p067l;

/* JADX INFO: renamed from: l.ۧᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 29T5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13005 extends AbstractC19039 {

    /* JADX INFO: renamed from: ܳۧ */
    public static final InterfaceC4410 f36590 = C13128.m30022(C13005.class);

    /* JADX INFO: renamed from: ܿۧ */
    public int f36591;

    /* JADX INFO: renamed from: ᩳۧ */
    public int f36592;

    public C13005(InterfaceC3341 interfaceC3341) {
        super(interfaceC3341);
    }

    @Override // p067l.AbstractC19039
    /* JADX INFO: renamed from: ۧ */
    public final int mo10509(byte[] bArr) {
        m43254(C3775.m7363(0, bArr));
        this.f36592 = C3775.m7363(2, bArr);
        m43256(C3775.m7363(4, bArr));
        this.f36591 = C3775.m7363(6, bArr);
        return 8;
    }

    @Override // p067l.AbstractC19039
    /* JADX INFO: renamed from: ۧ */
    public final int mo10508(int i, int i2, byte[] bArr) {
        m30261(false);
        InterfaceC15983[] interfaceC15983Arr = new C18368[m43258()];
        int i3 = i;
        for (int i4 = 0; i4 < m43258(); i4++) {
            C18368 c18368 = new C18368();
            interfaceC15983Arr[i4] = c18368;
            c18368.f54866 = m30243(false, i3, 13, bArr);
            c18368.f54865 = C3775.m7363(i3 + 14, bArr);
            int iM7365 = C3775.m7365(i3 + 16, bArr);
            i3 += 20;
            c18368.f54867 = m30243(false, ((iM7365 & 65535) - this.f36592) + i, 128, bArr);
            InterfaceC4410 interfaceC4410 = f36590;
            if (interfaceC4410.mo9194()) {
                interfaceC4410.mo9196(c18368.toString());
            }
        }
        m43251(interfaceC15983Arr);
        return i3 - i;
    }

    @Override // p067l.AbstractC19039, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("NetShareEnumResponse[");
        sb.append(super.toString());
        sb.append(",status=");
        sb.append(m43253());
        sb.append(",converter=");
        sb.append(this.f36592);
        sb.append(",entriesReturned=");
        sb.append(m43258());
        sb.append(",totalAvailableEntries=");
        return new String(C5410.m11876(this.f36591, "]", sb));
    }
}
